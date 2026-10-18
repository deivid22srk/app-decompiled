package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    final ab f5694a = new ab(this);

    /* renamed from: b, reason: collision with root package name */
    final Set<ServiceConnection> f5695b = new HashSet();
    int c = 2;
    boolean d;
    IBinder e;
    final z f;
    ComponentName g;
    final /* synthetic */ y h;

    public aa(y yVar, z zVar) {
        this.h = yVar;
        this.f = zVar;
    }

    public final void a(String str) {
        com.google.android.gms.common.stats.b bVar;
        Context context;
        com.google.android.gms.common.stats.b bVar2;
        Context context2;
        this.c = 3;
        bVar = this.h.d;
        context = this.h.f5733b;
        this.d = bVar.a(context, str, this.f.a(), this.f5694a, 129);
        if (this.d) {
            return;
        }
        this.c = 2;
        try {
            bVar2 = this.h.d;
            context2 = this.h.f5733b;
            bVar2.a(context2, this.f5694a);
        } catch (IllegalArgumentException e) {
        }
    }

    public final boolean a() {
        return this.f5695b.isEmpty();
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f5695b.contains(serviceConnection);
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.b bVar;
        Context context;
        bVar = this.h.d;
        context = this.h.f5733b;
        bVar.a(context, com.google.android.gms.common.stats.b.a(serviceConnection), str, this.f.a(), 3);
        this.f5695b.add(serviceConnection);
    }
}
