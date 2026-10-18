package com.google.gson;

/* loaded from: classes2.dex */
public final class ah<T> extends aj<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ad<T> f7763a;

    /* renamed from: b, reason: collision with root package name */
    private final x<T> f7764b;
    private final k c;
    private final com.google.gson.c.a<T> d;
    private final ak e;
    private aj<T> f;

    /* synthetic */ ah(ad adVar, x xVar, k kVar, com.google.gson.c.a aVar, ak akVar, byte b2) {
        this(adVar, xVar, kVar, aVar, akVar);
    }

    private ah(ad<T> adVar, x<T> xVar, k kVar, com.google.gson.c.a<T> aVar, ak akVar) {
        this.f7763a = adVar;
        this.f7764b = xVar;
        this.c = kVar;
        this.d = aVar;
        this.e = akVar;
    }

    @Override // com.google.gson.aj
    public final T a(com.google.gson.stream.a aVar) {
        if (this.f7764b == null) {
            return a().a(aVar);
        }
        y a2 = com.google.gson.b.v.a(aVar);
        if (a2 instanceof z) {
            return null;
        }
        try {
            return this.f7764b.deserialize(a2, this.d.f7847b, this.c.f7850a);
        } catch (JsonParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new JsonParseException(e2);
        }
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, T t) {
        if (this.f7763a == null) {
            a().a(fVar, t);
        } else if (t == null) {
            fVar.e();
        } else {
            com.google.gson.b.v.a(this.f7763a.serialize(t, this.d.f7847b, this.c.f7851b), fVar);
        }
    }

    private aj<T> a() {
        aj<T> ajVar = this.f;
        if (ajVar != null) {
            return ajVar;
        }
        aj<T> a2 = com.google.gson.b.q.f7835a.a(this.c, this.e, this.d);
        this.f = a2;
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ak a(com.google.gson.c.a<?> aVar, Object obj) {
        return new ai(obj, aVar, false, 0 == true ? 1 : 0);
    }
}
