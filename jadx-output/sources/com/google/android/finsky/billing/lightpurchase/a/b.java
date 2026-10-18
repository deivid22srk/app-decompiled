package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
final class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2287a;

    b(a aVar) {
        this.f2287a = aVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TextView textView;
        if (z) {
            textView = this.f2287a.am;
            textView.setError(null);
        }
    }
}
