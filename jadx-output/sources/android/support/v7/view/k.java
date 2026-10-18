package android.support.v7.view;

import android.content.Context;
import android.support.v4.view.as;
import android.support.v7.view.menu.o;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    Menu f569a;

    /* renamed from: b, reason: collision with root package name */
    int f570b;
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    int i;
    int j;
    CharSequence k;
    CharSequence l;
    int m;
    char n;
    char o;
    int p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    int u;
    String v;
    String w;
    String x;
    android.support.v4.view.n y;
    final /* synthetic */ i z;

    public k(i iVar, Menu menu) {
        this.z = iVar;
        this.f569a = menu;
        a();
    }

    public final void a() {
        this.f570b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    static char a(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    final void a(MenuItem menuItem) {
        Class<?>[] clsArr;
        Object[] objArr;
        Context context;
        boolean z = true;
        menuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s).setCheckable(this.p > 0).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
        if (this.t >= 0) {
            as.a(menuItem, this.t);
        }
        if (this.x != null) {
            context = this.z.e;
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new j(i.b(this.z), this.x));
        }
        if (this.p >= 2) {
            if (menuItem instanceof android.support.v7.view.menu.m) {
                ((android.support.v7.view.menu.m) menuItem).a(true);
            } else if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                try {
                    if (oVar.e == null) {
                        oVar.e = ((android.support.v4.e.a.b) oVar.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    oVar.e.invoke(oVar.d, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        if (this.v != null) {
            String str = this.v;
            clsArr = i.f565a;
            objArr = this.z.c;
            as.a(menuItem, (View) a(str, clsArr, objArr));
        } else {
            z = false;
        }
        if (this.u > 0) {
            if (!z) {
                as.b(menuItem, this.u);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.y != null) {
            as.a(menuItem, this.y);
        }
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu addSubMenu = this.f569a.addSubMenu(this.f570b, this.i, this.j, this.k);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
        Context context;
        try {
            context = this.z.e;
            Constructor<?> constructor = context.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
