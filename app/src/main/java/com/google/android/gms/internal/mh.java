package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class mh<L> {

    /* renamed from: a, reason: collision with root package name */
    public volatile L f6160a;

    /* renamed from: b, reason: collision with root package name */
    private final mh<L>.mi f6161b;

    public final void a(mj<? super L> mjVar) {
        com.google.android.gms.common.internal.av.a(mjVar, "Notifier must not be null");
        this.f6161b.sendMessage(this.f6161b.obtainMessage(1, mjVar));
    }

    final class mi extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh f6162a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            com.google.android.gms.common.internal.av.b(message.what == 1);
            mh mhVar = this.f6162a;
            mj mjVar = (mj) message.obj;
            L l = mhVar.f6160a;
            if (l == null) {
                mjVar.a();
                return;
            }
            try {
                mjVar.a(l);
            } catch (RuntimeException e) {
                mjVar.a();
                throw e;
            }
        }
    }
}
