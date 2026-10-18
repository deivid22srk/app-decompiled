package com.google.android.finsky.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2777a;

    b(a aVar) {
        this.f2777a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.car.CONNECTED".equals(intent.getAction())) {
            this.f2777a.c = true;
            a.a(this.f2777a);
        } else {
            this.f2777a.c = false;
            a.a(this.f2777a);
        }
    }
}
