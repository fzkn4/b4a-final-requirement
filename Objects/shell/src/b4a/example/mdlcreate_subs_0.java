package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlcreate_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"layoutCreateAccount\")";
Debug.ShouldStop(33554432);
mdlcreate.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutCreateAccount")),mdlcreate.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="conpassTxtb.Color =Colors.Transparent";
Debug.ShouldStop(67108864);
mdlcreate.mostCurrent._conpasstxtb.runVoidMethod ("setColor",mdlcreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 28;BA.debugLine="usrTxtb.Color =Colors.Transparent";
Debug.ShouldStop(134217728);
mdlcreate.mostCurrent._usrtxtb.runVoidMethod ("setColor",mdlcreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 29;BA.debugLine="userFullName.Color =Colors.Transparent";
Debug.ShouldStop(268435456);
mdlcreate.mostCurrent._userfullname.runVoidMethod ("setColor",mdlcreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 30;BA.debugLine="passTxtb.Color =Colors.Transparent";
Debug.ShouldStop(536870912);
mdlcreate.mostCurrent._passtxtb.runVoidMethod ("setColor",mdlcreate.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 32;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(-2147483648);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",mdlcreate._sql1.runMethod(true,"IsInitialized"),mdlcreate.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 34;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tr";
Debug.ShouldStop(2);
mdlcreate._sql1.runVoidMethod ("Initialize",(Object)(mdlcreate.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdlcreate.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 36;BA.debugLine="creatingDBtable";
Debug.ShouldStop(8);
_creatingdbtable();
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_back_Click (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,91);
if (RapidSub.canDelegate("btn_back_click")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","btn_back_click");}
 BA.debugLineNum = 91;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
mdlcreate.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_createacc_click() throws Exception{
try {
		Debug.PushSubsStack("btn_createAcc_Click (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,62);
if (RapidSub.canDelegate("btn_createacc_click")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","btn_createacc_click");}
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _fullname = RemoteObject.createImmutable("");
RemoteObject _password = RemoteObject.createImmutable("");
RemoteObject _confirmpassword = RemoteObject.createImmutable("");
 BA.debugLineNum = 62;BA.debugLine="Private Sub btn_createAcc_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim username As String = usrTxtb.Text";
Debug.ShouldStop(1073741824);
_username = mdlcreate.mostCurrent._usrtxtb.runMethod(true,"getText");Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 64;BA.debugLine="Dim fullname As String = userFullName.Text";
Debug.ShouldStop(-2147483648);
_fullname = mdlcreate.mostCurrent._userfullname.runMethod(true,"getText");Debug.locals.put("fullname", _fullname);Debug.locals.put("fullname", _fullname);
 BA.debugLineNum = 65;BA.debugLine="Dim password As String = passTxtb.Text";
Debug.ShouldStop(1);
_password = mdlcreate.mostCurrent._passtxtb.runMethod(true,"getText");Debug.locals.put("password", _password);Debug.locals.put("password", _password);
 BA.debugLineNum = 66;BA.debugLine="Dim confirmPassword As String = conpassTxtb.Text";
Debug.ShouldStop(2);
_confirmpassword = mdlcreate.mostCurrent._conpasstxtb.runMethod(true,"getText");Debug.locals.put("confirmPassword", _confirmpassword);Debug.locals.put("confirmPassword", _confirmpassword);
 BA.debugLineNum = 69;BA.debugLine="If password <> confirmPassword Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_password,_confirmpassword)) { 
 BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Passwords do not match.\", Fals";
Debug.ShouldStop(32);
mdlcreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Passwords do not match.")),(Object)(mdlcreate.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 71;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 75;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 76;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO userTables (user";
Debug.ShouldStop(2048);
mdlcreate._sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO userTables (userName, userPassword, fullName) VALUES (?, ?, ?)")),(Object)(mdlcreate.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_username),(_password),(_fullname)})))));
 BA.debugLineNum = 77;BA.debugLine="ToastMessageShow(\"Account created successfully!\"";
Debug.ShouldStop(4096);
mdlcreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Account created successfully!")),(Object)(mdlcreate.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 78;BA.debugLine="Log(\"Account for user '\" & username & \"' created";
Debug.ShouldStop(8192);
mdlcreate.mostCurrent.__c.runVoidMethod ("LogImpl","02752528",RemoteObject.concat(RemoteObject.createImmutable("Account for user '"),_username,RemoteObject.createImmutable("' created successfully.")),0);
 BA.debugLineNum = 81;BA.debugLine="usrTxtb.Text = \"\"";
Debug.ShouldStop(65536);
mdlcreate.mostCurrent._usrtxtb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 82;BA.debugLine="userFullName.Text = \"\"";
Debug.ShouldStop(131072);
mdlcreate.mostCurrent._userfullname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 83;BA.debugLine="passTxtb.Text = \"\"";
Debug.ShouldStop(262144);
mdlcreate.mostCurrent._passtxtb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 84;BA.debugLine="conpassTxtb.Text = \"\"";
Debug.ShouldStop(524288);
mdlcreate.mostCurrent._conpasstxtb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlcreate.processBA, e18.toString()); BA.debugLineNum = 86;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
mdlcreate.mostCurrent.__c.runVoidMethod ("LogImpl","02752536",BA.ObjectToString(mdlcreate.mostCurrent.__c.runMethod(false,"LastException",mdlcreate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 87;BA.debugLine="ToastMessageShow(\"Error creating account.\", Fals";
Debug.ShouldStop(4194304);
mdlcreate.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error creating account.")),(Object)(mdlcreate.mostCurrent.__c.getField(true,"False")));
 };
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
public static RemoteObject  _creatingdbtable() throws Exception{
try {
		Debug.PushSubsStack("creatingDBtable (mdlcreate) ","mdlcreate",4,mdlcreate.mostCurrent.activityBA,mdlcreate.mostCurrent,48);
if (RapidSub.canDelegate("creatingdbtable")) { return b4a.example.mdlcreate.remoteMe.runUserSub(false, "mdlcreate","creatingdbtable");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub creatingDBtable";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 50;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS us";
Debug.ShouldStop(131072);
mdlcreate._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS userTables("),RemoteObject.createImmutable("userID INTEGER PRIMARY KEY, "),RemoteObject.createImmutable("userName TEXT, "),RemoteObject.createImmutable("userPassword TEXT, "),RemoteObject.createImmutable("fullName TEXT);"))));
 BA.debugLineNum = 56;BA.debugLine="Log(\"Table 'userTables' created Successfully.\")";
Debug.ShouldStop(8388608);
mdlcreate.mostCurrent.__c.runVoidMethod ("LogImpl","02686984",RemoteObject.createImmutable("Table 'userTables' created Successfully."),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlcreate.processBA, e5.toString()); BA.debugLineNum = 58;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
mdlcreate.mostCurrent.__c.runVoidMethod ("LogImpl","02686986",BA.ObjectToString(mdlcreate.mostCurrent.__c.runMethod(false,"LastException",mdlcreate.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btn_back As Button";
mdlcreate.mostCurrent._btn_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btn_createAcc As Button";
mdlcreate.mostCurrent._btn_createacc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private conpassTxtb As EditText";
mdlcreate.mostCurrent._conpasstxtb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private passTxtb As EditText";
mdlcreate.mostCurrent._passtxtb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private usrTxtb As EditText";
mdlcreate.mostCurrent._usrtxtb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private userFullName As EditText";
mdlcreate.mostCurrent._userfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private SQL1 As SQL";
mdlcreate._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}