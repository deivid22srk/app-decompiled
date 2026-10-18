package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayCardViewMedium;

/* loaded from: classes.dex */
public class PlayCardViewBundleItemMedium extends PlayCardViewMedium implements ca {

    /* renamed from: a, reason: collision with root package name */
    private int f3339a;

    public PlayCardViewBundleItemMedium(Context context) {
        super(context);
    }

    public PlayCardViewBundleItemMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ca
    public void setCardType(int i) {
        this.f3339a = i;
    }

    @Override // com.google.android.play.layout.PlayCardViewMedium, com.google.android.play.layout.a
    public int getCardType() {
        return this.f3339a;
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
