package com.google.android.finsky.layout.play;

import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import java.util.HashSet;

/* loaded from: classes.dex */
final class cj extends dt {
    HashSet<eq> c;
    final /* synthetic */ PlayClusterViewContentV2 d;
    private int e;

    public cj(PlayClusterViewContentV2 playClusterViewContentV2) {
        this.d = playClusterViewContentV2;
        this.e = playClusterViewContentV2.w.X_() ? 1 : 0;
        this.c = new HashSet<>();
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return c() + this.d.w.d();
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        if (i <= 0) {
            return 0;
        }
        int a2 = a();
        if (this.e == 1) {
            if (i == a2 - 1) {
                return 2;
            }
            if (d() && i == a2 - e()) {
                return 1;
            }
        } else if (d() && i == a2 - 1) {
            return 1;
        }
        return this.d.w.b();
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        if (i == 0 || i == 1) {
            View view = new View(this.d.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            view.setTag("tagIsSpacer");
            cx cxVar = new cx(view);
            if (i == 0) {
                cxVar.a(false);
                return cxVar;
            }
            return cxVar;
        }
        if (i == 2) {
            View inflate = this.d.y.inflate(R.layout.cluster_loading_cell, viewGroup, false);
            inflate.setTag("tagIsSpacer");
            return new cx(inflate);
        }
        return new cx(this.d.y.inflate(i, viewGroup, false));
    }

    private int f(int i) {
        if (this.d.z) {
            return Math.max(0, ((i - (this.d.t * 2)) - (this.d.E * (this.d.getAdapter().a() - 2))) / 2);
        }
        return 0;
    }

    private boolean d() {
        return this.d.t > 0 || this.d.z;
    }

    private int e() {
        return (d() ? 1 : 0) + 1;
    }

    final int c() {
        return (this.e != 1 ? 0 : 1) + e();
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        this.c.add(eqVar);
        int i2 = eqVar.e;
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = eqVar.f795a.getLayoutParams();
        if (i2 == 0) {
            layoutParams.width = this.d.d(measuredWidth, measuredHeight) + this.d.t + f(measuredWidth);
            return;
        }
        if (i2 == 1) {
            layoutParams.width = this.d.t + f(measuredWidth);
            return;
        }
        if (i2 != 2) {
            int i3 = i - 1;
            this.d.w.a(eqVar.f795a, i3);
            if (this.d.B.b() != 3) {
                layoutParams.width = this.d.e(measuredWidth, measuredHeight);
            }
            if (layoutParams.height != -1) {
                layoutParams.height = this.d.B.a(this.d.w.a(i3), this.d.D, layoutParams.width);
            }
        }
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar) {
        this.c.remove(eqVar);
        KeyEvent.Callback callback = eqVar.f795a;
        if (callback instanceof com.google.android.finsky.adapters.ap) {
            ((com.google.android.finsky.adapters.ap) callback).ab_();
        }
    }

    @Override // android.support.v7.widget.dt
    public final boolean b() {
        return true;
    }

    static /* synthetic */ void a(cj cjVar, int i) {
        cjVar.e = i;
        cjVar.f774a.a();
    }
}
