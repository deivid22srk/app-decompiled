package com.caverock.androidsvg;

/* loaded from: classes.dex */
final class cj {

    /* renamed from: a, reason: collision with root package name */
    public float f1335a;

    /* renamed from: b, reason: collision with root package name */
    public float f1336b;
    public float c;
    public float d;
    final /* synthetic */ cg e;

    public cj(cg cgVar, float f, float f2, float f3, float f4) {
        this.e = cgVar;
        this.c = 0.0f;
        this.d = 0.0f;
        this.f1335a = f;
        this.f1336b = f2;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (sqrt != 0.0d) {
            this.c = (float) (f3 / sqrt);
            this.d = (float) (f4 / sqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.f1335a;
        float f4 = f2 - this.f1336b;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (sqrt != 0.0d) {
            this.c = ((float) (f3 / sqrt)) + this.c;
            this.d += (float) (f4 / sqrt);
        }
    }

    public final void a(cj cjVar) {
        this.c += cjVar.c;
        this.d += cjVar.d;
    }

    public final String toString() {
        return "(" + this.f1335a + "," + this.f1336b + " " + this.c + "," + this.d + ")";
    }
}
