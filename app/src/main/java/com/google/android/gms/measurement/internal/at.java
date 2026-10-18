package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class at implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppMetadata f6321a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f6322b;

    at(as asVar, AppMetadata appMetadata) {
        this.f6322b = asVar;
        this.f6321a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.f6322b.a(this.f6321a.h);
        apVar = this.f6322b.f6319a;
        AppMetadata appMetadata = this.f6321a;
        apVar.f().e();
        apVar.a();
        com.google.android.gms.common.internal.av.a(appMetadata.f6280b);
        apVar.a(appMetadata);
    }
}
