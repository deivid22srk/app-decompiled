package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f3123a;
    public final Context c;
    public ControlsContainerBackground d;
    public Drawable e;
    ViewGroup f;
    View g;
    public PlayHeaderListLayout h;
    public View i;
    public com.google.android.finsky.layout.play.cn j;
    public boolean k;
    public int l;
    private final int n;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3124b = new int[2];
    private float o = -1.0f;
    private float p = -1.0f;
    final ViewTreeObserver.OnPreDrawListener m = new ae(this);

    static {
        f3123a = Build.VERSION.SDK_INT >= 21;
    }

    public ad(Context context) {
        this.c = context;
        this.n = ik.d(this.c);
    }

    public final void a() {
        if (this.i != null) {
            if (f3123a) {
                this.f.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            this.f = null;
            this.g = null;
            this.i.getViewTreeObserver().removeOnPreDrawListener(this.m);
            this.i = null;
        }
    }

    static /* synthetic */ boolean a(ad adVar) {
        boolean z;
        if (adVar.h == null || adVar.f == null) {
            return false;
        }
        int measuredHeight = adVar.i.getMeasuredHeight();
        int height = adVar.f.getHeight();
        if (InsetsFrameLayout.f3009a) {
            height += adVar.n;
        }
        if (adVar.d.a(measuredHeight, height)) {
            if (f3123a) {
                adVar.f.invalidateOutline();
            }
            z = true;
        } else {
            z = false;
        }
        int actionBarHeight = adVar.n + adVar.h.getActionBarHeight();
        if (adVar.j == null || z) {
            adVar.j = new com.google.android.finsky.layout.play.cn(height, actionBarHeight);
        }
        int controlsContainerTranslatedTop = (height + ((int) adVar.h.getControlsContainerTranslatedTop())) - adVar.h.getTabBarHeight();
        boolean z2 = controlsContainerTranslatedTop <= actionBarHeight;
        ControlsContainerBackground controlsContainerBackground = adVar.d;
        boolean z3 = adVar.k;
        if (controlsContainerBackground.d != z2 && controlsContainerBackground.c != controlsContainerBackground.f2944b) {
            controlsContainerBackground.d = z2;
            int i = z2 ? controlsContainerBackground.c : controlsContainerBackground.f2944b;
            if (controlsContainerBackground.f2943a != null) {
                controlsContainerBackground.f2943a.a();
            }
            controlsContainerBackground.f2943a = new bj(controlsContainerBackground);
            controlsContainerBackground.f2943a.a(controlsContainerBackground.getHeight(), i);
            controlsContainerBackground.f2943a.setDuration((Math.abs(controlsContainerBackground.getHeight() - i) * 300) / Math.abs(controlsContainerBackground.c - controlsContainerBackground.f2944b));
            controlsContainerBackground.f2943a.setInterpolator((!z2 || z3) ? new DecelerateInterpolator() : new AccelerateInterpolator());
            controlsContainerBackground.startAnimation(controlsContainerBackground.f2943a);
        }
        float min = Math.min(1.0f, Math.max(0.0f, (controlsContainerTranslatedTop - 0.0f) / adVar.n));
        if (adVar.o != min) {
            adVar.o = min;
            android.support.v4.view.by.c(adVar.i, min);
        }
        float a2 = adVar.j.a(controlsContainerTranslatedTop);
        if (adVar.p == a2) {
            return z;
        }
        adVar.p = a2;
        android.support.v4.view.by.c(adVar.g, a2);
        return z;
    }
}
