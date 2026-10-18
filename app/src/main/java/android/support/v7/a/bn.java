package android.support.v7.a;

/* loaded from: classes.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    static bn f510a;

    /* renamed from: b, reason: collision with root package name */
    public long f511b;
    public long c;
    public int d;

    bn() {
    }

    public final void a(long j, double d, double d2) {
        float f = 6.24006f + (0.01720197f * ((j - 946728000000L) / 8.64E7f));
        double sin = f + (0.03341960161924362d * Math.sin(f)) + (3.4906598739326E-4d * Math.sin(2.0f * f)) + (5.236000106378924E-6d * Math.sin(3.0f * f)) + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(f) * 0.0053d) + ((-d2) / 360.0d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-0.0069d) * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d3 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d3) * Math.sin(asin))) / (Math.cos(asin) * Math.cos(d3));
        if (sin3 >= 1.0d) {
            this.d = 1;
            this.f511b = -1L;
            this.c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.d = 0;
                this.f511b = -1L;
                this.c = -1L;
                return;
            }
            float acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f511b = Math.round((acos + sin2) * 8.64E7d) + 946728000000L;
            this.c = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            if (this.c < j && this.f511b > j) {
                this.d = 0;
            } else {
                this.d = 1;
            }
        }
    }
}
