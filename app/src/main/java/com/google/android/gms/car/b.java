package com.google.android.gms.car;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
final class b extends com.google.android.gms.common.api.f<eu, h> {
    b() {
    }

    @Override // com.google.android.gms.common.api.f
    public final /* synthetic */ eu a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, h hVar2, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        h hVar3 = hVar2;
        com.google.android.gms.common.internal.av.a(hVar3, "Setting the API options is required.");
        return new eu(context, looper, hVar, hVar3.f5526a, pVar, qVar);
    }
}
