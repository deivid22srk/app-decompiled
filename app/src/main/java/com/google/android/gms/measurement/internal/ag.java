package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class ag extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f6297a = ag.class.getName();

    /* renamed from: b, reason: collision with root package name */
    final ap f6298b;
    boolean c;
    boolean d;

    ag(ap apVar) {
        com.google.android.gms.common.internal.av.a(apVar);
        this.f6298b = apVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f6298b.a();
        String action = intent.getAction();
        this.f6298b.e().g.a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f6298b.e().f6389b.a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean b2 = this.f6298b.i().b();
        if (this.d != b2) {
            this.d = b2;
            this.f6298b.f().a(new ah(this, b2));
        }
    }

    public final void a() {
        this.f6298b.a();
        this.f6298b.f().e();
        this.f6298b.f().e();
        if (this.c) {
            this.f6298b.e().g.a("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                this.f6298b.f6315a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6298b.e().f6388a.a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
