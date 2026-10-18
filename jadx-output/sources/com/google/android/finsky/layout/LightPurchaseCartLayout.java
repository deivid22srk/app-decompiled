package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class LightPurchaseCartLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f3014a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3015b;
    private final Rect c;
    private final Rect d;
    private final boolean e;

    public LightPurchaseCartLayout(Context context) {
        this(context, null);
    }

    public LightPurchaseCartLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3015b = getResources().getDimensionPixelSize(R.dimen.cart_details_touch_target_extend);
        this.c = new Rect();
        this.d = new Rect();
        this.e = FinskyApp.a().e().a(12602632L);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3014a = findViewById(R.id.header);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e) {
            if (this.f3014a != null && this.f3014a.getVisibility() != 8) {
                this.f3014a.getHitRect(this.c);
                this.c.inset(0, -this.f3015b);
                if (!this.c.equals(this.d)) {
                    setTouchDelegate(new com.google.android.play.utils.i(this.c, this.f3014a));
                    this.d.set(this.c);
                    return;
                }
                return;
            }
            this.d.setEmpty();
            setTouchDelegate(null);
        }
    }
}
