package com.google.android.gms.googlehelp.internal.common;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class j extends o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f5841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(c cVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        this.f5841a = cVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.n
    protected final void a(v vVar) {
        Status status;
        try {
            vVar.b(new k(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to hide Pip failed!", e);
            status = c.f5831a;
            b(status);
        }
    }
}
