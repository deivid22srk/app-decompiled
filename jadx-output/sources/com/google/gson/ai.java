package com.google.gson;

/* loaded from: classes2.dex */
final class ai implements ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.c.a<?> f7765a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7766b;
    private final Class<?> c;
    private final ad<?> d;
    private final x<?> e;

    /* synthetic */ ai(Object obj, com.google.gson.c.a aVar, boolean z, byte b2) {
        this(obj, aVar, z);
    }

    private ai(Object obj, com.google.gson.c.a<?> aVar, boolean z) {
        this.d = obj instanceof ad ? (ad) obj : null;
        this.e = obj instanceof x ? (x) obj : null;
        com.google.gson.b.a.a((this.d == null && this.e == null) ? false : true);
        this.f7765a = aVar;
        this.f7766b = z;
        this.c = null;
    }

    @Override // com.google.gson.ak
    public final <T> aj<T> a(k kVar, com.google.gson.c.a<T> aVar) {
        byte b2 = 0;
        if (this.f7765a != null ? this.f7765a.equals(aVar) || (this.f7766b && this.f7765a.f7847b == aVar.f7846a) : this.c.isAssignableFrom(aVar.f7846a)) {
            return new ah(this.d, this.e, kVar, aVar, this, b2);
        }
        return null;
    }
}
