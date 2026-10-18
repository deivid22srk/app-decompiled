package com.google.android.gms.internal;

import android.app.Dialog;
import android.content.IntentSender;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class mm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mk f6167a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6168b;
    private final ConnectionResult c;

    public mm(mk mkVar, int i, ConnectionResult connectionResult) {
        this.f6167a = mkVar;
        this.f6168b = i;
        this.c = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        com.google.android.gms.common.b unused;
        com.google.android.gms.common.b unused2;
        z = this.f6167a.f6163a;
        if (z) {
            z2 = this.f6167a.f6164b;
            if (z2) {
                return;
            }
            mk.c(this.f6167a);
            this.f6167a.e = this.f6168b;
            this.f6167a.f = this.c;
            if (this.c.a()) {
                try {
                    int indexOf = ((this.f6167a.f().d().g().indexOf(this.f6167a) + 1) << 16) + 1;
                    ConnectionResult connectionResult = this.c;
                    android.support.v4.app.t f = this.f6167a.f();
                    if (connectionResult.a()) {
                        f.startIntentSenderForResult(connectionResult.d.getIntentSender(), indexOf, null, 0, 0, 0);
                        return;
                    }
                    return;
                } catch (IntentSender.SendIntentException e) {
                    this.f6167a.v();
                    return;
                }
            }
            unused = mk.d;
            if (com.google.android.gms.common.b.a(this.c.c)) {
                com.google.android.gms.common.c.a(this.c.c, this.f6167a.f(), this.f6167a, 2, this.f6167a);
                return;
            }
            if (this.c.c != 18) {
                this.f6167a.a(this.f6168b, this.c);
                return;
            }
            unused2 = mk.d;
            Dialog a2 = com.google.android.gms.common.b.a(this.f6167a.f(), this.f6167a);
            this.f6167a.h = me.a(this.f6167a.f().getApplicationContext(), new mn(this, a2));
        }
    }
}
