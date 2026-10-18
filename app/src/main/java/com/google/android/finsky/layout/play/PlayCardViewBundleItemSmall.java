package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayCardViewSmall;

/* loaded from: classes.dex */
public class PlayCardViewBundleItemSmall extends PlayCardViewSmall implements ca {
    private int F;

    public PlayCardViewBundleItemSmall(Context context) {
        super(context);
    }

    public PlayCardViewBundleItemSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ca
    public void setCardType(int i) {
        this.F = i;
    }

    @Override // com.google.android.play.layout.PlayCardViewSmall, com.google.android.play.layout.a
    public int getCardType() {
        return this.F;
    }

    @Override // com.google.android.finsky.layout.play.ca
    public final void ad_() {
        if (!this.a_ && this.t != null) {
            this.t.setVisibility(8);
        }
    }

    @Override // com.google.android.play.layout.a
    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return ab.f3389a;
    }
}
