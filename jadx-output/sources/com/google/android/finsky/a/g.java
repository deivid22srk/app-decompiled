package com.google.android.finsky.a;

/* loaded from: classes.dex */
public final class g {
    private static g h = null;

    /* renamed from: a, reason: collision with root package name */
    final h<ad> f1481a = new h<>(ad.class, 40);

    /* renamed from: b, reason: collision with root package name */
    final h<ac> f1482b = new h<>(ac.class, 10);
    final h<z> c = new h<>(z.class, 10);
    final h<ab> d = new h<>(ab.class, 10);
    final h<y> e = new h<>(y.class, 10);
    final h<af> f = new h<>(af.class, 10);
    private final h<ai> i = new h<>(ai.class, 50);
    final h<ao> g = new h<>(ao.class, 10);

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (h == null) {
                h = new g();
            }
            gVar = h;
        }
        return gVar;
    }

    private g() {
    }

    public final ad b() {
        return this.f1481a.a();
    }

    public final ac c() {
        return this.f1482b.a();
    }

    public final z d() {
        return this.c.a();
    }

    public final ai e() {
        return this.i.a();
    }

    public final void a(ai aiVar) {
        for (ai aiVar2 : aiVar.f) {
            a(aiVar2);
        }
        aiVar.c();
        this.i.a(aiVar);
    }
}
