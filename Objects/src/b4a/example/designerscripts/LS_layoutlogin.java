package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutlogin{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
;}else{ 
;
views.get("panel1").vw.setWidth((int)((43d / 100 * width)));
views.get("panel2").vw.setWidth((int)((43d / 100 * width)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
views.get("label1").vw.setLeft((int)((69d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setWidth((int)((48d / 100 * width)));
views.get("label2").vw.setWidth((int)((48d / 100 * width)));
views.get("label2").vw.setLeft((int)((54.5d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("button1").vw.setWidth((int)((20d / 100 * width)));
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
views.get("button1").vw.setTop((int)((63d / 100 * height) - (views.get("button1").vw.getHeight() / 2)));
;};

}
}