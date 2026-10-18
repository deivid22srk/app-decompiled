package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;

/* loaded from: classes.dex */
public final class ku<R extends com.google.android.gms.common.api.x> extends Handler {
    public ku() {
        this(Looper.getMainLooper());
    }

    public ku(Looper looper) {
        super(looper);
    }

    public final void a(com.google.android.gms.common.api.y<? super R> yVar, R r) {
        sendMessage(obtainMessage(1, new Pair(yVar, r)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                com.google.android.gms.common.api.y yVar = (com.google.android.gms.common.api.y) pair.first;
                com.google.android.gms.common.api.x xVar = (com.google.android.gms.common.api.x) pair.second;
                try {
                    yVar.a(xVar);
                    return;
                } catch (RuntimeException e) {
                    kt.b(xVar);
                    throw e;
                }
            case 2:
                ((kt) message.obj).c(Status.d);
                return;
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
        }
    }
}
