package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardFrameLayout extends FrameLayout {
    public CardFrameLayout(Context context) {
        this(context, null);
    }

    public CardFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.j.f6829a;
    }
}
