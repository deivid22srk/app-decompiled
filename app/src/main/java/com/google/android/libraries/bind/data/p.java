package com.google.android.libraries.bind.data;

import java.util.Locale;

/* loaded from: classes.dex */
public class p extends m {

    /* renamed from: a, reason: collision with root package name */
    public k f6699a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6700b;
    public boolean c;
    private final o d;
    private boolean e = true;
    private boolean f;

    public p(o oVar) {
        this.d = oVar;
    }

    public void a(k kVar) {
        if (kVar != this.f6699a) {
            if (this.f) {
                d();
            }
            this.f6699a = kVar;
            c();
            a(j.f6693a);
        }
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = this.d.getClass().getSimpleName();
        objArr[1] = Boolean.valueOf(this.f6699a != null);
        objArr[2] = Boolean.valueOf(this.f);
        objArr[3] = Boolean.valueOf(this.f6700b);
        objArr[4] = Boolean.valueOf(this.c);
        objArr[5] = Boolean.valueOf(this.e);
        return String.format(locale, "View type: %s, hasData: %b, registered: %b, attached: %b,temporarilyDetached: %b, clearDataOnDetach: %b", objArr);
    }

    @Override // com.google.android.libraries.bind.data.m
    public final void a(j jVar) {
        boolean z = true;
        if (this.f6699a != null && this.f6699a.b() > 1) {
            z = false;
        }
        com.google.android.libraries.bind.dpkg.a.a(z, "Passed DataList with more than one row.");
        this.d.b(a());
    }

    public final void b() {
        this.c = false;
        c();
    }

    public final void c() {
        if ((this.f6700b && !this.c) || !this.e) {
            if (this.f || this.f6699a == null) {
                return;
            }
            this.f6699a.a(this);
            this.f = true;
            return;
        }
        if (this.f) {
            d();
        }
    }

    private void d() {
        this.f6699a.b(this);
        this.f = false;
    }

    public Data a() {
        if ((this.f6699a == null || this.f6699a.c()) ? false : true) {
            return this.f6699a.a(0);
        }
        return null;
    }
}
