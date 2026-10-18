package android.support.a.a;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    char f42a;

    /* renamed from: b, reason: collision with root package name */
    float[] f43b;

    /* synthetic */ d(char c, float[] fArr, byte b2) {
        this(c, fArr);
    }

    /* synthetic */ d(d dVar, byte b2) {
        this(dVar);
    }

    private d(char c, float[] fArr) {
        this.f42a = c;
        this.f43b = fArr;
    }

    private d(d dVar) {
        this.f42a = dVar.f42a;
        this.f43b = b.a(dVar.f43b, dVar.f43b.length);
    }

    static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        while (true) {
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = ((f * cos) + (f2 * sin)) / f5;
            double d4 = (((-f) * sin) + (f2 * cos)) / f6;
            double d5 = ((f3 * cos) + (f4 * sin)) / f5;
            double d6 = (((-f3) * sin) + (f4 * cos)) / f6;
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d11);
                float sqrt = (float) (Math.sqrt(d11) / 1.99999d);
                f5 *= sqrt;
                f6 *= sqrt;
            } else {
                double sqrt2 = Math.sqrt(d12);
                double d13 = d7 * sqrt2;
                double d14 = d8 * sqrt2;
                if (z == z2) {
                    d = d9 - d14;
                    d2 = d13 + d10;
                } else {
                    d = d14 + d9;
                    d2 = d10 - d13;
                }
                double atan2 = Math.atan2(d4 - d2, d3 - d);
                double atan22 = Math.atan2(d6 - d2, d5 - d) - atan2;
                if (z2 != (atan22 >= 0.0d)) {
                    if (atan22 > 0.0d) {
                        atan22 -= 6.283185307179586d;
                    } else {
                        atan22 += 6.283185307179586d;
                    }
                }
                double d15 = d * f5;
                double d16 = f6 * d2;
                a(path, (d15 * cos) - (d16 * sin), (d15 * sin) + (cos * d16), f5, f6, f, f2, radians, atan2, atan22);
                return;
            }
        }
    }

    private static void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
        double d11 = d9 / ceil;
        int i = 0;
        double d12 = (sin2 * (-d3) * sin) + (cos2 * d4 * cos);
        double d13 = d10;
        while (i < ceil) {
            double d14 = d8 + d11;
            double sin3 = Math.sin(d14);
            double cos3 = Math.cos(d14);
            double d15 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * sin3);
            double d16 = (d4 * cos * sin3) + (d3 * sin * cos3) + d2;
            double d17 = (((-d3) * cos) * sin3) - ((d4 * sin) * cos3);
            double d18 = (cos3 * d4 * cos) + (sin3 * (-d3) * sin);
            double tan = Math.tan((d14 - d8) / 2.0d);
            double sqrt = ((Math.sqrt((tan * (3.0d * tan)) + 4.0d) - 1.0d) * Math.sin(d14 - d8)) / 3.0d;
            path.cubicTo((float) ((d13 * sqrt) + d5), (float) (d6 + (d12 * sqrt)), (float) (d15 - (sqrt * d17)), (float) (d16 - (sqrt * d18)), (float) d15, (float) d16);
            i++;
            d13 = d17;
            d8 = d14;
            d6 = d16;
            d5 = d15;
            d12 = d18;
        }
    }
}
