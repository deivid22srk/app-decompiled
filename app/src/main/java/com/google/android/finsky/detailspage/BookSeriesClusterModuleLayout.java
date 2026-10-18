package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class BookSeriesClusterModuleLayout extends CardClusterModuleLayout {
    public BookSeriesClusterModuleLayout(Context context) {
        super(context);
    }

    public BookSeriesClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int a(Resources resources) {
        return R.layout.play_card_small;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int b(Resources resources) {
        return ik.c(resources);
    }
}
