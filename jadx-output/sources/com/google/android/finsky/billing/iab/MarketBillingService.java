package com.google.android.finsky.billing.iab;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.finsky.protos.sc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cr;
import java.util.Random;

/* loaded from: classes.dex */
public class MarketBillingService extends Service {
    private static final String[] c = new String[0];
    private static Random d = new Random();

    /* renamed from: a, reason: collision with root package name */
    PackageManager f2232a;

    /* renamed from: b, reason: collision with root package name */
    p f2233b = new p(this);
    private final com.android.vending.a.h e = new r(this);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f2232a = getPackageManager();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.e;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public static boolean a(Context context, String str, long j, n nVar) {
        Intent a2 = cr.a(context.getPackageManager(), str, new Intent("com.android.vending.billing.RESPONSE_CODE"));
        if (a2 == null) {
            FinskyLog.a("Response %s cannot be delivered to %s. Intent does not resolve.", nVar.name(), str);
            return false;
        }
        FinskyLog.a("Sending response %s for request %d to %s.", nVar.name(), Long.valueOf(j), str);
        a2.putExtra("request_id", j);
        a2.putExtra("response_code", nVar.ordinal());
        context.sendBroadcast(a2);
        return true;
    }

    static /* synthetic */ n a(sc scVar) {
        switch (scVar.f4371a) {
            case 0:
                return n.RESULT_OK;
            case 7:
                return n.RESULT_ITEM_UNAVAILABLE;
            case 9:
                return n.RESULT_DEVELOPER_ERROR;
            default:
                return n.RESULT_ERROR;
        }
    }
}
