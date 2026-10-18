package android.support.v4.widget;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    int f432a;

    /* renamed from: b, reason: collision with root package name */
    int f433b;
    float c;
    float d;
    float j;
    int k;
    long e = Long.MIN_VALUE;
    long i = -1;
    long f = 0;
    int g = 0;
    int h = 0;

    final float a(long j) {
        float a2;
        float a3;
        if (j < this.e) {
            return 0.0f;
        }
        if (this.i < 0 || j < this.i) {
            a2 = a.a((j - this.e) / this.f432a, 0.0f, 1.0f);
            return a2 * 0.5f;
        }
        long j2 = j - this.i;
        float f = 1.0f - this.j;
        float f2 = this.j;
        a3 = a.a(j2 / this.k, 0.0f, 1.0f);
        return (a3 * f2) + f;
    }
}
