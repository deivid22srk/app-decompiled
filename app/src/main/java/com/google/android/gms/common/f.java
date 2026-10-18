package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class f implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f5644a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<IBinder> f5645b = new LinkedBlockingQueue();

    public final IBinder a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if (this.f5644a) {
            throw new IllegalStateException();
        }
        this.f5644a = true;
        return this.f5645b.take();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5645b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
