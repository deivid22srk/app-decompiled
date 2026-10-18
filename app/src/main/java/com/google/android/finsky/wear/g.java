package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class g implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.v> {
    g() {
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.v vVar) {
        FinskyLog.a("device config message status=%d", Integer.valueOf(vVar.b().g));
    }
}
