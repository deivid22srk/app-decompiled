package com.google.android.finsky.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.AuthFailureError;
import com.android.volley.ServerError;
import com.android.volley.a.ae;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Throwable f2021a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2022b;
    private final AccountManager c;
    private final com.google.android.finsky.a.i d;

    public i(Context context, Account account) {
        this(context, FinskyApp.a().c(account));
    }

    private i(Context context, com.google.android.finsky.a.i iVar) {
        this.f2022b = context;
        this.c = AccountManager.get(this.f2022b);
        this.d = iVar;
    }

    public final j a(Account account) {
        String userData = this.c.getUserData(account, com.google.android.finsky.c.d.ev.b());
        if (userData == null) {
            a(900, -1L, 1, f2021a);
            return null;
        }
        try {
            j a2 = j.a(new JSONObject(userData), false);
            a(900, -1L);
            return a2;
        } catch (JSONException e) {
            a(900, -1L, 2, e);
            FinskyLog.d("Error deserializing reauth settings response from device", e);
            return new j(907);
        }
    }

    final j a(com.android.volley.a.a aVar) {
        Pair<String, Integer> a2 = a(aVar, 901);
        String str = (String) a2.first;
        Integer num = (Integer) a2.second;
        if (num != null) {
            return new j(num.intValue());
        }
        ae a3 = ae.a();
        FinskyApp.a().f1434a.a(new h(com.google.android.finsky.c.d.es.b(), str, aVar.f1197b, a3, a3));
        a(902, -1L);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = (JSONObject) a3.get();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (jSONObject == null) {
                a(903, elapsedRealtime2, -1, f2021a);
                return new j(901);
            }
            try {
                j a4 = j.a(jSONObject, true);
                a(903, elapsedRealtime2);
                return a4;
            } catch (JSONException e) {
                a(903, elapsedRealtime2, -3, e);
                FinskyLog.d("Error deserializing reauth settings response over network: %s", e);
                return new j(907);
            }
        } catch (InterruptedException e2) {
            a(903, SystemClock.elapsedRealtime() - elapsedRealtime, -2, e2);
            FinskyLog.e("getReauthSettings request to LSO reauth api interrupted.", new Object[0]);
            return new j(902);
        } catch (ExecutionException e3) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            Throwable cause = e3.getCause();
            if (!(cause instanceof ServerError)) {
                a(903, elapsedRealtime3, -2, cause);
                FinskyLog.d("VolleyError with getReauthSettings: %s", cause);
                return new j(902);
            }
            int a5 = l.a((ServerError) cause, false);
            a(903, elapsedRealtime3, -2, cause);
            return new j(a5);
        }
    }

    public final n a(Account account, String str, boolean z, String str2) {
        n nVar;
        jm.b();
        int i = z ? 904 : 907;
        com.android.volley.a.a b2 = b(account);
        Pair<String, Integer> a2 = a(b2, i);
        String str3 = (String) a2.first;
        Integer num = (Integer) a2.second;
        if (num != null) {
            return new n(num.intValue());
        }
        boolean z2 = !TextUtils.isEmpty(str2);
        JSONObject a3 = m.a(str, z);
        ae a4 = ae.a();
        if (!z2) {
            str2 = "me";
        }
        String replace = com.google.android.finsky.c.d.et.b().replace("%user_id%", str2);
        m mVar = new m(z2 ? Uri.parse(replace).buildUpon().appendQueryParameter("delegationType", "unicorn").toString() : replace, str3, b2.f1197b, a3, a4, a4);
        int i2 = z ? 905 : 908;
        int i3 = z ? 906 : 909;
        FinskyApp.a().f1434a.a(mVar);
        a(i2, -1L);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = (JSONObject) a4.get();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (jSONObject == null) {
                a(i3, elapsedRealtime2, -1, f2021a);
                return new n(901);
            }
            try {
                if (TextUtils.isEmpty(jSONObject.getString("encodedRapt"))) {
                    nVar = new n(z ? 1003 : 1100);
                } else {
                    nVar = new n(0);
                }
                a(i3, elapsedRealtime2);
                return nVar;
            } catch (JSONException e) {
                a(i3, elapsedRealtime2, -3, e);
                FinskyLog.d("Error deserializing verifyCredentials response: %s", e);
                return new n(907);
            }
        } catch (InterruptedException e2) {
            a(i3, SystemClock.elapsedRealtime() - elapsedRealtime, -2, e2);
            FinskyLog.e("verifyCredentials request to LSO reauth api interrupted.", new Object[0]);
            return new n(902);
        } catch (ExecutionException e3) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            Throwable cause = e3.getCause();
            if (cause instanceof ServerError) {
                int a5 = l.a((ServerError) cause, z);
                a(i3, elapsedRealtime3, -2, cause);
                return new n(a5);
            }
            a(i3, elapsedRealtime3, -2, cause);
            FinskyLog.d("VolleyError with verifyCredentials: %s", cause);
            return new n(902);
        }
    }

    private Pair<String, Integer> a(com.android.volley.a.b bVar, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String a2 = bVar.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.isEmpty(a2)) {
                a(i, elapsedRealtime2, 1, f2021a);
                return new Pair<>(null, 903);
            }
            a(i, elapsedRealtime2);
            return new Pair<>(a2, null);
        } catch (AuthFailureError e) {
            a(i, SystemClock.elapsedRealtime() - elapsedRealtime, 2, e);
            return new Pair<>(null, 904);
        }
    }

    final com.android.volley.a.a b(Account account) {
        return new com.android.volley.a.a(this.f2022b, account, com.google.android.finsky.c.d.eu.b(), (byte) 0);
    }

    private void a(int i, long j, int i2, Throwable th) {
        this.d.b(new com.google.android.finsky.a.b(i).b(j).a(i2).a(th).f1473a);
    }

    private void a(int i, long j) {
        this.d.b(new com.google.android.finsky.a.b(i).b(j).f1473a);
    }
}
