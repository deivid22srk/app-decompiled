package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    static final ax f339a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            f339a = new av();
        } else if (i >= 11) {
            f339a = new au();
        } else {
            f339a = new at();
        }
    }

    public static void a(MenuItem menuItem, int i) {
        if (menuItem instanceof android.support.v4.e.a.b) {
            ((android.support.v4.e.a.b) menuItem).setShowAsAction(i);
        } else {
            f339a.a(menuItem, i);
        }
    }

    public static MenuItem a(MenuItem menuItem, View view) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).setActionView(view) : f339a.a(menuItem, view);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).setActionView(i) : f339a.b(menuItem, i);
    }

    public static View a(MenuItem menuItem) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).getActionView() : f339a.a(menuItem);
    }

    public static MenuItem a(MenuItem menuItem, n nVar) {
        if (menuItem instanceof android.support.v4.e.a.b) {
            return ((android.support.v4.e.a.b) menuItem).a(nVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static boolean b(MenuItem menuItem) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).expandActionView() : f339a.b(menuItem);
    }

    public static boolean c(MenuItem menuItem) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).collapseActionView() : f339a.c(menuItem);
    }

    public static boolean d(MenuItem menuItem) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).isActionViewExpanded() : f339a.d(menuItem);
    }

    public static MenuItem a(MenuItem menuItem, ay ayVar) {
        return menuItem instanceof android.support.v4.e.a.b ? ((android.support.v4.e.a.b) menuItem).a(ayVar) : f339a.a(menuItem, ayVar);
    }
}
