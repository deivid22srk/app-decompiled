package com.google.android.finsky.api.model;

import com.google.android.finsky.protos.gb;
import java.util.Collection;

/* loaded from: classes.dex */
public final class h extends j implements com.android.volley.t<gb> {

    /* renamed from: a, reason: collision with root package name */
    public gb f1976a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1977b;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(gb gbVar) {
        this.f1976a = gbVar;
        l();
    }

    public h(com.google.android.finsky.api.b bVar, String str) {
        this(bVar, str, false, null);
    }

    public h(com.google.android.finsky.api.b bVar, String str, boolean z, Collection<String> collection) {
        this.f1977b = str;
        bVar.a(this.f1977b, z, false, collection, (com.android.volley.t<gb>) this, (com.android.volley.s) this);
    }

    public final Document b() {
        if (this.f1976a == null || this.f1976a.f3858b == null) {
            return null;
        }
        return new Document(this.f1976a.f3858b);
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.f1976a != null;
    }

    public final byte[] c() {
        if (this.f1976a == null || this.f1976a.f.length == 0) {
            return null;
        }
        return this.f1976a.f;
    }
}
