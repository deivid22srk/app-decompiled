package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class ap implements el<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageMonitorReceiver f4463b;

    ap(PackageMonitorReceiver packageMonitorReceiver, String str) {
        this.f4463b = packageMonitorReceiver;
        this.f4462a = str;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* synthetic */ void a(aq aqVar) {
        aqVar.d(this.f4462a);
    }
}
