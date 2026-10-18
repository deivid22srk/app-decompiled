package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class MyAccountSubscriptionCard extends bz<SubscriptionRowView> {
    private el j;
    private com.google.android.finsky.activities.b.s k;

    @Override // com.google.android.finsky.layout.bz
    protected final /* bridge */ /* synthetic */ void a(SubscriptionRowView subscriptionRowView, Document document, boolean z) {
        subscriptionRowView.a(document, this.d, this.f, z, this.g, 0, this.k.a(document), this.e, this.j);
    }

    public MyAccountSubscriptionCard(Context context) {
        this(context, null);
    }

    public MyAccountSubscriptionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2640, 2641, 1);
    }

    public final void a(com.google.android.finsky.activities.b.x xVar, Account account, DfeToc dfeToc, com.google.android.play.image.e eVar, el elVar, com.google.android.finsky.activities.b.s sVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.j = elVar;
        this.k = sVar;
        super.a(xVar, account, dfeToc, eVar, bVar, cyVar);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final void a(TextView textView) {
        textView.setText(R.string.no_subscriptions);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final /* synthetic */ SubscriptionRowView a(ViewGroup viewGroup) {
        return (SubscriptionRowView) this.f3177b.inflate(R.layout.subscription_row, viewGroup, false);
    }
}
