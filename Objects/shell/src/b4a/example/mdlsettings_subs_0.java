package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlsettings_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlsettings) ","mdlsettings",9,mdlsettings.mostCurrent.activityBA,mdlsettings.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlsettings.remoteMe.runUserSub(false, "mdlsettings","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"layoutSettings\")";
Debug.ShouldStop(262144);
mdlsettings.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutSettings")),mdlsettings.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (mdlsettings) ","mdlsettings",9,mdlsettings.mostCurrent.activityBA,mdlsettings.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlsettings.remoteMe.runUserSub(false, "mdlsettings","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mdlsettings) ","mdlsettings",9,mdlsettings.mostCurrent.activityBA,mdlsettings.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlsettings.remoteMe.runUserSub(false, "mdlsettings","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (mdlsettings) ","mdlsettings",9,mdlsettings.mostCurrent.activityBA,mdlsettings.mostCurrent,32);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.mdlsettings.remoteMe.runUserSub(false, "mdlsettings","button1_click");}
 BA.debugLineNum = 32;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="ToastMessageShow(\"Log out Successfully\", False)";
Debug.ShouldStop(1);
mdlsettings.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Log out Successfully")),(Object)(mdlsettings.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="StartActivity(mdlLogin)";
Debug.ShouldStop(2);
mdlsettings.mostCurrent.__c.runVoidMethod ("StartActivity",mdlsettings.processBA,(Object)((mdlsettings.mostCurrent._mdllogin.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private Button1 As Button";
mdlsettings.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}