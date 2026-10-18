package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class ay implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppMetadata f6331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f6332b;

    ay(as asVar, AppMetadata appMetadata) {
        this.f6332b = asVar;
        this.f6331a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.f6332b.a(this.f6331a.h);
        apVar = this.f6332b.f6319a;
        AppMetadata appMetadata = this.f6331a;
        apVar.f().e();
        apVar.a();
        com.google.android.gms.common.internal.av.a(appMetadata);
        com.google.android.gms.common.internal.av.a(appMetadata.f6280b);
        if (TextUtils.isEmpty(appMetadata.c)) {
            return;
        }
        apVar.a(appMetadata);
        if (apVar.h().a(appMetadata.f6280b, "_f") == null) {
            long a2 = apVar.d.a();
            apVar.a(new UserAttributeParcel("_fot", a2, Long.valueOf(3600000 * ((a2 / 3600000) + 1)), "auto"), appMetadata);
            Bundle bundle = new Bundle();
            bundle.putLong("_c", 1L);
            apVar.a(new EventParcel("_f", new EventParams(bundle), "auto", a2), appMetadata);
        }
    }
}
