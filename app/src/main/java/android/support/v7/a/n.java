package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f529a = {R.attr.homeAsUpIndicator};

    public static o a(Activity activity, Drawable drawable, int i) {
        o oVar = new o(activity);
        if (oVar.f530a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                oVar.f530a.invoke(actionBar, drawable);
                oVar.f531b.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (oVar.c != null) {
            oVar.c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
        }
        return oVar;
    }

    public static o a(o oVar, Activity activity, int i) {
        if (oVar == null) {
            oVar = new o(activity);
        }
        if (oVar.f530a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                oVar.f531b.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return oVar;
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f529a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}
