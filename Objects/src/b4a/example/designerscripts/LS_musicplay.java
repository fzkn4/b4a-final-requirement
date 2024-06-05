package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_musicplay{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("btn_play").vw.setLeft((int)((views.get("panelplayers").vw.getWidth())/2d - (views.get("btn_play").vw.getWidth() / 2)));
views.get("btn_play").vw.setTop((int)((views.get("panelplayers").vw.getHeight())/2d - (views.get("btn_play").vw.getHeight() / 2)));
views.get("btn_backward").vw.setTop((int)((views.get("btn_play").vw.getTop() + views.get("btn_play").vw.getHeight()/2) - (views.get("btn_backward").vw.getHeight() / 2)));
views.get("btn_backward").vw.setLeft((int)((10d / 100 * width)));
views.get("btn_next").vw.setTop((int)((views.get("btn_play").vw.getTop() + views.get("btn_play").vw.getHeight()/2) - (views.get("btn_next").vw.getHeight() / 2)));
views.get("btn_next").vw.setLeft((int)((90d / 100 * width) - (views.get("btn_next").vw.getWidth())));
views.get("llb_notfound").vw.setTop((int)((views.get("musiclist").vw.getTop() + views.get("musiclist").vw.getHeight()/2) - (views.get("llb_notfound").vw.getHeight() / 2)));
views.get("llb_notfound").vw.setLeft((int)((views.get("musiclist").vw.getLeft() + views.get("musiclist").vw.getWidth()/2) - (views.get("llb_notfound").vw.getWidth() / 2)));

}
}