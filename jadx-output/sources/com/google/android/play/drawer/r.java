package com.google.android.play.drawer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.play.utils.PlayCommonLog;

/* loaded from: classes.dex */
public class r extends DrawerLayout implements android.support.v4.widget.v {
    private int n;
    private float o;
    public ListView p;
    public TextView q;
    public ViewGroup r;
    public a s;
    public android.support.v7.a.f t;
    public boolean u;
    public boolean v;
    private android.support.v4.widget.v w;

    public r(Context context) {
        this(context, null);
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = false;
        Drawable drawable = getResources().getDrawable(com.google.android.play.j.drawer_shadow);
        if (!DrawerLayout.f406a) {
            this.i = drawable;
            super.a();
            invalidate();
        }
        super.setDrawerListener(this);
    }

    @Override // android.view.View
    @TargetApi(20)
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.r = (ViewGroup) findViewById(com.google.android.play.k.play_drawer_root);
        this.p = (ListView) findViewById(com.google.android.play.k.play_drawer_list);
        this.q = (TextView) findViewById(com.google.android.play.k.play_drawer_docked_action);
        this.q.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 21) {
            this.r.setOnApplyWindowInsetsListener(new s(this));
        }
    }

    public void setActionBarHeight(int i) {
        f();
        Resources resources = getResources();
        int i2 = resources.getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.play.i.play_drawer_max_width);
        this.r.getLayoutParams().width = Math.min(dimensionPixelSize, i2 - i);
        this.r.requestLayout();
    }

    public void setIsMiniProfile(boolean z) {
        this.v = z;
    }

    public void setCurrentAvatarClickable(boolean z) {
        f();
        this.s.j = z;
    }

    public final void f() {
        if (!this.u) {
            PlayCommonLog.d("Play Drawer configure was not called", new Object[0]);
        }
    }

    public final boolean g() {
        f();
        return g(this.r);
    }

    public void setDrawerToggle(android.support.v7.a.f fVar) {
        this.t = fVar;
        if (this.t != null) {
            this.t.a();
        }
    }

    public final void h() {
        f();
        if (g(this.r)) {
            f(this.r);
        }
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        f();
        if (this.t != null) {
            android.support.v7.a.f fVar = this.t;
            if (z == fVar.d) {
                return;
            }
            if (z) {
                fVar.a((Drawable) fVar.f523b, fVar.f522a.b() ? fVar.g : fVar.f);
            } else {
                fVar.a(fVar.c, 0);
            }
            fVar.d = z;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.u && this.t != null) {
            android.support.v7.a.f fVar = this.t;
            if (!fVar.e) {
                fVar.c = fVar.b();
            }
            fVar.a();
        }
    }

    public void b_(View view) {
        if (this.t != null) {
            this.t.b_(view);
        }
        this.s.a();
        if (this.w != null) {
            this.w.b_(view);
        }
    }

    public void c_(View view) {
        if (this.t != null) {
            this.t.c_(view);
        }
        if (this.w != null) {
            this.w.c_(view);
        }
    }

    @Override // android.support.v4.widget.v
    public final void a(View view, float f) {
        if (this.n == 2 && f < this.o) {
            this.s.a();
        }
        this.o = f;
        if (this.t != null) {
            this.t.a(view, f);
        }
        if (this.w != null) {
            this.w.a(view, f);
        }
    }

    @Override // android.support.v4.widget.v
    public final void d_(int i) {
        this.n = i;
        if (this.w != null) {
            this.w.d_(i);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout
    public final void setDrawerListener(android.support.v4.widget.v vVar) {
        this.w = vVar;
    }

    @Override // android.support.v4.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (NullPointerException e) {
            return false;
        }
    }
}
