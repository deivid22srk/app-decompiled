package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    final bp f706a;

    /* renamed from: b, reason: collision with root package name */
    final bo f707b = new bo();
    final List<View> c = new ArrayList();

    bn(bp bpVar) {
        this.f706a = bpVar;
    }

    final void a(View view) {
        this.c.add(view);
        this.f706a.c(view);
    }

    final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.f706a.d(view);
        return true;
    }

    final void a(View view, int i, boolean z) {
        int a2;
        if (i < 0) {
            a2 = this.f706a.a();
        } else {
            a2 = a(i);
        }
        this.f707b.a(a2, z);
        if (z) {
            a(view);
        }
        this.f706a.a(view, a2);
    }

    final int a(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.f706a.a();
        int i2 = i;
        while (i2 < a2) {
            int e = i - (i2 - this.f707b.e(i2));
            if (e == 0) {
                while (this.f707b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final View b(int i) {
        return this.f706a.b(a(i));
    }

    final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2;
        if (i < 0) {
            a2 = this.f706a.a();
        } else {
            a2 = a(i);
        }
        this.f707b.a(a2, z);
        if (z) {
            a(view);
        }
        this.f706a.a(view, a2, layoutParams);
    }

    public final int a() {
        return this.f706a.a() - this.c.size();
    }

    final int b() {
        return this.f706a.a();
    }

    final View c(int i) {
        return this.f706a.b(i);
    }

    final void d(int i) {
        int a2 = a(i);
        this.f707b.d(a2);
        this.f706a.c(a2);
    }

    final int c(View view) {
        int a2 = this.f706a.a(view);
        if (a2 == -1 || this.f707b.c(a2)) {
            return -1;
        }
        return a2 - this.f707b.e(a2);
    }

    final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.f707b.toString() + ", hidden list:" + this.c.size();
    }
}
