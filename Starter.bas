B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim SQL1 As SQL
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Try
		If File.Exists(File.DirInternal, "mydb.db") = False Then
			File.Copy(File.DirAssets, "mydb.db", File.DirInternal, "mydb.db")
			Log("Database connection initialized")
		Else
			File.Copy(File.DirAssets, "mydb.db", File.DirInternal, "mydb.db")
			SQL1.Initialize(File.DirInternal, "mydb.db", True)
			Log("Database connection initialized after copying from assets")
		End If
	Catch
		Log(LastException.Message)
	End Try
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	If SQL1.IsInitialized Then SQL1.Close
End Sub
