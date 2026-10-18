package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class ao implements el<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4460a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageMonitorReceiver f4461b;

    ao(PackageMonitorReceiver packageMonitorReceiver, String str) {
        this.f4461b = packageMonitorReceiver;
        this.f4460a = str;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* synthetic */ void a(aq aqVar) {
        aqVar.c(this.f4460a);
    }
}
