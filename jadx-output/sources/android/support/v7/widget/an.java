package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
final class an {
    private final CompoundButton c;
    private final ao d;
    private boolean g;

    /* renamed from: a, reason: collision with root package name */
    ColorStateList f662a = null;

    /* renamed from: b, reason: collision with root package name */
    PorterDuff.Mode f663b = null;
    private boolean e = false;
    private boolean f = false;

    an(CompoundButton compoundButton, ao aoVar) {
        this.c = compoundButton;
        this.d = aoVar;
    }

    final void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.c.getContext().obtainStyledAttributes(attributeSet, android.support.v7.b.l.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(android.support.v7.b.l.CompoundButton_android_button, 0)) != 0) {
                this.c.setButtonDrawable(this.d.a(this.c.getContext(), resourceId, false));
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.CompoundButton_buttonTint)) {
                android.support.v4.widget.f.a(this.c, obtainStyledAttributes.getColorStateList(android.support.v7.b.l.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.b.l.CompoundButton_buttonTintMode)) {
                android.support.v4.widget.f.a(this.c, cf.a(obtainStyledAttributes.getInt(android.support.v7.b.l.CompoundButton_buttonTintMode, -1)));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    final void a(ColorStateList colorStateList) {
        this.f662a = colorStateList;
        this.e = true;
        b();
    }

    final void a(PorterDuff.Mode mode) {
        this.f663b = mode;
        this.f = true;
        b();
    }

    final void a() {
        if (this.g) {
            this.g = false;
        } else {
            this.g = true;
            b();
        }
    }

    private void b() {
        Drawable a2 = android.support.v4.widget.f.a(this.c);
        if (a2 != null) {
            if (this.e || this.f) {
                Drawable mutate = android.support.v4.c.a.a.c(a2).mutate();
                if (this.e) {
                    android.support.v4.c.a.a.a(mutate, this.f662a);
                }
                if (this.f) {
                    android.support.v4.c.a.a.a(mutate, this.f663b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.c.getDrawableState());
                }
                this.c.setButtonDrawable(mutate);
            }
        }
    }

    final int a(int i) {
        Drawable a2;
        if (Build.VERSION.SDK_INT < 17 && (a2 = android.support.v4.widget.f.a(this.c)) != null) {
            return i + a2.getIntrinsicWidth();
        }
        return i;
    }
}
