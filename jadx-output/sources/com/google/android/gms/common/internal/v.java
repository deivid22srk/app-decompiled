package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final w f5728a;
    public final Handler h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<com.google.android.gms.common.api.p> f5729b = new ArrayList<>();
    public final ArrayList<com.google.android.gms.common.api.p> c = new ArrayList<>();
    public final ArrayList<com.google.android.gms.common.api.q> d = new ArrayList<>();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Object i = new Object();

    public v(Looper looper, w wVar) {
        this.f5728a = wVar;
        this.h = new Handler(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(com.google.android.gms.common.api.p pVar) {
        av.a(pVar);
        synchronized (this.i) {
            if (this.f5729b.contains(pVar)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + pVar + " is already registered");
            } else {
                this.f5729b.add(pVar);
            }
        }
        if (this.f5728a.g()) {
            this.h.sendMessage(this.h.obtainMessage(1, pVar));
        }
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        av.a(qVar);
        synchronized (this.i) {
            if (this.d.contains(qVar)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + qVar + " is already registered");
            } else {
                this.d.add(qVar);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
            return false;
        }
        com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) message.obj;
        synchronized (this.i) {
            if (this.e && this.f5728a.g() && this.f5729b.contains(pVar)) {
                pVar.a((Bundle) null);
            }
        }
        return true;
    }
}
