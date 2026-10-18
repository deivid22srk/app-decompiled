package com.google.android.gms.auth;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.x;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5381a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f5382b;
    private static final ComponentName c;
    private static final ComponentName d;

    static {
        int i = Build.VERSION.SDK_INT;
        f5381a = "callerUid";
        int i2 = Build.VERSION.SDK_INT;
        f5382b = "androidPackageName";
        c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    }

    private static <T> T a(Context context, ComponentName componentName, e<T> eVar) {
        com.google.android.gms.common.f fVar = new com.google.android.gms.common.f();
        x a2 = x.a(context);
        try {
            if (!a2.a(componentName, fVar, "GoogleAuthUtil")) {
                throw new IOException("Could not bind to service.");
            }
            try {
                return eVar.a(fVar.a());
            } catch (RemoteException | InterruptedException e) {
                Log.i("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            }
        } finally {
            a2.a(componentName, fVar);
        }
    }

    public static String a(Context context, Account account, String str) {
        Bundle bundle = new Bundle();
        av.c("Calling this from your main thread can lead to deadlock");
        a(context);
        Bundle bundle2 = new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f5382b))) {
            bundle2.putString(f5382b, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) a(context, c, new c(account, str, bundle2))).f5373b;
    }

    public static PendingIntent a(Context context, String str) {
        av.c("Calling this from your main thread can lead to deadlock");
        a(context);
        Bundle bundle = new Bundle();
        bundle.putString(f5382b, context.getPackageName());
        RecoveryDecision recoveryDecision = (RecoveryDecision) a(context, d, new d(str, bundle));
        if (recoveryDecision.c && recoveryDecision.e) {
            return recoveryDecision.f5365b;
        }
        return null;
    }

    private static void a(Context context) {
        try {
            com.google.android.gms.common.c.b(context.getApplicationContext());
        } catch (GooglePlayServicesNotAvailableException e) {
            throw new GoogleAuthException(e.getMessage());
        } catch (GooglePlayServicesRepairableException e2) {
            throw new GooglePlayServicesAvailabilityException(e2.f5559a, e2.getMessage(), new Intent(e2.f5560b));
        }
    }

    static /* synthetic */ Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }
}
