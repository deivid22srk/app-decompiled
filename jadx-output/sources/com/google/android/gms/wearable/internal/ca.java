package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ca extends com.google.android.gms.common.internal.l<am> {
    final ExecutorService f;
    private final ay<Object> g;
    private final ay<Object> h;
    private final ay<Object> i;
    private final ay<Object> j;
    private final ay<com.google.android.gms.wearable.h> k;
    private final ay<com.google.android.gms.wearable.u> l;
    private final ay<Object> m;
    private final ay<Object> n;
    private final ay<Object> o;

    public ca(Context context, Looper looper, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar, com.google.android.gms.common.internal.h hVar) {
        super(context, looper, 14, hVar, pVar, qVar);
        this.f = Executors.newCachedThreadPool();
        this.g = new ay<>();
        this.h = new ay<>();
        this.i = new ay<>();
        this.j = new ay<>();
        this.k = new ay<>();
        this.l = new ay<>();
        this.m = new ay<>();
        this.n = new ay<>();
        this.o = new ay<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.g.a(iBinder);
            this.h.a(iBinder);
            this.i.a(iBinder);
            this.j.a(iBinder);
            this.k.a(iBinder);
            this.l.a(iBinder);
            this.m.a(iBinder);
            this.n.a(iBinder);
            this.o.a(iBinder);
        }
        super.a(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.l, com.google.android.gms.common.api.g
    public final void b() {
        this.g.a(this);
        this.h.a(this);
        this.i.a(this);
        this.j.a(this);
        this.k.a(this);
        this.l.a(this);
        this.m.a(this);
        this.n.a(this);
        this.o.a(this);
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ am a(IBinder iBinder) {
        return an.a(iBinder);
    }
}
