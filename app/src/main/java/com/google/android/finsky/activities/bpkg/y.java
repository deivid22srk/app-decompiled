package com.google.android.finsky.activities.bpkg;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.api.model.i f1603a;

    /* renamed from: b, reason: collision with root package name */
    public String f1604b;
    public boolean c;
    public com.google.android.finsky.api.model.x d;
    public com.android.volley.s e;
    public final /* synthetic */ x f;

    public y(x xVar) {
        this.f = xVar;
    }

    /* synthetic */ y(x xVar, byte b2) {
        this(xVar);
    }

    public final void a() {
        if (this.d != null) {
            this.f1603a.b(this.d);
            this.d = null;
        }
        if (this.e != null) {
            this.f1603a.b(this.e);
            this.e = null;
        }
    }

    public final void a(com.google.android.finsky.api.model.x xVar, boolean z) {
        a();
        if (z) {
            this.f1603a.r();
        } else {
            this.f1603a.q();
        }
        this.c = false;
        this.d = xVar;
        this.f1603a.a(this.d);
        this.e = new z(this);
        this.f1603a.a(this.e);
    }
}
