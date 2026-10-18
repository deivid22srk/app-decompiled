package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardViewLargeMinus extends PlayCardViewMedium {
    public PlayCardViewLargeMinus(Context context) {
        this(context, null);
    }

    public PlayCardViewLargeMinus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.PlayCardViewMedium, com.google.android.play.layout.a
    public int getCardType() {
        return 3;
    }
}
