package android.support.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f52a;

    /* renamed from: b, reason: collision with root package name */
    l f53b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public m(m mVar) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        this.c = null;
        this.d = g.f45b;
        if (mVar != null) {
            this.f52a = mVar.f52a;
            this.f53b = new l(mVar.f53b);
            paint = mVar.f53b.m;
            if (paint != null) {
                l lVar = this.f53b;
                paint4 = mVar.f53b.m;
                lVar.m = new Paint(paint4);
            }
            paint2 = mVar.f53b.l;
            if (paint2 != null) {
                l lVar2 = this.f53b;
                paint3 = mVar.f53b.l;
                lVar2.l = new Paint(paint3);
            }
            this.c = mVar.c;
            this.d = mVar.d;
            this.e = mVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        this.f53b.a(new Canvas(this.f), i, i2);
    }

    public m() {
        this.c = null;
        this.d = g.f45b;
        this.f53b = new l();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new g(this, (byte) 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new g(this, (byte) 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f52a;
    }
}
