package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutcontacts{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("btn_add").vw.setLeft((int)((88d / 100 * width) - (views.get("btn_add").vw.getWidth() / 2)));
views.get("btn_add").vw.setTop((int)((90d / 100 * height) - (views.get("btn_add").vw.getHeight() / 2)));
views.get("listview1").vw.setWidth((int)((100d / 100 * width)));
;}else{ 
;
views.get("btn_add").vw.setLeft((int)((90d / 100 * width) - (views.get("btn_add").vw.getWidth() / 2)));
views.get("btn_add").vw.setTop((int)((90d / 100 * height) - (views.get("btn_add").vw.getHeight() / 2)));
views.get("listview1").vw.setWidth((int)((100d / 100 * width)));
;};

}
}