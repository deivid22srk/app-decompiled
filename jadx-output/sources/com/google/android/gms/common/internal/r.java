package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* loaded from: classes.dex */
public final class r implements com.google.android.gms.common.api.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f5727a;

    public r(l lVar) {
        this.f5727a = lVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.api.q qVar;
        com.google.android.gms.common.api.q qVar2;
        Set<Scope> set;
        if (connectionResult.b()) {
            l lVar = this.f5727a;
            set = this.f5727a.p;
            lVar.a((ad) null, set);
        } else {
            qVar = this.f5727a.s;
            if (qVar != null) {
                qVar2 = this.f5727a.s;
                qVar2.a(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.t
    public final void b(ConnectionResult connectionResult) {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
