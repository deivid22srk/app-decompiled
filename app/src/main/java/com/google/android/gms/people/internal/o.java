package com.google.android.gms.people.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class o implements com.google.android.gms.people.g {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6416a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.people.model.f f6417b;

    public o(Status status, com.google.android.gms.people.model.f fVar) {
        this.f6416a = status;
        this.f6417b = fVar;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6416a;
    }

    @Override // com.google.android.gms.people.g
    public final com.google.android.gms.people.model.f c() {
        return this.f6417b;
    }

    @Override // com.google.android.gms.common.api.w
    public final void a() {
        if (this.f6417b != null) {
            this.f6417b.a();
        }
    }
}
