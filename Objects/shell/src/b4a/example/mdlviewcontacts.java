
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

public class mdlviewcontacts implements IRemote{
	public static mdlviewcontacts mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mdlviewcontacts() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mdlviewcontacts"), "b4a.example.mdlviewcontacts");
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
		pcBA = new PCBA(this, mdlviewcontacts.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _num = RemoteObject.createImmutable("");
public static RemoteObject _btn_add = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mdllogin _mdllogin = null;
public static b4a.example.mdldashboard _mdldashboard = null;
public static b4a.example.mdlcreate _mdlcreate = null;
public static b4a.example.mdlcontactscreate _mdlcontactscreate = null;
public static b4a.example.mdlupdatecontacts _mdlupdatecontacts = null;
public static b4a.example.mdlquotes _mdlquotes = null;
public static b4a.example.mdlsettings _mdlsettings = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mdlviewcontacts.mostCurrent._activity,"btn_Add",mdlviewcontacts.mostCurrent._btn_add,"ListView1",mdlviewcontacts.mostCurrent._listview1,"Main",Debug.moduleToString(b4a.example.main.class),"mdlContactsCreate",Debug.moduleToString(b4a.example.mdlcontactscreate.class),"mdlCreate",Debug.moduleToString(b4a.example.mdlcreate.class),"mdlDashboard",Debug.moduleToString(b4a.example.mdldashboard.class),"mdlLogin",Debug.moduleToString(b4a.example.mdllogin.class),"mdlQuotes",Debug.moduleToString(b4a.example.mdlquotes.class),"mdlSettings",Debug.moduleToString(b4a.example.mdlsettings.class),"mdlUpdateContacts",Debug.moduleToString(b4a.example.mdlupdatecontacts.class),"Name",mdlviewcontacts._name,"num",mdlviewcontacts._num,"SQL1",mdlviewcontacts._sql1,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}