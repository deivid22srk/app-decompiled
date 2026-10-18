package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final View f654a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f655b;
    private fv c;
    private fv d;
    private fv e;

    aj(View view, ao aoVar) {
        this.f654a = view;
        this.f655b = aoVar;
    }

    final void a(AttributeSet attributeSet, int i) {
        ColorStateList b2;
        TypedArray obtainStyledAttributes = this.f654a.getContext().obtainStyledAttributes(attributeSet, android.support.v7.b.l.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.ViewBackgroundHelper_android_background) && (b2 = this.f655b.b(this.f654a.getContext(), obtainStyledAttributes.getResourceId(android.support.v7.b.l.ViewBackgroundHelper_android_background, -1))) != null) {
                b(b2);
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.ViewBackgroundHelper_backgroundTint)) {
                android.support.v4.view.by.a(this.f654a, obtainStyledAttributes.getColorStateList(android.support.v7.b.l.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.ViewBackgroundHelper_backgroundTintMode)) {
                android.support.v4.view.by.a(this.f654a, cf.a(obtainStyledAttributes.getInt(android.support.v7.b.l.ViewBackgroundHelper_backgroundTintMode, -1)));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    final void a(int i) {
        b(this.f655b != null ? this.f655b.b(this.f654a.getContext(), i) : null);
    }

    final void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new fv();
        }
        this.d.f833a = colorStateList;
        this.d.d = true;
        c();
    }

    final ColorStateList a() {
        if (this.d != null) {
            return this.d.f833a;
        }
        return null;
    }

    final void a(PorterDuff.Mode mode) {
        if (this.d == null) {
            this.d = new fv();
        }
        this.d.f834b = mode;
        this.d.c = true;
        c();
    }

    final PorterDuff.Mode b() {
        if (this.d != null) {
            return this.d.f834b;
        }
        return null;
    }

    final void c() {
        Drawable background = this.f654a.getBackground();
        if (background != null) {
            if (this.d != null) {
                ao.a(background, this.d, this.f654a.getDrawableState());
                return;
            }
            if (this.c != null) {
                ao.a(background, this.c, this.f654a.getDrawableState());
                return;
            }
            if (!(Build.VERSION.SDK_INT == 21 && (background instanceof GradientDrawable))) {
                return;
            }
            if (this.e == null) {
                this.e = new fv();
            }
            fv fvVar = this.e;
            fvVar.f833a = null;
            fvVar.d = false;
            fvVar.f834b = null;
            fvVar.c = false;
            ColorStateList D = android.support.v4.view.by.D(this.f654a);
            if (D != null) {
                fvVar.d = true;
                fvVar.f833a = D;
            }
            PorterDuff.Mode E = android.support.v4.view.by.E(this.f654a);
            if (E != null) {
                fvVar.c = true;
                fvVar.f834b = E;
            }
            if (!fvVar.d && !fvVar.c) {
                return;
            }
            ao.a(background, fvVar, this.f654a.getDrawableState());
        }
    }

    final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new fv();
            }
            this.c.f833a = colorStateList;
            this.c.d = true;
        } else {
            this.c = null;
        }
        c();
    }
}
