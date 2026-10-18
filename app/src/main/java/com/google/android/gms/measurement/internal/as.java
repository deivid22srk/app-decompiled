package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class as extends v {

    /* renamed from: a, reason: collision with root package name */
    public final ap f6319a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6320b;

    public as(ap apVar) {
        com.google.android.gms.common.internal.av.a(apVar);
        this.f6319a = apVar;
        this.f6320b = false;
    }

    public as(ap apVar, byte b2) {
        com.google.android.gms.common.internal.av.a(apVar);
        this.f6319a = apVar;
        this.f6320b = true;
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void a(AppMetadata appMetadata) {
        com.google.android.gms.common.internal.av.a(appMetadata);
        b(appMetadata.f6280b);
        this.f6319a.f().a(new ay(this, appMetadata));
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void a(EventParcel eventParcel, AppMetadata appMetadata) {
        com.google.android.gms.common.internal.av.a(eventParcel);
        com.google.android.gms.common.internal.av.a(appMetadata);
        b(appMetadata.f6280b);
        this.f6319a.f().a(new au(this, appMetadata, eventParcel));
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void a(EventParcel eventParcel, String str, String str2) {
        com.google.android.gms.common.internal.av.a(eventParcel);
        com.google.android.gms.common.internal.av.a(str);
        b(str);
        this.f6319a.f().a(new av(this, str2, eventParcel, str));
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        com.google.android.gms.common.internal.av.a(userAttributeParcel);
        com.google.android.gms.common.internal.av.a(appMetadata);
        b(appMetadata.f6280b);
        if (userAttributeParcel.a() == null) {
            this.f6319a.f().a(new aw(this, appMetadata, userAttributeParcel));
        } else {
            this.f6319a.f().a(new ax(this, appMetadata, userAttributeParcel));
        }
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void b(AppMetadata appMetadata) {
        com.google.android.gms.common.internal.av.a(appMetadata);
        b(appMetadata.f6280b);
        this.f6319a.f().a(new at(this, appMetadata));
    }

    final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(":", 2);
        if (split.length == 2) {
            try {
                long longValue = Long.valueOf(split[0]).longValue();
                if (longValue > 0) {
                    this.f6319a.d().f6302b.a(split[1], longValue);
                } else {
                    this.f6319a.e().f6389b.a("Combining sample with a non-positive weight", Long.valueOf(longValue));
                }
            } catch (NumberFormatException e) {
                this.f6319a.e().f6389b.a("Combining sample with a non-number weight", split[0]);
            }
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f6319a.e().f6388a.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            int myUid = this.f6320b ? Process.myUid() : Binder.getCallingUid();
            if (com.google.android.gms.common.c.a(this.f6319a.f6315a, myUid, str) || com.google.android.gms.common.c.a(this.f6319a.f6315a, myUid)) {
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        } catch (SecurityException e) {
            this.f6319a.e().f6388a.a("Measurement Service called with invalid calling package", str);
            throw e;
        }
    }
}
