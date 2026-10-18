package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a extends IntentService {

    /* renamed from: a, reason: collision with root package name */
    private static PowerManager.WakeLock f5250a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5251b = a.class;
    private static int d = 0;
    private static final Random e = new Random();
    private static final int f = (int) TimeUnit.SECONDS.toMillis(3600);
    private static final String g = Long.toBinaryString(e.nextLong());
    private final String[] c;

    public abstract void a(Context context);

    public abstract void a(Intent intent);

    public abstract void a(String str);

    public abstract void b(String str);

    protected a() {
        this(c("DynamicSenderIds"), null);
    }

    private a(String str, String[] strArr) {
        super(str);
        this.c = strArr;
    }

    private static String c(String str) {
        StringBuilder append = new StringBuilder("GCMIntentService-").append(str).append("-");
        int i = d + 1;
        d = i;
        String sb = append.append(i).toString();
        Log.v("GCMBaseIntentService", "Intent service name: " + sb);
        return sb;
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            Context applicationContext = getApplicationContext();
            String action = intent.getAction();
            if (action.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                b.a(applicationContext);
                String stringExtra = intent.getStringExtra("registration_id");
                String stringExtra2 = intent.getStringExtra("error");
                String stringExtra3 = intent.getStringExtra("unregistered");
                Log.d("GCMBaseIntentService", "handleRegistration: registrationId = " + stringExtra + ", error = " + stringExtra2 + ", unregistered = " + stringExtra3);
                if (stringExtra != null) {
                    b.c(applicationContext);
                    b.a(applicationContext, stringExtra);
                    b(stringExtra);
                } else if (stringExtra3 != null) {
                    b.c(applicationContext);
                    b.a(applicationContext, "");
                    a(applicationContext);
                } else {
                    Log.d("GCMBaseIntentService", "Registration error: " + stringExtra2);
                    if ("SERVICE_NOT_AVAILABLE".equals(stringExtra2)) {
                        int i = applicationContext.getSharedPreferences("com.google.android.gcm", 0).getInt("backoff_ms", 3000);
                        int nextInt = e.nextInt(i) + (i / 2);
                        Log.d("GCMBaseIntentService", "Scheduling registration retry, backoff = " + nextInt + " (" + i + ")");
                        Intent intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                        intent2.putExtra("token", g);
                        ((AlarmManager) applicationContext.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + nextInt, PendingIntent.getBroadcast(applicationContext, 0, intent2, 0));
                        if (i < f) {
                            b.a(applicationContext, i * 2);
                        }
                    } else {
                        a(stringExtra2);
                    }
                }
            } else if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                String stringExtra4 = intent.getStringExtra("message_type");
                if (stringExtra4 == null) {
                    a(intent);
                } else if (stringExtra4.equals("deleted_messages")) {
                    String stringExtra5 = intent.getStringExtra("total_deleted");
                    if (stringExtra5 != null) {
                        try {
                            Log.v("GCMBaseIntentService", "Received deleted messages notification: " + Integer.parseInt(stringExtra5));
                        } catch (NumberFormatException e2) {
                            Log.e("GCMBaseIntentService", "GCM returned invalid number of deleted messages: " + stringExtra5);
                        }
                    }
                } else {
                    Log.e("GCMBaseIntentService", "Received unknown special message: " + stringExtra4);
                }
            } else if (action.equals("com.google.android.gcm.intent.RETRY")) {
                String stringExtra6 = intent.getStringExtra("token");
                if (!g.equals(stringExtra6)) {
                    Log.e("GCMBaseIntentService", "Received invalid token: " + stringExtra6);
                    synchronized (f5251b) {
                        if (f5250a != null) {
                            Log.v("GCMBaseIntentService", "Releasing wakelock");
                            f5250a.release();
                        } else {
                            Log.e("GCMBaseIntentService", "Wakelock reference is null");
                        }
                    }
                    return;
                }
                if (b.b(applicationContext).length() > 0) {
                    Log.v("GCMRegistrar", "Unregistering app " + applicationContext.getPackageName());
                    Intent intent3 = new Intent("com.google.android.c2dm.intent.UNREGISTER");
                    intent3.setPackage("com.google.android.gsf");
                    intent3.putExtra("app", PendingIntent.getBroadcast(applicationContext, 0, new Intent(), 0));
                    applicationContext.startService(intent3);
                } else {
                    if (this.c == null) {
                        throw new IllegalStateException("sender id not set on constructor");
                    }
                    b.a(applicationContext, this.c);
                }
            }
            synchronized (f5251b) {
                if (f5250a != null) {
                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                    f5250a.release();
                } else {
                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                }
            }
        } catch (Throwable th) {
            synchronized (f5251b) {
                if (f5250a != null) {
                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                    f5250a.release();
                } else {
                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                }
                throw th;
            }
        }
    }

    static void a(Context context, Intent intent, String str) {
        synchronized (f5251b) {
            if (f5250a == null) {
                f5250a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        Log.v("GCMBaseIntentService", "Acquiring wakelock");
        f5250a.acquire();
        intent.setClassName(context, str);
        context.startService(intent);
    }

    public a(String... strArr) {
        this(c(b.a(strArr)), strArr);
    }
}
