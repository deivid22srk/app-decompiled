package android.support.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;

/* loaded from: classes.dex */
final class l {
    private static final Matrix j = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    float f50a;

    /* renamed from: b, reason: collision with root package name */
    float f51b;
    float c;
    float d;
    int e;
    String f;
    final android.support.v4.h.a<String, Object> g;
    private final Path h;
    private final Path i;
    private final Matrix k;
    private Paint l;
    private Paint m;
    private PathMeasure n;
    private int o;
    private final j p;

    public l() {
        this.k = new Matrix();
        this.f50a = 0.0f;
        this.f51b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 255;
        this.f = null;
        this.g = new android.support.v4.h.a<>();
        this.p = new j();
        this.h = new Path();
        this.i = new Path();
    }

    public l(l lVar) {
        this.k = new Matrix();
        this.f50a = 0.0f;
        this.f51b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 255;
        this.f = null;
        this.g = new android.support.v4.h.a<>();
        this.p = new j(lVar.p, this.g);
        this.h = new Path(lVar.h);
        this.i = new Path(lVar.i);
        this.f50a = lVar.f50a;
        this.f51b = lVar.f51b;
        this.c = lVar.c;
        this.d = lVar.d;
        this.o = lVar.o;
        this.e = lVar.e;
        this.f = lVar.f;
        if (lVar.f != null) {
            this.g.put(lVar.f, this);
        }
    }

    public final void a(Canvas canvas, int i, int i2) {
        a(this.p, j, canvas, i, i2, null);
    }

    private void a(j jVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        jVar.f48a.set(matrix);
        jVar.f48a.preConcat(jVar.j);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < jVar.f49b.size()) {
                Object obj = jVar.f49b.get(i4);
                if (obj instanceof j) {
                    a((j) obj, jVar.f48a, canvas, i, i2, colorFilter);
                } else if (obj instanceof k) {
                    k kVar = (k) obj;
                    float f = i / this.c;
                    float f2 = i2 / this.d;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = jVar.f48a;
                    this.k.set(matrix2);
                    this.k.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[0], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float f4 = 0.0f;
                    if (max > 0.0f) {
                        f4 = Math.abs(f3) / max;
                    }
                    if (f4 != 0.0f) {
                        kVar.a(this.h);
                        Path path = this.h;
                        this.i.reset();
                        if (kVar.a()) {
                            this.i.addPath(path, this.k);
                            canvas.clipPath(this.i, Region.Op.REPLACE);
                        } else {
                            i iVar = (i) kVar;
                            if (iVar.g != 0.0f || iVar.h != 1.0f) {
                                float f5 = (iVar.g + iVar.i) % 1.0f;
                                float f6 = (iVar.h + iVar.i) % 1.0f;
                                if (this.n == null) {
                                    this.n = new PathMeasure();
                                }
                                this.n.setPath(this.h, false);
                                float length = this.n.getLength();
                                float f7 = f5 * length;
                                float f8 = f6 * length;
                                path.reset();
                                if (f7 > f8) {
                                    this.n.getSegment(f7, length, path, true);
                                    this.n.getSegment(0.0f, f8, path, true);
                                } else {
                                    this.n.getSegment(f7, f8, path, true);
                                }
                                path.rLineTo(0.0f, 0.0f);
                            }
                            this.i.addPath(path, this.k);
                            if (iVar.c != 0) {
                                if (this.m == null) {
                                    this.m = new Paint();
                                    this.m.setStyle(Paint.Style.FILL);
                                    this.m.setAntiAlias(true);
                                }
                                Paint paint = this.m;
                                paint.setColor(g.a(iVar.c, iVar.f));
                                paint.setColorFilter(colorFilter);
                                canvas.drawPath(this.i, paint);
                            }
                            if (iVar.f46a != 0) {
                                if (this.l == null) {
                                    this.l = new Paint();
                                    this.l.setStyle(Paint.Style.STROKE);
                                    this.l.setAntiAlias(true);
                                }
                                Paint paint2 = this.l;
                                if (iVar.k != null) {
                                    paint2.setStrokeJoin(iVar.k);
                                }
                                if (iVar.j != null) {
                                    paint2.setStrokeCap(iVar.j);
                                }
                                paint2.setStrokeMiter(iVar.l);
                                paint2.setColor(g.a(iVar.f46a, iVar.d));
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(f4 * min * iVar.f47b);
                                canvas.drawPath(this.i, paint2);
                            }
                        }
                    }
                }
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }
}
