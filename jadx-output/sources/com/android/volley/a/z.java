package com.android.volley.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class z extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private String f1226a;

    /* renamed from: b, reason: collision with root package name */
    private int f1227b;
    private int c;
    private n d;
    private t e;

    public z(Context context) {
        this(context, null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(String str, n nVar) {
        this.f1226a = str;
        this.d = nVar;
        a(false);
    }

    public void setDefaultImageResId(int i) {
        this.f1227b = i;
    }

    public void setErrorImageResId(int i) {
        this.c = i;
    }

    private void a(boolean z) {
        boolean z2;
        t tVar;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z3 = false;
        if (getLayoutParams() == null) {
            z2 = false;
        } else {
            boolean z4 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
            z2 = z4;
        }
        boolean z5 = z2 && z3;
        if (width != 0 || height != 0 || z5) {
            if (TextUtils.isEmpty(this.f1226a)) {
                if (this.e != null) {
                    this.e.a();
                    this.e = null;
                }
                a();
                return;
            }
            if (this.e != null && this.e.c != null) {
                if (!this.e.c.equals(this.f1226a)) {
                    this.e.a();
                    a();
                } else {
                    return;
                }
            }
            if (z2) {
                width = 0;
            }
            if (z3) {
                height = 0;
            }
            n nVar = this.d;
            String str = this.f1226a;
            aa aaVar = new aa(this, z);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
            }
            String sb = new StringBuilder(str.length() + 12).append("#W").append(width).append("#H").append(height).append("#S").append(scaleType.ordinal()).append(str).toString();
            Bitmap a2 = nVar.f1216b.a(sb);
            if (a2 != null) {
                tVar = new t(nVar, a2, str, null, null);
                aaVar.a(tVar, true);
            } else {
                tVar = new t(nVar, null, str, sb, aaVar);
                aaVar.a(tVar, true);
                r rVar = nVar.c.get(sb);
                if (rVar != null) {
                    rVar.c.add(tVar);
                } else {
                    v vVar = new v(str, new o(nVar, sb), width, height, scaleType, Bitmap.Config.RGB_565, new p(nVar, sb));
                    nVar.f1215a.a(vVar);
                    nVar.c.put(sb, new r(nVar, vVar, tVar));
                }
            }
            this.e = tVar;
        }
    }

    private void a() {
        if (this.f1227b != 0) {
            setImageResource(this.f1227b);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.e != null) {
            this.e.a();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
