package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class n extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f5720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, Looper looper) {
        super(looper);
        this.f5720a = lVar;
    }

    private static void a(Message message) {
        ((o) message.obj).c();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        com.google.android.gms.common.api.p pVar;
        com.google.android.gms.common.api.p pVar2;
        com.google.android.gms.common.api.t tVar;
        if (this.f5720a.d.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !this.f5720a.m()) {
            a(message);
            return;
        }
        if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
            tVar = this.f5720a.k;
            tVar.a(connectionResult);
            l.k();
            return;
        }
        if (message.what == 4) {
            this.f5720a.a(4, (int) null);
            pVar = this.f5720a.r;
            if (pVar != null) {
                pVar2 = this.f5720a.r;
                pVar2.a(message.arg2);
            }
            this.f5720a.a(message.arg2);
            this.f5720a.a(4, 1, null);
            return;
        }
        if (message.what == 2 && !this.f5720a.g()) {
            a(message);
        } else if (b(message)) {
            ((o) message.obj).b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
