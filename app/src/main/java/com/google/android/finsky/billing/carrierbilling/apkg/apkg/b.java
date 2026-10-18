package com.google.android.finsky.billing.carrierbilling.apkg.apkg;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.k;
import com.google.android.finsky.protos.bz;
import com.google.android.finsky.protos.ca;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class b implements s, t<bz>, a, h {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.finsky.api.b f2176a;

    /* renamed from: b, reason: collision with root package name */
    public t<ca> f2177b;
    public s c;
    public int d = 0;
    public String e;
    public String f;
    public final String g;
    public final boolean h;
    public int i;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bz bzVar) {
        PendingIntent pendingIntent = null;
        bz bzVar2 = bzVar;
        if (this.f2177b != null) {
            String str = bzVar2.f3659a;
            if (TextUtils.isEmpty(str)) {
                FinskyLog.c("Invalid Google User Token received.", new Object[0]);
                c();
                return;
            }
            String str2 = this.e;
            if (TextUtils.isEmpty(str2)) {
                FinskyLog.c("Address to send SMS is unavailable", new Object[0]);
                c();
                return;
            }
            String str3 = (this.f + ":") + str;
            FinskyApp a2 = FinskyApp.a();
            e.f2180a = this;
            if (TextUtils.isEmpty(str2)) {
                FinskyLog.c("Send sms failed invalid destination address", new Object[0]);
                e.a(1);
            } else {
                if (this != null) {
                    pendingIntent = PendingIntent.getBroadcast(a2, 0, new Intent("android.finsky.SMS_SENT"), 0);
                    a2.registerReceiver(new f(), new IntentFilter("android.finsky.SMS_SENT"));
                }
                try {
                    SmsManager.getDefault().sendTextMessage(str2, null, str3, pendingIntent, null);
                } catch (SecurityException e) {
                    FinskyLog.e("Cannot send text message: %s", e);
                    e.a(1);
                }
            }
            b();
        }
    }

    public b(com.google.android.finsky.api.b bVar, String str, String str2, String str3, boolean z) {
        this.f2176a = bVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.a
    public final void a(t<ca> tVar, s sVar) {
        this.f2177b = tVar;
        this.c = sVar;
        d();
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.a
    public final void a() {
        this.f2177b = null;
        this.c = null;
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.a
    public final void b(t<ca> tVar, s sVar) {
        this.f2177b = tVar;
        this.c = sVar;
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.h
    public final void a(int i) {
        if (i == 1) {
            FinskyLog.c("Sending Sms Failed", new Object[0]);
            c();
            a();
        }
    }

    public void c() {
        ca caVar = new ca();
        caVar.f3661a = 4;
        caVar.f3662b = true;
        a(caVar);
    }

    public final void a(ca caVar) {
        if (this.f2177b != null) {
            this.f2177b.a_(caVar);
        }
    }

    public void d() {
        this.d = 0;
        this.f2176a.g(k.b(), this, this);
    }

    public final void b() {
        this.d = 1;
        if (this.f2177b != null) {
            this.f2176a.a(k.b(), this.g, this.h, new d(this), this);
        }
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.a
    public final void a(Bundle bundle) {
        bundle.putInt("association_state", this.d);
        bundle.putInt("association_retries", this.i);
        a();
    }

    @Override // com.google.android.finsky.billing.carrierbilling.apkg.apkg.a
    public final void a(Bundle bundle, t<ca> tVar, s sVar) {
        this.d = bundle.getInt("association_state");
        this.i = bundle.getInt("association_retries");
        this.f2177b = tVar;
        this.c = sVar;
        if (this.d == 1) {
            b();
        } else {
            d();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.i < com.google.android.finsky.cpkg.d.am.b().intValue() && (volleyError instanceof NoConnectionError) && this.d == 1) {
            this.i++;
            new Handler(Looper.getMainLooper()).postDelayed(new c(this), 3000L);
        } else {
            FinskyLog.c("Error while receiving Volley response in state " + this.d, new Object[0]);
            if (this.c != null) {
                this.c.a(volleyError);
            }
        }
    }
}
