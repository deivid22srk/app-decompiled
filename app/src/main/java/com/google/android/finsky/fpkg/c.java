package com.google.android.finsky.fpkg;

import android.os.Bundle;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2778a;

    c(a aVar) {
        this.f2778a = aVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        m mVar;
        m mVar2;
        a aVar = this.f2778a;
        com.google.android.gms.car.d dVar = com.google.android.gms.car.apkg.c;
        mVar = this.f2778a.f;
        aVar.c = dVar.a(mVar);
        a.a(this.f2778a);
        mVar2 = this.f2778a.f;
        mVar2.d();
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
        a.a(this.f2778a);
    }
}
