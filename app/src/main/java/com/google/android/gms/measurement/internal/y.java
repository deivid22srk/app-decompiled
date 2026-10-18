package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;

/* loaded from: classes.dex */
public final class y extends com.google.android.gms.common.internal.l<u> {
    public y(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 93, hVar, pVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.measurement.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ u a(IBinder iBinder) {
        return v.a(iBinder);
    }
}
