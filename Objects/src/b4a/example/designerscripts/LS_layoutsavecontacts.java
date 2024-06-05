package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutsavecontacts{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label2").vw.setLeft((int)((48d / 100 * width) - (views.get("label2").vw.getWidth())));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("label3").vw.setLeft((int)((73d / 100 * width) - (views.get("label3").vw.getWidth())));
views.get("label3").vw.setTop((int)((26d / 100 * height) - (views.get("label3").vw.getHeight() / 2)));
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
views.get("btn_save").vw.setLeft((int)((50d / 100 * width) - (views.get("btn_save").vw.getWidth() / 2)));
views.get("btn_save").vw.setTop((int)((45d / 100 * height) - (views.get("btn_save").vw.getHeight() / 2)));
;}else{ 
;
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label2").vw.setTop((int)((23d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * width)));
views.get("label2").vw.setLeft((int)((45d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("panel1").vw.setTop((int)((30d / 100 * height)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("label3").vw.setTop((int)((57d / 100 * height)));
views.get("label3").vw.setHeight((int)((5d / 100 * width)));
//BA.debugLineNum = 24;BA.debugLine="Label3.HorizontalCenter = 52%x"[layoutSaveContacts/General script]
views.get("label3").vw.setLeft((int)((52d / 100 * width) - (views.get("label3").vw.getWidth() / 2)));
//BA.debugLineNum = 25;BA.debugLine="Panel2.Top=65%y"[layoutSaveContacts/General script]
views.get("panel2").vw.setTop((int)((65d / 100 * height)));
//BA.debugLineNum = 26;BA.debugLine="Panel2.HorizontalCenter = 50%x"[layoutSaveContacts/General script]
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
//BA.debugLineNum = 27;BA.debugLine="btn_save.HorizontalCenter = 50%x"[layoutSaveContacts/General script]
views.get("btn_save").vw.setLeft((int)((50d / 100 * width) - (views.get("btn_save").vw.getWidth() / 2)));
//BA.debugLineNum = 28;BA.debugLine="btn_save.VerticalCenter = 90%y"[layoutSaveContacts/General script]
views.get("btn_save").vw.setTop((int)((90d / 100 * height) - (views.get("btn_save").vw.getHeight() / 2)));
//BA.debugLineNum = 29;BA.debugLine="End If"[layoutSaveContacts/General script]
;};

}
}