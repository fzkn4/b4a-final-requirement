package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlquotes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlquotes) ","mdlquotes",8,mdlquotes.mostCurrent.activityBA,mdlquotes.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlquotes.remoteMe.runUserSub(false, "mdlquotes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"layoutHorizontals\")";
Debug.ShouldStop(4194304);
mdlquotes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutHorizontals")),mdlquotes.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.LoadLayout(\"layoutQuotes\")";
Debug.ShouldStop(8388608);
mdlquotes.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutQuotes")),mdlquotes.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="ScrollView1.Panel.Height=labelend.Top";
Debug.ShouldStop(16777216);
mdlquotes.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",mdlquotes.mostCurrent._labelend.runMethod(true,"getTop"));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (mdlquotes) ","mdlquotes",8,mdlquotes.mostCurrent.activityBA,mdlquotes.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlquotes.remoteMe.runUserSub(false, "mdlquotes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mdlquotes) ","mdlquotes",8,mdlquotes.mostCurrent.activityBA,mdlquotes.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlquotes.remoteMe.runUserSub(false, "mdlquotes","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private labelend As Label";
mdlquotes.mostCurrent._labelend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
mdlquotes.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}