package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;

/* loaded from: classes.dex */
public final class d extends ba {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6363a;

    /* renamed from: b, reason: collision with root package name */
    private final AlarmManager f6364b;

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
        this.f6364b.cancel(o());
    }

    public final void b() {
        u();
        this.f6363a = false;
        this.f6364b.cancel(o());
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

    protected d(ap apVar) {
        super(apVar);
        this.f6364b = (AlarmManager) super.i().getSystemService("alarm");
    }

    public final void a(long j) {
        u();
        com.google.android.gms.common.internal.av.b(j > 0);
        com.google.android.gms.common.internal.av.a(AppMeasurementReceiver.a(super.i()), "Receiver not registered/enabled");
        com.google.android.gms.common.internal.av.a(AppMeasurementService.a(super.i()), "Service not registered/enabled");
        b();
        long b2 = super.h().b() + j;
        this.f6363a = true;
        this.f6364b.setInexactRepeating(2, b2, Math.max(i.M(), j), o());
    }

    private PendingIntent o() {
        Intent intent = new Intent(super.i(), (Class<?>) AppMeasurementReceiver.class);
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(super.i(), 0, intent, 0);
    }
}
