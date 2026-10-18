package com.google.android.gms.googlehelp;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.y;

/* loaded from: classes.dex */
final class k implements y<Status> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f5853a;

    k(j jVar) {
        this.f5853a = jVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(Status status) {
        if (!status.a()) {
            this.f5853a.f5852b.b();
        }
        this.f5853a.f5851a.d();
    }
}
