package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
/* loaded from: classes.dex */
final class ag extends aa {
    private final Interpolator n;
    private InsetDrawable o;

    ag(cd cdVar, ai aiVar) {
        super(cdVar, aiVar);
        this.n = cdVar.isInEditMode() ? null : AnimationUtils.loadInterpolator(this.k.getContext(), android.R.interpolator.fast_out_slow_in);
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable drawable;
        this.f79b = android.support.v4.c.apkg.a.c(h());
        android.support.v4.c.apkg.a.a(this.f79b, colorStateList);
        if (mode != null) {
            android.support.v4.c.apkg.a.a(this.f79b, mode);
        }
        if (i2 > 0) {
            this.d = a(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.d, this.f79b});
        } else {
            this.d = null;
            drawable = this.f79b;
        }
        this.c = new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        this.e = this.c;
        this.l.a(this.c);
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void a(int i) {
        if (this.c instanceof RippleDrawable) {
            ((RippleDrawable) this.c).setColor(ColorStateList.valueOf(i));
        } else {
            super.a(i);
        }
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    public final void a(float f) {
        this.k.setElevation(f);
        if (this.l.b()) {
            f();
        }
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void b(float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(h, a(ObjectAnimator.ofFloat(this.k, "translationZ", f)));
        stateListAnimator.addState(i, a(ObjectAnimator.ofFloat(this.k, "translationZ", f)));
        stateListAnimator.addState(j, a(ObjectAnimator.ofFloat(this.k, "translationZ", 0.0f)));
        this.k.setStateListAnimator(stateListAnimator);
        if (this.l.b()) {
            f();
        }
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    public final float a() {
        return this.k.getElevation();
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void c() {
        f();
    }

    @Override // android.support.design.widget.ad
    final void b(Rect rect) {
        if (this.l.b()) {
            this.o = new InsetDrawable(this.c, rect.left, rect.top, rect.right, rect.bottom);
            this.l.a(this.o);
        } else {
            this.l.a(this.c);
        }
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void a(int[] iArr) {
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void b() {
    }

    @Override // android.support.design.widget.aa, android.support.design.widget.ad
    final boolean d() {
        return false;
    }

    private Animator a(Animator animator) {
        animator.setInterpolator(this.n);
        return animator;
    }

    @Override // android.support.design.widget.ad
    final e g() {
        return new f();
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void a(Rect rect) {
        if (this.l.b()) {
            float a2 = this.l.a();
            float elevation = this.k.getElevation() + this.g;
            int ceil = (int) Math.ceil(ah.b(elevation, a2, false));
            int ceil2 = (int) Math.ceil(ah.a(elevation, a2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
