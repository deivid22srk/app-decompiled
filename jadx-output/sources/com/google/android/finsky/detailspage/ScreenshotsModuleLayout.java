package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.vending.R;
import com.google.android.finsky.layout.HorizontalStrip;

/* loaded from: classes.dex */
public class ScreenshotsModuleLayout extends FrameLayout implements com.google.android.finsky.adapters.ai, com.google.android.finsky.adapters.ap, bp, bq, bs, com.google.android.finsky.layout.bo, com.google.android.finsky.layout.by, com.google.android.finsky.layout.play.af {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.layout.bv f2508a;

    /* renamed from: b, reason: collision with root package name */
    HorizontalStrip f2509b;
    com.google.android.finsky.adapters.ag c;
    ds d;
    dt e;

    public ScreenshotsModuleLayout(Context context) {
        super(context);
    }

    public ScreenshotsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        int i;
        super.onFinishInflate();
        this.f2509b = (HorizontalStrip) findViewById(R.id.strip);
        Resources resources = getResources();
        boolean z = resources.getBoolean(R.bool.use_wide_layout);
        if (z) {
            int a2 = br.a(resources, z);
            int max = Math.max(a2 - resources.getDimensionPixelSize(R.dimen.screenshots_leading_peek), 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById(R.id.strip_background).getLayoutParams();
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            i = max;
        } else {
            i = 0;
        }
        this.f2509b.a(i, resources.getDimensionPixelOffset(R.dimen.screenshots_spacing));
        this.f2508a = new com.google.android.finsky.layout.bv(this, R.id.strip, this);
        this.f2508a.a(500);
    }

    Drawable getPlaceholderDrawable() {
        int dimension = (int) getContext().getResources().getDimension(R.dimen.screenshots_height);
        Bitmap createBitmap = Bitmap.createBitmap((dimension * 9) / 16, dimension, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getContext().getResources().getColor(R.color.details_screenshot_placeholder));
        return new BitmapDrawable(getContext().getResources(), createBitmap);
    }

    @Override // com.google.android.finsky.adapters.ai
    public final void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    @Override // com.google.android.finsky.layout.by
    public final void n_() {
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        if (this.c != null) {
            this.c.d.unregisterAll();
        }
        this.f2509b.setAdapter(null);
        this.c = null;
    }

    @Override // com.google.android.finsky.layout.play.af
    public final boolean a(float f, float f2) {
        return f >= ((float) this.f2509b.getLeft()) && f < ((float) this.f2509b.getRight()) && f2 >= ((float) this.f2509b.getTop()) && f2 < ((float) this.f2509b.getBottom());
    }

    @Override // com.google.android.finsky.layout.play.af
    public final void b() {
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerTop() {
        return this.f2509b.getTop();
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerBottom() {
        return this.f2509b.getBottom();
    }

    @Override // com.google.android.finsky.layout.bo
    public final void c() {
        if (this.e != null) {
            this.e.e();
        }
    }

    public static int a(Resources resources) {
        return resources.getDisplayMetrics().widthPixels / (resources.getDimensionPixelSize(R.dimen.screenshots_height) / 2);
    }
}
