package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class c<T extends IInterface> extends l<T> {
    private final com.google.android.gms.common.api.i<T> f;

    public c(Context context, Looper looper, int i, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar, h hVar, com.google.android.gms.common.api.i iVar) {
        super(context, looper, i, hVar, pVar, qVar);
        this.f = iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final T a(IBinder iBinder) {
        return this.f.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return this.f.b();
    }
}
