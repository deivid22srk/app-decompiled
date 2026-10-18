package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardViewLarge extends com.google.android.play.layout.a {
    public PlayCardViewLarge(Context context) {
        this(context, null);
    }

    public PlayCardViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a(i);
        super.onMeasure(i, i2);
    }
}
