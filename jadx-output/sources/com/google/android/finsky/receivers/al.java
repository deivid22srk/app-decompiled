package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class al implements el<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f4454a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4455b;
    final /* synthetic */ PackageMonitorReceiver c;

    al(PackageMonitorReceiver packageMonitorReceiver, String[] strArr, boolean z) {
        this.c = packageMonitorReceiver;
        this.f4454a = strArr;
        this.f4455b = z;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* bridge */ /* synthetic */ void a(aq aqVar) {
        aqVar.a(this.f4454a);
    }
}
