package com.google.android.play.apkg;

/* loaded from: classes.dex */
public class ac {
    public static final String c = ac.class.getSimpleName();
    public static ac d = null;

    /* renamed from: a, reason: collision with root package name */
    public final ad<m> f6744a = new ad<>(m.class, 60);

    /* renamed from: b, reason: collision with root package name */
    public final ad<n> f6745b = new ad<>(n.class, 50);

    public static synchronized ac a() {
        ac acVar;
        synchronized (ac.class) {
            if (d == null) {
                d = new ac();
            }
            acVar = d;
        }
        return acVar;
    }

    public ac() {
    }

    public final void a(m mVar) {
        for (n nVar : mVar.o) {
            nVar.c();
            this.f6745b.a(nVar);
        }
        mVar.c();
        this.f6744a.a(mVar);
    }
}
