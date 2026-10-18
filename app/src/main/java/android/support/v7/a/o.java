package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public Method f530a;

    /* renamed from: b, reason: collision with root package name */
    public Method f531b;
    public ImageView c;

    o(Activity activity) {
        try {
            this.f530a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
            this.f531b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            View findViewById = activity.findViewById(R.id.home);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() == 2) {
                    View childAt = viewGroup.getChildAt(0);
                    View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                    if (childAt2 instanceof ImageView) {
                        this.c = (ImageView) childAt2;
                    }
                }
            }
        }
    }
}
