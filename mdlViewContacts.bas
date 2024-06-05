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
    Dim SQL1 As SQL
	Dim Name As String 
	Dim num As String 
	
End Sub

Sub Globals
    Private btn_Add As Button
    Private ListView1 As ListView
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("layoutContacts")
	If FirstTime Then
		SQL1.Initialize(File.DirInternal, "mydb.db", True)
	End If
	LoadData
End Sub

Sub Activity_Resume
    LoadData
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Private Sub LoadData
	Try
		ListView1.Clear
		Dim Cursor As Cursor
		Cursor = SQL1.ExecQuery("SELECT * FROM Contacts")
		For i = 0 To Cursor.RowCount - 1
			Cursor.Position = i
			Dim fullname As String = Cursor.GetString("fullname")
			Dim number As String = Cursor.GetString("number")
			Dim itemText As String = "Name: " & fullname & " - Number: " & number
			ListView1.AddSingleLine(itemText)
		Next
		Cursor.Close
	Catch
		ToastMessageShow("No Contacts Available.", True)
	End Try
End Sub

Private Sub btn_Add_Click
	StartActivity(mdlContactsCreate)
End Sub

Sub ListView1_ItemClick(Position As Int, Value As Object)
	Dim itemText As String = ListView1.GetItem(Position)
	' Splitting the itemText by lines
	Dim lines() As String = Regex.Split("\r?\n", itemText)
    
	' Extracting name and number from the item text
	Dim fullname As String = ""
	Dim number As String = ""
	If lines.Length >= 2 Then
		fullname = lines(0)
		number = lines(1)
	End If
    Name = itemText
	num = number
	' Creating an intent to pass data to the update activity
	Dim updateIntent As Intent
	updateIntent.Initialize("", "") ' Initializing the intent without additional parameters
	updateIntent.PutExtra("fullname", fullname)
	updateIntent.PutExtra("number", number)
    
	' Starting the update activity with the intent
	StartActivity(mdlUpdateContacts)
	ListView1.Clear
	LoadData
End Sub
