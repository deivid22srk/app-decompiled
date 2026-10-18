package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class lu extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lr f6149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lu(lr lrVar, Looper looper) {
        super(looper);
        this.f6149a = lrVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                lr.c(this.f6149a);
                break;
            case 2:
                lr.b(this.f6149a);
                break;
            default:
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                break;
        }
    }
}
