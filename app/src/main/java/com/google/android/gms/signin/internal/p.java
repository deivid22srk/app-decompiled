package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f6452a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6453b;
    final /* synthetic */ i c;
    final /* synthetic */ o d;

    p(o oVar, List list, String str, i iVar) {
        this.d = oVar;
        this.f6452a = list;
        this.f6453b = str;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        try {
            rVar = this.d.f6450a.e;
            Collections.unmodifiableSet(new HashSet(this.f6452a));
            s a2 = rVar.a();
            this.c.a(new CheckServerAuthResult(a2.f5583a, a2.f5584b));
        } catch (RemoteException e) {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", e);
        }
    }
}
