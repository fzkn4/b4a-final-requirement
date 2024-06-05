package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlupdatecontacts_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlupdatecontacts) ","mdlupdatecontacts",7,mdlupdatecontacts.mostCurrent.activityBA,mdlupdatecontacts.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlupdatecontacts.remoteMe.runUserSub(false, "mdlupdatecontacts","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"layoutUpdateContacts\")";
Debug.ShouldStop(524288);
mdlupdatecontacts.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutUpdateContacts")),mdlupdatecontacts.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="update_fullname.Color = Colors.Transparent";
Debug.ShouldStop(1048576);
mdlupdatecontacts.mostCurrent._update_fullname.runVoidMethod ("setColor",mdlupdatecontacts.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 22;BA.debugLine="update_number.Color = Colors.Transparent";
Debug.ShouldStop(2097152);
mdlupdatecontacts.mostCurrent._update_number.runVoidMethod ("setColor",mdlupdatecontacts.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 24;BA.debugLine="If Activity.GetStartingIntent.HasExtra(\"fullname\"";
Debug.ShouldStop(8388608);
if (mdlupdatecontacts.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("fullname"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="fullname = Activity.GetStartingIntent.GetExtra(\"";
Debug.ShouldStop(16777216);
mdlupdatecontacts._fullname = BA.ObjectToString(mdlupdatecontacts.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("fullname"))));
 BA.debugLineNum = 26;BA.debugLine="number = Activity.GetStartingIntent.GetExtra(\"nu";
Debug.ShouldStop(33554432);
mdlupdatecontacts._number = BA.ObjectToString(mdlupdatecontacts.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("number"))));
 BA.debugLineNum = 29;BA.debugLine="update_fullname.Text = fullname";
Debug.ShouldStop(268435456);
mdlupdatecontacts.mostCurrent._update_fullname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(mdlupdatecontacts._fullname));
 BA.debugLineNum = 30;BA.debugLine="update_number.Text = number";
