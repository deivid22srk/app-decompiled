package com.google.android.finsky.receivers;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FlushLogsReceiver extends android.support.v4.b.ab {
    private static Handler c;

    /* renamed from: a, reason: collision with root package name */
    private static final Intent f4428a = new Intent(FinskyApp.a(), (Class<?>) FlushLogsReceiver.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Intent f4429b = new Intent(FinskyApp.a(), (Class<?>) FlushLogsService.class);
    private static Runnable d = new d();

    private static Handler d() {
        synchronized (FlushLogsReceiver.class) {
            c = new Handler(Looper.getMainLooper());
        }
        return c;
    }

    public static void a() {
        if (FinskyApp.a().m.f4968b) {
            c();
            a(FinskyApp.a(), com.google.android.finsky.cpkg.d.fc.b().longValue());
        } else {
            d().postDelayed(d, com.google.android.finsky.cpkg.d.fa.b().longValue());
        }
    }

    public static void b() {
        a(FinskyApp.a(), 0L);
    }

    public static void c() {
        d().removeCallbacks(d);
        FinskyApp a2 = FinskyApp.a();
        if (bg.aS.a().longValue() <= 0) {
            return;
        }
        bg.aS.a((com.google.android.finsky.cpkg.o<Long>) 0L);
        ((AlarmManager) a2.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(a2, 0, f4428a, 0));
    }

    static void a(Context context, long j) {
        long longValue = bg.aS.a().longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue <= 0 || longValue < currentTimeMillis) {
            long j2 = currentTimeMillis + j;
            bg.aS.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(com.google.android.finsky.cpkg.d.fe.b().longValue() + j2));
            ((AlarmManager) context.getSystemService("alarm")).set(0, j2, PendingIntent.getBroadcast(context, 0, f4428a, 0));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, f4429b);
    }

    public class FlushLogsService extends IntentService {
        public FlushLogsService() {
            super("FlushLogsService");
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            Account[] a2 = com.google.android.finsky.api.apkg.a(FinskyApp.a());
            CountDownLatch countDownLatch = new CountDownLatch(a2.length);
            e eVar = new e(this, countDownLatch);
            for (Account account : a2) {
                FinskyLog.a("Flushing event logs for %s", FinskyLog.a(account.name));
                FinskyApp.a().c(account).a(eVar);
            }
            try {
                if (!countDownLatch.await(com.google.android.finsky.cpkg.d.fd.b().longValue(), TimeUnit.MILLISECONDS)) {
                    FinskyLog.a("Logs flushing took more than %d ms. Releasing wake lock.", com.google.android.finsky.cpkg.d.fd.b());
                }
            } catch (InterruptedException e) {
                FinskyLog.a("Logs flushing was interrupted. Releasing wake lock.", new Object[0]);
            }
            bg.aS.a((com.google.android.finsky.cpkg.o<Long>) 0L);
            android.support.v4.b.ab.a(intent);
        }
    }
}
