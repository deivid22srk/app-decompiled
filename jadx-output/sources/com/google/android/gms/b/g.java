package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Status f5389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f5390b;

    g(f fVar, Status status) {
        this.f5390b = fVar;
        this.f5389a = status;
    }

    @Override // com.google.android.gms.common.api.w
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f5389a;
    }

    @Override // com.google.android.gms.b.d
    public final com.google.android.gms.b.a.b c() {
        return new com.google.android.gms.b.a.b(DataHolder.b(this.f5389a.g));
    }
}
