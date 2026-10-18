package com.google.android.finsky.services;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cr;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FetchConsumptionDataService extends IntentService {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f4547a = Executors.newSingleThreadExecutor(new com.google.android.finsky.utils.t());

    public FetchConsumptionDataService() {
        super("FetchConsumptionDataService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("backendId", 0);
        String a2 = cr.a(intExtra);
        Semaphore semaphore = new Semaphore(0);
        FinskyLog.a("Starting ServiceConnection to consumption app: %s", a2);
        Intent intent2 = new Intent("com.google.android.play.IUserContentService.BIND");
        intent2.setPackage(a2);
        s sVar = new s(this, intExtra, semaphore);
        bindService(intent2, sVar, 1);
        long longValue = com.google.android.finsky.c.d.bX.b().longValue();
        try {
            if (!semaphore.tryAcquire(longValue, TimeUnit.MILLISECONDS)) {
                FinskyLog.d("Service connection for %d timed out after %d", Integer.valueOf(intExtra), Long.valueOf(longValue));
            }
        } catch (InterruptedException e) {
            FinskyLog.c("Interrupted while connecting to remote service", new Object[0]);
        } finally {
            unbindService(sVar);
        }
    }

    public static void a(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) FetchConsumptionDataService.class);
        intent.putExtra("backendId", i);
        intent.setAction("FetchConsumptionDataService:" + i);
        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 500, PendingIntent.getService(context, 0, intent, 0));
    }
}
