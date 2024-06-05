package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutupdatecontacts{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("label1").vw.setTop((int)((10d / 100 * height)));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label2").vw.setLeft((int)((49d / 100 * width) - (views.get("label2").vw.getWidth())));
views.get("panel1").vw.setLeft((int)((75d / 100 * width) - (views.get("panel1").vw.getWidth())));
views.get("label3").vw.setLeft((int)((74d / 100 * width) - (views.get("label3").vw.getWidth())));
views.get("label3").vw.setTop((int)((41d / 100 * height) - (views.get("label3").vw.getHeight() / 2)));
views.get("panel2").vw.setLeft((int)((75d / 100 * width) - (views.get("panel2").vw.getWidth())));
views.get("btn_update").vw.setLeft((int)((37d / 100 * width) - (views.get("btn_update").vw.getWidth() / 2)));
views.get("delete").vw.setLeft((int)((66d / 100 * width) - (views.get("delete").vw.getWidth() / 2)));
;}else{ 
;
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setTop((int)((10d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));
views.get("label2").vw.setTop((int)((20d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * width)));
views.get("panel1").vw.setTop((int)((30d / 100 * height)));
views.get("label3").vw.setTop((int)((55d / 100 * height)));
views.get("label3").vw.setHeight((int)((5d / 100 * width)));
views.get("panel2").vw.setTop((int)((65d / 100 * height)));
views.get("btn_update").vw.setTop((int)((70d / 100 * height)));
views.get("btn_update").vw.setLeft((int)((90d / 100 * width) - (views.get("btn_update").vw.getWidth())));
views.get("delete").vw.setLeft((int)((68d / 100 * width) - (views.get("delete").vw.getWidth() / 2)));
views.get("delete").vw.setTop((int)((70d / 100 * height)));
;};

}
}