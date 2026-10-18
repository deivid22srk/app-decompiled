package com.google.android.wallet.common.util;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f7298a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7299b;

    j(Context context, String str) {
        this.f7298a = context;
        this.f7299b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f7298a, String.format("Overriding MCC/MNC with %s", this.f7299b), 0).show();
    }
}
