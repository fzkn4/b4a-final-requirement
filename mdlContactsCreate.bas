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
	Dim SQL1 As SQL
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private add_fullname As EditText
	Private add_number As EditText
	Private btn_save As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("layoutSaveContacts")
	add_fullname.Color = Colors.Transparent
	add_number.Color = Colors.Transparent
	' Initialize the database
	If FirstTime Then
		SQL1.Initialize(File.DirInternal, "mydb.db", True)
	End If
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub


Private Sub btn_save_Click
	Dim fullname As String = add_fullname.Text
	Dim number As String = add_number.Text
    
	' Validate inputs
	If fullname = "" Then
		ToastMessageShow("Full name cannot be empty", True)
		Return
	End If
    
	If number = "" Then
		ToastMessageShow("Number cannot be empty", True)
		Return
	End If
    
	' Validate that number is text only and has a maximum length of 11 characters
	If number.Length > 11 Then
		ToastMessageShow("Number must be up to 11 characters", True)
		Return
	End If
    
	Try
		' Save to database
		SQL1.ExecNonQuery2("INSERT INTO Contacts (fullname, number) VALUES (?, ?)", Array As Object(fullname, number))
		ToastMessageShow("Contact saved", False)
        
		' Clear the input fields
		add_fullname.Text = ""
		add_number.Text = ""
        
		' Optionally, you can start an activity to view contacts or perform another action
		Activity.Finish
        
	Catch
		ToastMessageShow("Error: Unable to save contact", True)
	End Try
End Sub
