package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@gw
/* loaded from: classes.dex */
public final class hd extends Handler {
    public hd(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.d.f().a((Throwable) e, false);
            throw e;
        }
    }
}
