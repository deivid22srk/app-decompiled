package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.android.volley.v;
import com.google.android.finsky.protos.lf;
import com.google.android.finsky.protos.lg;
import com.google.android.finsky.protos.lk;
import com.google.android.finsky.protos.op;
import com.google.android.finsky.protos.os;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.b.j;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class b<T extends com.google.protobuf.nano.c> extends l<lg> {
    private static final boolean j = Log.isLoggable("DfeProto", 2);
    private t<T> k;
    private final Class<T> l;
    private final e m;
    private boolean n;
    private boolean o;
    private long p;
    private Map<String, String> q;
    private StringBuilder r;
    private boolean s;
    private DfeResponseVerifier t;

    @Override // com.android.volley.l
    public final /* synthetic */ void a(lg lgVar) {
        try {
            com.google.protobuf.nano.c a2 = com.google.android.play.dfe.a.a.a(lgVar.f4078a, lf.class, this.l);
            if (a2 != null) {
                if (this.n || !this.o) {
                    if (this.k != null) {
                        this.k.a_(a2);
                    }
                    this.o = true;
                    return;
                }
                PlayCommonLog.a("Not delivering second response for request=[%s]", this);
                return;
            }
            PlayCommonLog.c("Null parsed response for request=[%s]", this);
            b(new VolleyError());
        } catch (Exception e) {
            PlayCommonLog.c("Null wrapper parsed for request=[%s]", this);
            b(new ParseError(e));
        }
    }

    public b(String str, e eVar, Class<T> cls, t<T> tVar, s sVar) {
        this(str, eVar, cls, tVar, sVar, (byte) 0);
    }

    private b(String str, e eVar, Class<T> cls, t<T> tVar, s sVar, byte b2) {
        super(0, Uri.withAppendedPath(d.f6837a, str).toString(), sVar);
        this.n = false;
        this.p = -1L;
        this.s = false;
        if (TextUtils.isEmpty(str)) {
            PlayCommonLog.d("Empty DFE URL", new Object[0]);
        }
        this.e = !j.o.b().booleanValue();
        this.g = new c(eVar);
        this.m = eVar;
        this.k = tVar;
        this.l = cls;
    }

    @Override // com.android.volley.l
    public final String b() {
        boolean z = true;
        String b2 = super.b();
        boolean z2 = !TextUtils.isEmpty(j.j.b());
        boolean z3 = !TextUtils.isEmpty(j.f7073b.b());
        boolean booleanValue = j.o.b().booleanValue();
        boolean booleanValue2 = j.p.b().booleanValue();
        boolean booleanValue3 = j.q.b().booleanValue();
        if (!z2 && !z3 && !booleanValue && !booleanValue2 && !booleanValue3) {
            return b2;
        }
        StringBuilder sb = new StringBuilder(b2);
        boolean z4 = b2.indexOf(63) != -1;
        if (z2) {
            sb.append(z4 ? '&' : '?');
            sb.append("ipCountryOverride=");
            sb.append(j.j.b());
            z4 = true;
        }
        if (z3) {
            sb.append(z4 ? '&' : '?');
            sb.append("mccmncOverride=");
            sb.append(j.f7073b.b());
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

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        Map<String, String> b2 = this.m.b();
        if (this.q != null) {
            b2.putAll(this.q);
        }
        if (this.t != null) {
            try {
                b2.put("X-DFE-Signature-Request", this.t.a());
            } catch (DfeResponseVerifier.DfeResponseVerifierException e) {
                PlayCommonLog.b("Couldn't create signature request: %s", e);
                d();
            }
        }
        v vVar = this.g;
        String str = "timeoutMs=" + vVar.a();
        int b3 = vVar.b();
        if (b3 > 0) {
            str = str + "; retryAttempt=" + b3;
        }
        b2.put("X-DFE-Request-Params", str);
        return b2;
    }

    @Override // com.android.volley.l
    public final r<lg> a(k kVar) {
        com.android.volley.b b2;
        Object[] objArr = {b(), Integer.valueOf((kVar.c == null || !kVar.c.containsKey("X-DFE-Content-Length")) ? 0 : Integer.parseInt(kVar.c.get("X-DFE-Content-Length")) / 1024)};
        lg a2 = a(kVar, false);
        if (a2 == null) {
            return r.a(new ParseError(kVar));
        }
        if (j) {
            String b3 = j.c.b();
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
        r<lg> a22 = a2(a2);
        if (a22 == null) {
            if (a2.d != null) {
                os osVar = a2.d;
                if (osVar.f4227b) {
                    this.p = osVar.f4226a;
                }
            }
            if (this.t != null) {
                b2 = null;
            } else {
                b2 = b(kVar);
            }
            if (b2 != null) {
                a(a2, b2);
            }
            r<lg> a3 = r.a(a2, b2);
            PlayCommonLog.e("DFE response %s", b());
            return a3;
        }
        return a22;
    }

    private void a(lg lgVar, com.android.volley.b bVar) {
        if (lgVar.c.length <= 0 && lgVar.f4079b == null) {
            return;
        }
        com.android.volley.a aVar = this.m.f6840b;
        long currentTimeMillis = System.currentTimeMillis();
        for (lk lkVar : lgVar.c) {
            com.android.volley.b bVar2 = new com.android.volley.b();
            bVar2.f1228a = lkVar.c;
            bVar2.f1229b = lkVar.e;
            bVar2.c = bVar.c;
            bVar2.e = lkVar.g + currentTimeMillis;
            bVar2.f = lkVar.i + currentTimeMillis;
            aVar.a(c(Uri.withAppendedPath(d.f6837a, lkVar.f4084a).toString()), bVar2);
        }
        lgVar.c = lk.b();
        lgVar.f4079b = null;
        bVar.f1228a = com.google.protobuf.nano.c.a(lgVar);
    }

    private static com.android.volley.b b(k kVar) {
        com.android.volley.b a2 = com.android.volley.a.l.a(kVar);
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
            PlayCommonLog.b("Invalid TTL: %s", kVar.c);
            a2.f = 0L;
            a2.e = 0L;
        }
        a2.e = Math.max(a2.e, a2.f);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final VolleyError a(VolleyError volleyError) {
        lg a2;
        if ((volleyError instanceof ServerError) && volleyError.f1195b != null && (a2 = a(volleyError.f1195b, false)) != null) {
            r<lg> a22 = a2(a2);
            if (a22 != null) {
                return a22.c;
            }
            PlayCommonLog.c("Received a null response in ResponseWrapper, error %d", Integer.valueOf(volleyError.f1195b.f1243a));
            return volleyError;
        }
        return volleyError;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private r<lg> a2(lg lgVar) {
        if (lgVar.f4079b == null) {
            return null;
        }
        op opVar = lgVar.f4079b;
        if (opVar.f) {
            PlayCommonLog.a("%s", opVar.e);
        }
        if (opVar.f4221a) {
            this.m.f6840b.b();
        }
        if (opVar.d) {
            return r.a(new DfeServerError(opVar.c));
        }
        return null;
    }

    @Override // com.android.volley.l
    public final void b(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            this.m.a();
        }
        if (!this.o) {
            super.b(volleyError);
        } else {
            PlayCommonLog.a("Not delivering error response for request=[%s], error=[%s] because response already delivered.", this, volleyError);
        }
    }

    private String c(String str) {
        StringBuilder append = new StringBuilder(256).append(str).append("/account=");
        Account account = this.m.f6839a.f1196a;
        StringBuilder append2 = append.append(account == null ? null : account.name);
        if (this.r != null) {
            append2.append((CharSequence) this.r);
        }
        return append2.toString();
    }

    @Override // com.android.volley.l
    public final String c() {
        return c(super.b());
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(inputStream, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
            byteArrayOutputStream.close();
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                inputStream.close();
            }
        }
    }

    private lg a(k kVar, boolean z) {
        while (true) {
            try {
                String str = kVar.c.get("X-DFE-Signature-Response");
                if (z) {
                    byte[] a2 = a((InputStream) new GZIPInputStream(new ByteArrayInputStream(kVar.f1244b)));
                    lg a3 = lg.a(a2);
                    if (this.t != null) {
                        this.t.a(a2, str);
                    }
                    return a3;
                }
                lg a4 = lg.a(kVar.f1244b);
                if (this.t != null) {
                    this.t.a(kVar.f1244b, str);
                    a("signature-verification-succeeded");
                }
                return a4;
            } catch (DfeResponseVerifier.DfeResponseVerifierException e) {
                a("signature-verification-failed");
                PlayCommonLog.c("Could not verify request: %s, exception %s", this, e);
            } catch (InvalidProtocolBufferNanoException e2) {
                if (z) {
                    PlayCommonLog.b("Cannot parse response as PlayResponseWrapper proto.", new Object[0]);
                    break;
                }
                z = true;
            } catch (IOException e3) {
                PlayCommonLog.b("IOException while manually unzipping request.", new Object[0]);
            }
        }
        return null;
    }
}
