package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class HighlightsViewPager extends FinskyViewPager implements af {
    public HighlightsViewPager(Context context) {
        super(context);
    }

    public HighlightsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.af
    public final boolean a(float f, float f2) {
        return true;
    }

    @Override // com.google.android.finsky.layout.play.af
    public final void b() {
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerTop() {
        return 0;
    }

    @Override // com.google.android.finsky.layout.play.af
    public int getHorizontalScrollerBottom() {
        return getHeight();
    }
}
