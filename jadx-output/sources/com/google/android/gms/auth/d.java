package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.bc;

/* loaded from: classes.dex */
final class d implements e<RecoveryDecision> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5385a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5386b = null;
    final /* synthetic */ boolean c = true;
    final /* synthetic */ Bundle d;

    d(String str, Bundle bundle) {
        this.f5385a = str;
        this.d = bundle;
    }

    @Override // com.google.android.gms.auth.e
    public final /* synthetic */ RecoveryDecision a(IBinder iBinder) {
        return (RecoveryDecision) b.a(bc.a(iBinder).a(this.f5385a, this.f5386b, this.c, this.d));
    }
}
