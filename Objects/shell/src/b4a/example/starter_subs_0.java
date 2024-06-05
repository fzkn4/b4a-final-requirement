package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",1,starter.processBA,starter.mostCurrent,38);
if (RapidSub.canDelegate("application_error")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 38;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim SQL1 As SQL";
starter._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",1,starter.processBA,starter.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 15;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 16;BA.debugLine="If File.Exists(File.DirInternal, \"mydb.db\") = Fa";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("mydb.db"))),starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="File.Copy(File.DirAssets, \"mydb.db\", File.DirIn";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("mydb.db")),(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("mydb.db")));
 BA.debugLineNum = 18;BA.debugLine="Log(\"Database connection initialized\")";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","0524294",RemoteObject.createImmutable("Database connection initialized"),0);
 }else {
 BA.debugLineNum = 20;BA.debugLine="File.Copy(File.DirAssets, \"mydb.db\", File.DirIn";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("mydb.db")),(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("mydb.db")));
 BA.debugLineNum = 21;BA.debugLine="SQL1.Initialize(File.DirInternal, \"mydb.db\", Tr";
Debug.ShouldStop(1048576);
starter._sql1.runVoidMethod ("Initialize",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("mydb.db")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 22;BA.debugLine="Log(\"Database connection initialized after copy";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","0524298",RemoteObject.createImmutable("Database connection initialized after copying from assets"),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e11.toString()); BA.debugLineNum = 25;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","0524301",starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",1,starter.processBA,starter.mostCurrent,42);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 42;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If SQL1.IsInitialized Then SQL1.Close";
Debug.ShouldStop(1024);
if (starter._sql1.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
starter._sql1.runVoidMethod ("Close");};
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",1,starter.processBA,starter.mostCurrent,29);
if (RapidSub.canDelegate("service_start")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 29;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
Debug.ShouldStop(536870912);
starter.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",1,starter.processBA,starter.mostCurrent,33);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 33;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(1);
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
}