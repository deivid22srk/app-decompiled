package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class an implements el<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4458a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageMonitorReceiver f4459b;

    an(PackageMonitorReceiver packageMonitorReceiver, String str) {
        this.f4459b = packageMonitorReceiver;
        this.f4458a = str;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* synthetic */ void a(aq aqVar) {
        aqVar.b(this.f4458a);
    }
}
