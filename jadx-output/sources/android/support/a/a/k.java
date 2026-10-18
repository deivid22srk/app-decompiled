package android.support.a.a;

import android.graphics.Path;

/* loaded from: classes.dex */
class k {
    protected d[] m;
    String n;
    int o;

    public k() {
        this.m = null;
    }

    public k(k kVar) {
        this.m = null;
        this.n = kVar.n;
        this.o = kVar.o;
        this.m = b.a(kVar.m);
    }

    public final void a(Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        path.reset();
        if (this.m != null) {
            d[] dVarArr = this.m;
            float[] fArr = new float[6];
            char c = 'm';
            int i2 = 0;
            while (true) {
                int i3 = i2;
                char c2 = c;
                if (i3 >= dVarArr.length) {
                    return;
                }
                char c3 = dVarArr[i3].f42a;
                float[] fArr2 = dVarArr[i3].f43b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = fArr[2];
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = fArr[5];
                switch (c3) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't':
                        i = 2;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f14, f15);
                        f13 = f15;
                        f12 = f14;
                        f11 = f15;
                        f10 = f14;
                        i = 2;
                        break;
                    default:
                        i = 2;
                        break;
                }
                int i4 = 0;
                float f16 = f15;
                float f17 = f14;
                float f18 = f11;
                float f19 = f10;
                while (i4 < fArr2.length) {
                    switch (c3) {
                        case 'A':
                            d.a(path, f19, f18, fArr2[i4 + 5], fArr2[i4 + 6], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = fArr2[i4 + 5];
                            f13 = fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'C':
                            path.cubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            float f20 = fArr2[i4 + 4];
                            float f21 = fArr2[i4 + 5];
                            f12 = fArr2[i4 + 2];
                            f13 = fArr2[i4 + 3];
                            f3 = f21;
                            f4 = f20;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'H':
                            path.lineTo(fArr2[i4 + 0], f18);
                            f = f16;
                            f3 = f18;
                            f4 = fArr2[i4 + 0];
                            f2 = f17;
                            break;
                        case 'L':
                            path.lineTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                            float f22 = fArr2[i4 + 0];
                            f3 = fArr2[i4 + 1];
                            f4 = f22;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'M':
                            f2 = fArr2[i4 + 0];
                            f = fArr2[i4 + 1];
                            if (i4 > 0) {
                                path.lineTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                                break;
                            } else {
                                path.moveTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                break;
                            }
                        case 'Q':
                            path.quadTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4 + 0];
                            f13 = fArr2[i4 + 1];
                            float f23 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f23;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'S':
                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                f7 = (2.0f * f18) - f13;
                                f8 = (2.0f * f19) - f12;
                            } else {
                                f7 = f18;
                                f8 = f19;
                            }
                            path.cubicTo(f8, f7, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4 + 0];
                            f13 = fArr2[i4 + 1];
                            float f24 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f24;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'T':
                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                f19 = (2.0f * f19) - f12;
                                f18 = (2.0f * f18) - f13;
                            }
                            path.quadTo(f19, f18, fArr2[i4 + 0], fArr2[i4 + 1]);
                            float f25 = fArr2[i4 + 0];
                            f13 = f18;
                            f12 = f19;
                            f3 = fArr2[i4 + 1];
                            f4 = f25;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'V':
                            path.lineTo(f19, fArr2[i4 + 0]);
                            f2 = f17;
                            f3 = fArr2[i4 + 0];
                            f4 = f19;
                            f = f16;
                            break;
                        case 'a':
                            d.a(path, f19, f18, fArr2[i4 + 5] + f19, fArr2[i4 + 6] + f18, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = f19 + fArr2[i4 + 5];
                            f13 = f18 + fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'c':
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            f12 = f19 + fArr2[i4 + 2];
                            f13 = f18 + fArr2[i4 + 3];
                            float f26 = f19 + fArr2[i4 + 4];
                            f3 = f18 + fArr2[i4 + 5];
                            f4 = f26;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'h':
                            path.rLineTo(fArr2[i4 + 0], 0.0f);
                            f = f16;
                            f3 = f18;
                            f4 = f19 + fArr2[i4 + 0];
                            f2 = f17;
                            break;
                        case 'l':
                            path.rLineTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                            float f27 = f19 + fArr2[i4 + 0];
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f27;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'm':
                            f2 = f19 + fArr2[i4 + 0];
                            f = f18 + fArr2[i4 + 1];
                            if (i4 > 0) {
                                path.rLineTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                                break;
                            } else {
                                path.rMoveTo(fArr2[i4 + 0], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                break;
                            }
                        case 'q':
                            path.rQuadTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4 + 0];
                            f13 = f18 + fArr2[i4 + 1];
                            float f28 = f19 + fArr2[i4 + 2];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f28;
                            f = f16;
                            f2 = f17;
                            break;
                        case 's':
                            float f29 = 0.0f;
                            if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                f9 = 0.0f;
                            } else {
                                f29 = f18 - f13;
                                f9 = f19 - f12;
                            }
                            path.rCubicTo(f9, f29, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4 + 0];
                            f13 = f18 + fArr2[i4 + 1];
                            float f30 = f19 + fArr2[i4 + 2];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f30;
                            f = f16;
                            f2 = f17;
                            break;
                        case 't':
                            if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                f5 = 0.0f;
                                f6 = 0.0f;
                            } else {
                                f5 = f18 - f13;
                                f6 = f19 - f12;
                            }
                            path.rQuadTo(f6, f5, fArr2[i4 + 0], fArr2[i4 + 1]);
                            f12 = f19 + f6;
                            f13 = f18 + f5;
                            float f31 = f19 + fArr2[i4 + 0];
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f31;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'v':
                            path.rLineTo(0.0f, fArr2[i4 + 0]);
                            f2 = f17;
                            f3 = f18 + fArr2[i4 + 0];
                            f4 = f19;
                            f = f16;
                            break;
                        default:
                            f = f16;
                            f2 = f17;
                            f3 = f18;
                            f4 = f19;
                            break;
                    }
                    i4 += i;
                    f16 = f;
                    f17 = f2;
                    f18 = f3;
                    f19 = f4;
                    c2 = c3;
                }
                fArr[0] = f19;
                fArr[1] = f18;
                fArr[2] = f12;
                fArr[3] = f13;
                fArr[4] = f17;
                fArr[5] = f16;
                c = dVarArr[i3].f42a;
                i2 = i3 + 1;
            }
        }
    }

    public boolean a() {
        return false;
    }
}
