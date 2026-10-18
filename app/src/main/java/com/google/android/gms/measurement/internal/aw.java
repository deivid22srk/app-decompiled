package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppMetadata f6327a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UserAttributeParcel f6328b;
    final /* synthetic */ as c;

    aw(as asVar, AppMetadata appMetadata, UserAttributeParcel userAttributeParcel) {
        this.c = asVar;
        this.f6327a = appMetadata;
        this.f6328b = userAttributeParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.c.a(this.f6327a.h);
        apVar = this.c.f6319a;
        UserAttributeParcel userAttributeParcel = this.f6328b;
        AppMetadata appMetadata = this.f6327a;
        apVar.f().e();
        apVar.a();
        if (TextUtils.isEmpty(appMetadata.c)) {
            return;
        }
        apVar.e().f.a("Removing user attribute", userAttributeParcel.f6286b);
        apVar.h().b();
        try {
            apVar.a(appMetadata);
            apVar.h().b(appMetadata.f6280b, userAttributeParcel.f6286b);
            apVar.h().o();
            apVar.e().f.a("User attribute removed", userAttributeParcel.f6286b);
        } finally {
            apVar.h().p();
        }
    }
}
