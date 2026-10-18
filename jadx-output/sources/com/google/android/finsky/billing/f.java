package com.google.android.finsky.billing;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2203a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2204b;
    private final j c;

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void b(Bundle bundle);

    public f(g gVar, j jVar, Bundle bundle) {
        this.f2203a = bundle;
        this.f2204b = gVar;
        this.c = jVar;
    }

    public void b() {
    }

    public void c() {
        a(true, null);
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public boolean e() {
        return false;
    }

    public final void a(boolean z, Bundle bundle) {
        this.c.a(z, bundle);
    }

    public final void a(String str) {
        this.c.a(str);
    }
}
