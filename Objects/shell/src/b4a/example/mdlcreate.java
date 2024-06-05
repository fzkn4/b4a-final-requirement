
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class mdlcreate implements IRemote{
	public static mdlcreate mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mdlcreate() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mdlcreate"), "b4a.example.mdlcreate");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, mdlcreate.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _btn_back = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_createacc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _conpasstxtb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _passtxtb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _usrtxtb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _userfullname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mdllogin _mdllogin = null;
public static b4a.example.mdldashboard _mdldashboard = null;
public static b4a.example.mdlcontactscreate _mdlcontactscreate = null;
public static b4a.example.mdlviewcontacts _mdlviewcontacts = null;
public static b4a.example.mdlupdatecontacts _mdlupdatecontacts = null;
public static b4a.example.mdlquotes _mdlquotes = null;
public static b4a.example.mdlsettings _mdlsettings = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mdlcreate.mostCurrent._activity,"btn_back",mdlcreate.mostCurrent._btn_back,"btn_createAcc",mdlcreate.mostCurrent._btn_createacc,"conpassTxtb",mdlcreate.mostCurrent._conpasstxtb,"Main",Debug.moduleToString(b4a.example.main.class),"mdlContactsCreate",Debug.moduleToString(b4a.example.mdlcontactscreate.class),"mdlDashboard",Debug.moduleToString(b4a.example.mdldashboard.class),"mdlLogin",Debug.moduleToString(b4a.example.mdllogin.class),"mdlQuotes",Debug.moduleToString(b4a.example.mdlquotes.class),"mdlSettings",Debug.moduleToString(b4a.example.mdlsettings.class),"mdlUpdateContacts",Debug.moduleToString(b4a.example.mdlupdatecontacts.class),"mdlViewContacts",Debug.moduleToString(b4a.example.mdlviewcontacts.class),"passTxtb",mdlcreate.mostCurrent._passtxtb,"SQL1",mdlcreate._sql1,"Starter",Debug.moduleToString(b4a.example.starter.class),"userFullName",mdlcreate.mostCurrent._userfullname,"usrTxtb",mdlcreate.mostCurrent._usrtxtb};
}
}