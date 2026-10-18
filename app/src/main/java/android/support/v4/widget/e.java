package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
final class e extends OvalShape {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f454a;

    /* renamed from: b, reason: collision with root package name */
    private RadialGradient f455b;
    private Paint c = new Paint();
    private int d;

    public e(d dVar, int i, int i2) {
        int i3;
        this.f454a = dVar;
        dVar.f453b = i;
        this.d = i2;
        float f = this.d / 2;
        float f2 = this.d / 2;
        i3 = dVar.f453b;
        this.f455b = new RadialGradient(f, f2, i3, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.c.setShader(this.f455b);
    }

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        int i;
        int width = this.f454a.getWidth();
        int height = this.f454a.getHeight();
        int i2 = this.d / 2;
        i = this.f454a.f453b;
        canvas.drawCircle(width / 2, height / 2, i2 + i, this.c);
        canvas.drawCircle(width / 2, height / 2, this.d / 2, paint);
    }
}
