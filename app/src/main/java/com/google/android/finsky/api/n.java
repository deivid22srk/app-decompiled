package com.google.android.finsky.api;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.kf;
import com.google.android.finsky.protos.lk;
import com.google.android.finsky.protos.nr;
import com.google.android.finsky.protos.ns;
import com.google.android.finsky.protos.op;
import com.google.android.finsky.protos.or;
import com.google.android.finsky.protos.os;
import com.google.android.finsky.protos.qw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class n<T extends com.google.protobuf.nano.c> extends com.android.volley.l<ns> {
    private static final boolean j = Log.isLoggable("DfeProto", 2);
    private int A;
    private p B;
    private com.android.volley.t<T> k;
    private final Class<T> l;
    boolean m;
    public long n;
    qw o;
    boolean p;
    boolean q;
    public boolean r;
    DfeResponseVerifier s;
    boolean t;
    private final e u;
    private boolean v;
    private Map<String, String> w;
    private StringBuilder x;
    private long y;
    private NetworkInfo z;

    @Override // com.android.volley.l
    public final /* synthetic */ void a(ns nsVar) {
        try {
            com.google.protobuf.nano.c a2 = com.google.android.play.dfe.a.a.a(nsVar.f4183a, nr.class, this.l);
            if (a2 != null) {
                if (this.m || !this.v) {
                    if (this.k != null) {
                        this.k.a_((T) a2);
                    }
                    this.v = true;
                    a(true, (VolleyError) null, this.y <= 0);
                    return;
                }
                FinskyLog.a("Not delivering second response for request=[%s]", this);
                return;
            }
            FinskyLog.d("Null parsed response for request=[%s]", this);
            b(new VolleyError());
        } catch (Exception e) {
            FinskyLog.d("Null wrapper parsed for request=[%s]", this);
            b(new ParseError(e));
        }
    }

    public n(String str, e eVar, Class<T> cls, com.android.volley.t<T> tVar, com.android.volley.s sVar) {
        this(0, str, eVar, cls, tVar, sVar, null);
    }

    public n(String str, e eVar, Class<T> cls, com.android.volley.t<T> tVar, com.android.volley.s sVar, byte b2) {
        this(1, str, eVar, cls, tVar, sVar, null);
    }

    public n(int i, String str, e eVar, Class<T> cls, com.android.volley.t<T> tVar, com.android.volley.s sVar, p pVar) {
        super(i, Uri.withAppendedPath(b.f1951a, str).toString(), sVar);
        this.m = false;
        this.n = -1L;
        this.r = false;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.e("Empty DFE URL", new Object[0]);
        }
        this.e = !d.K.b().booleanValue();
        this.g = new r(s.c(), eVar);
        this.u = eVar;
        this.k = tVar;
        this.l = cls;
        this.z = this.u.g();
        this.B = pVar;
    }

    @Override // com.android.volley.l
    public final String b() {
        boolean z = true;
        String b2 = super.b();
        boolean z2 = !TextUtils.isEmpty(d.o.b());
        boolean z3 = !TextUtils.isEmpty(d.f1953a.b());
        boolean booleanValue = d.K.b().booleanValue();
        boolean booleanValue2 = d.L.b().booleanValue();
        boolean booleanValue3 = d.M.b().booleanValue();
        if (!z2 && !z3 && !booleanValue && !booleanValue2 && !booleanValue3) {
            return b2;
        }
        StringBuilder sb = new StringBuilder(b2);
        boolean z4 = b2.indexOf(63) != -1;
        if (z2) {
            sb.append(z4 ? '&' : '?');
            sb.append("ipCountryOverride=");
            sb.append(d.o.b());
            z4 = true;
        }
        if (z3) {
            sb.append(z4 ? '&' : '?');
            sb.append("mccmncOverride=");
            sb.append(d.f1953a.b());
            z4 = true;
        }
        if (booleanValue) {
            sb.append(z4 ? '&' : '?');
            sb.append("skipCache=true");
            z4 = true;
        }
        if (booleanValue2) {
            sb.append(z4 ? '&' : '?');
            sb.append("showStagingData=true");
        } else {
            z = z4;
        }
        if (booleanValue3) {
            sb.append(z ? '&' : '?');
            sb.append("p13n=false");
        }
        return sb.toString();
    }

    public final void a(String str, String str2, String str3) {
        if (this.w == null) {
            this.w = new HashMap();
        }
        this.w.put(str, str2);
        if (!TextUtils.isEmpty(str3)) {
            if (this.x == null) {
                this.x = new StringBuilder();
            }
            this.x.append("/").append(str).append("=").append(str3);
        }
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        String str;
        Map<String, String> e = this.u.e();
        if (this.w != null) {
            e.putAll(this.w);
        }
        if (this.s != null) {
            try {
                e.put("X-DFE-Signature-Request", this.s.a());
            } catch (DfeResponseVerifier.DfeResponseVerifierException e2) {
                FinskyLog.c("Couldn't create signature request: %s", e2);
                d();
            }
        }
        com.android.volley.v vVar = this.g;
        String str2 = "timeoutMs=" + vVar.a();
        int b2 = vVar.b();
        if (b2 > 0) {
            str2 = str2 + "; retryAttempt=" + b2;
        }
        e.put("X-DFE-Request-Params", str2);
        String a2 = bg.aL.b(this.u.b()).a();
        if (!TextUtils.isEmpty(a2)) {
            e.put("X-DFE-Server-Cookies", a2);
        }
        if (this.p) {
            e eVar = this.u;
            if (eVar.j != null) {
                eVar.j.a(eVar, e);
            } else {
                String f = eVar.f();
                if (!TextUtils.isEmpty(f)) {
                    e.put("X-DFE-Device-Checkin-Consistency-Token", f);
                }
            }
        }
        if (this.o != null) {
            e.a(this.o, e);
        }
        if (this.q) {
            e eVar2 = this.u;
            if (eVar2.g != null && eVar2.g.a(eVar2.a())) {
                e.put("X-DFE-Managed-Context", "true");
            }
        }
        if (this.t) {
            e eVar3 = this.u;
            jm.b();
            String a3 = eVar3.i == null ? null : eVar3.i.a();
            if (!TextUtils.isEmpty(a3)) {
                e.put("X-Ad-Id", a3);
            } else {
                if (!(this.u.i != null)) {
                    str = "no_ad_id_provider";
                } else {
                    str = "ad_id_fetch_done_no_id_set";
                }
                FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(1101).b(str).f1473a);
            }
            e eVar4 = this.u;
            Boolean b3 = eVar4.i != null ? eVar4.i.b() : null;
            if (b3 != null) {
                e.put("X-Limit-Ad-Tracking-Enabled", b3.toString());
            }
        }
        return e;
    }

    @Override // com.android.volley.l
    public final com.android.volley.r<ns> a(com.android.volley.k kVar) {
        com.android.volley.b b2;
        if (kVar.c != null && kVar.c.containsKey("X-DFE-Content-Length")) {
            this.A = Integer.parseInt(kVar.c.get("X-DFE-Content-Length"));
        }
        this.y = kVar.e;
        Object[] objArr = {b(), Integer.valueOf((kVar.c == null || !kVar.c.containsKey("X-DFE-Content-Length")) ? 0 : Integer.parseInt(kVar.c.get("X-DFE-Content-Length")) / 1024)};
        ns a2 = a(kVar, false);
        if (a2 == null) {
            return com.android.volley.r.a(new ParseError(kVar));
        }
        if (j) {
            String b3 = d.f1954b.b();
            if (b().matches(b3)) {
                synchronized (com.google.protobuf.nano.d.class) {
                    Log.v("DfeProto", "Response for " + b());
                    for (String str : com.google.protobuf.nano.d.a(a2).split("\n")) {
                        Log.v("DfeProto", "| " + str);
                    }
                }
            } else {
                Log.v("DfeProto", "Url does not match regexp: url=" + b() + " / regexp=" + b3);
            }
        }
        com.android.volley.r<ns> a22 = a2(a2);
        if (a22 == null) {
            if (a2.e != null) {
                os osVar = a2.e;
                if (osVar.f4227b) {
                    this.n = osVar.f4226a;
                }
            }
            b(a2);
            if (a2.f != null && this.u.f1956b != null) {
                this.u.f1956b.a(a2.f);
            }
            or orVar = a2.g;
            if (orVar != null) {
                bg.aL.b(this.u.b()).a(Base64.encodeToString(com.google.protobuf.nano.c.a(orVar), 3));
            }
            if (this.s != null) {
                b2 = null;
            } else {
                b2 = b(kVar);
            }
            if (b2 != null) {
                a(a2, b2);
            }
            com.android.volley.r<ns> a3 = com.android.volley.r.a(a2, b2);
            FinskyLog.f("DFE response %s", b());
            return a3;
        }
        return a22;
    }

    private void a(ns nsVar, com.android.volley.b bVar) {
        if (nsVar.c.length <= 0 && nsVar.f4184b == null && nsVar.d.length <= 0 && nsVar.g == null) {
            return;
        }
        com.android.volley.a aVar = this.u.d;
        long currentTimeMillis = System.currentTimeMillis();
        for (lk lkVar : nsVar.c) {
            com.android.volley.b bVar2 = new com.android.volley.b();
            bVar2.f1228a = lkVar.c;
            bVar2.f1229b = lkVar.e;
            bVar2.c = bVar.c;
            bVar2.e = lkVar.g + currentTimeMillis;
            bVar2.f = lkVar.i + currentTimeMillis;
            aVar.a(c(Uri.withAppendedPath(b.f1951a, lkVar.f4084a).toString()), bVar2);
        }
        nsVar.c = lk.b();
        nsVar.f4184b = null;
        nsVar.d = kf.b();
        nsVar.g = null;
        nsVar.f = null;
        bVar.f1228a = com.google.protobuf.nano.c.a(nsVar);
    }

    private static com.android.volley.b b(com.android.volley.k kVar) {
        com.android.volley.b a2 = com.android.volley.apkg.l.a(kVar);
        if (a2 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str = kVar.c.get("X-DFE-Soft-TTL");
            if (str != null) {
                a2.f = Long.parseLong(str) + currentTimeMillis;
            }
            String str2 = kVar.c.get("X-DFE-Hard-TTL");
            if (str2 != null) {
                a2.e = currentTimeMillis + Long.parseLong(str2);
            }
        } catch (NumberFormatException e) {
            FinskyLog.c("Invalid TTL: %s", kVar.c);
            a2.f = 0L;
            a2.e = 0L;
        }
        a2.e = Math.max(a2.e, a2.f);
        return a2;
    }

    @Override // com.android.volley.l
    public final void d() {
        super.d();
        if (this.B != null) {
            this.B.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final VolleyError a(VolleyError volleyError) {
        ns a2;
        if ((volleyError instanceof ServerError) && volleyError.f1195b != null && (a2 = a(volleyError.f1195b, false)) != null) {
            com.android.volley.r<ns> a22 = a2(a2);
            if (a22 != null) {
                return a22.c;
            }
            FinskyLog.d("Received a null response in ResponseWrapper, error %d", Integer.valueOf(volleyError.f1195b.f1243a));
            return volleyError;
        }
        return volleyError;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.android.volley.r<ns> a2(ns nsVar) {
        if (nsVar.f4184b == null) {
            return null;
        }
        op opVar = nsVar.f4184b;
        if (opVar.f) {
            FinskyLog.a("%s", opVar.e);
        }
        if (opVar.f4221a) {
            this.u.d.b();
        }
        if (opVar.g.length > 0) {
            new Handler(Looper.getMainLooper()).post(new o(this, opVar));
        }
        if (opVar.d) {
            return com.android.volley.r.a(new DfeServerError(opVar.c));
        }
        return null;
    }

    private void b(ns nsVar) {
        if (this.u.e != null && nsVar.d.length != 0) {
            for (kf kfVar : nsVar.d) {
                this.u.e.a(kfVar);
            }
        }
    }

    private void a(boolean z, VolleyError volleyError, boolean z2) {
        if (this.u.f != null && com.google.android.finsky.api.z.a(z2, false)) {
            this.u.f.a(b(), this.y, this.n, this.g.b() + 1, this.g.a(), this.g instanceof r ? ((r) this.g).f1234a : 0.0f, z, volleyError, this.z, this.u.g(), this.A, z2);
        }
    }

    private String c(String str) {
        StringBuilder append = new StringBuilder(256).append(str).append("/account=").append(this.u.b());
        if (this.x != null) {
            append.append((CharSequence) this.x);
        }
        return append.toString();
    }

    @Override // com.android.volley.l
    public String c() {
        return c(super.b());
    }

    private ns a(com.android.volley.k kVar, boolean z) {
        while (true) {
            try {
                String str = kVar.c.get("X-DFE-Signature-Response");
                if (z) {
                    byte[] a2 = jm.a((InputStream) new GZIPInputStream(new ByteArrayInputStream(kVar.f1244b)));
                    ns a3 = ns.a(a2);
                    if (this.s != null) {
                        this.s.a(a2, str);
                    }
                    return a3;
                }
                ns a4 = ns.a(kVar.f1244b);
                if (this.s != null) {
                    this.s.a(kVar.f1244b, str);
                    a("signature-verification-succeeded");
                }
                return a4;
            } catch (DfeResponseVerifier.DfeResponseVerifierException e) {
                a("signature-verification-failed");
                FinskyLog.d("Could not verify request: %s, exception %s", this, e);
            } catch (InvalidProtocolBufferNanoException e2) {
                if (z) {
                    FinskyLog.c("Cannot parse response as ResponseWrapper proto.", new Object[0]);
                    break;
                }
                z = true;
            } catch (IOException e3) {
                FinskyLog.c("IOException while manually unzipping request.", new Object[0]);
            }
        }
        return null;
    }

    @Override // com.android.volley.l
    public final void b(VolleyError volleyError) {
        this.y = volleyError.c;
        a(false, volleyError, false);
        if (volleyError instanceof AuthFailureError) {
            this.u.d();
        }
        if (!this.v) {
            super.b(volleyError);
        } else {
            FinskyLog.a("Not delivering error response for request=[%s], error=[%s] because response already delivered.", this, volleyError);
        }
    }
}
