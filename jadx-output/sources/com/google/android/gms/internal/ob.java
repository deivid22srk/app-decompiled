package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ob extends oc {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f6199b;
    final /* synthetic */ Bundle k;
    final /* synthetic */ oa l;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Integer f6198a = null;
    final /* synthetic */ Integer c = null;
    final /* synthetic */ Integer d = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ob(oa oaVar, com.google.android.gms.common.api.h hVar, com.google.android.gms.common.api.m mVar, Long l, Bundle bundle) {
        super(hVar, mVar);
        this.l = oaVar;
        this.f6199b = l;
        this.k = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(nw nwVar) {
        nw nwVar2 = nwVar;
        Bundle bundle = new Bundle();
        if (this.f6198a != null) {
            bundle.putInt("latency_micros", this.f6198a.intValue());
        }
        if (this.f6199b != null) {
            bundle.putLong("latency_bps", this.f6199b.longValue());
        }
        if (this.c != null) {
            bundle.putInt("latitude_e6", this.c.intValue());
        }
        if (this.d != null) {
            bundle.putInt("longitude_e6", this.d.intValue());
        }
        if (!bundle.isEmpty() || (this.k != null && !this.k.isEmpty())) {
            Bundle bundle2 = this.k;
            nwVar2.n();
            nwVar2.o().a(nwVar2.f5716a.getPackageName(), bundle, bundle2);
        }
        a((ob) Status.f5572a);
    }
}
