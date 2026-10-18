package com.google.android.finsky.services;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelUtils;
import com.google.android.finsky.widget.consumption.ConsumptionAppDocList;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class s implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FetchConsumptionDataService f4633a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.play.a f4634b;
    private final int c;
    private final Semaphore d;

    public s(FetchConsumptionDataService fetchConsumptionDataService, int i, Semaphore semaphore) {
        this.f4633a = fetchConsumptionDataService;
        this.c = i;
        this.d = semaphore;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ExecutorService executorService;
        executorService = FetchConsumptionDataService.f4547a;
        executorService.execute(new t(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4634b = null;
        this.d.release();
    }

    static /* synthetic */ void a(s sVar) {
        try {
            List<Bundle> a2 = sVar.f4634b.a(0, 20);
            if (a2 != null) {
                FinskyLog.a("retrieved %d documents from [%d]", Integer.valueOf(a2.size()), Integer.valueOf(sVar.c));
                a a3 = a.a();
                FetchConsumptionDataService fetchConsumptionDataService = sVar.f4633a;
                a3.a(fetchConsumptionDataService, sVar.c, a2);
                ConsumptionAppDocList a4 = ConsumptionAppDocList.a(sVar.c, a2);
                try {
                    ParcelUtils.a(a.b(fetchConsumptionDataService, a4.f5167a), a4);
                } catch (IOException e) {
                    FinskyLog.d("Failed to cache %s: %s", Integer.valueOf(sVar.c), e.getMessage());
                }
            } else {
                FinskyLog.a("Error fetching data from service for backend=[%s]", Integer.valueOf(sVar.c));
            }
        } catch (Exception e2) {
            FinskyLog.a(e2, "Exception during data fetch: %s", e2.getMessage());
        }
    }
}
