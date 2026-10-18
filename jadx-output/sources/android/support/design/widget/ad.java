package android.support.design.widget;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
abstract class ad {
    static final int[] h = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] i = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] j = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private final Rect f78a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    Drawable f79b;
    Drawable c;
    e d;
    Drawable e;
    float f;
    float g;
    final cd k;
    final ai l;
    ViewTreeObserver.OnPreDrawListener m;

    abstract float a();

    abstract void a(float f);

    abstract void a(int i2);

    abstract void a(ColorStateList colorStateList);

    abstract void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i2, int i3);

    abstract void a(PorterDuff.Mode mode);

    abstract void a(Rect rect);

    abstract void a(boolean z);

    abstract void a(int[] iArr);

    abstract void b();

    abstract void b(float f);

    abstract void b(boolean z);

    abstract void c();

    ad(cd cdVar, ai aiVar) {
        this.k = cdVar;
        this.l = aiVar;
    }

    final void c(float f) {
        if (this.f != f) {
            this.f = f;
            a(f);
        }
    }

    final void f() {
        Rect rect = this.f78a;
        a(rect);
        b(rect);
        this.l.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void b(Rect rect) {
    }

    boolean d() {
        return false;
    }

    final e a(int i2, ColorStateList colorStateList) {
        Resources resources = this.k.getResources();
        e g = g();
        int color = resources.getColor(android.support.design.d.design_fab_stroke_top_outer_color);
        int color2 = resources.getColor(android.support.design.d.design_fab_stroke_top_inner_color);
        int color3 = resources.getColor(android.support.design.d.design_fab_stroke_end_inner_color);
        int color4 = resources.getColor(android.support.design.d.design_fab_stroke_end_outer_color);
        g.e = color;
        g.f = color2;
        g.g = color3;
        g.h = color4;
        float f = i2;
        if (g.d != f) {
            g.d = f;
            g.f133a.setStrokeWidth(f * 1.3333f);
            g.i = true;
            g.invalidateSelf();
        }
        g.a(colorStateList);
        return g;
    }

    e g() {
        return new e();
    }

    void e() {
    }

    static GradientDrawable h() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        return gradientDrawable;
    }
}
