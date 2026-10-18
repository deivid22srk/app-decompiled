package com.google.android.wallet.instrumentmanager.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.ui.common.InfoMessageTextView;

/* loaded from: classes.dex */
public class ImInfoMessageTextView extends InfoMessageTextView implements com.google.android.wallet.analytics.a {
    public ImInfoMessageTextView(Context context) {
        super(context, null);
        setAnalyticsClickListener(this);
    }

    public ImInfoMessageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAnalyticsClickListener(this);
    }

    public ImInfoMessageTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAnalyticsClickListener(this);
    }

    @Override // com.google.android.wallet.analytics.a
    public final void a(e eVar, int i) {
        com.google.android.wallet.common.bpkg.a.a.a(eVar, -1, i);
    }
}
