package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;

/* loaded from: classes.dex */
public final class kj extends com.google.android.gms.common.internal.l<kn> {
    public kj(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 40, hVar, pVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ kn a(IBinder iBinder) {
        return ko.a(iBinder);
    }
}
