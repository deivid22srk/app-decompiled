package com.google.android.finsky.api.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ae;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.protos.aj;
import com.google.android.finsky.protos.an;
import com.google.android.finsky.protos.ao;
import com.google.android.finsky.protos.ap;
import com.google.android.finsky.protos.au;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.protos.gn;
import com.google.android.finsky.protos.gq;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.hc;
import com.google.android.finsky.protos.in;
import com.google.android.finsky.protos.jd;
import com.google.android.finsky.protos.jl;
import com.google.android.finsky.protos.jw;
import com.google.android.finsky.protos.kb;
import com.google.android.finsky.protos.kc;
import com.google.android.finsky.protos.mv;
import com.google.android.finsky.protos.nb;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.protos.om;
import com.google.android.finsky.protos.pe;
import com.google.android.finsky.protos.pi;
import com.google.android.finsky.protos.po;
import com.google.android.finsky.protos.qb;
import com.google.android.finsky.protos.sr;
import com.google.android.finsky.protos.sv;
import com.google.android.finsky.protos.sx;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.bc;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Document implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final gx f1963a;

    /* renamed from: b, reason: collision with root package name */
    public Document f1964b;
    public CharSequence c;
    public boolean d;
    private Map<Integer, List<ds>> e;
    private List<Document> f;
    private Document[] g;
    private float i = -1.0f;
    private static final String[] h = jm.d(com.google.android.finsky.c.d.eq.b());
    private static Boolean j = null;
    public static final Parcelable.Creator<Document> CREATOR = new o();

    public Document(gx gxVar) {
        this.f1963a = gxVar;
    }

    public final int a() {
        return this.f1963a.x.length;
    }

    public final Document a(int i) {
        if (this.g == null) {
            this.g = new Document[a()];
        }
        if (this.g[i] == null) {
            this.g[i] = new Document(this.f1963a.x[i]);
        }
        return this.g[i];
    }

    public final Document[] b() {
        if (this.g == null) {
            this.g = new Document[a()];
        }
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            if (this.g[i] == null) {
                this.g[i] = new Document(this.f1963a.x[i]);
            }
        }
        return this.g;
    }

    public final String e() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.c == null) ? "" : aeVar.c.e;
    }

    public final String f() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.f3585b == null) ? "" : aeVar.f3585b.f4213a;
    }

    public final String g() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.f3585b == null) ? "" : aeVar.f3585b.e;
    }

    public final aj h() {
        if (F() != null) {
            return F().d;
        }
        return null;
    }

    public final boolean i() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.j == null) ? false : true;
    }

    public final jd j() {
        if (this.f1963a.C != null) {
            return this.f1963a.C.j;
        }
        return null;
    }

    public final boolean k() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.i == null) ? false : true;
    }

    public final sx l() {
        if (k()) {
            return this.f1963a.C.i;
        }
        return null;
    }

    public final boolean m() {
        return this.f1963a.y != null;
    }

    public final ol n() {
        if (this.f1963a.C != null) {
            return this.f1963a.C.e;
        }
        return null;
    }

    public final ol[] o() {
        if (this.f1963a.C != null) {
            return this.f1963a.C.f3584a;
        }
        return null;
    }

    public final ol p() {
        ae aeVar = this.f1963a.C;
        if (aeVar != null) {
            return aeVar.d;
        }
        return null;
    }

    public final Document q() {
        if (r()) {
            return new Document(this.f1963a.C.z);
        }
        return null;
    }

    public final boolean r() {
        return (this.f1963a.C == null || this.f1963a.C.z == null) ? false : true;
    }

    public final long s() {
        if (!D() || E() == null) {
            return 0L;
        }
        return E().n;
    }

    public final in t() {
        if (E() != null) {
            return E().ab;
        }
        return null;
    }

    public final CharSequence u() {
        if (!this.d) {
            String str = this.f1963a.o;
            if (!TextUtils.isEmpty(str)) {
                this.c = bc.a(str);
            }
            this.d = true;
        }
        return this.c;
    }

    public final boolean v() {
        return this.f1963a.C != null && this.f1963a.C.F.length > 0;
    }

    public final sv[] w() {
        return this.f1963a.C.F;
    }

    public final boolean x() {
        return (this.f1963a.C == null || TextUtils.isEmpty(this.f1963a.C.H)) ? false : true;
    }

    public final String y() {
        return this.f1963a.C.H;
    }

    public final boolean z() {
        return this.f1963a.B != null;
    }

    public final float A() {
        if (this.i < 0.0f) {
            this.i = com.google.android.finsky.utils.v.b(this.f1963a.B.c);
        }
        return this.i;
    }

    public final long B() {
        return this.f1963a.B.e;
    }

    public final int[] C() {
        if (!z()) {
            return new int[]{0, 0, 0, 0, 0};
        }
        nb nbVar = this.f1963a.B;
        return new int[]{(int) nbVar.q, (int) nbVar.o, (int) nbVar.m, (int) nbVar.k, (int) nbVar.i};
    }

    public final List<ds> b(int i) {
        return bf().get(Integer.valueOf(i));
    }

    public final boolean c(int i) {
        return bf().containsKey(Integer.valueOf(i));
    }

    @SuppressLint({"UseSparseArrays"})
    private Map<Integer, List<ds>> bf() {
        if (this.e == null) {
            this.e = new HashMap();
            for (ds dsVar : this.f1963a.w) {
                int i = dsVar.f3746a;
                if (!this.e.containsKey(Integer.valueOf(i))) {
                    this.e.put(Integer.valueOf(i), new ArrayList());
                }
                this.e.get(Integer.valueOf(i)).add(dsVar);
            }
        }
        return this.e;
    }

    public final boolean D() {
        return this.f1963a.z != null;
    }

    public final ag E() {
        if (D()) {
            return this.f1963a.z.f3874a;
        }
        return null;
    }

    public final com.google.android.finsky.protos.w F() {
        if (D()) {
            return this.f1963a.z.f3875b;
        }
        return null;
    }

    public final pe G() {
        if (D()) {
            return this.f1963a.z.d;
        }
        return null;
    }

    public final au H() {
        if (D()) {
            return this.f1963a.z.e;
        }
        return null;
    }

    public final sr I() {
        if (D()) {
            return this.f1963a.z.f;
        }
        return null;
    }

    public final qb J() {
        if (D()) {
            return this.f1963a.z.k;
        }
        return null;
    }

    public final jl K() {
        if (D()) {
            return this.f1963a.z.h;
        }
        return null;
    }

    public final gq L() {
        if (D()) {
            return this.f1963a.z.l;
        }
        return null;
    }

    public final boolean M() {
        return this.f1963a.A != null;
    }

    public final ea a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (ea eaVar : this.f1963a.u) {
            if (str.equals(eaVar.S)) {
                return eaVar;
            }
        }
        return null;
    }

    public static boolean a(ea eaVar) {
        return eaVar != null && (eaVar.A == 1 || eaVar.A == 7) && eaVar.O && eaVar.N > System.currentTimeMillis();
    }

    public final boolean O() {
        return a(d(1)) || a(d(7));
    }

    public final boolean P() {
        if (this.f1963a.V) {
            return true;
        }
        for (int i = 0; i < h.length; i++) {
            if (this.f1963a.f3890a.equals(h[i])) {
                return true;
            }
        }
        return false;
    }

    public final int Q() {
        if (this.f1963a.v != null) {
            return this.f1963a.v.f3926a;
        }
        return -1;
    }

    public final String R() {
        ea d = d(1);
        if (d == null || !d.i) {
            return null;
        }
        return d.h;
    }

    public final boolean S() {
        ea d = d(1);
        if (d != null) {
            return d.w;
        }
        return false;
    }

    public final int T() {
        ag E = E();
        if (E == null || E.ab == null) {
            return 0;
        }
        String str = E.w;
        for (String str2 : jm.d(com.google.android.finsky.c.d.L.b())) {
            if (str.equals(str2)) {
                return 23;
            }
        }
        return E.ab.f;
    }

    public final fw[] U() {
        fw[] b2 = fw.b();
        ag E = E();
        if (E != null) {
            if (E.ab != null && E.ab.e != null) {
                b2 = E.ab.e;
            }
            return a(E.w, b2);
        }
        return b2;
    }

    public static fw[] a(String str, fw[] fwVarArr) {
        synchronized (Document.class) {
            if (j == null) {
                j = Boolean.valueOf(FinskyApp.a().e().a(12605207L));
            }
            if (j.booleanValue()) {
                if (fwVarArr.length <= 0) {
                    boolean z = str.startsWith("com.google") && !com.google.android.finsky.b.l.a(str);
                    boolean equals = str.equals(com.google.android.finsky.c.d.fz.b());
                    fw fwVar = null;
                    if (z || equals) {
                        fwVar = new fw();
                        fwVar.f3850b = true;
                        fwVar.f3849a = "com.google.android.gms";
                        fwVar.d = true;
                        fwVar.c = 8301010;
                        fwVar.h = true;
                        fwVar.g = true;
                    }
                    if (z) {
                        return new fw[]{fwVar};
                    }
                    if (equals) {
                        fw fwVar2 = new fw();
                        fwVar2.f3850b = true;
                        fwVar2.f3849a = "com.google.android.play.games";
                        fwVar2.d = true;
                        fwVar2.c = 34120010;
                        fwVar2.h = true;
                        fwVar2.g = true;
                        return new fw[]{fwVar2, fwVar};
                    }
                    return fwVarArr;
                }
                return fwVarArr;
            }
            return fwVarArr;
        }
    }

    public final boolean V() {
        List<ds> b2 = b(1);
        return (b2 == null || b2.isEmpty() || 1 == this.f1963a.g) ? false : true;
    }

    public final boolean W() {
        return this.f1963a.C != null && this.f1963a.C.h.length > 0;
    }

    public final CharSequence X() {
        StringBuilder sb = new StringBuilder();
        ae aeVar = this.f1963a.C;
        int length = aeVar.h.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append("<br />");
            }
            sb.append(aeVar.h[i].f4409a);
        }
        return bc.a(sb.toString());
    }

    public final boolean Y() {
        return this.f1963a.C.l.length > 0;
    }

    public final an Z() {
        return this.f1963a.C.l[0];
    }

    public final an[] aa() {
        return this.f1963a.C.l;
    }

    public final boolean ab() {
        return this.f1963a.C.m.length > 0;
    }

    public final an ac() {
        return this.f1963a.C.o;
    }

    public final boolean ad() {
        return (this.f1963a.C == null || this.f1963a.C.p == null || this.f1963a.C.p.length <= 0) ? false : true;
    }

    public final ao ae() {
        return this.f1963a.C.p[0];
    }

    public final boolean af() {
        return (this.f1963a.C == null || this.f1963a.C.n == null || this.f1963a.C.n.length <= 0) ? false : true;
    }

    public final an[] ag() {
        return this.f1963a.C.n;
    }

    public final boolean ah() {
        return (aJ() == null || aJ().j == null) ? false : true;
    }

    public final boolean ai() {
        return (aJ() == null || aJ().f4260a == null) ? false : true;
    }

    public final boolean aj() {
        return (aJ() == null || aJ().o == null) ? false : true;
    }

    public final boolean ak() {
        return (aJ() == null || aJ().p == null) ? false : true;
    }

    public final boolean al() {
        return (aJ() == null || aJ().r == null) ? false : true;
    }

    public final boolean am() {
        return (aJ() == null || aJ().C == null) ? false : true;
    }

    public final boolean an() {
        return (aJ() == null || aJ().x == null) ? false : true;
    }

    public final jw ao() {
        if (aJ() != null) {
            return aJ().x;
        }
        return null;
    }

    public final hc ap() {
        return this.f1963a.C.k.k;
    }

    public final boolean aq() {
        return (this.f1963a.C == null || this.f1963a.C.k == null || this.f1963a.C.k.m == null) ? false : true;
    }

    public final pi ar() {
        if (this.f1963a.C == null || this.f1963a.C.u == null) {
            return null;
        }
        return this.f1963a.C.u;
    }

    public final String as() {
        if (this.f1963a.C == null || this.f1963a.C.Q == null) {
            return null;
        }
        return this.f1963a.C.Q.f4237a;
    }

    public final mv at() {
        if (this.f1963a.C == null || this.f1963a.C.C == null) {
            return null;
        }
        return this.f1963a.C.C;
    }

    public final kb au() {
        if (av()) {
            return this.f1963a.C.E;
        }
        return null;
    }

    public final boolean av() {
        return (this.f1963a.C == null || this.f1963a.C.E == null) ? false : true;
    }

    public final boolean ax() {
        return (aJ() == null || aJ().y == null) ? false : true;
    }

    public final boolean ay() {
        return (aJ() == null || aJ().t == null) ? false : true;
    }

    public final boolean az() {
        po aJ = aJ();
        return (aJ == null || aJ.J == null || aJ.J.f3937a == null) ? false : true;
    }

    public final ny aA() {
        if (az()) {
            return aJ().J.f3937a;
        }
        return null;
    }

    public final boolean aB() {
        po aJ = aJ();
        return (aJ == null || aJ.O == null) ? false : true;
    }

    public final boolean aC() {
        return (aJ() == null || aJ().w == null) ? false : true;
    }

    public final boolean aD() {
        return (aJ() == null || aJ().K == null) ? false : true;
    }

    public final boolean aE() {
        return (aJ() == null || aJ().u == null) ? false : true;
    }

    public final boolean aF() {
        return (aJ() == null || aJ().B == null) ? false : true;
    }

    public final String aG() {
        po aJ = aJ();
        if (aJ == null || aJ.B == null) {
            return null;
        }
        return aJ.B.f4239a;
    }

    public final boolean aH() {
        pi ar = ar();
        return (ar == null || ar.f4249a == null) ? false : true;
    }

    public final gn aI() {
        if (aH()) {
            return ar().f4249a;
        }
        return null;
    }

    public final po aJ() {
        if (this.f1963a.C != null) {
            return this.f1963a.C.k;
        }
        return null;
    }

    public final boolean aK() {
        com.google.android.finsky.protos.w F = F();
        return (F == null || F.c == null || !F.c.f4018b) ? false : true;
    }

    public final boolean aL() {
        com.google.android.finsky.protos.w F = F();
        return (F == null || F.c == null || F.c.c.length <= 0) ? false : true;
    }

    public final boolean aM() {
        return this.f1963a.C != null && this.f1963a.C.t.length > 0;
    }

    public final List<Document> aN() {
        if (!aM()) {
            return null;
        }
        if (this.f == null) {
            this.f = new ArrayList(this.f1963a.C.t.length);
            for (gx gxVar : this.f1963a.C.t) {
                this.f.add(new Document(gxVar));
            }
        }
        return this.f;
    }

    public final boolean aP() {
        int[] C = C();
        for (int i = 0; i < 5; i++) {
            if (C[i] > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean aQ() {
        return (this.f1963a == null || ar() == null || ar().c.length <= 0) ? false : true;
    }

    public final boolean aR() {
        return aQ() && aH();
    }

    public final boolean aS() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.O == null || !aeVar.O.f4394a) ? false : true;
    }

    public final String aT() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.O == null) ? "" : aeVar.O.c;
    }

    public final String aU() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.O == null) ? "" : aeVar.O.g;
    }

    public final String aV() {
        ae aeVar = this.f1963a.C;
        return (aeVar == null || aeVar.O == null) ? "" : aeVar.O.e;
    }

    public final ap aW() {
        po aJ = aJ();
        if (aJ != null) {
            return aJ.G;
        }
        return null;
    }

    public final boolean aX() {
        po aJ = aJ();
        return (aJ == null || aJ.P == null) ? false : true;
    }

    public final boolean aY() {
        po aJ = aJ();
        return (aJ == null || aJ.I == null) ? false : true;
    }

    public final kc aZ() {
        if (ba()) {
            return this.f1963a.C.D;
        }
        return null;
    }

    public final boolean ba() {
        return (this.f1963a.C == null || this.f1963a.C.D == null) ? false : true;
    }

    public final boolean bb() {
        return D() && this.f1963a.z.e != null && this.f1963a.z.e.n;
    }

    public final String bc() {
        if (!D() || this.f1963a.z.e == null) {
            return null;
        }
        return this.f1963a.z.e.m;
    }

    public final String bd() {
        if (!D() || this.f1963a.z.o == null) {
            return null;
        }
        return this.f1963a.z.o.c;
    }

    public final String be() {
        if (!D() || this.f1963a.z.o == null) {
            return null;
        }
        return this.f1963a.z.o.f3611a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.a(this.f1963a), 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append(this.f1963a.f3890a);
        if (this.f1963a.e == 1) {
            sb.append(" v=").append(E().e);
        }
        sb.append('}');
        return sb.toString();
    }

    public final dp c() {
        return as.a(this.f1963a.g, this.f1963a.e, this.f1963a.c);
    }

    public final int d() {
        if (this.f1963a.e == 1) {
            return E().e;
        }
        return -1;
    }

    public final ea d(int i) {
        for (ea eaVar : this.f1963a.u) {
            if (eaVar.A == i) {
                return eaVar;
            }
        }
        return null;
    }

    public final ea N() {
        return this.f1963a.e == 15 ? d(1) : d(13);
    }

    public final om aw() {
        if ((this.f1963a.C == null || this.f1963a.C.P == null) ? false : true) {
            return this.f1963a.C.P;
        }
        return null;
    }

    public final boolean aO() {
        return this.f1963a.e != 12 && G() == null && this.f1963a.P && this.f1963a.e != 15 && d(13) == null;
    }
}
