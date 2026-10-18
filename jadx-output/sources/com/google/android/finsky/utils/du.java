package com.google.android.finsky.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class du implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4834a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Notification f4835b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ Intent f;
    final /* synthetic */ dt g;

    du(dt dtVar, int i, Notification notification, String str, String str2, String str3, Intent intent) {
        this.g = dtVar;
        this.f4834a = i;
        this.f4835b = notification;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = intent;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        Context context;
        if (!z) {
            context = this.g.f4833a;
            ((NotificationManager) context.getSystemService("notification")).notify(this.f4834a, this.f4835b);
        }
        dt.a(!z, this.c, this.d, this.e, this.f);
    }
}
