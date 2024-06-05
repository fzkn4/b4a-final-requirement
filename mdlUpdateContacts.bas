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
	Dim fullname As String
	Dim number As String
	
	
End Sub

Sub Globals
	Private btn_update As Button
	Private update_fullname As EditText
	Private update_number As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("layoutUpdateContacts")
	update_fullname.Color = Colors.Transparent
	update_number.Color = Colors.Transparent
	' Retrieve data from intent extras
	If Activity.GetStartingIntent.HasExtra("fullname") Then
		fullname = Activity.GetStartingIntent.GetExtra("fullname")
		number = Activity.GetStartingIntent.GetExtra("number")
        
		' Set EditText fields with retrieved data
		update_fullname.Text = fullname
		update_number.Text = number
	End If
	
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub btn_update_Click
	' Validate inputs
	Dim fullname As String = update_fullname.Text
	Dim number As String = update_number.Text

	If fullname = "" Or number = "" Then
		ToastMessageShow("Please fill in all fields", True)
		Return
	End If
	Try
		' Update the database
		Dim SQL1 As SQL
		SQL1.Initialize(File.DirInternal, "mydb.db", True)
		
		SQL1.ExecNonQuery2("UPDATE Contacts SET fullname = ?, number = ? WHERE fullname = ?", Array As Object(update_fullname.Text, update_number.Text, update_fullname.Text))
		SQL1.Close

		ToastMessageShow("Contact updated successfully", False)
		
	Catch
		Log(LastException)
	End Try
    
	' Close the activity
	Activity.Finish
End Sub



Private Sub delete_Click
	' Validate inputs
	Dim fullname As String = update_fullname.Text
	Dim number As String = update_number.Text

	Try
		Dim SQL1 As SQL
		
		SQL1.Initialize(File.DirInternal, "mydb.db", True)
		SQL1.ExecNonQuery2("Delete FROM Contacts WHERE fullname = ?", Array As Object(update_fullname.Text))
		SQL1.Close

		ToastMessageShow("Contact deleted successfully", False)
    
		' Close the activity
	Catch
		Log(LastException)
	End Try
	Activity.Finish
End Sub