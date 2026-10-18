package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class LicensingService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final com.android.vending.licensing.d f4548a = new aa(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4548a;
    }

    static /* synthetic */ void a(com.android.vending.licensing.a aVar, int i, String str, String str2) {
        try {
            aVar.a(i, str, str2);
        } catch (RemoteException e) {
            FinskyLog.d("Unable to send license information", new Object[0]);
        }
    }
}
