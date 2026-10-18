package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class qa extends com.google.android.gms.common.api.f<com.google.android.gms.signin.internal.n, qg> {
    qa() {
    }

    @Override // com.google.android.gms.common.api.f
    public final /* synthetic */ com.google.android.gms.signin.internal.n a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, qg qgVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        qg qgVar2 = qgVar;
        return new com.google.android.gms.signin.internal.n(context, looper, hVar, qgVar2 == null ? qg.f6244a : qgVar2, pVar, qVar, Executors.newSingleThreadExecutor());
    }
}
