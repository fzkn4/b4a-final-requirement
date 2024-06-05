package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutdashboard{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("label1").vw.setLeft((int)((52d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label2").vw.setWidth((int)((100d / 100 * width)));
views.get("label2").vw.setLeft((int)((50d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("panel3").vw.setLeft((int)((26d / 100 * height) - (views.get("panel3").vw.getWidth())));
views.get("contactv").vw.setLeft((int)((14d / 100 * width) - (views.get("contactv").vw.getWidth() / 2)));
views.get("contactv").vw.setTop((int)((6d / 100 * height) - (views.get("contactv").vw.getHeight() / 2)));
views.get("label5").vw.setLeft((int)((14d / 100 * width) - (views.get("label5").vw.getWidth() / 2)));
views.get("label5").vw.setTop((int)((10d / 100 * height) - (views.get("label5").vw.getHeight() / 2)));
views.get("panel5").vw.setLeft((int)((51d / 100 * height) - (views.get("panel5").vw.getWidth())));
//BA.debugLineNum = 14;BA.debugLine="settingsV.HorizontalCenter = 14%x"[layoutDashboard/General script]
views.get("settingsv").vw.setLeft((int)((14d / 100 * width) - (views.get("settingsv").vw.getWidth() / 2)));
//BA.debugLineNum = 15;BA.debugLine="settingsV.VerticalCenter = 6%y"[layoutDashboard/General script]
views.get("settingsv").vw.setTop((int)((6d / 100 * height) - (views.get("settingsv").vw.getHeight() / 2)));
//BA.debugLineNum = 16;BA.debugLine="Label7.HorizontalCenter = 14%x"[layoutDashboard/General script]
views.get("label7").vw.setLeft((int)((14d / 100 * width) - (views.get("label7").vw.getWidth() / 2)));
//BA.debugLineNum = 17;BA.debugLine="Label7.VerticalCenter =10%y"[layoutDashboard/General script]
views.get("label7").vw.setTop((int)((10d / 100 * height) - (views.get("label7").vw.getHeight() / 2)));
//BA.debugLineNum = 19;BA.debugLine="Else Landscape"[layoutDashboard/General script]
;}else{ 
String.valueOf(!anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait());
//BA.debugLineNum = 21;BA.debugLine="Panel3.Top=23%x"[layoutDashboard/General script]
views.get("panel3").vw.setTop((int)((23d / 100 * width)));
//BA.debugLineNum = 22;BA.debugLine="Panel3.Right=45%x"[layoutDashboard/General script]
views.get("panel3").vw.setLeft((int)((45d / 100 * width) - (views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 24;BA.debugLine="Panel5.Top=23%x"[layoutDashboard/General script]
views.get("panel5").vw.setTop((int)((23d / 100 * width)));
//BA.debugLineNum = 25;BA.debugLine="Panel5.Right=75%x"[layoutDashboard/General script]
views.get("panel5").vw.setLeft((int)((75d / 100 * width) - (views.get("panel5").vw.getWidth())));
//BA.debugLineNum = 27;BA.debugLine="End If"[layoutDashboard/General script]
;};

}
}