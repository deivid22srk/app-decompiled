package com.caverock.androidsvg;

/* loaded from: classes.dex */
public final class ag implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    float f1272a;

    /* renamed from: b, reason: collision with root package name */
    cd f1273b;

    public ag(float f, cd cdVar) {
        this.f1272a = 0.0f;
        this.f1273b = cd.px;
        this.f1272a = f;
        this.f1273b = cdVar;
    }

    public ag(float f) {
        this.f1272a = 0.0f;
        this.f1273b = cd.px;
        this.f1272a = f;
        this.f1273b = cd.px;
    }

    public final float a(cg cgVar) {
        switch (r.f1393a[this.f1273b.ordinal()]) {
            case 9:
                s b2 = cgVar.b();
                if (b2 != null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f1272a;
    }

    public final float b(cg cgVar) {
        if (this.f1273b == cd.percent) {
            s b2 = cgVar.b();
            if (b2 == null) {
                return this.f1272a;
            }
            return (b2.d * this.f1272a) / 100.0f;
        }
        return a(cgVar);
    }

    public final float c(cg cgVar) {
        if (this.f1273b == cd.percent) {
            s b2 = cgVar.b();
            if (b2 == null) {
                return this.f1272a;
            }
            float f = b2.c;
            if (f == b2.d) {
                return (this.f1272a * f) / 100.0f;
            }
            return (((float) (Math.sqrt((r0 * r0) + (f * f)) / 1.414213562373095d)) * this.f1272a) / 100.0f;
        }
        return a(cgVar);
    }

    public final float a(cg cgVar, float f) {
        return this.f1273b == cd.percent ? (this.f1272a * f) / 100.0f : a(cgVar);
    }

    public final float a(float f) {
        switch (r.f1393a[this.f1273b.ordinal()]) {
        }
        return this.f1272a;
    }

    public final boolean a() {
        return this.f1272a == 0.0f;
    }

    public final boolean b() {
        return this.f1272a < 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f1272a) + this.f1273b;
    }
}
