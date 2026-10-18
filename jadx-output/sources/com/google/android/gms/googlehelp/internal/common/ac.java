package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ac extends af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f5828b;

    ac(ab abVar, Activity activity) {
        this.f5828b = abVar;
        this.f5827a = activity;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.af, com.google.android.gms.googlehelp.l
    public final com.google.android.gms.common.api.u<Status> a() {
        com.google.android.gms.common.api.m mVar;
        com.google.android.gms.googlehelp.f fVar = com.google.android.gms.googlehelp.h.d;
        mVar = this.f5828b.f5826a;
        return fVar.b(mVar, this.f5827a);
    }
}
