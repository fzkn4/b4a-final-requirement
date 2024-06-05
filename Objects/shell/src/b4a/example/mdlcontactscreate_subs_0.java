package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlcontactscreate_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlcontactscreate) ","mdlcontactscreate",5,mdlcontactscreate.mostCurrent.activityBA,mdlcontactscreate.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlcontactscreate.remoteMe.runUserSub(false, "mdlcontactscreate","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"layoutSaveContacts\")";
Debug.ShouldStop(2097152);
mdlcontactscreate.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutSaveContacts")),mdlcontactscreate.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="add_fullname.Color = Colors.Transparent";
Debug.ShouldStop(4194304);
mdlcontactscreate.mostCurrent._add_fullname.runVoidMethod ("setColor",mdlcontactscreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 24;BA.debugLine="add_number.Color = Colors.Transparent";
Debug.ShouldStop(8388608);
mdlcontactscreate.mostCurrent._add_number.runVoidMethod ("setColor",mdlcontactscreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 26;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(33554432);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tru";
Debug.ShouldStop(67108864);
mdlcontactscreate._sql1.runVoidMethod ("Initialize",(Object)(mdlcontactscreate.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (mdlcontactscreate) ","mdlcontactscreate",5,mdlcontactscreate.mostCurrent.activityBA,mdlcontactscreate.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlcontactscreate.remoteMe.runUserSub(false, "mdlcontactscreate","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (mdlcontactscreate) ","mdlcontactscreate",5,mdlcontactscreate.mostCurrent.activityBA,mdlcontactscreate.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlcontactscreate.remoteMe.runUserSub(false, "mdlcontactscreate","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_save_click() throws Exception{
try {
		Debug.PushSubsStack("btn_save_Click (mdlcontactscreate) ","mdlcontactscreate",5,mdlcontactscreate.mostCurrent.activityBA,mdlcontactscreate.mostCurrent,38);
if (RapidSub.canDelegate("btn_save_click")) { return b4a.example.mdlcontactscreate.remoteMe.runUserSub(false, "mdlcontactscreate","btn_save_click");}
RemoteObject _fullname = RemoteObject.createImmutable("");
RemoteObject _number = RemoteObject.createImmutable("");
 BA.debugLineNum = 38;BA.debugLine="Private Sub btn_save_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim fullname As String = add_fullname.Text";
Debug.ShouldStop(64);
_fullname = mdlcontactscreate.mostCurrent._add_fullname.runMethod(true,"getText");Debug.locals.put("fullname", _fullname);Debug.locals.put("fullname", _fullname);
 BA.debugLineNum = 40;BA.debugLine="Dim number As String = add_number.Text";
Debug.ShouldStop(128);
_number = mdlcontactscreate.mostCurrent._add_number.runMethod(true,"getText");Debug.locals.put("number", _number);Debug.locals.put("number", _number);
 BA.debugLineNum = 43;BA.debugLine="If fullname = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_fullname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 44;BA.debugLine="ToastMessageShow(\"Full name cannot be empty\", Tr";
Debug.ShouldStop(2048);
mdlcontactscreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Full name cannot be empty")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 45;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 48;BA.debugLine="If number = \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_number,BA.ObjectToString(""))) { 
 BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"Number cannot be empty\", True)";
Debug.ShouldStop(65536);
mdlcontactscreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Number cannot be empty")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 54;BA.debugLine="If number.Length > 11 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_number.runMethod(true,"length"),BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 55;BA.debugLine="ToastMessageShow(\"Number must be up to 11 charac";
Debug.ShouldStop(4194304);
mdlcontactscreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Number must be up to 11 characters")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 56;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 59;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 61;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO Contacts (fullna";
Debug.ShouldStop(268435456);
mdlcontactscreate._sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Contacts (fullname, number) VALUES (?, ?)")),(Object)(mdlcontactscreate.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fullname),(_number)})))));
 BA.debugLineNum = 62;BA.debugLine="ToastMessageShow(\"Contact saved\", False)";
Debug.ShouldStop(536870912);
mdlcontactscreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Contact saved")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 65;BA.debugLine="add_fullname.Text = \"\"";
Debug.ShouldStop(1);
mdlcontactscreate.mostCurrent._add_fullname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 66;BA.debugLine="add_number.Text = \"\"";
Debug.ShouldStop(2);
mdlcontactscreate.mostCurrent._add_number.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
mdlcontactscreate.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlcontactscreate.processBA, e22.toString()); BA.debugLineNum = 72;BA.debugLine="ToastMessageShow(\"Error: Unable to save contact\"";
Debug.ShouldStop(128);
mdlcontactscreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error: Unable to save contact")),(Object)(mdlcontactscreate.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private add_fullname As EditText";
mdlcontactscreate.mostCurrent._add_fullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private add_number As EditText";
mdlcontactscreate.mostCurrent._add_number = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btn_save As Button";
mdlcontactscreate.mostCurrent._btn_save = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim SQL1 As SQL";
mdlcontactscreate._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}