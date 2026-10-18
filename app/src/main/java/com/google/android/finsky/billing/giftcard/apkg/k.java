package com.google.android.finsky.billing.giftcard.apkg;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class k implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f2223a;

    k(i iVar) {
        this.f2223a = iVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.f2223a.a(true);
            return false;
        }
        return false;
    }
}
