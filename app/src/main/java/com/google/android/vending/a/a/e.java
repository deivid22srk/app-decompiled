package com.google.android.vending.a.a;

import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.AuthFailureError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.se;
import com.google.android.finsky.protos.sf;
import com.google.android.finsky.protos.sh;
import com.google.android.finsky.protos.si;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.protobuf.nano.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class e<T extends com.google.protobuf.nano.c, U extends com.google.protobuf.nano.c> extends l<sh> {
    protected final c j;
    public boolean k;
    public boolean l;
    public com.google.android.gms.ads.bpkg.a m;
    private final T n;
    private final Class<T> o;
    private final Class<U> p;
    private final boolean q;
    private final t<U> r;
    private Map<String, String> s;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final /* synthetic */ void a(sh shVar) {
        this.r.a_(com.google.android.play.dfe.a.a.a(shVar.f4381a[0], si.class, this.p));
    }

    public static <T extends com.google.protobuf.nano.c, U extends com.google.protobuf.nano.c> e<T, U> a(String str, Class<T> cls, T t, Class<U> cls2, t<U> tVar, c cVar, s sVar) {
        return new e<>(str, cls, t, cls2, tVar, cVar, sVar);
    }

    private e(String str, Class<T> cls, T t, Class<U> cls2, t<U> tVar, c cVar, s sVar) {
        super(1, str, sVar);
        this.k = false;
        this.q = str.startsWith("https");
        this.n = t;
        this.o = cls;
        this.p = cls2;
        this.r = tVar;
        this.j = cVar;
        this.g = new f(this.j, this.q);
    }

    public final void a(String str, String str2) {
        if (this.s == null) {
            this.s = new HashMap();
        }
        this.s.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final r<sh> a(k kVar) {
        r<sh> a2;
        try {
            byte[] a3 = jm.a((InputStream) new GZIPInputStream(new ByteArrayInputStream(kVar.f1244b), kVar.f1244b.length));
            sh shVar = (sh) com.google.protobuf.nano.c.a(new sh(), a3, a3.length);
            if (shVar.f4381a.length != 1) {
                a2 = r.a(new ServerError());
            } else if (shVar.f4381a[0].f4383a.f4379a != 0) {
                a2 = r.a(new ServerError());
            } else {
                a2 = r.a(shVar, null);
            }
            return a2;
        } catch (IOException e) {
            FinskyLog.c("Cannot parse Vending ResponseProto: " + e, new Object[0]);
            return r.a(new VolleyError());
        }
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        Map<String, String> map;
        Map<String, String> a2 = this.j.a();
        if (this.s == null || this.s.isEmpty()) {
            map = a2;
        } else {
            map = new HashMap<>();
            map.putAll(a2);
            map.putAll(this.s);
        }
        if (this.l) {
            String a3 = this.m.a();
            if (!TextUtils.isEmpty(a3)) {
                map.put("X-Ad-Id", a3);
            } else {
                FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(1101).b("ad_id_fetch_done_no_id_set").f1473a);
            }
            Boolean b2 = this.m.b();
            if (b2 != null) {
                map.put("X-Limit-Ad-Tracking-Enabled", b2.toString());
            }
        }
        return map;
    }

    @Override // com.android.volley.l
    public final void b(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            this.j.b(this.q);
        }
        super.b(volleyError);
    }

    @Override // com.android.volley.l
    public final String toString() {
        return super.toString() + " " + this.o.getSimpleName();
    }

    @Override // com.android.volley.l
    public final Map<String, String> i() {
        HashMap hashMap = new HashMap();
        T t = this.n;
        sf sfVar = new sf();
        com.google.android.play.dfe.a.a.a(sfVar, sf.class, t, this.o);
        se seVar = new se();
        seVar.f4375a = this.j.a(this.q);
        seVar.f4376b = new sf[]{sfVar};
        hashMap.put("request", Base64.encodeToString(com.google.protobuf.nano.c.a(seVar), 11));
        hashMap.put("version", "2");
        return hashMap;
    }
}
