package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppMetadata f6323a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EventParcel f6324b;
    final /* synthetic */ as c;

    au(as asVar, AppMetadata appMetadata, EventParcel eventParcel) {
        this.c = asVar;
        this.f6323a = appMetadata;
        this.f6324b = eventParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.c.a(this.f6323a.h);
        apVar = this.c.f6319a;
        apVar.a(this.f6324b, this.f6323a);
    }
}
