package com.google.android.finsky.layout.actionbar;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.Window;
import com.deivid22srk.store.R;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.search.ah;

/* loaded from: classes.dex */
public final class a implements com.google.android.play.headerlist.j, ah {

    /* renamed from: a, reason: collision with root package name */
    private PlayHeaderListLayout f3110a;

    /* renamed from: b, reason: collision with root package name */
    private Window f3111b;
    private final Drawable c;
    private final Drawable d;
    private Drawable e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private ObjectAnimator j;
    private ObjectAnimator k;

    public a(Window window, PlayHeaderListLayout playHeaderListLayout) {
        this.f3111b = window;
        this.f3110a = playHeaderListLayout;
        Resources resources = playHeaderListLayout.getResources();
        this.c = new ColorDrawable(0);
        this.d = new b(this, GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f3110a.getResources().getColor(R.color.status_bar_overlay), 0}, FinskySearchToolbar.a(this.f3110a.getContext()));
        this.e = this.d;
        this.i = resources.getColor(R.color.play_search_overlay_color);
        this.f = this.f3110a.c();
        this.h = this.f3110a.b();
        b();
    }

    @Override // com.google.android.play.headerlist.j
    public final void a() {
        if (this.f3110a != null) {
            boolean c = this.f3110a.c();
            if (this.f != c) {
                this.f = c;
                b();
            }
            boolean b2 = this.f3110a.b();
            if (this.h != b2) {
                this.h = b2;
                if (this.g) {
                    f();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (!this.h) {
                f();
            }
        }
    }

    public final void b() {
        this.e = this.f ? this.c : this.d;
        a(this.e);
    }

    @TargetApi(21)
    private void f() {
        if (Build.VERSION.SDK_INT >= 21 && this.f3110a != null) {
            boolean z = this.g && !this.h;
            if (this.j != null) {
                this.j.cancel();
            }
            this.j = ObjectAnimator.ofArgb(this.f3111b, "statusBarColor", z ? this.i : this.f3110a.getResources().getColor(R.color.status_bar_overlay));
            this.j.setDuration(300L).start();
            if (this.k != null) {
                this.k.cancel();
            }
            this.k = ObjectAnimator.ofInt(this.d, "alpha", z ? 0 : 255);
            this.k.setDuration(300L).start();
        }
    }

    @Override // com.google.android.play.search.ah
    public final void c() {
        a(true);
    }

    @Override // com.google.android.play.search.ah
    public final void d() {
        a(false);
    }

    public final void e() {
        a(this.c);
        this.f3111b = null;
        this.f3110a = null;
    }

    private void a(Drawable drawable) {
        if (this.f3110a != null) {
            this.f3110a.getToolbarContainer().setBackgroundDrawable(drawable);
        }
    }
}
