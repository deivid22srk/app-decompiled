package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class CardTextView extends TextView {
    public CardTextView(Context context) {
        this(context, null);
    }

    public CardTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public com.google.android.play.c.i getCardViewGroupDelegate() {
        return com.google.android.play.c.j.f6829a;
    }
}
