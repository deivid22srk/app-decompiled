package com.google.android.finsky.setup;

import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class i extends com.google.android.finsky.epkg.u {

    /* renamed from: a, reason: collision with root package name */
    nv[] f4662a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.api.b f4663b;

    public static i a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        i iVar = new i();
        iVar.f(bundle);
        return iVar;
    }

    @Override // com.google.android.finsky.epkg.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f4663b = FinskyApp.a().b(this.r.getString("authAccount"));
    }

    public final void a(long j) {
        if (this.as == 4) {
            FinskyLog.e("Making another load request while in loading state: %d", Integer.valueOf(this.as));
        } else {
            a(4, 0);
            this.f4663b.a(j, new j(this), new k(this));
        }
    }
}
