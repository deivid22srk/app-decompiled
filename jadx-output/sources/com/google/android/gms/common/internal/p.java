package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class p extends ak {

    /* renamed from: a, reason: collision with root package name */
    private l f5723a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5724b;

    public p(l lVar, int i) {
        this.f5723a = lVar;
        this.f5724b = i;
    }

    @Override // com.google.android.gms.common.internal.aj
    public final void a(int i, Bundle bundle) {
        av.a(this.f5723a, "onAccountValidationComplete can be called only once per call to validateAccount");
        l lVar = this.f5723a;
        lVar.c.sendMessage(lVar.c.obtainMessage(5, this.f5724b, -1, new u(lVar, i, bundle)));
        this.f5723a = null;
    }

    @Override // com.google.android.gms.common.internal.aj
    public final void a(int i, IBinder iBinder, Bundle bundle) {
        av.a(this.f5723a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f5723a.a(i, iBinder, bundle, this.f5724b);
        this.f5723a = null;
    }
}
