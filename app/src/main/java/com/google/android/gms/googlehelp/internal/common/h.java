package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class h extends o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f5839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(c cVar, com.google.android.gms.common.api.m mVar, Activity activity) {
        super(mVar);
        this.f5839b = cVar;
        this.f5838a = activity;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.n
    protected final void a(v vVar) {
        Status status;
        try {
            vVar.a(new i(this, this.f5838a));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to show Pip failed!", e);
            status = c.f5831a;
            b(status);
        }
    }
}
