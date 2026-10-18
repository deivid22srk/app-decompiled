package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class FeaturedCardClusterModuleLayout extends CardClusterModuleLayout {
    public FeaturedCardClusterModuleLayout(Context context) {
        super(context);
    }

    public FeaturedCardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int a(Resources resources) {
        return R.layout.featured_card;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int b(Resources resources) {
        return 1;
    }
}
