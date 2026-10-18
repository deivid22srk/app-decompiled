package com.google.android.wallet.common.c.apkg;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7270a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7271b;
    public final Uri c;
    public final String d;
    public final com.android.volley.apkg.a e;
    public String f;

    public a(Context context, com.google.d.b.a.a.b bVar, com.android.volley.apkg.a aVar) {
        this.f7270a = context;
        this.f7271b = Uri.parse(bVar.f7737a);
        this.c = Uri.parse(bVar.f7738b);
        this.d = bVar.c;
        this.e = aVar;
    }

    public final synchronized void a() {
        if (this.f != null) {
            this.e.a(this.f);
            this.f = null;
        }
    }

    public final synchronized Map<String, String> b() {
        android.support.v4.h.a aVar;
        this.f = this.e.a();
        aVar = new android.support.v4.h.a(2);
        if (this.d.startsWith("oauth2:")) {
            String valueOf = String.valueOf(this.f);
            aVar.put("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        } else {
            String valueOf2 = String.valueOf(this.f);
            aVar.put("Authorization", valueOf2.length() != 0 ? "GoogleLogin auth=".concat(valueOf2) : new String("GoogleLogin auth="));
        }
        aVar.put("User-Agent", com.google.android.wallet.common.c.a.f7268a);
        return aVar;
    }
}
