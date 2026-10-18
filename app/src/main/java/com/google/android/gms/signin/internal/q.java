package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.r;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6454a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6455b;
    final /* synthetic */ i c;
    final /* synthetic */ o d;

    q(o oVar, String str, String str2, i iVar) {
        this.d = oVar;
        this.f6454a = str;
        this.f6455b = str2;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        try {
            rVar = this.d.f6450a.e;
            this.c.a(rVar.b());
        } catch (RemoteException e) {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", e);
        }
    }
}
