package com.caverock.androidsvg;

/* loaded from: classes.dex */
public final class s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float f1394a;

    /* renamed from: b, reason: collision with root package name */
    public float f1395b;
    public float c;
    public float d;

    public s(float f, float f2, float f3, float f4) {
        this.f1394a = f;
        this.f1395b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static s a(float f, float f2, float f3, float f4) {
        return new s(f, f2, f3 - f, f4 - f2);
    }

    public final float a() {
        return this.f1394a + this.c;
    }

    public final float b() {
        return this.f1395b + this.d;
    }

    public final String toString() {
        return "[" + this.f1394a + " " + this.f1395b + " " + this.c + " " + this.d + "]";
    }
}
