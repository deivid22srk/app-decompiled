package com.google.android.gms.car;

import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    final Handler f5477a;

    /* renamed from: b, reason: collision with root package name */
    private final dq f5478b;
    private final List<Object> c;
    private final at d;

    final void a() {
        if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "handleCarDisconnection");
        }
        try {
            this.f5478b.b(this.d);
        } catch (RemoteException e) {
        }
        Iterator<Object> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.c.clear();
    }
}
