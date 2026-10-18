package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class am implements el<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4456a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4457b;
    final /* synthetic */ PackageMonitorReceiver c;

    am(PackageMonitorReceiver packageMonitorReceiver, String str, boolean z) {
        this.c = packageMonitorReceiver;
        this.f4456a = str;
        this.f4457b = z;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* bridge */ /* synthetic */ void a(aq aqVar) {
        aqVar.a(this.f4456a, this.f4457b);
    }
}
