package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ab implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f5696a;

    public ab(aa aaVar) {
        this.f5696a = aaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        hashMap = this.f5696a.h.f5732a;
        synchronized (hashMap) {
            this.f5696a.e = iBinder;
            this.f5696a.g = componentName;
            Iterator<ServiceConnection> it = this.f5696a.f5695b.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f5696a.c = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        hashMap = this.f5696a.h.f5732a;
        synchronized (hashMap) {
            this.f5696a.e = null;
            this.f5696a.g = componentName;
            Iterator<ServiceConnection> it = this.f5696a.f5695b.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f5696a.c = 2;
        }
    }
}
