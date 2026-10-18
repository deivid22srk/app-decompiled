package com.google.android.wallet.ui.common;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class FifeNetworkImageView extends com.android.volley.a.z {

    /* renamed from: a, reason: collision with root package name */
    private static int f7442a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f7443b = 1;
    private boolean c;
    private boolean d;
    private int e;
    private v f;
    private String g;
    private String h;
    private com.android.volley.a.n i;
    private boolean j;
    private float k;
    private int l;

    public FifeNetworkImageView(Context context) {
        super(context);
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.FifeNetworkImageView);
        this.k = obtainStyledAttributes.getFloat(com.google.android.wallet.e.k.FifeNetworkImageView_internalUicAspectRatio, -1.0f);
        this.l = obtainStyledAttributes.getInt(com.google.android.wallet.e.k.FifeNetworkImageView_internalUicDominantDimension, -1);
        if ((this.k == -1.0f) ^ (this.l == -1)) {
            throw new RuntimeException("Both internalUicAspectRatio and internalUicDominantDimension must be specified.");
        }
        obtainStyledAttributes.recycle();
    }

    public void setFadeIn(boolean z) {
        if (Build.VERSION.SDK_INT < 14) {
            this.c = false;
            return;
        }
        this.c = z;
        if (this.c) {
            this.e = getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        }
    }

    public void setLazyLoad(boolean z) {
        this.d = z;
    }

    public final void a(String str, com.android.volley.a.n nVar, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        this.i = nVar;
        this.j = z;
        int width = getWidth();
        int height = getHeight();
        if (width == 0 && height == 0 && (layoutParams = getLayoutParams()) != null && layoutParams.width > 0 && layoutParams.height > 0) {
            width = layoutParams.width;
            height = layoutParams.height;
        }
        if (height != 0 && width != 0) {
            this.g = null;
            a(bj.a(str, width, height, this.j), this.i);
        } else {
            this.g = str;
        }
    }

    @Override // com.android.volley.a.z
    public final void a(String str, com.android.volley.a.n nVar) {
        if (this.d) {
            this.h = str;
        } else {
            super.a(str, nVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d = false;
        if (this.h != null) {
            super.a(this.h, this.i);
            this.h = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.k > 0.0f) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
            if (this.l == f7442a) {
                defaultSize = Math.max((int) (defaultSize2 * this.k), getSuggestedMinimumWidth());
            } else if (this.l == f7443b) {
                defaultSize2 = Math.max((int) (defaultSize / this.k), getSuggestedMinimumHeight());
            }
            setMeasuredDimension(defaultSize, defaultSize2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.a.z, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.g != null) {
            String str = this.g;
            this.g = null;
            post(new u(this, str));
        }
    }

    public void setOnLoadedListener(v vVar) {
        this.f = vVar;
    }

    @Override // android.widget.ImageView
    @TargetApi(14)
    public void setImageBitmap(Bitmap bitmap) {
        boolean z = true;
        super.setImageBitmap(bitmap);
        if (this.f != null) {
            this.f.a(bitmap);
        }
        if (this.c) {
            boolean z2 = getVisibility() == 0;
            if (Build.VERSION.SDK_INT < 14) {
                z = z2;
            } else if (!z2 || getAlpha() != 1.0f) {
                z = false;
            }
            if (z) {
                bj.a(this, 0, this.e, (Runnable) null);
            }
        }
    }
}
