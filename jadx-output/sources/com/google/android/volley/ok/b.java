package com.google.android.volley.ok;

import android.net.TrafficStats;
import android.os.SystemClock;
import org.apache.http.HttpEntity;

/* loaded from: classes.dex */
final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    long f7210a = SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    long f7211b;
    long c;
    final /* synthetic */ a d;

    b(a aVar) {
        this.d = aVar;
        this.f7211b = TrafficStats.getUidTxBytes(aVar.f7209a);
        this.c = TrafficStats.getUidRxBytes(aVar.f7209a);
    }

    @Override // com.google.android.volley.ok.j
    public final HttpEntity a(String str, HttpEntity httpEntity) {
        return new com.google.android.volley.guava.a(httpEntity, str, this.d.f7209a, this.f7211b, this.c, SystemClock.elapsedRealtime() - this.f7210a, this.f7210a);
    }
}