Debug.ShouldStop(536870912);
mdlupdatecontacts.mostCurrent._update_number.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(mdlupdatecontacts._number));
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mdlupdatecontacts) ","mdlupdatecontacts",7,mdlupdatecontacts.mostCurrent.activityBA,mdlupdatecontacts.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlupdatecontacts.remoteMe.runUserSub(false, "mdlupdatecontacts","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mdlupdatecontacts) ","mdlupdatecontacts",7,mdlupdatecontacts.mostCurrent.activityBA,mdlupdatecontacts.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlupdatecontacts.remoteMe.runUserSub(false, "mdlupdatecontacts","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_update_click() throws Exception{
try {
		Debug.PushSubsStack("btn_update_Click (mdlupdatecontacts) ","mdlupdatecontacts",7,mdlupdatecontacts.mostCurrent.activityBA,mdlupdatecontacts.mostCurrent,41);
if (RapidSub.canDelegate("btn_update_click")) { return b4a.example.mdlupdatecontacts.remoteMe.runUserSub(false, "mdlupdatecontacts","btn_update_click");}
RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
 BA.debugLineNum = 41;BA.debugLine="Sub btn_update_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="Dim fullname As String = update_fullname.Text";
Debug.ShouldStop(1024);
mdlupdatecontacts._fullname = mdlupdatecontacts.mostCurrent._update_fullname.runMethod(true,"getText");
 BA.debugLineNum = 44;BA.debugLine="Dim number As String = update_number.Text";
Debug.ShouldStop(2048);
mdlupdatecontacts._number = mdlupdatecontacts.mostCurrent._update_number.runMethod(true,"getText");
 BA.debugLineNum = 46;BA.debugLine="If fullname = \"\" Or number = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",mdlupdatecontacts._fullname,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",mdlupdatecontacts._number,BA.ObjectToString(""))) { 
 BA.debugLineNum = 47;BA.debugLine="ToastMessageShow(\"Please fill in all fields\", Tr";
Debug.ShouldStop(16384);
mdlupdatecontacts.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please fill in all fields")),(Object)(mdlupdatecontacts.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 48;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 52;BA.debugLine="Dim SQL1 As SQL";
Debug.ShouldStop(524288);
_sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");Debug.locals.put("SQL1", _sql1);
 BA.debugLineNum = 53;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tru";
Debug.ShouldStop(1048576);
_sql1.runVoidMethod ("Initialize",(Object)(mdlupdatecontacts.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdlupdatecontacts.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 55;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE Contacts SET fullname";
Debug.ShouldStop(4194304);
_sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE Contacts SET fullname = ?, number = ? WHERE fullname = ?")),(Object)(mdlupdatecontacts.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(mdlupdatecontacts.mostCurrent._update_fullname.runMethod(true,"getText")),(mdlupdatecontacts.mostCurrent._update_number.runMethod(true,"getText")),(mdlupdatecontacts.mostCurrent._update_fullname.runMethod(true,"getText"))})))));
 BA.debugLineNum = 56;BA.debugLine="SQL1.Close";
Debug.ShouldStop(8388608);
_sql1.runVoidMethod ("Close");
 BA.debugLineNum = 58;BA.debugLine="ToastMessageShow(\"Contact updated successfully\",";
Debug.ShouldStop(33554432);
mdlupdatecontacts.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Contact updated successfully")),(Object)(mdlupdatecontacts.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlupdatecontacts.processBA, e14.toString()); BA.debugLineNum = 61;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
mdlupdatecontacts.mostCurrent.__c.runVoidMethod ("LogImpl","04128788",BA.ObjectToString(mdlupdatecontacts.mostCurrent.__c.runMethod(false,"LastException",mdlupdatecontacts.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 65;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
mdlupdatecontacts.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete_click() throws Exception{
try {
		Debug.PushSubsStack("delete_Click (mdlupdatecontacts) ","mdlupdatecontacts",7,mdlupdatecontacts.mostCurrent.activityBA,mdlupdatecontacts.mostCurrent,70);
if (RapidSub.canDelegate("delete_click")) { return b4a.example.mdlupdatecontacts.remoteMe.runUserSub(false, "mdlupdatecontacts","delete_click");}
RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
 BA.debugLineNum = 70;BA.debugLine="Private Sub delete_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="Dim fullname As String = update_fullname.Text";
Debug.ShouldStop(128);
mdlupdatecontacts._fullname = mdlupdatecontacts.mostCurrent._update_fullname.runMethod(true,"getText");
 BA.debugLineNum = 73;BA.debugLine="Dim number As String = update_number.Text";
Debug.ShouldStop(256);
mdlupdatecontacts._number = mdlupdatecontacts.mostCurrent._update_number.runMethod(true,"getText");
 BA.debugLineNum = 75;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 76;BA.debugLine="Dim SQL1 As SQL";
Debug.ShouldStop(2048);
_sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");Debug.locals.put("SQL1", _sql1);
 BA.debugLineNum = 78;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tru";
Debug.ShouldStop(8192);
_sql1.runVoidMethod ("Initialize",(Object)(mdlupdatecontacts.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdlupdatecontacts.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="SQL1.ExecNonQuery2(\"Delete FROM Contacts WHERE f";
Debug.ShouldStop(16384);
_sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Delete FROM Contacts WHERE fullname = ?")),(Object)(mdlupdatecontacts.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mdlupdatecontacts.mostCurrent._update_fullname.runMethod(true,"getText"))})))));
 BA.debugLineNum = 80;BA.debugLine="SQL1.Close";
Debug.ShouldStop(32768);
_sql1.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="ToastMessageShow(\"Contact deleted successfully\",";
Debug.ShouldStop(131072);
mdlupdatecontacts.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Contact deleted successfully")),(Object)(mdlupdatecontacts.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlupdatecontacts.processBA, e10.toString()); BA.debugLineNum = 86;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
mdlupdatecontacts.mostCurrent.__c.runVoidMethod ("LogImpl","04194320",BA.ObjectToString(mdlupdatecontacts.mostCurrent.__c.runMethod(false,"LastException",mdlupdatecontacts.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 88;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
mdlupdatecontacts.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private btn_update As Button";
mdlupdatecontacts.mostCurrent._btn_update = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private update_fullname As EditText";
mdlupdatecontacts.mostCurrent._update_fullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private update_number As EditText";
mdlupdatecontacts.mostCurrent._update_number = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim fullname As String";
mdlupdatecontacts._fullname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim number As String";
mdlupdatecontacts._number = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}