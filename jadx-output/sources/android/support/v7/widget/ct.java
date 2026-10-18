package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class ct extends el {

    /* renamed from: a, reason: collision with root package name */
    private final float f748a;
    protected PointF d;

    /* renamed from: b, reason: collision with root package name */
    protected final LinearInterpolator f749b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected int e = 0;
    protected int f = 0;

    public abstract PointF a(int i);

    public ct(Context context) {
        this.f748a = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a() {
        this.f = 0;
        this.e = 0;
        this.d = null;
    }

    private int b(int i) {
        return (int) Math.ceil(Math.abs(i) * this.f748a);
    }

    private static int a(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 <= 0) {
                    int i7 = i4 - i2;
                    if (i7 >= 0) {
                        return 0;
                    }
                    return i7;
                }
                return i6;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a(View view, em emVar) {
        int a2;
        int i = 1;
        int i2 = 0;
        int i3 = (this.d == null || this.d.x == 0.0f) ? 0 : this.d.x > 0.0f ? 1 : -1;
        ec ecVar = this.i;
        if (ecVar.i()) {
            ed edVar = (ed) view.getLayoutParams();
            a2 = a(ec.d(view) - edVar.leftMargin, edVar.rightMargin + ec.f(view), ecVar.r(), View.MeasureSpec.getSize(ecVar.v) - ecVar.t(), i3);
        } else {
            a2 = 0;
        }
        if (this.d == null || this.d.y == 0.0f) {
            i = 0;
        } else if (this.d.y <= 0.0f) {
            i = -1;
        }
        ec ecVar2 = this.i;
        if (ecVar2.j()) {
            ed edVar2 = (ed) view.getLayoutParams();
            i2 = a(ec.e(view) - edVar2.topMargin, edVar2.bottomMargin + ec.g(view), ecVar2.s(), View.MeasureSpec.getSize(ecVar2.w) - ecVar2.u(), i);
        }
        int ceil = (int) Math.ceil(b((int) Math.sqrt((a2 * a2) + (i2 * i2))) / 0.3356d);
        if (ceil > 0) {
            emVar.a(-a2, -i2, ceil, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a(int i, int i2, em emVar) {
        if (this.h.e.q() == 0) {
            b();
            return;
        }
        this.e = a(this.e, i);
        this.f = a(this.f, i2);
        if (this.e == 0 && this.f == 0) {
            PointF a2 = a(this.g);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
                emVar.c = this.g;
                b();
                return;
            }
            double sqrt = Math.sqrt((a2.x * a2.x) + (a2.y * a2.y));
            a2.x = (float) (a2.x / sqrt);
            a2.y = (float) (a2.y / sqrt);
            this.d = a2;
            this.e = (int) (a2.x * 10000.0f);
            this.f = (int) (a2.y * 10000.0f);
            emVar.a((int) (this.e * 1.2f), (int) (this.f * 1.2f), (int) (b(10000) * 1.2f), this.f749b);
        }
    }
}
