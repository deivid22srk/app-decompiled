package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class i extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4480a;

    i(h hVar) {
        this.f4480a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.finsky.installer.n nVar;
        nVar = this.f4480a.h;
        if (nVar.c()) {
            this.f4480a.a(false);
        }
    }
}
