package com.google.android.gms.googlehelp;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;

/* loaded from: classes.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5815b;

    b(a aVar, Intent intent) {
        this.f5815b = aVar;
        this.f5814a = intent;
    }

    @Override // com.google.android.gms.googlehelp.l
    public final void b() {
        this.f5815b.a(16, this.f5814a);
    }

    @Override // com.google.android.gms.googlehelp.l
    public final u<Status> a() {
        return h.d.a(this.f5815b.f5813b, this.f5815b.f5812a, this.f5814a);
    }
}
