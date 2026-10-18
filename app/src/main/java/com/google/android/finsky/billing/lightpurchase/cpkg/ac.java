package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ac implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f2343a;

    ac(ab abVar) {
        this.f2343a = abVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.f2343a.b(true);
        return true;
    }
}
