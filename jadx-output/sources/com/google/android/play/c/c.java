package com.google.android.play.c;

import android.R;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* loaded from: classes.dex */
public final class c extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    b f6825a;

    /* renamed from: b, reason: collision with root package name */
    private Resources f6826b;
    private Bitmap c;

    c(Resources resources, b bVar) {
        super(resources.getColorStateList(com.google.android.play.h.play_overlay_highlight_fill), null, bVar);
        this.f6826b = resources;
        this.f6825a = bVar;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6825a.setBounds(rect);
        a(rect);
    }

    final void a(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        if (width > 0 && height > 0) {
            try {
                if (this.c == null) {
                    this.c = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
                } else {
                    this.c.reconfigure(width, height, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                this.c = null;
            }
            if (this.c != null) {
                Canvas canvas = new Canvas(this.c);
                canvas.drawColor(0, PorterDuff.Mode.SRC);
                this.f6825a.setBounds(0, 0, width, height);
                this.f6825a.draw(canvas);
                setDrawableByLayerId(R.id.mask, new BitmapDrawable(this.f6826b, this.c));
            } else {
                setDrawableByLayerId(R.id.mask, new ColorDrawable(-1));
            }
            invalidateSelf();
        }
    }
}
