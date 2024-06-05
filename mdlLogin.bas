B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
    #FullScreen: False
    #IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	Private loginAttempts As Int
	Private maxAttempts As Int
	Private SQL1 As SQL
	Dim fname As String 
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Button1 As Button
	Private EditText1 As EditText
	Private EditText2 As EditText

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("layoutLogin")
    
	EditText1.Color = Colors.Transparent
	EditText2.Color = Colors.Transparent
    
	loginAttempts = 4
	maxAttempts = 0
	If FirstTime Then
		SQL1.Initialize(File.DirInternal, "mydb.db", True)
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Button1_Click
	Try
		' Retrieve text from input fields
		Dim enteredUsername As String = EditText1.Text
		Dim enteredPassword As String = EditText2.Text
        
		' Query the database to check if the user exists with the provided username and password
		Dim cursor As Cursor
		cursor = SQL1.ExecQuery2("SELECT * FROM userTables WHERE userName = ? AND userPassword = ?", Array As String(enteredUsername, enteredPassword))
        
		If cursor.RowCount > 0 Then
			cursor.Position = 0
			Dim userFullName As String = cursor.GetString("fullName")
			fname = userFullName
			Log("Login successful. Welcome, " & userFullName & "!")
			ToastMessageShow("Login successful. Welcome, " & userFullName & "!", False)
            
			' Start the dashboard activity and pass the userFullName as an extra
			StartActivity("mdlDashboard")
			
			EditText1.Text = ""
			EditText2.Text = ""
			
		Else
			Log("Login failed. Invalid username or password.")
			ToastMessageShow("Login failed. Invalid username or password.", False)
            
			' Incorrect credentials
			loginAttempts = loginAttempts - 1
            
			If loginAttempts > maxAttempts Then
				' Still within the allowed attempts
				ToastMessageShow("Incorrect Credentials. Attempts left: " & loginAttempts, False)
			Else
				' Reached maximum attempts, show a message or take appropriate action
				ToastMessageShow("Maximum login attempts reached. Please contact support.", False)
                
				' Disable the login button
				Button1.Enabled = False
				' You may choose to disable other UI elements or take additional actions here.
			End If
		End If
		cursor.Close
	Catch
		Log(LastException)
		ToastMessageShow("Error: " & LastException.Message, False)
	End Try
End Sub