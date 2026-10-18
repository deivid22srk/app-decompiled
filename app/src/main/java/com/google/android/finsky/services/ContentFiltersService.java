package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.protos.ew;

/* loaded from: classes.dex */
public class ContentFiltersService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final com.deivid22srk.store.bpkg.b f4542a = new e(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4542a;
    }

    static /* synthetic */ boolean a(ew[] ewVarArr, int[] iArr) {
        for (ew ewVar : ewVarArr) {
            for (int i : iArr) {
                for (int i2 : ewVar.f3804a) {
                    if (i2 == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
