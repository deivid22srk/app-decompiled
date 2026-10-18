package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlaySocialHeader extends com.google.android.finsky.layout.bp implements com.google.android.finsky.adapters.ap, y {

    /* renamed from: a, reason: collision with root package name */
    public PlayAvatarPack f3369a;

    public PlaySocialHeader(Context context) {
        this(context, null);
    }

    public PlaySocialHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3369a = (PlayAvatarPack) findViewById(R.id.avatar_pack);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int a2 = HeroGraphicView.a(getContext(), size, true, 0.0f);
        this.f3369a.measure(i, 0);
        int measuredHeight = a2 + ((int) (this.f3369a.getMeasuredHeight() * 0.3f));
        if (InsetsFrameLayout.f3009a) {
            measuredHeight -= ik.d(getContext());
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        this.f3369a.layout(0, height - this.f3369a.getMeasuredHeight(), width, height);
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3369a.ab_();
    }
}
