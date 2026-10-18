package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ps extends com.google.android.gms.common.internal.l<po> {
    private final Context f;

    public ps(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 45, hVar, pVar, qVar);
        this.f = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ po a(IBinder iBinder) {
        return pp.a(iBinder);
    }
}
