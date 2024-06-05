package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutcreateaccount{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((BA.ObjectToBoolean( String.valueOf(!anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("label4").vw.setLeft((int)((50d / 100 * width) - (views.get("label4").vw.getWidth() / 2)));
views.get("btn_createacc").vw.setLeft((int)((80d / 100 * width) - (views.get("btn_createacc").vw.getWidth() / 2)));
views.get("btn_createacc").vw.setTop((int)((90d / 100 * height) - (views.get("btn_createacc").vw.getHeight() / 2)));
;}else{ 
;
;};

}
}