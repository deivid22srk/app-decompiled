package com.android.ex.photo.a;

import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.ap;
import android.support.v4.h.g;
import android.support.v4.view.bn;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b extends bn {

    /* renamed from: b, reason: collision with root package name */
    private final aa f1139b;
    ap g = null;
    private Fragment c = null;
    private g<String, Fragment> d = new c(this);

    public abstract Fragment c(int i);

    public b(aa aaVar) {
        this.f1139b = aaVar;
    }

    @Override // android.support.v4.view.bn
    public Object a(View view, int i) {
        if (this.g == null) {
            this.g = this.f1139b.a();
        }
        String a2 = a(view.getId(), i);
        this.d.b(a2);
        Fragment a3 = this.f1139b.a(a2);
        if (a3 != null) {
            this.g.e(a3);
        } else {
            a3 = c(i);
            if (a3 == null) {
                return null;
            }
            this.g.a(view.getId(), a3, a(view.getId(), i));
        }
        if (a3 != this.c) {
            a3.d(false);
            return a3;
        }
        return a3;
    }

    @Override // android.support.v4.view.bn
    public void a(View view, int i, Object obj) {
        if (this.g == null) {
            this.g = this.f1139b.a();
        }
        Fragment fragment = (Fragment) obj;
        String str = fragment.H;
        if (str == null) {
            str = a(view.getId(), i);
        }
        this.d.a(str, fragment);
        this.g.d(fragment);
    }

    @Override // android.support.v4.view.bn
    public final void a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.c) {
            if (this.c != null) {
                this.c.d(false);
            }
            if (fragment != null) {
                fragment.d(true);
            }
            this.c = fragment;
        }
    }

    @Override // android.support.v4.view.bn
    public final void c() {
        if (this.g != null && !this.f1139b.h()) {
            this.g.c();
            this.g = null;
            this.f1139b.b();
        }
    }

    @Override // android.support.v4.view.bn
    public final boolean a(View view, Object obj) {
        Object obj2 = ((Fragment) obj).R;
        for (Object obj3 = view; obj3 instanceof View; obj3 = ((View) obj3).getParent()) {
            if (obj3 == obj2) {
                return true;
            }
        }
        return false;
    }

    protected String a(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }
}
