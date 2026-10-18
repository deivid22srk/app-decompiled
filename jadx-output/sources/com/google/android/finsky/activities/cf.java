package com.google.android.finsky.activities;

import android.widget.Toast;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class cf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f1651a;

    cf(cc ccVar) {
        this.f1651a = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f1651a.e, R.string.cancel_preorder_okay, 0).show();
    }
}
