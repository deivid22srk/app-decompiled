package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;

/* loaded from: classes.dex */
public final class nw extends com.google.android.gms.common.internal.l<com.google.android.gms.c.a.a> {
    public nw(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 28, hVar, pVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.mdm.services.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.mdm.internal.INetworkQualityService";
    }

    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ com.google.android.gms.c.a.a a(IBinder iBinder) {
        return com.google.android.gms.c.a.b.a(iBinder);
    }
}
