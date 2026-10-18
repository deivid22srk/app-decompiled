package com.google.android.gms.car;

import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    final int f5530a;

    /* renamed from: b, reason: collision with root package name */
    private final l f5531b;
    private final bi c;
    private InputStream d;
    private volatile int e;
    private final n f;

    final synchronized void a() {
        if (this.e != 2) {
            b();
            try {
                this.c.e(this.f);
            } catch (RemoteException e) {
            }
            this.e = 2;
            if (ah.a("CAR.AUDIO", 3)) {
                Log.d("CAR.AUDIO", "CarAudioRecord released");
            }
        }
    }

    private synchronized void b() {
        if (this.e == 1) {
            this.e = 0;
            try {
                this.c.b(this.f);
                this.d.close();
            } catch (RemoteException e) {
                Log.i("CAR.AUDIO", "CarAudioRecord RemoteException from car service:" + e.getMessage());
                if (this.e == 1 && this.d != null) {
                    try {
                        this.d.close();
                    } catch (IOException e2) {
                    }
                }
                if (this.e != 2) {
                    l lVar = this.f5531b;
                    if (this.f5530a != 0) {
                        throw new RuntimeException("wrong stream type " + this.f5530a);
                    }
                    synchronized (lVar.f5529b) {
                        lVar.c.remove(this);
                        this.e = 2;
                    }
                }
            } catch (IOException e3) {
            }
            if (ah.a("CAR.AUDIO", 3)) {
                Log.d("CAR.AUDIO", "CarAudioRecord stopped");
            }
        } else if (ah.a("CAR.AUDIO", 3)) {
            Log.d("CAR.AUDIO", "CarAudioRecord stop while not started");
        }
    }
}
