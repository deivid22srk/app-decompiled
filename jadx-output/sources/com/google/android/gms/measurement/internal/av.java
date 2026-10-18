package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6325a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EventParcel f6326b;
    final /* synthetic */ String c;
    final /* synthetic */ as d;

    av(as asVar, String str, EventParcel eventParcel, String str2) {
        this.d = asVar;
        this.f6325a = str;
        this.f6326b = eventParcel;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap apVar;
        this.d.a(this.f6325a);
        apVar = this.d.f6319a;
        EventParcel eventParcel = this.f6326b;
        String str = this.c;
        b c = apVar.h().c(str);
        if (c == null || TextUtils.isEmpty(c.g)) {
            apVar.e().f.a("No app data available; dropping event", str);
        } else {
            apVar.a(eventParcel, new AppMetadata(str, c.c, c.g, c.h, c.i, c.j, null, c.k));
        }
    }
}
