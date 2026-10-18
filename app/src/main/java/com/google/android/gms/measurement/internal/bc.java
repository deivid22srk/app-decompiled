package com.google.android.gms.measurement.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class bc extends ba {

    /* renamed from: a, reason: collision with root package name */
    bf f6338a;

    protected bc(ap apVar) {
        super(apVar);
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.cpkg.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    public final void a(String str, String str2, Object obj) {
        com.google.android.gms.common.internal.av.a(str);
        long a2 = super.h().a();
        super.j();
        g.a(str2);
        if (obj == null) {
            super.k().a(new be(this, str, str2, a2));
            return;
        }
        super.j().a(str2, obj);
        super.j();
        Object b2 = g.b(str2, obj);
        if (b2 != null) {
            super.k().a(new bd(this, str, str2, b2, a2));
        }
    }

    public final void b() {
        super.e();
        super.c();
        u();
        if (this.h.b()) {
            super.g().o();
        }
    }

    static /* synthetic */ void a(bc bcVar, String str, String str2, Object obj, long j) {
        com.google.android.gms.common.internal.av.a(str);
        com.google.android.gms.common.internal.av.a(str2);
        super.e();
        super.c();
        bcVar.u();
        if (!super.m().r()) {
            super.l().e.a("User attribute not set since app measurement is disabled");
        } else if (bcVar.h.b()) {
            super.l().f.a("Setting user attribute (FE)", str2, obj);
            super.g().a(new UserAttributeParcel(str2, j, obj, str));
        }
    }
}
