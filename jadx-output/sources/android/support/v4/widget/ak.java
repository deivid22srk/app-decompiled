package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ak extends Drawable implements Animatable {
    private static final Interpolator c = new LinearInterpolator();
    private static final Interpolator d = new android.support.v4.view.b.b();

    /* renamed from: b, reason: collision with root package name */
    boolean f422b;
    private float g;
    private Resources h;
    private View i;
    private Animation j;
    private float k;
    private double l;
    private double m;
    private final int[] e = {-16777216};
    private final ArrayList<Animation> f = new ArrayList<>();
    private final Drawable.Callback n = new an(this);

    /* renamed from: a, reason: collision with root package name */
    final ao f421a = new ao(this.n);

    public ak(Context context, View view) {
        this.i = view;
        this.h = context.getResources();
        this.f421a.a(this.e);
        a(1);
        ao aoVar = this.f421a;
        al alVar = new al(this, aoVar);
        alVar.setRepeatCount(-1);
        alVar.setRepeatMode(1);
        alVar.setInterpolator(c);
        alVar.setAnimationListener(new am(this, aoVar));
        this.j = alVar;
    }

    private void a(double d2, double d3, double d4, double d5, float f, float f2) {
        float ceil;
        ao aoVar = this.f421a;
        float f3 = this.h.getDisplayMetrics().density;
        this.l = f3 * d2;
        this.m = f3 * d3;
        float f4 = ((float) d5) * f3;
        aoVar.g = f4;
        aoVar.f429b.setStrokeWidth(f4);
        aoVar.d();
        aoVar.q = f3 * d4;
        aoVar.a(0);
        aoVar.r = (int) (f * f3);
        aoVar.s = (int) (f3 * f2);
        float min = Math.min((int) this.l, (int) this.m);
        if (aoVar.q <= 0.0d || min < 0.0f) {
            ceil = (float) Math.ceil(aoVar.g / 2.0f);
        } else {
            ceil = (float) ((min / 2.0f) - aoVar.q);
        }
        aoVar.h = ceil;
    }

    public final void a(int i) {
        if (i == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void a(boolean z) {
        this.f421a.a(z);
    }

    public final void a(float f) {
        ao aoVar = this.f421a;
        if (f == aoVar.p) {
            return;
        }
        aoVar.p = f;
        aoVar.d();
    }

    public final void b(float f) {
        this.f421a.a(0.0f);
        this.f421a.b(f);
    }

    public final void b(int i) {
        this.f421a.v = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        ao aoVar = this.f421a;
        RectF rectF = aoVar.f428a;
        rectF.set(bounds);
        rectF.inset(aoVar.h, aoVar.h);
        float f = 360.0f * (aoVar.d + aoVar.f);
        float f2 = ((aoVar.e + aoVar.f) * 360.0f) - f;
        aoVar.f429b.setColor(aoVar.w);
        canvas.drawArc(rectF, f, f2, false, aoVar.f429b);
        if (aoVar.n) {
            if (aoVar.o == null) {
                aoVar.o = new Path();
                aoVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aoVar.o.reset();
            }
            float f3 = (((int) aoVar.h) / 2) * aoVar.p;
            float cos = (float) ((aoVar.q * Math.cos(0.0d)) + bounds.exactCenterX());
            float sin = (float) ((aoVar.q * Math.sin(0.0d)) + bounds.exactCenterY());
            aoVar.o.moveTo(0.0f, 0.0f);
            aoVar.o.lineTo(aoVar.r * aoVar.p, 0.0f);
            aoVar.o.lineTo((aoVar.r * aoVar.p) / 2.0f, aoVar.s * aoVar.p);
            aoVar.o.offset(cos - f3, sin);
            aoVar.o.close();
            aoVar.c.setColor(aoVar.w);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aoVar.o, aoVar.c);
        }
        if (aoVar.t < 255) {
            aoVar.u.setColor(aoVar.v);
            aoVar.u.setAlpha(255 - aoVar.t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, aoVar.u);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f421a.t = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f421a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ao aoVar = this.f421a;
        aoVar.f429b.setColorFilter(colorFilter);
        aoVar.d();
    }

    final void c(float f) {
        this.g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.j.reset();
        this.f421a.b();
        if (this.f421a.e != this.f421a.d) {
            this.f422b = true;
            this.j.setDuration(666L);
            this.i.startAnimation(this.j);
        } else {
            this.f421a.a(0);
            this.f421a.c();
            this.j.setDuration(1332L);
            this.i.startAnimation(this.j);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.clearAnimation();
        c(0.0f);
        this.f421a.a(false);
        this.f421a.a(0);
        this.f421a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(float f, ao aoVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = aoVar.i[aoVar.j];
            int i2 = aoVar.i[aoVar.a()];
            int intValue = Integer.valueOf(i).intValue();
            int i3 = (intValue >> 24) & 255;
            int i4 = (intValue >> 16) & 255;
            int i5 = (intValue >> 8) & 255;
            int intValue2 = Integer.valueOf(i2).intValue();
            aoVar.w = (((int) (f2 * ((intValue2 & 255) - r1))) + (intValue & 255)) | ((i3 + ((int) ((((intValue2 >> 24) & 255) - i3) * f2))) << 24) | ((i4 + ((int) ((((intValue2 >> 16) & 255) - i4) * f2))) << 16) | ((((int) ((((intValue2 >> 8) & 255) - i5) * f2)) + i5) << 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float b(ao aoVar) {
        return (float) Math.toRadians(aoVar.g / (6.283185307179586d * aoVar.q));
    }

    static /* synthetic */ void a(float f, ao aoVar) {
        c(f, aoVar);
        float floor = (float) (Math.floor(aoVar.m / 0.8f) + 1.0d);
        aoVar.a((((aoVar.l - b(aoVar)) - aoVar.k) * f) + aoVar.k);
        aoVar.b(aoVar.l);
        aoVar.c(((floor - aoVar.m) * f) + aoVar.m);
    }
}
