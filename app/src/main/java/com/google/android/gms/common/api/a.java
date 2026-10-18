package com.google.android.gms.common.api;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
public final class a<O extends b> {

    /* renamed from: a, reason: collision with root package name */
    final j<?, O> f5574a;

    /* renamed from: b, reason: collision with root package name */
    final k<?> f5575b;
    public final String c;
    private final f<?, O> d;
    private final h<?> e;

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends g> a(String str, f<C, O> fVar, h<C> hVar) {
        av.a(fVar, "Cannot construct an Api with a null ClientBuilder");
        av.a(hVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.d = fVar;
        this.f5574a = null;
        this.e = hVar;
        this.f5575b = null;
    }

    public final f<?, O> a() {
        av.a(this.d != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.d;
    }

    public final h<?> b() {
        av.a(this.e != null, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.e;
    }
}
