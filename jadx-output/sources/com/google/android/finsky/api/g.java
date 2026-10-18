package com.google.android.finsky.api;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.VoucherParams;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.protos.ay;
import com.google.android.finsky.protos.bo;
import com.google.android.finsky.protos.bp;
import com.google.android.finsky.protos.bq;
import com.google.android.finsky.protos.bv;
import com.google.android.finsky.protos.bw;
import com.google.android.finsky.protos.bz;
import com.google.android.finsky.protos.ca;
import com.google.android.finsky.protos.dk;
import com.google.android.finsky.protos.dl;
import com.google.android.finsky.protos.dm;
import com.google.android.finsky.protos.ep;
import com.google.android.finsky.protos.ey;
import com.google.android.finsky.protos.ez;
import com.google.android.finsky.protos.fa;
import com.google.android.finsky.protos.fq;
import com.google.android.finsky.protos.fu;
import com.google.android.finsky.protos.fv;
import com.google.android.finsky.protos.fz;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.protos.gb;
import com.google.android.finsky.protos.gk;
import com.google.android.finsky.protos.gm;
import com.google.android.finsky.protos.gy;
import com.google.android.finsky.protos.ha;
import com.google.android.finsky.protos.hb;
import com.google.android.finsky.protos.hj;
import com.google.android.finsky.protos.hk;
import com.google.android.finsky.protos.hn;
import com.google.android.finsky.protos.ib;
import com.google.android.finsky.protos.id;
import com.google.android.finsky.protos.is;
import com.google.android.finsky.protos.it;
import com.google.android.finsky.protos.je;
import com.google.android.finsky.protos.jg;
import com.google.android.finsky.protos.jj;
import com.google.android.finsky.protos.jk;
import com.google.android.finsky.protos.jq;
import com.google.android.finsky.protos.jr;
import com.google.android.finsky.protos.js;
import com.google.android.finsky.protos.jt;
import com.google.android.finsky.protos.ju;
import com.google.android.finsky.protos.jz;
import com.google.android.finsky.protos.ks;
import com.google.android.finsky.protos.li;
import com.google.android.finsky.protos.lo;
import com.google.android.finsky.protos.ls;
import com.google.android.finsky.protos.lt;
import com.google.android.finsky.protos.ma;
import com.google.android.finsky.protos.me;
import com.google.android.finsky.protos.mf;
import com.google.android.finsky.protos.mh;
import com.google.android.finsky.protos.mi;
import com.google.android.finsky.protos.mj;
import com.google.android.finsky.protos.mk;
import com.google.android.finsky.protos.mm;
import com.google.android.finsky.protos.mn;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.protos.mz;
import com.google.android.finsky.protos.nk;
import com.google.android.finsky.protos.np;
import com.google.android.finsky.protos.nw;
import com.google.android.finsky.protos.nx;
import com.google.android.finsky.protos.nz;
import com.google.android.finsky.protos.ob;
import com.google.android.finsky.protos.od;
import com.google.android.finsky.protos.og;
import com.google.android.finsky.protos.oj;
import com.google.android.finsky.protos.on;
import com.google.android.finsky.protos.ot;
import com.google.android.finsky.protos.ou;
import com.google.android.finsky.protos.ow;
import com.google.android.finsky.protos.ox;
import com.google.android.finsky.protos.oy;
import com.google.android.finsky.protos.oz;
import com.google.android.finsky.protos.pm;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.protos.qe;
import com.google.android.finsky.protos.qf;
import com.google.android.finsky.protos.qh;
import com.google.android.finsky.protos.qi;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.protos.qp;
import com.google.android.finsky.protos.qq;
import com.google.android.finsky.protos.qr;
import com.google.android.finsky.protos.qs;
import com.google.android.finsky.protos.qw;
import com.google.android.finsky.utils.bg;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements b {
    private final com.android.volley.o aI;
    final e ao;
    private static final boolean ap = d.c.b().booleanValue();
    private static final boolean aq = d.d.b().booleanValue();
    private static final int ar = d.s.b().intValue();
    private static final int as = d.t.b().intValue();
    private static final int at = d.u.b().intValue();
    private static final int au = d.v.b().intValue();
    private static final float av = d.w.b().floatValue();
    private static final int aw = d.I.b().intValue();
    private static final int ax = d.x.b().intValue();
    private static final int ay = d.y.b().intValue();
    private static final float az = d.z.b().floatValue();
    private static final int aA = d.A.b().intValue();
    private static final int aB = d.B.b().intValue();
    private static final int aC = d.C.b().intValue();
    private static final int aD = d.D.b().intValue();
    private static final float aE = d.E.b().floatValue();
    private static final int aF = d.F.b().intValue();
    private static final int aG = d.G.b().intValue();
    private static final float aH = d.H.b().floatValue();

    public g(com.android.volley.o oVar, e eVar) {
        this.aI = oVar;
        this.ao = eVar;
    }

    @Override // com.google.android.finsky.api.b
    public final e a() {
        return this.ao;
    }

    @Override // com.google.android.finsky.api.b
    public final Account b() {
        return this.ao.a();
    }

    @Override // com.google.android.finsky.api.b
    public final String c() {
        return this.ao.b();
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(boolean z, String str, com.android.volley.t<pw> tVar, com.android.volley.s sVar) {
        n nVar = new n(f1952b.toString(), this.ao, pw.class, tVar, sVar);
        nVar.m = z;
        if (!TextUtils.isEmpty(str)) {
            nVar.a("X-DFE-Device-Config-Token", Uri.encode(str), (String) null);
        }
        com.google.android.finsky.d.d dVar = this.ao.f1956b;
        if (dVar == null || !dVar.a(12603108L)) {
            nVar.p = true;
        }
        nVar.q = true;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final void d() {
        this.aI.a(new l(this.ao.d, new n(f1952b.toString(), this.ao, pw.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, com.android.volley.t<on> tVar, com.android.volley.s sVar) {
        n nVar = new n(c.toString(), this.ao, on.class, tVar, sVar);
        if (!TextUtils.isEmpty(str)) {
            nVar.a("X-DFE-Device-Config-Token", Uri.encode(str), (String) null);
        }
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final void e() {
        this.aI.a(new l(this.ao.d, new n(c.toString(), this.ao, on.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, qm qmVar, com.android.volley.t<ay> tVar, com.android.volley.s sVar) {
        n<?> nVar = new n<>(str, this.ao, ay.class, tVar, sVar);
        a(nVar, qmVar);
        a(nVar);
        return this.aI.a(nVar);
    }

    private void a(n<?> nVar) {
        nVar.a("X-DFE-Network-Type", Integer.toString(com.google.android.play.utils.e.a(this.ao.f1955a)), (String) null);
    }

    private static void a(n<?> nVar, qm qmVar) {
        String str;
        if (qmVar != null) {
            String a2 = s.a(com.google.protobuf.nano.c.a(qmVar));
            if (FinskyApp.a().e().a(12605655L)) {
                jg jgVar = qmVar.f4299a;
                if (jgVar == null) {
                    str = null;
                } else {
                    int a3 = com.google.c.b.a.a.a.a(com.google.android.finsky.c.d.eK.b().intValue());
                    if (a3 < 30) {
                        a3++;
                    }
                    str = Long.toHexString(com.google.c.b.a.a.a.a(com.google.c.b.a.a.a.a((long) (jgVar.f3992a * 1.0E7d), (long) (jgVar.c * 1.0E7d)), a3));
                }
            } else {
                str = a2;
            }
            nVar.a("X-DFE-User-Context", a2, str);
        }
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, int i, String str2, com.android.volley.t<ey> tVar, com.android.volley.s sVar) {
        c cVar = new c(F.toString(), this.ao, ey.class, tVar, sVar);
        cVar.a("doc", str);
        cVar.a("cft", Integer.toString(i));
        if (!TextUtils.isEmpty(str2)) {
            cVar.a("content", str2);
        }
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(String str, qm qmVar, com.android.volley.t<je> tVar, com.android.volley.s sVar) {
        n<?> nVar = new n<>(str, this.ao, je.class, tVar, sVar);
        a(nVar, qmVar);
        a(nVar);
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> c(String str, com.android.volley.t<og> tVar, com.android.volley.s sVar) {
        n nVar = new n(str, this.ao, og.class, tVar, sVar);
        nVar.t = true;
        if (FinskyApp.a().e().a(12604087L)) {
            a((n<?>) nVar, e.c());
        }
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, int i, int i2, boolean z, com.android.volley.t<oj> tVar, com.android.volley.s sVar, p pVar) {
        Uri.Builder appendQueryParameter = e.buildUpon().appendQueryParameter("q", str).appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("ssis", Integer.toString(i2));
        appendQueryParameter.appendQueryParameter("sst", Integer.toString(2));
        if (z) {
            appendQueryParameter.appendQueryParameter("sst", Integer.toString(3));
        }
        n nVar = new n(0, appendQueryParameter.toString(), this.ao, oj.class, tVar, sVar, pVar);
        if (FinskyApp.a().e().a(12603401L)) {
            a((n<?>) nVar, e.c());
        }
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> h(String str, com.android.volley.t<fu> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = f.buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("playCountryOverride", str);
        }
        return this.aI.a(new n(buildUpon.toString(), this.ao, fu.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(com.android.volley.t<jz> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(g.toString(), this.ao, jz.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, int i, boolean z, com.android.volley.t<gy> tVar, com.android.volley.s sVar) {
        c cVar = new c(ag.toString(), this.ao, gy.class, tVar, sVar);
        cVar.g = h();
        cVar.a("doc", str);
        cVar.a("ot", Integer.toString(i));
        cVar.a("sd", z ? "1" : "0");
        cVar.s = new q(this.ao.f1955a);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, String str3, int i, boolean z, com.android.volley.t<nz> tVar, com.android.volley.s sVar) {
        c cVar = new c(k.toString(), this.ao, nz.class, tVar, sVar);
        cVar.a("doc", str);
        cVar.a("title", str2);
        cVar.a("content", str3);
        cVar.a("rating", Integer.toString(i));
        cVar.a("ipr", Boolean.toString(z));
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> d(String str, com.android.volley.t<nz> tVar, com.android.volley.s sVar) {
        c cVar = new c(l.toString(), this.ao, nz.class, tVar, sVar);
        cVar.a("doc", str);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, int i, com.android.volley.t<nz> tVar, com.android.volley.s sVar) {
        n nVar = new n(m.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("revId", str2).appendQueryParameter("rating", Integer.toString(i)).build().toString(), this.ao, nz.class, tVar, sVar);
        nVar.e = false;
        nVar.p = true;
        nVar.r = true;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, boolean z, int i, int i2, int i3, com.android.volley.t<nz> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(b(str, z, i, i2, i3), this.ao, nz.class, tVar, sVar));
    }

    private static String b(String str, boolean z, int i, int i2, int i3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("dfil", "1");
        }
        if (i > 0) {
            buildUpon.appendQueryParameter("vc", Integer.toString(i));
        }
        if (i2 > 0) {
            buildUpon.appendQueryParameter("rating", Integer.toString(i2));
        }
        if (i3 >= 0) {
            buildUpon.appendQueryParameter("sort", Integer.toString(i3));
        }
        return buildUpon.toString();
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> e(String str, com.android.volley.t<ob> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(str, this.ao, ob.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(String str, com.android.volley.t<com.google.android.finsky.protos.b> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(H.toString() + "?nid=" + str, this.ao, com.google.android.finsky.protos.b.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, Boolean bool, com.android.volley.t<com.google.android.finsky.protos.a> tVar, com.android.volley.s sVar) {
        c cVar = new c(I.toString(), this.ao, com.google.android.finsky.protos.a.class, tVar, sVar);
        cVar.a("tost", str);
        if (bool != null) {
            cVar.a("toscme", bool.toString());
        }
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, boolean z, boolean z2, Collection<String> collection, com.android.volley.t<gb> tVar, com.android.volley.s sVar) {
        n<?> nVar = new n<>(str, this.ao, gb.class, tVar, sVar);
        if (z) {
            nVar.a("X-DFE-No-Prefetch", "true", (String) null);
        }
        a(nVar);
        nVar.r = z2;
        if (collection != null && !collection.isEmpty() && d.N.b().booleanValue()) {
            nVar.a("X-DFE-Client-Has-Vouchers", "true", (String) null);
            if (collection.size() <= d.O.b().intValue()) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : collection) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(Uri.encode(str2));
                }
                nVar.a("X-DFE-Vouchers-Backend-Docids-CSV", sb.toString(), (String) null);
            }
        }
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(List<String> list, int[] iArr, boolean z, com.android.volley.t<ga> tVar, com.android.volley.s sVar) {
        return a(list, iArr, z, (String) null, false, tVar, sVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(List<String> list, int[] iArr, boolean z, String str, boolean z2, com.android.volley.t<ga> tVar, com.android.volley.s sVar) {
        fz fzVar = new fz();
        int size = list.size();
        Integer[] numArr = new Integer[size];
        for (int i = 0; i < size; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Arrays.sort(numArr, new i(this, list));
        fzVar.f3853a = new String[size];
        if (iArr != null) {
            fzVar.f3854b = new int[size];
        }
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = numArr[i2].intValue();
            fzVar.f3853a[i2] = list.get(intValue);
            if (iArr != null) {
                fzVar.f3854b[i2] = iArr[intValue];
            }
        }
        fzVar.e = z2;
        fzVar.f = true;
        if (!TextUtils.isEmpty(str)) {
            fzVar.g = str;
            fzVar.h = true;
        }
        Uri.Builder buildUpon = K.buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("au", "1");
        }
        h hVar = new h(this, buildUpon.build().toString(), fzVar, this.ao, ga.class, tVar, sVar, fzVar);
        hVar.e = true;
        hVar.g = new r(ax, ay, az, this.ao);
        hVar.r = false;
        return this.aI.a(hVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, boolean z, com.android.volley.t<li> tVar, com.android.volley.s sVar) {
        c cVar = new c(G.toString(), this.ao, li.class, tVar, sVar);
        cVar.a("doc", str);
        cVar.a("rating", Integer.toString(z ? 1 : 0));
        return this.aI.a(cVar);
    }

    private void b(n<?> nVar) {
        if (ap) {
            e eVar = this.ao;
            String c = eVar.i == null ? null : eVar.i.c();
            if (!TextUtils.isEmpty(c)) {
                nVar.a("X-Public-Android-Id", c, (String) null);
            }
        }
        if (!aq) {
            return;
        }
        nVar.t = true;
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(String str, int i, String str2, mk mkVar, ma maVar, String str3, int i2, VoucherParams voucherParams, int i3, String str4, Map<String, String> map, com.android.volley.t<mo> tVar, com.android.volley.s sVar) {
        com.android.volley.v h;
        c cVar = new c((FinskyApp.a().e().a(12603788L) ? r : o).toString(), this.ao, mo.class, tVar, sVar);
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        if (e.a(12602810L)) {
            h = new x(2500, this.ao);
        } else if (e.a(12602812L)) {
            h = new x(3500, this.ao);
        } else if (e.a(12602814L)) {
            h = new x(5000, this.ao);
        } else if (e.a(12602816L)) {
            h = new x(7000, this.ao);
        } else {
            h = h();
        }
        cVar.g = h;
        cVar.a("doc", str);
        if (TextUtils.isEmpty(str2)) {
            cVar.a("ot", Integer.toString(i));
        } else {
            cVar.a("oi", str2);
        }
        if (str3 != null) {
            cVar.a("ii", str3);
        }
        cVar.a("chv", String.valueOf(voucherParams.c));
        cVar.a("aav", String.valueOf(voucherParams.f2284b));
        if (!TextUtils.isEmpty(voucherParams.f2283a)) {
            cVar.a("usvid", voucherParams.f2283a);
        }
        if (i3 > 0) {
            cVar.a("vc", String.valueOf(i3));
        }
        if (i2 != 0) {
            cVar.a("ipt", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str4)) {
            cVar.a("ipcdr", str4);
        }
        if (mkVar != null) {
            cVar.a("bav", Integer.toString(mkVar.f4130a));
            cVar.a("shpn", mkVar.c);
            cVar.a("shh", mkVar.g);
            cVar.a("shvc", Integer.toString(mkVar.e));
            if (mkVar.i != null) {
                cVar.a("payload", mkVar.i);
            }
            if (mkVar.k != null) {
                for (String str5 : mkVar.k) {
                    cVar.a("odid", str5);
                }
            }
            mh[] mhVarArr = mkVar.l;
            if (mhVarArr != null && mhVarArr.length > 0) {
                mi miVar = new mi();
                miVar.f4127a = mhVarArr;
                cVar.a("iabx", s.a(com.google.protobuf.nano.c.a(miVar)));
            }
        }
        a(cVar, maVar);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cVar.a(entry.getKey(), entry.getValue());
            }
        }
        return (n) this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(String str, Map<String, String> map, ma maVar, mf mfVar, String str2, boolean z, qw qwVar, com.android.volley.t<me> tVar, com.android.volley.s sVar) {
        Uri uri = FinskyApp.a().e().a(12603788L) ? s : p;
        if (z) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("s7e_suffix", d.R.b());
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.size() > 0) {
                for (String str3 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            uri = buildUpon.build();
        }
        c cVar = new c(uri.toString(), this.ao, me.class, tVar, sVar);
        cVar.a("pct", str);
        cVar.g = h();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cVar.a(entry.getKey(), entry.getValue());
            }
        }
        if (mfVar != null) {
            if (mfVar.f4122b) {
                cVar.a("dcbch", mfVar.f4121a);
            }
            if (mfVar.d) {
                cVar.a("dcbpassphrase", mfVar.c);
            }
        }
        a(cVar, maVar);
        if (str2 != null) {
            cVar.a("chdi", str2);
        }
        cVar.o = qwVar;
        b(cVar);
        cVar.s = new q(this.ao.f1955a);
        return (n) this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(mm mmVar, com.android.volley.t<mn> tVar, com.android.volley.s sVar) {
        y yVar = new y(q.toString(), mmVar, this.ao, mn.class, tVar, sVar);
        b(yVar);
        yVar.g = h();
        yVar.s = new q(this.ao.f1955a);
        return (n) this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> f(String str, com.android.volley.t<od> tVar, com.android.volley.s sVar) {
        c cVar = new c(t.toString(), this.ao, od.class, tVar, sVar);
        cVar.g = h();
        cVar.a("doc", str);
        cVar.a("ot", Integer.toString(1));
        cVar.s = new q(this.ao.f1955a);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(qr qrVar, com.android.volley.t<qs> tVar, com.android.volley.s sVar) {
        y yVar = new y(u.toString(), qrVar, this.ao, qs.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        return (n) this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(qp qpVar, com.android.volley.t<qq> tVar, com.android.volley.s sVar) {
        y yVar = new y(v.toString(), qpVar, this.ao, qq.class, tVar, sVar);
        yVar.g = h();
        yVar.s = new q(this.ao.f1955a);
        return (n) this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    @SuppressLint({"NewApi"})
    public final com.android.volley.l<?> a(bv bvVar, com.android.volley.t<bw> tVar, com.android.volley.s sVar) {
        y yVar = new y(w.toString(), bvVar, this.ao, bw.class, tVar, sVar);
        yVar.g = h();
        if (Build.VERSION.SDK_INT >= 9) {
            yVar.a("X-DFE-Hardware-Id", e.a(Build.SERIAL), (String) null);
        }
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(hj hjVar, com.android.volley.t<hk> tVar, com.android.volley.s sVar) {
        y yVar = new y(x.toString(), hjVar, this.ao, hk.class, tVar, sVar);
        yVar.g = h();
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(com.android.volley.t<bq> tVar, com.android.volley.s sVar) {
        return this.aI.a(new c(y.toString(), this.ao, bq.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> c(com.android.volley.t<nw> tVar, com.android.volley.s sVar) {
        n nVar = new n(z.toString(), this.ao, nw.class, tVar, sVar);
        nVar.p = true;
        nVar.g = new r(at, au, av, this.ao);
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(long j, com.android.volley.t<nx> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = A.buildUpon();
        buildUpon.appendQueryParameter("raid", Long.toString(j));
        n nVar = new n(buildUpon.toString(), this.ao, nx.class, tVar, sVar);
        nVar.p = true;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(int i, String str, String str2, com.android.volley.t<bp> tVar, com.android.volley.s sVar) {
        c cVar = new c(C.toString(), this.ao, bp.class, tVar, sVar);
        cVar.a("dt", Integer.toString(i));
        cVar.a("shpn", str);
        if (!TextUtils.isEmpty(str2)) {
            cVar.a("dcbch", str2);
        }
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    @SuppressLint({"NewApi"})
    public final com.android.volley.l<?> d(com.android.volley.t<dm> tVar, com.android.volley.s sVar) {
        c cVar = new c(B.toString(), this.ao, dm.class, tVar, sVar);
        cVar.g = h();
        if (Build.VERSION.SDK_INT >= 9) {
            cVar.a("X-DFE-Hardware-Id", e.a(Build.SERIAL), (String) null);
        }
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, Map<String, String> map, com.android.volley.t<bo> tVar, com.android.volley.s sVar) {
        c cVar = new c(D.toString(), this.ao, bo.class, tVar, sVar);
        cVar.g = h();
        if (str != null) {
            cVar.a("pct", str);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cVar.a(entry.getKey(), entry.getValue());
            }
        }
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> g(String str, com.android.volley.t<bz> tVar, com.android.volley.s sVar) {
        c cVar = new c(M.toString(), this.ao, bz.class, tVar, sVar);
        cVar.a("dcbch", str);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, boolean z, com.android.volley.t<ca> tVar, com.android.volley.s sVar) {
        c cVar = new c(N.toString(), this.ao, ca.class, tVar, sVar);
        cVar.a("dcbch", str);
        if (!TextUtils.isEmpty(str2)) {
            cVar.a("dcbptosv", str2);
        }
        cVar.a("dcbreqaddr", Boolean.toString(z));
        cVar.g = new r(aA, aB, 0.0f, this.ao);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(jj jjVar, com.android.volley.t<jk> tVar, com.android.volley.s sVar) {
        return this.aI.a(new y(E.toString(), jjVar, this.ao, jk.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(is isVar, com.android.volley.t<it> tVar, com.android.volley.s sVar) {
        y yVar = new y(O.toString(), isVar, this.ao, it.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        yVar.g = new r(aC, aD, aE, this.ao);
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, byte[] bArr, Integer num, Integer num2, String[] strArr, String str2, String str3, String str4, com.android.volley.t<fv> tVar, com.android.volley.s sVar) {
        Uri.Builder appendQueryParameter = P.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("ot", Integer.toString(1));
        if (bArr != null) {
            appendQueryParameter.appendQueryParameter("st", s.a(bArr));
        }
        if (num != null) {
            appendQueryParameter.appendQueryParameter("vc", num.toString());
        }
        if (num2 != null) {
            appendQueryParameter.appendQueryParameter("bvc", num2.toString());
            if (strArr != null) {
                for (String str5 : strArr) {
                    appendQueryParameter.appendQueryParameter("pf", str5);
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("shh", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ch", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("dtok", str4);
        }
        n nVar = new n(appendQueryParameter.build().toString(), this.ao, fv.class, tVar, sVar);
        nVar.e = false;
        nVar.p = true;
        nVar.r = true;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, int i, List<String> list, com.android.volley.t<jt> tVar, com.android.volley.s sVar) {
        js jsVar = new js();
        jsVar.f4006a = str;
        jsVar.c = i;
        int size = list.size();
        jsVar.e = new nk[size];
        for (int i2 = 0; i2 < size; i2++) {
            nk nkVar = new nk();
            nkVar.f4171a = list.get(i2);
            jsVar.e[i2] = nkVar;
        }
        return this.aI.a(new y(Q.toString(), jsVar, this.ao, jt.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final String a(int i, String str, int i2, byte[] bArr) {
        Uri.Builder appendQueryParameter = J.buildUpon().appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("dt", Integer.toString(i2)).appendQueryParameter("libid", str);
        if (bArr != null) {
            appendQueryParameter.appendQueryParameter("st", s.a(bArr));
        }
        return appendQueryParameter.toString();
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, com.android.volley.t<np> tVar, com.android.volley.s sVar, p pVar) {
        Uri.Builder appendQueryParameter = L.buildUpon().appendQueryParameter("url", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("ref", str2);
        }
        n<?> nVar = new n<>(0, appendQueryParameter.toString(), this.ao, np.class, tVar, sVar, pVar);
        b(nVar);
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> i(String str, com.android.volley.t<mz> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(str, this.ao, mz.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(ls lsVar, com.android.volley.t<lt> tVar, com.android.volley.s sVar) {
        y yVar = new y(Y.toString(), lsVar, this.ao, lt.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        yVar.g = h();
        b(yVar);
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> e(com.android.volley.t<dk> tVar, com.android.volley.s sVar) {
        c cVar = new c(aa.toString(), this.ao, dk.class, tVar, sVar);
        cVar.g = g();
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(String str, Map<String, String> map, com.android.volley.t<dk> tVar, com.android.volley.s sVar) {
        c cVar = new c(str, this.ao, dk.class, tVar, sVar);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            cVar.a(entry.getKey(), entry.getValue());
        }
        cVar.g = g();
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> j(String str, com.android.volley.t<dk> tVar, com.android.volley.s sVar) {
        c cVar = new c(str, this.ao, dk.class, tVar, sVar);
        cVar.g = g();
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, String str3, com.android.volley.t<dk> tVar, com.android.volley.s sVar) {
        c cVar = new c(str, this.ao, dk.class, tVar, sVar);
        cVar.a(str2, str3);
        cVar.g = g();
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> c(String str, String str2, com.android.volley.t<ks> tVar, com.android.volley.s sVar) {
        c cVar = new c(ab.toString(), this.ao, ks.class, tVar, sVar);
        cVar.a("doc", str);
        cVar.a("referrer", str2);
        cVar.g = new r(aw, 0, 0.0f, this.ao);
        cVar.t = true;
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> k(String str, com.android.volley.t<ks> tVar, com.android.volley.s sVar) {
        c cVar = new c(ab.toString(), this.ao, ks.class, tVar, sVar);
        cVar.a("url", str);
        cVar.g = new r(aw, 0, 0.0f, this.ao);
        cVar.t = true;
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> g(com.android.volley.t<pm> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = ac.buildUpon();
        if (bg.an.a().booleanValue()) {
            buildUpon.appendQueryParameter("getAll", Boolean.toString(true));
        }
        return this.aI.a(new n(buildUpon.toString(), this.ao, pm.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(long j, int i, com.android.volley.t<gm> tVar, com.android.volley.s sVar) {
        return this.aI.a(new c(ad.buildUpon().appendQueryParameter("sid", Long.toString(j)).appendQueryParameter("sdrn", Integer.toString(i)).toString(), this.ao, gm.class, tVar, sVar));
    }

    private r g() {
        return new r(as, 0, 0.0f, this.ao);
    }

    private r h() {
        return new r(ar, 0, 0.0f, this.ao);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar) {
        jq jqVar = new jq();
        jqVar.f4003a = str;
        jqVar.f4004b = true;
        jqVar.c = (String[]) collection.toArray(new String[collection.size()]);
        y yVar = new y(R.toString(), jqVar, this.ao, jr.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar) {
        jq jqVar = new jq();
        jqVar.f4003a = str;
        jqVar.f4004b = true;
        jqVar.d = (String[]) collection.toArray(new String[collection.size()]);
        y yVar = new y(R.toString(), jqVar, this.ao, jr.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> c(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar) {
        jq jqVar = new jq();
        jqVar.f4003a = str;
        jqVar.f4004b = true;
        jqVar.e = (String[]) collection.toArray(new String[collection.size()]);
        y yVar = new y(R.toString(), jqVar, this.ao, jr.class, tVar, sVar);
        yVar.s = new q(this.ao.f1955a);
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, String str2, com.android.volley.t<ep> tVar, com.android.volley.s sVar) {
        c cVar = new c(S.toString(), this.ao, ep.class, tVar, sVar);
        cVar.g = h();
        cVar.a("pt", str);
        cVar.a("ot", Integer.toString(1));
        cVar.a("shpn", str2);
        cVar.s = new q(this.ao.f1955a);
        return this.aI.a(cVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(int i, String str, String str2, String str3, mi miVar, com.android.volley.t<mj> tVar, com.android.volley.s sVar) {
        Uri.Builder appendQueryParameter = T.buildUpon().appendQueryParameter("bav", Integer.toString(i)).appendQueryParameter("shpn", str).appendQueryParameter("iabt", str2);
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ctntkn", str3);
        }
        if (miVar != null) {
            appendQueryParameter.appendQueryParameter("iabx", s.a(com.google.protobuf.nano.c.a(miVar)));
        }
        n nVar = new n(appendQueryParameter.toString(), this.ao, mj.class, tVar, sVar);
        nVar.s = new q(this.ao.f1955a);
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final void a(String str, boolean z, int i, int i2, int i3) {
        this.aI.a(new l(this.ao.d, new n(b(str, z, i, i2, i3), this.ao, nz.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final void a(String str) {
        this.aI.a(new l(this.ao.d, new n(str, this.ao, gb.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final void b(String str) {
        this.aI.a(new l(this.ao.d, new n(str, this.ao, je.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final void f() {
        Uri.Builder buildUpon = ac.buildUpon();
        if (bg.an.a().booleanValue()) {
            buildUpon.appendQueryParameter("getAll", Boolean.toString(true));
        }
        this.aI.a(new l(this.ao.d, new n(buildUpon.toString(), this.ao, pm.class, null, null).c()));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(gk gkVar, String str, fq fqVar, String str2, com.android.volley.t<qi> tVar, com.android.volley.s sVar) {
        qh qhVar = new qh();
        if (gkVar != null) {
            qhVar.f4293a = gkVar;
        }
        if (str != null) {
            qhVar.e = str;
            qhVar.f = true;
        }
        qhVar.d = fqVar;
        y yVar = new y(U.toString(), qhVar, this.ao, qi.class, tVar, sVar);
        yVar.g = h();
        if (!TextUtils.isEmpty(str2)) {
            yVar.a("X-DFE-Device-Config-Token", Uri.encode(str2), (String) null);
        }
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(gk gkVar, com.android.volley.t<hb> tVar, com.android.volley.s sVar) {
        ha haVar = new ha();
        if (gkVar != null) {
            haVar.f3897a = gkVar;
        }
        y yVar = new y(V.toString(), haVar, this.ao, hb.class, tVar, sVar);
        yVar.g = i();
        yVar.r = false;
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(String str, Integer num, Integer num2, String[] strArr, String str2, String str3, String str4, com.android.volley.t<fv> tVar, com.android.volley.s sVar) {
        Uri.Builder appendQueryParameter = W.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("ot", Integer.toString(1));
        if (num != null) {
            appendQueryParameter.appendQueryParameter("vc", num.toString());
        }
        if (num2 != null) {
            appendQueryParameter.appendQueryParameter("bvc", num2.toString());
            if (strArr != null) {
                for (String str5 : strArr) {
                    appendQueryParameter.appendQueryParameter("pf", str5);
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("shh", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ch", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("dtok", str4);
        }
        n nVar = new n(appendQueryParameter.build().toString(), this.ao, fv.class, tVar, sVar);
        nVar.g = i();
        nVar.e = false;
        nVar.p = true;
        nVar.r = true;
        return this.aI.a(nVar);
    }

    private r i() {
        return new r(aF, aG, aH, this.ao);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(String str, String str2, com.android.volley.t<lo> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = X.buildUpon();
        buildUpon.appendQueryParameter("doc", str2);
        n nVar = new n(buildUpon.build().toString(), this.ao, lo.class, tVar, sVar);
        if (!TextUtils.isEmpty(str)) {
            nVar.a("X-DFE-Device-Config-Token", Uri.encode(str), (String) null);
        }
        nVar.g = new r(d.S.b().intValue(), d.T.b().intValue(), d.U.b().floatValue(), this.ao);
        nVar.p = true;
        nVar.q = true;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(com.android.volley.t<ContentFilters.ContentFilterSettingsResponse> tVar, com.android.volley.s sVar, boolean z) {
        Uri.Builder buildUpon = Z.buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("at", Boolean.TRUE.toString());
        }
        return this.aI.a(new n(buildUpon.build().toString(), this.ao, ContentFilters.ContentFilterSettingsResponse.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> f(com.android.volley.t<ContentFilters.ContentFilterSettingsResponse> tVar, com.android.volley.s sVar) {
        return this.aI.a(new c(Z.toString(), this.ao, ContentFilters.ContentFilterSettingsResponse.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(qw qwVar, int i, com.android.volley.t<id> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = af.buildUpon();
        if (i != 7) {
            buildUpon.appendQueryParameter("ddt", String.valueOf(i));
        }
        n nVar = new n(buildUpon.build().toString(), this.ao, id.class, tVar, sVar);
        nVar.o = qwVar;
        return this.aI.a(nVar);
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> l(String str, com.android.volley.t<ib> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = ak.buildUpon();
        buildUpon.appendQueryParameter("ogi", str);
        return this.aI.a(new n(buildUpon.build().toString(), this.ao, ib.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> b(String str, String str2, int i, com.android.volley.t<ou> tVar, com.android.volley.s sVar) {
        hn hnVar = new hn();
        hnVar.g = i;
        hnVar.f3918a = str2;
        hnVar.e = str;
        ot otVar = new ot();
        otVar.f4228a = hnVar;
        return this.aI.a(new y(aj.toString(), otVar, this.ao, ou.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> h(com.android.volley.t<ox> tVar, com.android.volley.s sVar) {
        return this.aI.a(new n(ai.toString(), this.ao, ox.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(ow[] owVarArr, com.android.volley.t<oz> tVar, com.android.volley.s sVar) {
        oy oyVar = new oy();
        oyVar.f4232a = owVarArr;
        return this.aI.a(new y(ah.toString(), oyVar, this.ao, oz.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(qe qeVar, qw qwVar, com.android.volley.t<qf> tVar, com.android.volley.s sVar) {
        y yVar = new y(ae.toString(), qeVar, this.ao, qf.class, new j(this, tVar), sVar);
        yVar.o = qwVar;
        return this.aI.a(yVar);
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> i(com.android.volley.t<ju> tVar, com.android.volley.s sVar) {
        return (n) this.aI.a(new n(al.toString(), this.ao, ju.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(String str, int i, long j, com.android.volley.t<dl> tVar, com.android.volley.s sVar) {
        Uri.Builder buildUpon = am.buildUpon();
        buildUpon.appendQueryParameter("pkgn", str);
        buildUpon.appendQueryParameter("vc", String.valueOf(i));
        buildUpon.appendQueryParameter("nnc", String.valueOf(j));
        return (n) this.aI.a(new n(buildUpon.build().toString(), this.ao, dl.class, tVar, sVar));
    }

    @Override // com.google.android.finsky.api.b
    public final n<?> a(ez ezVar, int i, com.android.volley.t<fa> tVar, com.android.volley.s sVar) {
        y yVar = new y(an.toString(), ezVar, this.ao, fa.class, tVar, sVar);
        yVar.a("X-Account-Ordinal", String.valueOf(i), (String) null);
        yVar.t = true;
        yVar.r = true;
        return (n) this.aI.a(yVar);
    }

    private static void a(c cVar, ma maVar) {
        cVar.a("pcap", String.valueOf(maVar.f4111a));
        if (maVar.d) {
            cVar.a("pclats", String.valueOf(maVar.c));
        }
    }

    @Override // com.google.android.finsky.api.b
    public final com.android.volley.l<?> a(Document document, int i, com.android.volley.t<com.google.android.finsky.protos.bg> tVar, com.android.volley.s sVar) {
        c cVar = new c(n.toString(), this.ao, com.google.android.finsky.protos.bg.class, tVar, sVar);
        cVar.g = h();
        cVar.a("doc", document.f1963a.f3890a);
        cVar.a("ot", Integer.toString(i));
        if (document.f1963a.e == 1) {
            cVar.a("vc", String.valueOf(document.E().e));
        }
        b(cVar);
        cVar.s = new q(this.ao.f1955a);
        return this.aI.a(cVar);
    }
}
