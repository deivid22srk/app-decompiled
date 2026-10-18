package com.google.android.finsky.billing.lightpurchase.c;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
final class ac implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f2343a;

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
