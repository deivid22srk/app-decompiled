package android.support.v4.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class ao {
    int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p;
    double q;
    int r;
    int s;
    int t;
    int v;
    int w;
    private final Drawable.Callback x;

    /* renamed from: a, reason: collision with root package name */
    final RectF f428a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    final Paint f429b = new Paint();
    final Paint c = new Paint();
    float d = 0.0f;
    float e = 0.0f;
    float f = 0.0f;
    float g = 5.0f;
    float h = 2.5f;
    final Paint u = new Paint(1);

    public ao(Drawable.Callback callback) {
        this.x = callback;
        this.f429b.setStrokeCap(Paint.Cap.SQUARE);
        this.f429b.setAntiAlias(true);
        this.f429b.setStyle(Paint.Style.STROKE);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
    }

    public final void a(int[] iArr) {
        this.i = iArr;
        a(0);
    }

    public final void a(int i) {
        this.j = i;
        this.w = this.i[this.j];
    }

    final int a() {
        return (this.j + 1) % this.i.length;
    }

    public final void a(float f) {
        this.d = f;
        d();
    }

    public final void b(float f) {
        this.e = f;
        d();
    }

    public final void c(float f) {
        this.f = f;
        d();
    }

    public final void a(boolean z) {
        if (this.n != z) {
            this.n = z;
            d();
        }
    }

    public final void b() {
        this.k = this.d;
        this.l = this.e;
        this.m = this.f;
    }

    public final void c() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        a(0.0f);
        b(0.0f);
        c(0.0f);
    }

    final void d() {
        this.x.invalidateDrawable(null);
    }
}
