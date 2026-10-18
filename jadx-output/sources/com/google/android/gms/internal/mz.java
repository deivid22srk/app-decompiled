package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;

/* loaded from: classes.dex */
public final class mz extends com.google.android.gms.common.internal.l<nf> {
    public mz(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 20, hVar, pVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.deviceconnection.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.deviceconnection.internal.IDeviceConnectionService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ nf a(IBinder iBinder) {
        return ng.a(iBinder);
    }
}
