package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class ax implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppMetadata f6329a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UserAttributeParcel f6330b;
    final /* synthetic */ as c;

    ax(as asVar, AppMetadata appMetadata, UserAttributeParcel userAttributeParcel) {
        this.c = asVar;
        this.f6329a = appMetadata;
        this.f6330b = userAttributeParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.c.a(this.f6329a.h);
        apVar = this.c.f6319a;
        apVar.a(this.f6330b, this.f6329a);
    }
}
