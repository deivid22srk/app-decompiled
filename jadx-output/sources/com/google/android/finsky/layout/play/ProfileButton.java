package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ProfileButton extends TextView {

    /* renamed from: a, reason: collision with root package name */
    Drawable f3372a;

    /* renamed from: b, reason: collision with root package name */
    private int f3373b;
    private final int c;

    public ProfileButton(Context context) {
        this(context, null);
    }

    public ProfileButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.play_profile_button_icon_gap);
        this.f3373b = android.support.v4.view.by.n(this);
        setWillNotDraw(false);
    }

    final void a(String str, int i) {
        int i2 = this.f3373b;
        int o = android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setText(str);
        setBackgroundResource(i);
        if (this.f3372a != null) {
            this.f3372a.setBounds(0, 0, this.f3372a.getIntrinsicWidth(), this.f3372a.getIntrinsicHeight());
            i2 += this.f3372a.getIntrinsicWidth() + this.c;
        }
        android.support.v4.view.by.a(this, i2, paddingTop, o, paddingBottom);
    }

    public final void a(String str, int i, int i2) {
        this.f3372a = i > 0 ? android.support.v4.b.g.a(getContext(), i) : null;
        a(str, i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isClickable()) {
            com.google.android.play.utils.g.a(accessibilityNodeInfo, Button.class.getName());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int max;
        int i = 0;
        super.onDraw(canvas);
        if (this.f3372a != null) {
            int height = (getHeight() - this.f3372a.getIntrinsicHeight()) / 2;
            Layout layout = getLayout();
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            boolean z = android.support.v4.view.by.h(this) == 0;
            if (layout != null) {
                int width = z ? getWidth() : 0;
                int lineCount = layout.getLineCount();
                int i2 = 0;
                i = width;
                while (i2 < lineCount) {
                    if (z) {
                        max = Math.min(i, (((int) layout.getLineLeft(i2)) + paddingLeft) - scrollX);
                    } else {
                        max = Math.max(i, (((int) layout.getLineRight(i2)) + paddingLeft) - scrollX);
                    }
                    i2++;
                    i = max;
                }
            }
            int intrinsicWidth = this.f3372a.getIntrinsicWidth();
            canvas.save();
            canvas.translate((z ? (i - intrinsicWidth) - this.c : this.c + i) + scrollX, height);
            this.f3372a.draw(canvas);
            canvas.restore();
        }
    }
}
