package com.a.a.apkg.apkg;

import com.a.a.ah;

/* loaded from: classes.dex */
public final class w extends ah {

    /* renamed from: a, reason: collision with root package name */
    public final com.a.a.t f917a;

    /* renamed from: b, reason: collision with root package name */
    public final okio2.i f918b;

    public w(com.a.a.t tVar, okio2.i iVar) {
        this.f917a = tVar;
        this.f918b = iVar;
    }

    @Override // com.a.a.ah
    public final com.a.a.x a() {
        String a2 = this.f917a.a("Content-Type");
        if (a2 != null) {
            return com.a.a.x.a(a2);
        }
        return null;
    }

    @Override // com.a.a.ah
    public final long b() {
        return u.a(this.f917a);
    }

    @Override // com.a.a.ah
    public final okio2.i c() {
        return this.f918b;
    }
}
