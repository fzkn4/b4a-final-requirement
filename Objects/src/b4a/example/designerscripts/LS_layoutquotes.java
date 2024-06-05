package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutquotes{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
if ((BA.ObjectToBoolean( String.valueOf(!anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("q1").vw.setTop((int)((44d / 100 * height)));
views.get("q1").vw.setLeft((int)((2d / 100 * width)));
views.get("q2").vw.setTop((int)((44d / 100 * height)));
views.get("q2").vw.setLeft((int)((27d / 100 * width)));
views.get("q3").vw.setTop((int)((44d / 100 * height)));
views.get("q3").vw.setLeft((int)((52d / 100 * width)));
views.get("q4").vw.setTop((int)((44d / 100 * height)));
views.get("q4").vw.setLeft((int)((77d / 100 * width)));
views.get("q5").vw.setTop((int)((100d / 100 * height)));
views.get("q5").vw.setLeft((int)((2d / 100 * width)));
views.get("q6").vw.setTop((int)((100d / 100 * height)));
views.get("q6").vw.setLeft((int)((27d / 100 * width)));
views.get("q7").vw.setTop((int)((100d / 100 * height)));
views.get("q7").vw.setLeft((int)((52d / 100 * width)));
views.get("q8").vw.setTop((int)((100d / 100 * height)));
views.get("q8").vw.setLeft((int)((77d / 100 * width)));
;}else{ 
;
//BA.debugLineNum = 31;BA.debugLine="End If"[layoutQuotes/General script]
;};

}
}