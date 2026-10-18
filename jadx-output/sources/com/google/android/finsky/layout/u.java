package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    int f3523a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, t> f3524b = new HashMap();

    public u(Context context) {
        Resources resources = context.getResources();
        this.f3523a = resources.getDimensionPixelSize(R.dimen.play_card_inset);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_mini_card_content_height);
        this.f3524b.put(Integer.valueOf(R.layout.play_card_mini), new v(this, ik.c(resources), dimensionPixelSize));
        this.f3524b.put(Integer.valueOf(R.layout.play_card_small), new w(this, resources.getDimensionPixelSize(R.dimen.play_small_card_content_min_height)));
        this.f3524b.put(Integer.valueOf(R.layout.play_card_medium), new x(this));
        this.f3524b.put(Integer.valueOf(R.layout.play_card_artist), new y(this, resources.getDimensionPixelSize(R.dimen.play_artist_card_content_height)));
        this.f3524b.put(Integer.valueOf(R.layout.play_card_avatar), new z(this, resources.getDimensionPixelSize(R.dimen.play_avatar_card_content_height), resources.getDimensionPixelSize(R.dimen.play_person_card_primary_padding), resources.getDimensionPixelSize(R.dimen.play_person_card_secondary_padding)));
        this.f3524b.put(Integer.valueOf(R.layout.play_quicklinks_banner_pill_item), new aa(this, resources.getDimensionPixelSize(R.dimen.quicklinks_pill_content_min_height), resources.getDimensionPixelSize(R.dimen.quicklinks_pill_padding), resources.getDimensionPixelSize(R.dimen.quicklinks_banner_vpadding)));
    }

    public final t a(int i) {
        return this.f3524b.get(Integer.valueOf(i));
    }
}
