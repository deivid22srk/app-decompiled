package com.google.android.wallet.ui.common;

import android.view.View;

/* loaded from: classes2.dex */
final class bp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7520a;

    bp(View view) {
        this.f7520a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7520a.requestFocus();
    }
}
