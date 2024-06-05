package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdlviewcontacts_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"layoutContacts\")";
Debug.ShouldStop(524288);
mdlviewcontacts.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layoutContacts")),mdlviewcontacts.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(1048576);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 22;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tru";
Debug.ShouldStop(2097152);
mdlviewcontacts._sql1.runVoidMethod ("Initialize",(Object)(mdlviewcontacts.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(mdlviewcontacts.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 24;BA.debugLine="LoadData";
Debug.ShouldStop(8388608);
_loaddata();
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="LoadData";
Debug.ShouldStop(134217728);
_loaddata();
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
public static RemoteObject  _btn_add_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Add_Click (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,52);
if (RapidSub.canDelegate("btn_add_click")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","btn_add_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub btn_Add_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="StartActivity(mdlContactsCreate)";
Debug.ShouldStop(1048576);
mdlviewcontacts.mostCurrent.__c.runVoidMethod ("StartActivity",mdlviewcontacts.processBA,(Object)((mdlviewcontacts.mostCurrent._mdlcontactscreate.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private btn_Add As Button";
mdlviewcontacts.mostCurrent._btn_add = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private ListView1 As ListView";
mdlviewcontacts.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,56);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","listview1_itemclick", _position, _value);}
RemoteObject _itemtext = RemoteObject.createImmutable("");
RemoteObject _lines = null;
RemoteObject _fullname = RemoteObject.createImmutable("");
RemoteObject _number = RemoteObject.createImmutable("");
RemoteObject _updateintent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 56;BA.debugLine="Sub ListView1_ItemClick(Position As Int, Value As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim itemText As String = ListView1.GetItem(Positi";
Debug.ShouldStop(16777216);
_itemtext = BA.ObjectToString(mdlviewcontacts.mostCurrent._listview1.runMethod(false,"GetItem",(Object)(_position)));Debug.locals.put("itemText", _itemtext);Debug.locals.put("itemText", _itemtext);
 BA.debugLineNum = 59;BA.debugLine="Dim lines() As String = Regex.Split(\"\\r?\\n\", item";
Debug.ShouldStop(67108864);
_lines = mdlviewcontacts.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\r?\\n")),(Object)(_itemtext));Debug.locals.put("lines", _lines);Debug.locals.put("lines", _lines);
 BA.debugLineNum = 62;BA.debugLine="Dim fullname As String = \"\"";
Debug.ShouldStop(536870912);
_fullname = BA.ObjectToString("");Debug.locals.put("fullname", _fullname);Debug.locals.put("fullname", _fullname);
 BA.debugLineNum = 63;BA.debugLine="Dim number As String = \"\"";
Debug.ShouldStop(1073741824);
_number = BA.ObjectToString("");Debug.locals.put("number", _number);Debug.locals.put("number", _number);
 BA.debugLineNum = 64;BA.debugLine="If lines.Length >= 2 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",_lines.getField(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 65;BA.debugLine="fullname = lines(0)";
Debug.ShouldStop(1);
_fullname = _lines.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("fullname", _fullname);
 BA.debugLineNum = 66;BA.debugLine="number = lines(1)";
Debug.ShouldStop(2);
_number = _lines.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("number", _number);
 };
 BA.debugLineNum = 68;BA.debugLine="Name = itemText";
Debug.ShouldStop(8);
mdlviewcontacts._name = _itemtext;
 BA.debugLineNum = 69;BA.debugLine="num = number";
Debug.ShouldStop(16);
mdlviewcontacts._num = _number;
 BA.debugLineNum = 71;BA.debugLine="Dim updateIntent As Intent";
Debug.ShouldStop(64);
_updateintent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("updateIntent", _updateintent);
 BA.debugLineNum = 72;BA.debugLine="updateIntent.Initialize(\"\", \"\") ' Initializing th";
Debug.ShouldStop(128);
_updateintent.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="updateIntent.PutExtra(\"fullname\", fullname)";
Debug.ShouldStop(256);
_updateintent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("fullname")),(Object)((_fullname)));
 BA.debugLineNum = 74;BA.debugLine="updateIntent.PutExtra(\"number\", number)";
Debug.ShouldStop(512);
_updateintent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("number")),(Object)((_number)));
 BA.debugLineNum = 77;BA.debugLine="StartActivity(mdlUpdateContacts)";
Debug.ShouldStop(4096);
mdlviewcontacts.mostCurrent.__c.runVoidMethod ("StartActivity",mdlviewcontacts.processBA,(Object)((mdlviewcontacts.mostCurrent._mdlupdatecontacts.getObject())));
 BA.debugLineNum = 78;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8192);
mdlviewcontacts.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 79;BA.debugLine="LoadData";
Debug.ShouldStop(16384);
_loaddata();
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
public static RemoteObject  _loaddata() throws Exception{
try {
		Debug.PushSubsStack("LoadData (mdlviewcontacts) ","mdlviewcontacts",6,mdlviewcontacts.mostCurrent.activityBA,mdlviewcontacts.mostCurrent,34);
if (RapidSub.canDelegate("loaddata")) { return b4a.example.mdlviewcontacts.remoteMe.runUserSub(false, "mdlviewcontacts","loaddata");}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _fullname = RemoteObject.createImmutable("");
RemoteObject _number = RemoteObject.createImmutable("");
RemoteObject _itemtext = RemoteObject.createImmutable("");
 BA.debugLineNum = 34;BA.debugLine="Private Sub LoadData";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 36;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8);
mdlviewcontacts.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 37;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(16);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 38;BA.debugLine="Cursor = SQL1.ExecQuery(\"SELECT * FROM Contacts\"";
Debug.ShouldStop(32);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdlviewcontacts._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Contacts"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 39;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(128);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 41;BA.debugLine="Dim fullname As String = Cursor.GetString(\"full";
Debug.ShouldStop(256);
_fullname = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fullname")));Debug.locals.put("fullname", _fullname);Debug.locals.put("fullname", _fullname);
 BA.debugLineNum = 42;BA.debugLine="Dim number As String = Cursor.GetString(\"number";
Debug.ShouldStop(512);
_number = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("number")));Debug.locals.put("number", _number);Debug.locals.put("number", _number);
 BA.debugLineNum = 43;BA.debugLine="Dim itemText As String = \"Name: \" & fullname &";
Debug.ShouldStop(1024);
_itemtext = RemoteObject.concat(RemoteObject.createImmutable("Name: "),_fullname,RemoteObject.createImmutable(" - Number: "),_number);Debug.locals.put("itemText", _itemtext);Debug.locals.put("itemText", _itemtext);
 BA.debugLineNum = 44;BA.debugLine="ListView1.AddSingleLine(itemText)";
Debug.ShouldStop(2048);
mdlviewcontacts.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_itemtext)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 46;BA.debugLine="Cursor.Close";
Debug.ShouldStop(8192);
_cursor.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",mdlviewcontacts.processBA, e14.toString()); BA.debugLineNum = 48;BA.debugLine="ToastMessageShow(\"No Contacts Available.\", True)";
Debug.ShouldStop(32768);
mdlviewcontacts.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No Contacts Available.")),(Object)(mdlviewcontacts.mostCurrent.__c.getField(true,"True")));
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim SQL1 As SQL";
mdlviewcontacts._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 8;BA.debugLine="Dim Name As String";
mdlviewcontacts._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim num As String";
mdlviewcontacts._num = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}