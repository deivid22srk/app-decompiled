package com.google.android.finsky.receivers;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class t implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4497a;

    t(h hVar) {
        this.f4497a = hVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Context context;
        t tVar;
        ArrayList arrayList;
        boolean z;
        com.google.android.finsky.installer.h hVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i = 0;
        jm.a();
        this.f4497a.y = com.google.android.finsky.installer.i.a(iBinder);
        try {
            hVar = this.f4497a.y;
            hVar.a(this.f4497a.f4479b);
            while (true) {
                int i2 = i;
                arrayList2 = this.f4497a.z;
                if (i2 < arrayList2.size()) {
                    arrayList4 = this.f4497a.z;
                    ((Runnable) arrayList4.get(i2)).run();
                    i = i2 + 1;
                } else {
                    arrayList3 = this.f4497a.z;
                    arrayList3.clear();
                    return;
                }
            }
        } catch (RemoteException e) {
            FinskyLog.c("Couldn't register listener *** received %s", e);
            context = this.f4497a.c;
            tVar = this.f4497a.x;
            context.unbindService(tVar);
            this.f4497a.y = null;
            arrayList = this.f4497a.z;
            arrayList.clear();
            z = this.f4497a.o;
            if (!z) {
                FinskyLog.c("Force-starting the installer after connection failure", new Object[0]);
                h.f(this.f4497a);
                this.f4497a.a(true);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
