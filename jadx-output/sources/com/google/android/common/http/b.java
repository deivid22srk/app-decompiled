package com.google.android.common.http;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class b extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f1429a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, InputStream inputStream) {
        super(inputStream);
        this.f1429a = aVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        int i;
        int i2;
        String str;
        long j2;
        long j3;
        long j4;
        long j5;
        int i3;
        int i4;
        String str2;
        long j6;
        long j7;
        long j8;
        try {
            super.close();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j5 = this.f1429a.f;
            long j9 = elapsedRealtime - j5;
            i3 = this.f1429a.f1428b;
            long uidTxBytes = TrafficStats.getUidTxBytes(i3);
            i4 = this.f1429a.f1428b;
            long uidRxBytes = TrafficStats.getUidRxBytes(i4);
            str2 = this.f1429a.f1427a;
            j6 = this.f1429a.e;
            j7 = this.f1429a.c;
            j8 = this.f1429a.d;
            EventLog.writeEvent(52001, str2, Long.valueOf(j6), Long.valueOf(j9), Long.valueOf(uidTxBytes - j7), Long.valueOf(uidRxBytes - j8));
        } catch (Throwable th) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j = this.f1429a.f;
            long j10 = elapsedRealtime2 - j;
            i = this.f1429a.f1428b;
            long uidTxBytes2 = TrafficStats.getUidTxBytes(i);
            i2 = this.f1429a.f1428b;
            long uidRxBytes2 = TrafficStats.getUidRxBytes(i2);
            str = this.f1429a.f1427a;
            j2 = this.f1429a.e;
            j3 = this.f1429a.c;
            j4 = this.f1429a.d;
            EventLog.writeEvent(52001, str, Long.valueOf(j2), Long.valueOf(j10), Long.valueOf(uidTxBytes2 - j3), Long.valueOf(uidRxBytes2 - j4));
            throw th;
        }
    }
}
