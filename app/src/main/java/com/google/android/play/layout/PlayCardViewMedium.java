package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardViewMedium extends a {
    public PlayCardViewMedium(Context context) {
        this(context, null);
    }

    public PlayCardViewMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b(i2);
        super.onMeasure(i, i2);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 2;
    }
}
