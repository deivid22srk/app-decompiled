package com.google.android.finsky.billing.apkg;

import com.android.volley.VolleyError;
import com.android.volley.apkg.l;
import com.android.volley.s;
import com.google.android.finsky.utils.FinskyLog;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.finsky.auth.d f2152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2153b;

    public j(h hVar, com.google.android.finsky.auth.d dVar) {
        this.f2153b = hVar;
        this.f2152a = dVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        String str;
        String str2;
        String str3;
        int i = 900;
        if (volleyError.f1195b == null || volleyError.f1195b.f1244b == null || volleyError.f1195b.c == null) {
            FinskyLog.a("ClientLogin error: network response empty", new Object[0]);
            this.f2152a.b_(900);
            return;
        }
        try {
            String str4 = new String(volleyError.f1195b.f1244b, l.a(volleyError.f1195b.c));
            str = h.k;
            if (str4.contains(str)) {
                str3 = h.l;
                if (str4.contains(str3)) {
                    i = 1200;
                    FinskyLog.a("ClientLogin error: two factor.", new Object[0]);
                } else {
                    i = 1100;
                    FinskyLog.a("ClientLogin error: bad auth.", new Object[0]);
                }
            } else {
                str2 = h.m;
                if (str4.contains(str2)) {
                    i = 1201;
                    FinskyLog.a("ClientLogin error: captcha.", new Object[0]);
                } else {
                    FinskyLog.a("ClientLogin error: unrecognized type %s", str4);
                }
            }
        } catch (UnsupportedEncodingException e) {
            FinskyLog.d("Unsupported encoding %s", e);
        }
        this.f2152a.b_(i);
    }
}
