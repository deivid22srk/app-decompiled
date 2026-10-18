package android.support.v4.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class by {
    private static final Interpolator v = new bz();

    /* renamed from: a, reason: collision with root package name */
    public int f448a;

    /* renamed from: b, reason: collision with root package name */
    int f449b;
    float[] c;
    float[] d;
    float[] e;
    float[] f;
    int g;
    float h;
    int i;
    int j;
    View k;
    private int[] m;
    private int[] n;
    private int[] o;
    private VelocityTracker p;
    private float q;
    private bc r;
    private final cb s;
    private boolean t;
    private final ViewGroup u;
    private int l = -1;
    private final Runnable w = new ca(this);

    public static by a(ViewGroup viewGroup, cb cbVar) {
        return new by(viewGroup.getContext(), viewGroup, cbVar);
    }

    public static by a(ViewGroup viewGroup, float f, cb cbVar) {
        by a2 = a(viewGroup, cbVar);
        a2.f449b = (int) (a2.f449b * (1.0f / f));
        return a2;
    }

    private by(Context context, ViewGroup viewGroup, cb cbVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cbVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.u = viewGroup;
        this.s = cbVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f449b = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = bc.a(context, v);
    }

    public final void a(View view, int i) {
        if (view.getParent() != this.u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
        }
        this.k = view;
        this.l = i;
        this.s.b(view);
        a(1);
    }

    public final void a() {
        this.l = -1;
        if (this.c != null) {
            Arrays.fill(this.c, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.m, 0);
            Arrays.fill(this.n, 0);
            Arrays.fill(this.o, 0);
            this.g = 0;
        }
        if (this.p != null) {
            this.p.recycle();
            this.p = null;
        }
    }

    public final boolean a(View view, int i, int i2) {
        this.k = view;
        this.l = -1;
        boolean a2 = a(i, i2, 0, 0);
        if (!a2 && this.f448a == 0 && this.k != null) {
            this.k = null;
        }
        return a2;
    }

    public final boolean a(int i, int i2) {
        if (!this.t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return a(i, i2, (int) android.support.v4.view.bu.a(this.p, this.l), (int) android.support.v4.view.bu.b(this.p, this.l));
    }

    private boolean a(int i, int i2, int i3, int i4) {
        int left = this.k.getLeft();
        int top = this.k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.r.h();
            a(0);
            return false;
        }
        View view = this.k;
        int b2 = b(i3, (int) this.h, (int) this.q);
        int b3 = b(i4, (int) this.h, (int) this.q);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.r.a(left, top, i5, i6, (int) (((b3 != 0 ? abs4 / i7 : abs2 / i8) * a(i6, b3, 0)) + ((b2 != 0 ? abs3 / i7 : abs / i8) * a(i5, b2, this.s.c(view)))));
        a(2);
        return true;
    }

    private int a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth() / 2;
        float sin = (((float) Math.sin((float) ((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.4712389167638204d))) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private static int b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private static float a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    public final boolean b() {
        if (this.f448a == 2) {
            boolean g = this.r.g();
            int b2 = this.r.b();
            int c = this.r.c();
            int left = b2 - this.k.getLeft();
            int top = c - this.k.getTop();
            if (left != 0) {
                this.k.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.k.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.b(this.k, b2);
            }
            if (g && b2 == this.r.d() && c == this.r.e()) {
                this.r.h();
                g = false;
            }
            if (!g) {
                this.u.post(this.w);
            }
        }
        return this.f448a == 2;
    }

    private void a(float f) {
        this.t = true;
        this.s.a(this.k, f);
        this.t = false;
        if (this.f448a == 1) {
            a(0);
        }
    }

    private void b(int i) {
        if (this.c != null) {
            this.c[i] = 0.0f;
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.m[i] = 0;
            this.n[i] = 0;
            this.o[i] = 0;
            this.g &= (1 << i) ^ (-1);
        }
    }

    private void c(MotionEvent motionEvent) {
        int c = android.support.v4.view.bc.c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b2 = android.support.v4.view.bc.b(motionEvent, i);
            float c2 = android.support.v4.view.bc.c(motionEvent, i);
            float d = android.support.v4.view.bc.d(motionEvent, i);
            this.e[b2] = c2;
            this.f[b2] = d;
        }
    }

    final void a(int i) {
        this.u.removeCallbacks(this.w);
        if (this.f448a != i) {
            this.f448a = i;
            this.s.a(i);
            if (this.f448a == 0) {
                this.k = null;
            }
        }
    }

    private boolean b(View view, int i) {
        if (view == this.k && this.l == i) {
            return true;
        }
        if (view != null && this.s.a(view)) {
            this.l = i;
            a(view, i);
            return true;
        }
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        View b2;
        int a2 = android.support.v4.view.bc.a(motionEvent);
        int b3 = android.support.v4.view.bc.b(motionEvent);
        if (a2 == 0) {
            a();
        }
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
        this.p.addMovement(motionEvent);
        switch (a2) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b4 = android.support.v4.view.bc.b(motionEvent, 0);
                a(x, y, b4);
                View b5 = b((int) x, (int) y);
                if (b5 == this.k && this.f448a == 2) {
                    b(b5, b4);
                }
                if ((this.m[b4] & this.j) != 0) {
                    this.s.c();
                    break;
                }
                break;
            case 1:
            case 3:
                a();
                break;
            case 2:
                if (this.c != null && this.d != null) {
                    int c = android.support.v4.view.bc.c(motionEvent);
                    for (int i = 0; i < c; i++) {
                        int b6 = android.support.v4.view.bc.b(motionEvent, i);
                        float c2 = android.support.v4.view.bc.c(motionEvent, i);
                        float d = android.support.v4.view.bc.d(motionEvent, i);
                        float f = c2 - this.c[b6];
                        float f2 = d - this.d[b6];
                        View b7 = b((int) c2, (int) d);
                        boolean z = b7 != null && a(b7, f);
                        if (z) {
                            int left = b7.getLeft();
                            int a3 = this.s.a(b7, ((int) f) + left);
                            b7.getTop();
                            this.s.d(b7);
                            int c3 = this.s.c(b7);
                            if (c3 != 0) {
                                if (c3 > 0 && a3 == left) {
                                }
                            }
                            c(motionEvent);
                            break;
                        }
                        b(f, f2, b6);
                        i = (this.f448a == 1 || (z && b(b7, b6))) ? 0 : i + 1;
                        c(motionEvent);
                    }
                    c(motionEvent);
                }
                break;
            case 5:
                int b8 = android.support.v4.view.bc.b(motionEvent, b3);
                float c4 = android.support.v4.view.bc.c(motionEvent, b3);
                float d2 = android.support.v4.view.bc.d(motionEvent, b3);
                a(c4, d2, b8);
                if (this.f448a == 0) {
                    if ((this.m[b8] & this.j) != 0) {
                        this.s.c();
                        break;
                    }
                } else if (this.f448a == 2 && (b2 = b((int) c4, (int) d2)) == this.k) {
                    b(b2, b8);
                    break;
                }
                break;
            case 6:
                b(android.support.v4.view.bc.b(motionEvent, b3));
                break;
        }
        return this.f448a == 1;
    }

    public final void b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int a2 = android.support.v4.view.bc.a(motionEvent);
        int b2 = android.support.v4.view.bc.b(motionEvent);
        if (a2 == 0) {
            a();
        }
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
        this.p.addMovement(motionEvent);
        switch (a2) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b3 = android.support.v4.view.bc.b(motionEvent, 0);
                View b4 = b((int) x, (int) y);
                a(x, y, b3);
                b(b4, b3);
                if ((this.m[b3] & this.j) != 0) {
                    this.s.c();
                    break;
                }
                break;
            case 1:
                if (this.f448a == 1) {
                    c();
                }
                a();
                break;
            case 2:
                if (this.f448a == 1) {
                    int a3 = android.support.v4.view.bc.a(motionEvent, this.l);
                    float c = android.support.v4.view.bc.c(motionEvent, a3);
                    float d = android.support.v4.view.bc.d(motionEvent, a3);
                    int i3 = (int) (c - this.e[this.l]);
                    int i4 = (int) (d - this.f[this.l]);
                    int left = this.k.getLeft() + i3;
                    this.k.getTop();
                    int left2 = this.k.getLeft();
                    int top = this.k.getTop();
                    if (i3 != 0) {
                        left = this.s.a(this.k, left);
                        this.k.offsetLeftAndRight(left - left2);
                    }
                    if (i4 != 0) {
                        this.k.offsetTopAndBottom(this.s.d(this.k) - top);
                    }
                    if (i3 != 0 || i4 != 0) {
                        this.s.b(this.k, left);
                    }
                    c(motionEvent);
                    break;
                } else {
                    int c2 = android.support.v4.view.bc.c(motionEvent);
                    while (i2 < c2) {
                        int b5 = android.support.v4.view.bc.b(motionEvent, i2);
                        float c3 = android.support.v4.view.bc.c(motionEvent, i2);
                        float d2 = android.support.v4.view.bc.d(motionEvent, i2);
                        float f = c3 - this.c[b5];
                        b(f, d2 - this.d[b5], b5);
                        if (this.f448a != 1) {
                            View b6 = b((int) c3, (int) d2);
                            if (!a(b6, f) || !b(b6, b5)) {
                                i2++;
                            }
                        }
                        c(motionEvent);
                        break;
                    }
                    c(motionEvent);
                }
                break;
            case 3:
                if (this.f448a == 1) {
                    a(0.0f);
                }
                a();
                break;
            case 5:
                int b7 = android.support.v4.view.bc.b(motionEvent, b2);
                float c4 = android.support.v4.view.bc.c(motionEvent, b2);
                float d3 = android.support.v4.view.bc.d(motionEvent, b2);
                a(c4, d3, b7);
                if (this.f448a == 0) {
                    b(b((int) c4, (int) d3), b7);
                    if ((this.m[b7] & this.j) != 0) {
                        this.s.c();
                        break;
                    }
                } else {
                    int i5 = (int) c4;
                    int i6 = (int) d3;
                    View view = this.k;
                    if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        b(this.k, b7);
                        break;
                    }
                }
                break;
            case 6:
                int b8 = android.support.v4.view.bc.b(motionEvent, b2);
                if (this.f448a == 1 && b8 == this.l) {
                    int c5 = android.support.v4.view.bc.c(motionEvent);
                    while (true) {
                        if (i2 >= c5) {
                            i = -1;
                        } else {
                            int b9 = android.support.v4.view.bc.b(motionEvent, i2);
                            if (b9 != this.l) {
                                if (b((int) android.support.v4.view.bc.c(motionEvent, i2), (int) android.support.v4.view.bc.d(motionEvent, i2)) == this.k && b(this.k, b9)) {
                                    i = this.l;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        c();
                    }
                }
                b(b8);
                break;
        }
    }

    private void b(float f, float f2, int i) {
        int i2 = a(f, f2, i, 1) ? 1 : 0;
        if (a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.n;
            iArr[i] = iArr[i] | i2;
            this.s.a(i2, i);
        }
    }

    private boolean a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.m[i] & i2) != i2 || (this.j & i2) == 0 || (this.o[i] & i2) == i2 || (this.n[i] & i2) == i2) {
            return false;
        }
        return (abs > ((float) this.f449b) || abs2 > ((float) this.f449b)) && (this.n[i] & i2) == 0 && abs > ((float) this.f449b);
    }

    private boolean a(View view, float f) {
        if (view == null) {
            return false;
        }
        return (this.s.c(view) > 0) && Math.abs(f) > ((float) this.f449b);
    }

    private void c() {
        this.p.computeCurrentVelocity(1000, this.q);
        float a2 = a(android.support.v4.view.bu.a(this.p, this.l), this.h, this.q);
        a(android.support.v4.view.bu.b(this.p, this.l), this.h, this.q);
        a(a2);
    }

    public final View b(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private void a(float f, float f2, int i) {
        if (this.c == null || this.c.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.c != null) {
                System.arraycopy(this.c, 0, fArr, 0, this.c.length);
                System.arraycopy(this.d, 0, fArr2, 0, this.d.length);
                System.arraycopy(this.e, 0, fArr3, 0, this.e.length);
                System.arraycopy(this.f, 0, fArr4, 0, this.f.length);
                System.arraycopy(this.m, 0, iArr, 0, this.m.length);
                System.arraycopy(this.n, 0, iArr2, 0, this.n.length);
                System.arraycopy(this.o, 0, iArr3, 0, this.o.length);
            }
            this.c = fArr;
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.m = iArr;
            this.n = iArr2;
            this.o = iArr3;
        }
        float[] fArr5 = this.c;
        this.e[i] = f;
        fArr5[i] = f;
        float[] fArr6 = this.d;
        this.f[i] = f2;
        fArr6[i] = f2;
        int[] iArr4 = this.m;
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = i2 < this.u.getLeft() + this.i ? 1 : 0;
        if (i3 < this.u.getTop() + this.i) {
            i4 |= 4;
        }
        if (i2 > this.u.getRight() - this.i) {
            i4 |= 2;
        }
        if (i3 > this.u.getBottom() - this.i) {
            i4 |= 8;
        }
        iArr4[i] = i4;
        this.g |= 1 << i;
    }
}
