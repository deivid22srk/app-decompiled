package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.utils.ex;

/* loaded from: classes.dex */
public class PlayEditorialAppCardView extends com.google.android.play.layout.a implements com.google.android.finsky.navigationmanager.j, ex {
    public PlayEditorialAppCardView(Context context) {
        this(context, null);
    }

    public PlayEditorialAppCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 5;
    }

    @Override // com.google.android.finsky.utils.ex
    public int[] getImageTypePreference() {
        return ex.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.z = 0.48828125f;
        a(i);
        super.onMeasure(i, i2);
    }
}
