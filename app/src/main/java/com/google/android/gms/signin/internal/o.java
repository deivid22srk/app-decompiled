package com.google.android.gms.signin.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.qg;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class o extends e {

    /* renamed from: a, reason: collision with root package name */
    public final qg f6450a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f6451b;

    public o(qg qgVar, ExecutorService executorService) {
        this.f6450a = qgVar;
        this.f6451b = executorService;
    }

    @Override // com.google.android.gms.signin.internal.d
    public final void a(String str, String str2, i iVar) {
        this.f6451b.submit(new q(this, str, str2, iVar));
    }

    @Override // com.google.android.gms.signin.internal.d
    public final void a(String str, List<Scope> list, i iVar) {
        this.f6451b.submit(new p(this, list, str, iVar));
    }
}
