package com.google.android.finsky.utils;

import android.app.NotificationManager;
import android.content.Intent;

/* loaded from: classes.dex */
final class dv implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NotificationManager f4836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4837b;
    final /* synthetic */ android.support.v4.app.bn c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ Intent g;
    final /* synthetic */ dt h;

    dv(dt dtVar, NotificationManager notificationManager, int i, android.support.v4.app.bn bnVar, String str, String str2, String str3, Intent intent) {
        this.h = dtVar;
        this.f4836a = notificationManager;
        this.f4837b = i;
        this.c = bnVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = intent;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        if (!z) {
            this.f4836a.notify(this.f4837b, this.c.a());
        }
        dt.a(!z, this.d, this.e, this.f, this.g);
    }
}
