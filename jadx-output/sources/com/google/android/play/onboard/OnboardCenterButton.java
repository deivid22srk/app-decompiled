package com.google.android.play.onboard;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.play.i;
import com.google.android.play.k;

/* loaded from: classes.dex */
public class OnboardCenterButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f6998a;

    /* renamed from: b, reason: collision with root package name */
    private Button f6999b;
    private Rect c;
    private Rect d;

    public OnboardCenterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6998a = getResources().getDimensionPixelSize(i.play_onboard__onboard_v2_touch_extension);
        this.c = new Rect();
        this.d = new Rect();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6999b = (Button) findViewById(k.play_onboard_center_button);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6999b.getVisibility() != 8) {
            this.f6999b.getHitRect(this.c);
            this.c.left -= this.f6998a;
            this.c.top -= this.f6998a;
            this.c.right += this.f6998a;
            this.c.bottom += this.f6998a;
            if (!this.d.equals(this.c)) {
                setTouchDelegate(new com.google.android.play.utils.i(this.c, this.f6999b));
                this.d.set(this.c);
            }
        }
    }
}
