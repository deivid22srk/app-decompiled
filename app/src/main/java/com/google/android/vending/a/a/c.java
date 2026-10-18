package com.google.android.vending.a.a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.protos.sd;
import com.google.android.finsky.utils.jm;
import com.google.android.volley.l;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.volley.apkg.a f7102a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7103b;
    private final com.android.volley.apkg.a c;
    private sd d;
    private String e;
    private String f;
    private final Map<String, String> g = new HashMap();

    public c(Context context, Account account, Locale locale, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f7103b = context;
        a("User-Agent", str10);
        this.f7102a = new com.android.volley.apkg.a(context, account, com.google.android.finsky.cpkg.d.q.b());
        this.c = new com.android.volley.apkg.a(context, account, com.google.android.finsky.cpkg.d.r.b());
        this.d = new sd();
        this.d.g = str;
        this.d.h = true;
        this.d.m = locale.getCountry();
        this.d.n = true;
        this.d.k = locale.getLanguage();
        this.d.l = true;
        this.d.e = i;
        this.d.f = true;
        if (str2 != null) {
            this.d.o = str2;
            this.d.p = true;
        }
        if (str3 != null) {
            this.d.q = str3;
            this.d.r = true;
        }
        if (str4 != null) {
            this.d.s = str4;
            this.d.t = true;
        }
        if (str5 != null) {
            this.d.u = str5;
            this.d.v = true;
        }
        this.d.i = str6 + ":" + str7;
        this.d.j = true;
        this.d.w = str8;
        this.d.x = true;
        this.d.y = str9;
        this.d.z = true;
        String a2 = l.a(this.f7103b, "https://android.clients.google.com/vending/api/ApiRequest");
        if (a2 == null) {
            throw new RuntimeException("URL blocked: https://android.clients.google.com/vending/api/ApiRequest");
        }
        jm.c(a2);
    }

    public static String a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        return String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d)", str, "2", Integer.valueOf(i), Integer.valueOf(i2), b(str2), b(str3), b(str4), b(str5), b(str6), b(str7), Integer.valueOf(z ? 1 : 0));
    }

    private static String b(String str) {
        return Uri.encode(str).replace("(", "").replace(")", "");
    }

    public final synchronized void a(String str, String str2) {
        this.g.put(str, str2);
    }

    public final synchronized Map<String, String> a() {
        return this.g;
    }

    public final synchronized String a(String str) {
        return this.g.get(str);
    }

    public final sd a(boolean z) {
        String str;
        sd sdVar = new sd();
        try {
            byte[] a2 = com.google.protobuf.nano.c.a(this.d);
            com.google.protobuf.nano.c.a(sdVar, a2, a2.length);
            if (z) {
                this.f = this.c.a();
                str = this.f;
            } else {
                this.e = this.f7102a.a();
                str = this.e;
            }
            sdVar.f4373a = str;
            sdVar.f4374b = true;
            sdVar.c = z;
            sdVar.d = true;
            return sdVar;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IllegalStateException("Cannot happen.");
        }
    }

    public final void b(boolean z) {
        String str = z ? this.f : this.e;
        if (str != null) {
            this.f7102a.a(str);
        }
        if (z) {
            this.f = null;
        } else {
            this.e = null;
        }
    }
}
