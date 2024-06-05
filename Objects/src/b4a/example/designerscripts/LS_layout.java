package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="If Landscape Then"[Layout/General script]
if ((BA.ObjectToBoolean( String.valueOf(!anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
//BA.debugLineNum = 2;BA.debugLine="Label1.HorizontalCenter = 50%x"[Layout/General script]
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
//BA.debugLineNum = 3;BA.debugLine="Label1.VerticalCenter = 10%y"[Layout/General script]
views.get("label1").vw.setTop((int)((10d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));
//BA.debugLineNum = 5;BA.debugLine="btnLogin.HorizontalCenter = 84%x"[Layout/General script]
views.get("btnlogin").vw.setLeft((int)((84d / 100 * width) - (views.get("btnlogin").vw.getWidth() / 2)));
//BA.debugLineNum = 6;BA.debugLine="btnLogin.VerticalCenter = 70%y"[Layout/General script]
views.get("btnlogin").vw.setTop((int)((70d / 100 * height) - (views.get("btnlogin").vw.getHeight() / 2)));
//BA.debugLineNum = 7;BA.debugLine="btnCreate.HorizontalCenter = 50%x"[Layout/General script]
views.get("btncreate").vw.setLeft((int)((50d / 100 * width) - (views.get("btncreate").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="btnCreate.VerticalCenter = 70%y"[Layout/General script]
views.get("btncreate").vw.setTop((int)((70d / 100 * height) - (views.get("btncreate").vw.getHeight() / 2)));
//BA.debugLineNum = 9;BA.debugLine="btnCreate.Width = 30%x"[Layout/General script]
views.get("btncreate").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="btnLogin.Width = 30%x"[Layout/General script]
views.get("btnlogin").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 11;BA.debugLine="Else"[Layout/General script]
;}else{ 
;
//BA.debugLineNum = 13;BA.debugLine="End If"[Layout/General script]
;};

}
}