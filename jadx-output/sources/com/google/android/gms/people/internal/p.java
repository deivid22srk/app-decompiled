package com.google.android.gms.people.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class p implements com.google.android.gms.people.e {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6418a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.people.model.b f6419b;

    public p(Status status, com.google.android.gms.people.model.b bVar) {
        this.f6418a = status;
        this.f6419b = bVar;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6418a;
    }

    @Override // com.google.android.gms.people.e
    public final com.google.android.gms.people.model.b c() {
        return this.f6419b;
    }

    @Override // com.google.android.gms.common.api.w
    public final void a() {
        if (this.f6419b != null) {
            this.f6419b.a();
        }
    }
}
