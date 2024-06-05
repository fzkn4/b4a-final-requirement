
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

public class mdllogin implements IRemote{
	public static mdllogin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mdllogin() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mdllogin"), "b4a.example.mdllogin");
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
		pcBA = new PCBA(this, mdllogin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _loginattempts = RemoteObject.createImmutable(0);
public static RemoteObject _maxattempts = RemoteObject.createImmutable(0);
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mdldashboard _mdldashboard = null;
public static b4a.example.mdlcreate _mdlcreate = null;
public static b4a.example.mdlcontactscreate _mdlcontactscreate = null;
public static b4a.example.mdlviewcontacts _mdlviewcontacts = null;
public static b4a.example.mdlupdatecontacts _mdlupdatecontacts = null;
public static b4a.example.mdlquotes _mdlquotes = null;
public static b4a.example.mdlsettings _mdlsettings = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mdllogin.mostCurrent._activity,"Button1",mdllogin.mostCurrent._button1,"EditText1",mdllogin.mostCurrent._edittext1,"EditText2",mdllogin.mostCurrent._edittext2,"fname",mdllogin._fname,"loginAttempts",mdllogin._loginattempts,"Main",Debug.moduleToString(b4a.example.main.class),"maxAttempts",mdllogin._maxattempts,"mdlContactsCreate",Debug.moduleToString(b4a.example.mdlcontactscreate.class),"mdlCreate",Debug.moduleToString(b4a.example.mdlcreate.class),"mdlDashboard",Debug.moduleToString(b4a.example.mdldashboard.class),"mdlQuotes",Debug.moduleToString(b4a.example.mdlquotes.class),"mdlSettings",Debug.moduleToString(b4a.example.mdlsettings.class),"mdlUpdateContacts",Debug.moduleToString(b4a.example.mdlupdatecontacts.class),"mdlViewContacts",Debug.moduleToString(b4a.example.mdlviewcontacts.class),"SQL1",mdllogin._sql1,"Starter",Debug.moduleToString(b4a.example.starter.class),"xui",mdllogin._xui};
}
}