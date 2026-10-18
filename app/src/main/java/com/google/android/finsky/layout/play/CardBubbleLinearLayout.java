package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.layout.ForegroundLinearLayout;

/* loaded from: classes.dex */
public class CardBubbleLinearLayout extends ForegroundLinearLayout {
    public CardBubbleLinearLayout(Context context) {
        this(context, null);
    }

    public CardBubbleLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().a(this, context, attributeSet, 0);
    }

    public CardBubbleLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.e.f6827a;
    }
}
