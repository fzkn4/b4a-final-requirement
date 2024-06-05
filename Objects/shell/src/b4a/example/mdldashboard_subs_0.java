package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdldashboard_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"layoutDashboard\")";
Debug.ShouldStop(33554432);
mdldashboard.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutDashboard")),mdldashboard.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="Label2.Text = \"Welcome! \" & mdlLogin.fname & \"!\"";
Debug.ShouldStop(67108864);
mdldashboard.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Welcome! "),mdldashboard.mostCurrent._mdllogin._fname /*RemoteObject*/ ,RemoteObject.createImmutable("!"))));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _bulbv_click() throws Exception{
try {
		Debug.PushSubsStack("bulbV_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,74);
if (RapidSub.canDelegate("bulbv_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","bulbv_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub bulbV_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _contactv_click() throws Exception{
try {
		Debug.PushSubsStack("contactV_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,61);
if (RapidSub.canDelegate("contactv_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","contactv_click");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub contactV_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="StartActivity(mdlViewContacts)";
Debug.ShouldStop(536870912);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlviewcontacts.getObject())));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As Panel";
mdldashboard.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
mdldashboard.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label3 As Label";
mdldashboard.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
mdldashboard.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label4_click() throws Exception{
try {
		Debug.PushSubsStack("Label4_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,52);
if (RapidSub.canDelegate("label4_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","label4_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub Label4_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="StartActivity(mdlQuotes)";
Debug.ShouldStop(1048576);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlquotes.getObject())));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label5_click() throws Exception{
try {
		Debug.PushSubsStack("Label5_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,65);
if (RapidSub.canDelegate("label5_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","label5_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub Label5_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="StartActivity(mdlViewContacts)";
Debug.ShouldStop(2);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlviewcontacts.getObject())));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label6_click() throws Exception{
try {
		Debug.PushSubsStack("Label6_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,78);
if (RapidSub.canDelegate("label6_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","label6_click");}
 BA.debugLineNum = 78;BA.debugLine="Private Sub Label6_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label7_click() throws Exception{
try {
		Debug.PushSubsStack("Label7_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,92);
if (RapidSub.canDelegate("label7_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","label7_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub Label7_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="StartActivity(mdlSettings)";
Debug.ShouldStop(268435456);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlsettings.getObject())));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel2_click() throws Exception{
try {
		Debug.PushSubsStack("Panel2_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,44);
if (RapidSub.canDelegate("panel2_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","panel2_click");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub Panel2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(mdlQuotes)";
Debug.ShouldStop(4096);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlquotes.getObject())));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel3_click() throws Exception{
try {
		Debug.PushSubsStack("Panel3_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,57);
if (RapidSub.canDelegate("panel3_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","panel3_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub Panel3_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(mdlViewContacts)";
Debug.ShouldStop(33554432);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlviewcontacts.getObject())));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel4_click() throws Exception{
try {
		Debug.PushSubsStack("Panel4_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,70);
if (RapidSub.canDelegate("panel4_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","panel4_click");}
 BA.debugLineNum = 70;BA.debugLine="Private Sub Panel4_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel5_click() throws Exception{
try {
		Debug.PushSubsStack("Panel5_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,84);
if (RapidSub.canDelegate("panel5_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","panel5_click");}
 BA.debugLineNum = 84;BA.debugLine="Private Sub Panel5_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="StartActivity(mdlSettings)";
Debug.ShouldStop(1048576);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlsettings.getObject())));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _quotev_click() throws Exception{
try {
		Debug.PushSubsStack("quoteV_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,48);
if (RapidSub.canDelegate("quotev_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","quotev_click");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub quoteV_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="StartActivity(mdlQuotes)";
Debug.ShouldStop(65536);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlquotes.getObject())));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settingsv_click() throws Exception{
try {
		Debug.PushSubsStack("settingsV_Click (mdldashboard) ","mdldashboard",3,mdldashboard.mostCurrent.activityBA,mdldashboard.mostCurrent,88);
if (RapidSub.canDelegate("settingsv_click")) { return b4a.example.mdldashboard.remoteMe.runUserSub(false, "mdldashboard","settingsv_click");}
 BA.debugLineNum = 88;BA.debugLine="Private Sub settingsV_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="StartActivity(mdlSettings)";
Debug.ShouldStop(16777216);
mdldashboard.mostCurrent.__c.runVoidMethod ("StartActivity",mdldashboard.processBA,(Object)((mdldashboard.mostCurrent._mdlsettings.getObject())));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}