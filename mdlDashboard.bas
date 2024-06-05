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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	'Private ScrollView1 As ScrollView
	Private Panel1 As Panel
	Private Label1 As Label	
	Private Label3 As Label
	Private Label2 As Label
End Sub


Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

	Activity.LoadLayout("layoutDashboard")
	Label2.Text = "Welcome! " & mdlLogin.fname & "!"
	
	'ScrollView1.Panel.LoadLayout("layoutNotes")
	'ScrollView1.Panel.Height=Label1.Top

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


'Life Quote
Private Sub Panel2_Click
	StartActivity(mdlQuotes)
End Sub

Private Sub quoteV_Click
	StartActivity(mdlQuotes)
End Sub

Private Sub Label4_Click
	StartActivity(mdlQuotes)
End Sub

'Contacts
Private Sub Panel3_Click
	StartActivity(mdlViewContacts)
End Sub

Private Sub contactV_Click
	StartActivity(mdlViewContacts)
End Sub

Private Sub Label5_Click
	StartActivity(mdlViewContacts)
End Sub

'Life Advice
Private Sub Panel4_Click
	
End Sub

Private Sub bulbV_Click
	
End Sub

Private Sub Label6_Click
	
End Sub

'Settings

Private Sub Panel5_Click
	StartActivity(mdlSettings)
End Sub

Private Sub settingsV_Click
	StartActivity(mdlSettings)
End Sub

Private Sub Label7_Click
	StartActivity(mdlSettings)
End Sub