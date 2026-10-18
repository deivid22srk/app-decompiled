package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.wearable.internal.ca;

/* loaded from: classes.dex */
final class ab extends com.google.android.gms.common.api.f<ca, ac> {
    ab() {
    }

    @Override // com.google.android.gms.common.api.f
    public final /* synthetic */ ca a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, ac acVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        if (acVar == null) {
            new ad();
            new ac((byte) 0);
        }
        return new ca(context, looper, pVar, qVar, hVar);
    }
}
