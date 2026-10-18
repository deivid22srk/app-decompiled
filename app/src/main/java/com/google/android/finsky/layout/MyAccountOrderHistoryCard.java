package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class MyAccountOrderHistoryCard extends bz<OrderHistoryRowView> {
    private cr j;

    @Override // com.google.android.finsky.layout.bz
    protected final /* bridge */ /* synthetic */ void a(OrderHistoryRowView orderHistoryRowView, Document document, boolean z) {
        orderHistoryRowView.a(this.c, document, this.d, this.f, z, this.g, 0, this.j);
    }

    public MyAccountOrderHistoryCard(Context context) {
        this(context, null);
    }

    public MyAccountOrderHistoryCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2601, 2600, 0);
    }

    public final void a(com.google.android.finsky.activities.bpkg.x xVar, Account account, DfeToc dfeToc, com.google.android.play.image.e eVar, cr crVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.j = crVar;
        super.a(xVar, account, dfeToc, eVar, bVar, cyVar);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final void a(TextView textView) {
        textView.setText(R.string.no_order_history);
    }

    @Override // com.google.android.finsky.layout.bz
    protected final /* synthetic */ OrderHistoryRowView a(ViewGroup viewGroup) {
        return (OrderHistoryRowView) this.f3177b.inflate(R.layout.order_history_row, viewGroup, false);
    }
}
