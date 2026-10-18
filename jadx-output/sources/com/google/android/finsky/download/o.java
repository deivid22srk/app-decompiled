package com.google.android.finsky.download;

import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f2725a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2726b;
    final /* synthetic */ long c;
    final /* synthetic */ n d;

    o(n nVar, q qVar, long j, long j2) {
        this.d = nVar;
        this.f2725a = qVar;
        this.f2726b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        q a2 = n.a(this.d);
        q qVar = this.f2725a;
        if (qVar == null || qVar.f2729a == null || a2.f2729a == null) {
            FinskyLog.c("Missing start or end network state", new Object[0]);
        } else if (qVar.f2729a.getType() != a2.f2729a.getType()) {
            FinskyLog.a("Network type has changed (%d to %d)", Integer.valueOf(qVar.f2729a.getType()), Integer.valueOf(a2.f2729a.getType()));
        } else {
            switch (qVar.f2729a.getType()) {
                case 0:
                    boolean z2 = qVar.f2729a.getSubtype() == a2.f2729a.getSubtype();
                    if (!z2) {
                        FinskyLog.a("Network subtype has changed (%d to %d)", Integer.valueOf(qVar.f2729a.getSubtype()), Integer.valueOf(a2.f2729a.getSubtype()));
                    }
                    z = z2;
                    break;
                case 1:
                    if (qVar.f2730b != null && a2.f2730b != null && qVar.f2730b.getSSID().equals(a2.f2730b.getSSID())) {
                        z = true;
                        break;
                    } else {
                        FinskyLog.a("Wifi network changed", new Object[0]);
                        break;
                    }
                    break;
                default:
                    z = true;
                    break;
            }
        }
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("bytes_transferred", Long.toString(this.f2726b));
            com.google.android.gms.c.a.a(FinskyApp.a(), Long.valueOf(this.c), bundle);
        }
    }
}
