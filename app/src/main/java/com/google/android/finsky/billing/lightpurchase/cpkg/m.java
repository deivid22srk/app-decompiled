package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;

/* loaded from: classes.dex */
public final class m implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2363a;

    m(k kVar) {
        this.f2363a = kVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && ((PurchaseFragment) k.b(this.f2363a)).B()) {
            this.f2363a.a(true);
            return false;
        }
        return false;
    }
}
