package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.android.vending.R;

/* loaded from: classes.dex */
public class AvatarClusterModuleLayout extends CardClusterModuleLayout {
    public AvatarClusterModuleLayout(Context context) {
        super(context);
    }

    public AvatarClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int a(Resources resources) {
        return R.layout.play_card_avatar;
    }
}
