package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ProfileInfoBlock extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f3374a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f3375b;
    private View c;

    public ProfileInfoBlock(Context context) {
        this(context, null);
    }

    public ProfileInfoBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3374a = new Rect();
        this.f3375b = new Rect();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(R.id.action_button);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int height = this.c.getHeight() / 2;
        int width = this.c.getWidth() / 3;
        this.c.getHitRect(this.f3374a);
        this.f3374a.inset(-width, -height);
        if (!this.f3374a.equals(this.f3375b)) {
            setTouchDelegate(new com.google.android.play.utils.i(this.f3374a, this.c));
            this.f3375b.set(this.f3374a);
        }
    }
}
