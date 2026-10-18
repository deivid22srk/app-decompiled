package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class PlayCardViewMediumPlus extends com.google.android.play.layout.a {
    public PlayCardViewMediumPlus(Context context) {
        this(context, null);
    }

    public PlayCardViewMediumPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        int i3 = ((((size - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) / 2;
        int i4 = (int) (i3 * this.z);
        this.b_.getLayoutParams().width = i3;
        this.b_.getLayoutParams().height = i4;
        super.onMeasure(i, i2);
    }
}
