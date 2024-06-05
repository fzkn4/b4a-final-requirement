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
	Private SQL1 As SQL
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btn_back As Button
	Private btn_createAcc As Button
	Private conpassTxtb As EditText
	Private passTxtb As EditText
	Private usrTxtb As EditText
	Private userFullName As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("layoutCreateAccount")
	conpassTxtb.Color =Colors.Transparent
	usrTxtb.Color =Colors.Transparent
	userFullName.Color =Colors.Transparent
	passTxtb.Color =Colors.Transparent
	' Initialize the database if it's the first time the activity is created
	If FirstTime Then
		If SQL1.IsInitialized = False Then
			SQL1.Initialize(File.DirInternal, "mydb.db", True)
		End If
		creatingDBtable
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub creatingDBtable
	Try
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS userTables(" _
		& "userID INTEGER PRIMARY KEY, " _
		& "userName TEXT, " _
		& "userPassword TEXT, " _
		& "fullName TEXT);")
		
		Log("Table 'userTables' created Successfully.")
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub btn_createAcc_Click
	Dim username As String = usrTxtb.Text
	Dim fullname As String = userFullName.Text
	Dim password As String = passTxtb.Text
	Dim confirmPassword As String = conpassTxtb.Text
	
	' Check if passwords match
	If password <> confirmPassword Then
		ToastMessageShow("Passwords do not match.", False)
		Return
	End If
	
	' Insert the new user into the database
	Try
		SQL1.ExecNonQuery2("INSERT INTO userTables (userName, userPassword, fullName) VALUES (?, ?, ?)", Array As Object(username, password, fullname))
		ToastMessageShow("Account created successfully!", False)
		Log("Account for user '" & username & "' created successfully.")
		
		' Clear all textboxes
		usrTxtb.Text = ""
		userFullName.Text = ""
		passTxtb.Text = ""
		conpassTxtb.Text = ""
	Catch
		Log(LastException)
		ToastMessageShow("Error creating account.", False)
	End Try
End Sub

Private Sub btn_back_Click
	Activity.Finish
End Sub
