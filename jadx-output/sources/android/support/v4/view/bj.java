package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    public boolean f351a;

    /* renamed from: b, reason: collision with root package name */
    private final View f352b;
    private ViewParent c;
    private int[] d;

    public bj(View view) {
        this.f352b = view;
    }

    public final void a(boolean z) {
        if (this.f351a) {
            by.G(this.f352b);
        }
        this.f351a = z;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean a(int i) {
        if (a()) {
            return true;
        }
        if (this.f351a) {
            View view = this.f352b;
            for (ViewParent parent = this.f352b.getParent(); parent != null; parent = parent.getParent()) {
                if (dr.a(parent, view, this.f352b, i)) {
                    this.c = parent;
                    dr.b(parent, view, this.f352b, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void b() {
        if (this.c != null) {
            dr.a(this.c, this.f352b);
            this.c = null;
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        if (!this.f351a || this.c == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr != null) {
                this.f352b.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            dr.a(this.c, this.f352b, i, i2, i3, i4);
            if (iArr != null) {
                this.f352b.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        }
        if (iArr == null) {
            return false;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        return false;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4;
        if (!this.f351a || this.c == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f352b.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i3 = iArr2[1];
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.d == null) {
                    this.d = new int[2];
                }
                iArr = this.d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            dr.a(this.c, this.f352b, i, i2, iArr);
            if (iArr2 != null) {
                this.f352b.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i3;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        }
        if (iArr2 == null) {
            return false;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (!this.f351a || this.c == null) {
            return false;
        }
        return dr.a(this.c, this.f352b, f, f2, z);
    }

    public final boolean a(float f, float f2) {
        if (!this.f351a || this.c == null) {
            return false;
        }
        return dr.a(this.c, this.f352b, f, f2);
    }
}
