package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class mc extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ma f6157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mc(ma maVar, Looper looper) {
        super(looper);
        this.f6157a = maVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((mb) message.obj).a(this.f6157a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", "Unknown message id: " + message.what);
                return;
        }
    }
}
