package com.google.android.gms.googlehelp;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5816a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5817b;

    public c(a aVar, d dVar) {
        this.f5817b = aVar;
        this.f5816a = dVar;
    }

    @Override // com.google.android.gms.googlehelp.l
    public final void b() {
        this.f5816a.a();
    }

    @Override // com.google.android.gms.googlehelp.l
    public final u<Status> a() {
        return h.d.a(this.f5817b.f5813b, this.f5817b.f5812a);
    }
}
