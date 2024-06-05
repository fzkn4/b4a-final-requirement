package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdllogin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdllogin) ","mdllogin",2,mdllogin.mostCurrent.activityBA,mdllogin.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdllogin.remoteMe.runUserSub(false, "mdllogin","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"layoutLogin\")";
Debug.ShouldStop(268435456);
mdllogin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutLogin")),mdllogin.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="EditText1.Color = Colors.Transparent";
Debug.ShouldStop(1073741824);
mdllogin.mostCurrent._edittext1.runVoidMethod ("setColor",mdllogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 32;BA.debugLine="EditText2.Color = Colors.Transparent";
Debug.ShouldStop(-2147483648);
mdllogin.mostCurrent._edittext2.runVoidMethod ("setColor",mdllogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 34;BA.debugLine="loginAttempts = 4";
Debug.ShouldStop(2);
mdllogin._loginattempts = BA.numberCast(int.class, 4);
 BA.debugLineNum = 35;BA.debugLine="maxAttempts = 0";
Debug.ShouldStop(4);
mdllogin._maxattempts = BA.numberCast(int.class, 0);
 BA.debugLineNum = 36;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tru";
Debug.ShouldStop(16);
mdllogin._sql1.runVoidMethod ("Initialize",(Object)(mdllogin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdllogin.mostCurrent.__c.getField(true,"True")));
 };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mdllogin) ","mdllogin",2,mdllogin.mostCurrent.activityBA,mdllogin.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdllogin.remoteMe.runUserSub(false, "mdllogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (mdllogin) ","mdllogin",2,mdllogin.mostCurrent.activityBA,mdllogin.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdllogin.remoteMe.runUserSub(false, "mdllogin","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Button1_Click (mdllogin) ","mdllogin",2,mdllogin.mostCurrent.activityBA,mdllogin.mostCurrent,49);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.mdllogin.remoteMe.runUserSub(false, "mdllogin","button1_click");}
RemoteObject _enteredusername = RemoteObject.createImmutable("");
RemoteObject _enteredpassword = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _userfullname = RemoteObject.createImmutable("");
 BA.debugLineNum = 49;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 52;BA.debugLine="Dim enteredUsername As String = EditText1.Text";
Debug.ShouldStop(524288);
_enteredusername = mdllogin.mostCurrent._edittext1.runMethod(true,"getText");Debug.locals.put("enteredUsername", _enteredusername);Debug.locals.put("enteredUsername", _enteredusername);
 BA.debugLineNum = 53;BA.debugLine="Dim enteredPassword As String = EditText2.Text";
Debug.ShouldStop(1048576);
_enteredpassword = mdllogin.mostCurrent._edittext2.runMethod(true,"getText");Debug.locals.put("enteredPassword", _enteredpassword);Debug.locals.put("enteredPassword", _enteredpassword);
 BA.debugLineNum = 56;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 57;BA.debugLine="cursor = SQL1.ExecQuery2(\"SELECT * FROM userTabl";
Debug.ShouldStop(16777216);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdllogin._sql1.runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM userTables WHERE userName = ? AND userPassword = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_enteredusername,_enteredpassword}))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 59;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(134217728);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 61;BA.debugLine="Dim userFullName As String = cursor.GetString(\"";
Debug.ShouldStop(268435456);
_userfullname = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fullName")));Debug.locals.put("userFullName", _userfullname);Debug.locals.put("userFullName", _userfullname);
 BA.debugLineNum = 62;BA.debugLine="fname = userFullName";
Debug.ShouldStop(536870912);
mdllogin._fname = _userfullname;
 BA.debugLineNum = 63;BA.debugLine="Log(\"Login successful. Welcome, \" & userFullNam";
Debug.ShouldStop(1073741824);
mdllogin.mostCurrent.__c.runVoidMethod ("LogImpl","01179662",RemoteObject.concat(RemoteObject.createImmutable("Login successful. Welcome, "),_userfullname,RemoteObject.createImmutable("!")),0);
 BA.debugLineNum = 64;BA.debugLine="ToastMessageShow(\"Login successful. Welcome, \"";
Debug.ShouldStop(-2147483648);
mdllogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Login successful. Welcome, "),_userfullname,RemoteObject.createImmutable("!")))),(Object)(mdllogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 67;BA.debugLine="StartActivity(\"mdlDashboard\")";
Debug.ShouldStop(4);
mdllogin.mostCurrent.__c.runVoidMethod ("StartActivity",mdllogin.processBA,(Object)((RemoteObject.createImmutable("mdlDashboard"))));
 BA.debugLineNum = 69;BA.debugLine="EditText1.Text = \"\"";
Debug.ShouldStop(16);
mdllogin.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="EditText2.Text = \"\"";
Debug.ShouldStop(32);
mdllogin.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 73;BA.debugLine="Log(\"Login failed. Invalid username or password";
Debug.ShouldStop(256);
mdllogin.mostCurrent.__c.runVoidMethod ("LogImpl","01179672",RemoteObject.createImmutable("Login failed. Invalid username or password."),0);
 BA.debugLineNum = 74;BA.debugLine="ToastMessageShow(\"Login failed. Invalid usernam";
Debug.ShouldStop(512);
mdllogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Login failed. Invalid username or password.")),(Object)(mdllogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 77;BA.debugLine="loginAttempts = loginAttempts - 1";
Debug.ShouldStop(4096);
mdllogin._loginattempts = RemoteObject.solve(new RemoteObject[] {mdllogin._loginattempts,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 79;BA.debugLine="If loginAttempts > maxAttempts Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",mdllogin._loginattempts,BA.numberCast(double.class, mdllogin._maxattempts))) { 
 BA.debugLineNum = 81;BA.debugLine="ToastMessageShow(\"Incorrect Credentials. Attem";
Debug.ShouldStop(65536);
mdllogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Incorrect Credentials. Attempts left: "),mdllogin._loginattempts))),(Object)(mdllogin.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 84;BA.debugLine="ToastMessageShow(\"Maximum login attempts reach";
Debug.ShouldStop(524288);
mdllogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Maximum login attempts reached. Please contact support.")),(Object)(mdllogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 87;BA.debugLine="Button1.Enabled = False";
Debug.ShouldStop(4194304);
mdllogin.mostCurrent._button1.runMethod(true,"setEnabled",mdllogin.mostCurrent.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 91;BA.debugLine="cursor.Close";
Debug.ShouldStop(67108864);
_cursor.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdllogin.processBA, e28.toString()); BA.debugLineNum = 93;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
mdllogin.mostCurrent.__c.runVoidMethod ("LogImpl","01179692",BA.ObjectToString(mdllogin.mostCurrent.__c.runMethod(false,"LastException",mdllogin.mostCurrent.activityBA)),0);
 BA.debugLineNum = 94;BA.debugLine="ToastMessageShow(\"Error: \" & LastException.Messa";
Debug.ShouldStop(536870912);
mdllogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),mdllogin.mostCurrent.__c.runMethod(false,"LastException",mdllogin.mostCurrent.activityBA).runMethod(true,"getMessage")))),(Object)(mdllogin.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private Button1 As Button";
mdllogin.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditText1 As EditText";
mdllogin.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText2 As EditText";
mdllogin.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
mdllogin._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private loginAttempts As Int";
mdllogin._loginattempts = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Private maxAttempts As Int";
mdllogin._maxattempts = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Private SQL1 As SQL";
mdllogin._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 13;BA.debugLine="Dim fname As String";
mdllogin._fname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}