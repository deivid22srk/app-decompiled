package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class MyAccountRewardsCard extends bz<RewardRowView> {
    @Override // com.google.android.finsky.layout.bz
    protected final /* bridge */ /* synthetic */ void a(RewardRowView rewardRowView, Document document, boolean z) {
        rewardRowView.a(document, this.d, this.f, z, this.g, 0, this.e);
    }

    public MyAccountRewardsCard(Context context) {
        this(context, null);
    }

    public MyAccountRewardsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2660, 2661, 2);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final void a(TextView textView) {
        textView.setText(R.string.no_rewards);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final /* synthetic */ RewardRowView a(ViewGroup viewGroup) {
        return (RewardRowView) this.f3177b.inflate(R.layout.reward_row, viewGroup, false);
    }
}
