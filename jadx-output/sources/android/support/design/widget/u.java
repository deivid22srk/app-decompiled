package android.support.design.widget;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class u extends ad {

    /* renamed from: a, reason: collision with root package name */
    ah f146a;
    private int n;
    private bb o;
    private boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(cd cdVar, ai aiVar) {
        super(cdVar, aiVar);
        byte b2 = 0;
        this.n = cdVar.getResources().getInteger(R.integer.config_shortAnimTime);
        this.o = new bb();
        bb bbVar = this.o;
        View a2 = bbVar.a();
        if (a2 != cdVar) {
            if (a2 != null) {
                View a3 = bbVar.a();
                int size = bbVar.f102a.size();
                for (int i = 0; i < size; i++) {
                    if (a3.getAnimation() == bbVar.f102a.get(i).f106b) {
                        a3.clearAnimation();
                    }
                }
                bbVar.d = null;
                bbVar.f103b = null;
                bbVar.c = null;
            }
            if (cdVar != null) {
                bbVar.d = new WeakReference<>(cdVar);
            }
        }
        this.o.a(h, a(new y(this, b2)));
        this.o.a(i, a(new y(this, b2)));
        this.o.a(j, a(new z(this, b2)));
    }

    @Override // android.support.design.widget.ad
    void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.f79b = android.support.v4.c.a.a.c(h());
        android.support.v4.c.a.a.a(this.f79b, colorStateList);
        if (mode != null) {
            android.support.v4.c.a.a.a(this.f79b, mode);
        }
        this.c = android.support.v4.c.a.a.c(h());
        android.support.v4.c.a.a.a(this.c, b(i));
        android.support.v4.c.a.a.a(this.c, PorterDuff.Mode.MULTIPLY);
        if (i2 > 0) {
            this.d = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.d, this.f79b, this.c};
        } else {
            this.d = null;
            drawableArr = new Drawable[]{this.f79b, this.c};
        }
        this.e = new LayerDrawable(drawableArr);
        this.f146a = new ah(this.k.getResources(), this.e, this.l.a(), this.f, this.f + this.g);
        ah ahVar = this.f146a;
        ahVar.k = false;
        ahVar.invalidateSelf();
        this.l.a(this.f146a);
    }

    @Override // android.support.design.widget.ad
    final void a(ColorStateList colorStateList) {
        android.support.v4.c.a.a.a(this.f79b, colorStateList);
        if (this.d != null) {
            this.d.a(colorStateList);
        }
    }

    @Override // android.support.design.widget.ad
    final void a(PorterDuff.Mode mode) {
        android.support.v4.c.a.a.a(this.f79b, mode);
    }

    @Override // android.support.design.widget.ad
    void a(int i) {
        android.support.v4.c.a.a.a(this.c, b(i));
    }

    @Override // android.support.design.widget.ad
    float a() {
        return this.f;
    }

    @Override // android.support.design.widget.ad
    void a(float f) {
        if (this.f146a != null) {
            this.f146a.a(f, this.g + f);
            f();
        }
    }

    @Override // android.support.design.widget.ad
    void b(float f) {
        if (this.f146a != null) {
            ah ahVar = this.f146a;
            ahVar.a(ahVar.j, this.f + f);
            f();
        }
    }

    @Override // android.support.design.widget.ad
    void a(int[] iArr) {
        bd bdVar;
        bb bbVar = this.o;
        int size = bbVar.f102a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bdVar = null;
                break;
            }
            bd bdVar2 = bbVar.f102a.get(i);
            if (StateSet.stateSetMatches(bdVar2.f105a, iArr)) {
                bdVar = bdVar2;
                break;
            }
            i++;
        }
        if (bdVar == bbVar.f103b) {
            return;
        }
        if (bbVar.f103b != null && bbVar.c != null) {
            View a2 = bbVar.a();
            if (a2 != null && a2.getAnimation() == bbVar.c) {
                a2.clearAnimation();
            }
            bbVar.c = null;
        }
        bbVar.f103b = bdVar;
        View view = bbVar.d.get();
        if (bdVar == null || view == null || view.getVisibility() != 0) {
            return;
        }
        bbVar.c = bdVar.f106b;
        View a3 = bbVar.a();
        if (a3 == null) {
            return;
        }
        a3.startAnimation(bbVar.c);
    }

    @Override // android.support.design.widget.ad
    void b() {
        View a2;
        bb bbVar = this.o;
        if (bbVar.c == null || (a2 = bbVar.a()) == null || a2.getAnimation() != bbVar.c) {
            return;
        }
        a2.clearAnimation();
    }

    @Override // android.support.design.widget.ad
    void a(boolean z) {
        if (!this.p && this.k.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.k.getContext(), android.support.design.b.design_fab_out);
            loadAnimation.setInterpolator(a.c);
            loadAnimation.setDuration(200L);
            loadAnimation.setAnimationListener(new v(this, z, null));
            this.k.startAnimation(loadAnimation);
        }
    }

    @Override // android.support.design.widget.ad
    void b(boolean z) {
        if (this.k.getVisibility() != 0 || this.p) {
            this.k.clearAnimation();
            this.k.a(0, z);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.k.getContext(), android.support.design.b.design_fab_in);
            loadAnimation.setDuration(200L);
            loadAnimation.setInterpolator(a.d);
            loadAnimation.setAnimationListener(new w(this, null));
            this.k.startAnimation(loadAnimation);
        }
    }

    @Override // android.support.design.widget.ad
    void c() {
    }

    @Override // android.support.design.widget.ad
    void a(Rect rect) {
        this.f146a.getPadding(rect);
    }

    private Animation a(Animation animation) {
        animation.setInterpolator(a.f73b);
        animation.setDuration(this.n);
        return animation;
    }

    private static ColorStateList b(int i) {
        return new ColorStateList(new int[][]{i, h, new int[0]}, new int[]{i, i, 0});
    }
}
