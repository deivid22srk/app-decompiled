package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* loaded from: classes.dex */
abstract class e<T> extends f<T> {

    /* renamed from: a, reason: collision with root package name */
    final Context f586a;

    /* renamed from: b, reason: collision with root package name */
    Map<android.support.v4.e.a.b, MenuItem> f587b;
    Map<android.support.v4.e.a.c, SubMenu> c;

    e(Context context, T t) {
        super(t);
        this.f586a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof android.support.v4.e.a.b)) {
            return menuItem;
        }
        android.support.v4.e.a.b bVar = (android.support.v4.e.a.b) menuItem;
        if (this.f587b == null) {
            this.f587b = new android.support.v4.h.a();
        }
        MenuItem menuItem2 = this.f587b.get(menuItem);
        if (menuItem2 == null) {
            MenuItem a2 = ab.a(this.f586a, bVar);
            this.f587b.put(bVar, a2);
            return a2;
        }
        return menuItem2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof android.support.v4.e.a.c)) {
            return subMenu;
        }
        android.support.v4.e.a.c cVar = (android.support.v4.e.a.c) subMenu;
        if (this.c == null) {
            this.c = new android.support.v4.h.a();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 == null) {
            Context context = this.f586a;
            if (Build.VERSION.SDK_INT >= 14) {
                ae aeVar = new ae(context, cVar);
                this.c.put(cVar, aeVar);
                return aeVar;
            }
            throw new UnsupportedOperationException();
        }
        return subMenu2;
    }
}
