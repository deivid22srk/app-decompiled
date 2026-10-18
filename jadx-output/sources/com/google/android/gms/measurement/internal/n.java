package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends ba {

    /* renamed from: a, reason: collision with root package name */
    private long f6375a;

    /* renamed from: b, reason: collision with root package name */
    private String f6376b;

    n(ap apVar) {
        super(apVar);
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
        Calendar calendar = Calendar.getInstance();
        this.f6375a = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        this.f6376b = locale.getLanguage().toLowerCase(Locale.ENGLISH) + "-" + locale.getCountry().toLowerCase(Locale.ENGLISH);
    }

    public final String b() {
        u();
        return Build.MODEL;
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
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.c.a h() {
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

    public final String o() {
        u();
        return Build.VERSION.RELEASE;
    }

    public final long p() {
        u();
        return this.f6375a;
    }

    public final String q() {
        u();
        return this.f6376b;
    }
}
