package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ArtistClusterModuleLayout extends CardClusterModuleLayout {
    public ArtistClusterModuleLayout(Context context) {
        super(context);
    }

    public ArtistClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int a(Resources resources) {
        return R.layout.play_card_artist;
    }

    @Override // com.google.android.finsky.detailspage.CardClusterModuleLayout
    protected final int b(Resources resources) {
        return resources.getInteger(R.integer.music_item_rows);
    }
}
