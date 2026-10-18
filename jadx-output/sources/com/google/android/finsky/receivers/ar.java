package com.google.android.finsky.receivers;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class ar implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f4465b;
    final /* synthetic */ RemoveAssetReceiver c;

    ar(RemoveAssetReceiver removeAssetReceiver, Context context, Intent intent) {
        this.c = removeAssetReceiver;
        this.f4464a = context;
        this.f4465b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RemoveAssetReceiver.a(this.f4464a, this.f4465b);
    }
}
