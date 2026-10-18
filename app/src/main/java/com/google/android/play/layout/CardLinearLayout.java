package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class CardLinearLayout extends LinearLayout {
    public CardLinearLayout(Context context) {
        this(context, null);
    }

    public CardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().a(this, context, attributeSet, 0);
    }

    public CardLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.j.f6829a;
    }
}
