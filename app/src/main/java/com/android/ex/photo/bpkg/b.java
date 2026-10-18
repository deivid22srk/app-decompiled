package com.android.ex.photo.bpkg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f1143a;

    public b(a aVar) {
        this.f1143a = aVar;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f1143a.ar = false;
            return;
        }
        if (!this.f1143a.ar && !this.f1143a.v()) {
            if (!this.f1143a.aq) {
                this.f1143a.l().a(2, this.f1143a);
            }
            this.f1143a.l().a(3, this.f1143a);
            this.f1143a.ar = true;
            this.f1143a.aj.a(0);
        }
    }
}
