package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.google.android.gms.measurement.AppMeasurementService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bg extends ba {

    /* renamed from: a, reason: collision with root package name */
    final bm f6344a;

    /* renamed from: b, reason: collision with root package name */
    u f6345b;
    private Boolean c;
    private final l d;
    private final c e;
    private final List<Runnable> f;
    private final l g;

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

    protected bg(ap apVar) {
        super(apVar);
        this.f = new ArrayList();
        this.e = new c(apVar.d);
        this.f6344a = new bm(this);
        this.d = new bh(this, apVar);
        this.g = new bi(this, apVar);
    }

    public final boolean b() {
        super.e();
        u();
        return this.f6345b != null;
    }

    protected final void a(UserAttributeParcel userAttributeParcel) {
        super.e();
        u();
        a(new bj(this, userAttributeParcel));
    }

    protected final void o() {
        super.e();
        u();
        a(new bk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        super.e();
        this.e.a();
        this.d.a(i.x());
    }

    private void q() {
        boolean z;
        super.e();
        u();
        if (b()) {
            return;
        }
        if (this.c == null) {
            this.c = super.m().q();
            if (this.c == null) {
                super.l().g.a("State of service unknown");
                super.e();
                u();
                if (i.B()) {
                    z = true;
                } else {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.measurement.service.MeasurementBrokerService"));
                    com.google.android.gms.common.stats.b a2 = com.google.android.gms.common.stats.b.a();
                    super.l().g.a("Checking service availability");
                    if (a2.a(super.i(), intent, new bl(this), 0)) {
                        super.l().g.a("Service available");
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this.c = Boolean.valueOf(z);
                super.m().a(this.c.booleanValue());
            }
        }
        if (this.c.booleanValue()) {
            super.l().g.a("Using measurement service");
            bm bmVar = this.f6344a;
            super.e();
            Context i = super.i();
            synchronized (bmVar) {
                if (bmVar.f6352a) {
                    super.l().g.a("Connection attempt already in progress");
                } else if (bmVar.f6353b != null) {
                    super.l().g.a("Already awaiting connection attempt");
                } else {
                    bmVar.f6353b = new y(i, Looper.getMainLooper(), new com.google.android.gms.common.api.n(i).a(), bmVar, bmVar);
                    super.l().g.a("Connecting to remote service");
                    bmVar.f6352a = true;
                    bmVar.f6353b.l();
                }
            }
            return;
        }
        List<ResolveInfo> queryIntentServices = super.i().getPackageManager().queryIntentServices(new Intent(super.i(), (Class<?>) AppMeasurementService.class), 65536);
        if (!(queryIntentServices != null && queryIntentServices.size() > 0)) {
            if (!super.n().C()) {
                super.l().f6388a.a("Not in main process. Unable to use local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            } else {
                super.l().g.a("Using direct local measurement implementation");
                a(new as(this.h, (byte) 0));
                return;
            }
        }
        super.l().g.a("Using local app measurement service");
        Intent intent2 = new Intent("com.google.android.gms.measurement.START");
        intent2.setComponent(new ComponentName(super.i(), (Class<?>) AppMeasurementService.class));
        bm bmVar2 = this.f6344a;
        super.e();
        Context i2 = super.i();
        com.google.android.gms.common.stats.b a3 = com.google.android.gms.common.stats.b.a();
        synchronized (bmVar2) {
            if (bmVar2.f6352a) {
                super.l().g.a("Connection attempt already in progress");
            } else {
                bmVar2.f6352a = true;
                a3.a(i2, intent2, bmVar2.c.f6344a, 129);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u uVar) {
        super.e();
        com.google.android.gms.common.internal.av.a(uVar);
        this.f6345b = uVar;
        p();
        super.e();
        super.l().g.a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        Iterator<Runnable> it = this.f.iterator();
        while (it.hasNext()) {
            super.k().a(it.next());
        }
        this.f.clear();
        this.g.b();
    }

    private void a(Runnable runnable) {
        super.e();
        if (b()) {
            runnable.run();
        } else {
            if (this.f.size() >= i.F()) {
                super.l().f6388a.a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f.add(runnable);
            this.g.a(60000L);
            q();
        }
    }

    static /* synthetic */ void a(bg bgVar, ComponentName componentName) {
        super.e();
        if (bgVar.f6345b != null) {
            bgVar.f6345b = null;
            super.l().g.a("Disconnected from device MeasurementService", componentName);
            super.e();
            bgVar.q();
        }
    }

    static /* synthetic */ void a(bg bgVar) {
        super.e();
        if (bgVar.b()) {
            super.l().g.a("Inactivity, disconnecting from AppMeasurementService");
            super.e();
            bgVar.u();
            try {
                com.google.android.gms.common.stats.b.a().a(super.i(), bgVar.f6344a);
            } catch (IllegalArgumentException e) {
            } catch (IllegalStateException e2) {
            }
            bgVar.f6345b = null;
        }
    }
}
