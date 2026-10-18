package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ol;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.on;
import com.google.android.gms.internal.oo;
import com.google.android.gms.internal.op;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ap {
    private static bb h;
    private static volatile ap i;

    /* renamed from: a, reason: collision with root package name */
    final Context f6315a;

    /* renamed from: b, reason: collision with root package name */
    final i f6316b;
    final al c;
    final com.google.android.gms.common.c.a d;
    final bg e;
    int f;
    int g;
    private final ai j;
    private final z k;
    private final com.google.android.gms.measurement.a l;
    private final g m;
    private final j n;
    private final ac o;
    private final n p;
    private final bc q;
    private final x r;
    private final ag s;
    private final d t;
    private final boolean u;
    private Boolean v;
    private List<Long> w;

    private static void a(az azVar) {
        if (azVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    static void a(ba baVar) {
        if (baVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!baVar.t()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private bc m() {
        a((ba) this.q);
        return this.q;
    }

    private n n() {
        a((ba) this.p);
        return this.p;
    }

    private ag o() {
        if (this.s == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return this.s;
    }

    private d p() {
        a((ba) this.t);
        return this.t;
    }

    private boolean q() {
        return !TextUtils.isEmpty(h().q());
    }

    final void a() {
        if (!this.u) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public final ai d() {
        a((az) this.j);
        return this.j;
    }

    public final z e() {
        a((ba) this.k);
        return this.k;
    }

    public final al f() {
        a((ba) this.c);
        return this.c;
    }

    public final g g() {
        a(this.m);
        return this.m;
    }

    public final j h() {
        a((ba) this.n);
        return this.n;
    }

    public final ac i() {
        a((ba) this.o);
        return this.o;
    }

    public final x j() {
        a((ba) this.r);
        return this.r;
    }

    private ap(bb bbVar) {
        com.google.android.gms.common.internal.av.a(bbVar);
        this.f6315a = bbVar.f6337a;
        this.d = com.google.android.gms.common.c.f.c();
        this.f6316b = new i(this);
        ai aiVar = new ai(this);
        aiVar.v();
        this.j = aiVar;
        z zVar = new z(this);
        zVar.v();
        this.k = zVar;
        this.m = new g(this);
        n nVar = new n(this);
        nVar.v();
        this.p = nVar;
        x xVar = new x(this);
        xVar.v();
        this.r = xVar;
        j jVar = new j(this);
        jVar.v();
        this.n = jVar;
        ac acVar = new ac(this);
        acVar.v();
        this.o = acVar;
        bg b2 = bb.b(this);
        b2.v();
        this.e = b2;
        bc a2 = bb.a(this);
        a2.v();
        this.q = a2;
        d c = bb.c(this);
        c.v();
        this.t = c;
        this.s = new ag(this);
        this.l = new com.google.android.gms.measurement.a(this);
        al alVar = new al(this);
        alVar.v();
        this.c = alVar;
        if (this.f != this.g) {
            e().f6388a.a("Not all components initialized", Integer.valueOf(this.f), Integer.valueOf(this.g));
        }
        this.u = true;
        if (!i.B()) {
            if (!(this.f6315a.getApplicationContext() instanceof Application)) {
                e().f6389b.a("Application context is not an Application");
            } else if (Build.VERSION.SDK_INT >= 14) {
                bc m = m();
                if (m.i().getApplicationContext() instanceof Application) {
                    Application application = (Application) m.i().getApplicationContext();
                    if (m.f6338a == null) {
                        m.f6338a = new bf(m, (byte) 0);
                    }
                    application.unregisterActivityLifecycleCallbacks(m.f6338a);
                    application.registerActivityLifecycleCallbacks(m.f6338a);
                    m.l().g.a("Registered activity lifecycle callback");
                }
            } else {
                e().f.a("Not tracking deep linking pre-ICS");
            }
        }
        this.c.a(new aq(this));
    }

    protected final boolean b() {
        a();
        f().e();
        if (this.v == null) {
            this.v = Boolean.valueOf(g().b("android.permission.INTERNET") && g().b("android.permission.ACCESS_NETWORK_STATE") && AppMeasurementReceiver.a(this.f6315a) && AppMeasurementService.a(this.f6315a));
            if (this.v.booleanValue() && !i.B()) {
                this.v = Boolean.valueOf(TextUtils.isEmpty(j().b()) ? false : true);
            }
        }
        return this.v.booleanValue();
    }

    protected final void c() {
        f().e();
        e().e.a("App measurement is starting up");
        e().f.a("Debug logging enabled");
        h().r();
        if (!b()) {
            if (!g().b("android.permission.INTERNET")) {
                e().f6388a.a("App is missing INTERNET permission");
            }
            if (!g().b("android.permission.ACCESS_NETWORK_STATE")) {
                e().f6388a.a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!AppMeasurementReceiver.a(this.f6315a)) {
                e().f6388a.a("AppMeasurementReceiver not registered/enabled");
            }
            if (!AppMeasurementService.a(this.f6315a)) {
                e().f6388a.a("AppMeasurementService not registered/enabled");
            }
            e().f6388a.a("Uploading is not possible. App measurement disabled");
        } else if (!i.B() && !TextUtils.isEmpty(j().b())) {
            m().b();
        }
        l();
    }

    public static ap a(Context context) {
        com.google.android.gms.common.internal.av.a(context);
        com.google.android.gms.common.internal.av.a(context.getApplicationContext());
        if (i == null) {
            synchronized (ap.class) {
                if (i == null) {
                    i = new ap(h != null ? h : new bb(context));
                }
            }
        }
        return i;
    }

    final void a(EventParcel eventParcel, AppMetadata appMetadata) {
        p pVar;
        o oVar;
        b bVar;
        f().e();
        a();
        com.google.android.gms.common.internal.av.a(appMetadata.f6280b);
        if (TextUtils.isEmpty(appMetadata.c)) {
            return;
        }
        e().g.a("Logging event", eventParcel);
        o oVar2 = new o(this, eventParcel.d, appMetadata.f6280b, eventParcel.f6284b, eventParcel.e, eventParcel.c.a());
        h().b();
        try {
            a(appMetadata);
            p a2 = h().a(appMetadata.f6280b, oVar2.f6378b);
            if (a2 == null) {
                pVar = new p(appMetadata.f6280b, oVar2.f6378b, 1L, 1L, oVar2.d);
                oVar = oVar2;
            } else {
                o oVar3 = new o(this, oVar2.c, oVar2.f6377a, oVar2.f6378b, oVar2.d, a2.e, oVar2.f);
                pVar = new p(a2.f6379a, a2.f6380b, a2.c + 1, a2.d + 1, oVar3.d);
                oVar = oVar3;
            }
            h().a(pVar);
            o[] oVarArr = {oVar};
            com.google.android.gms.common.internal.av.a(appMetadata);
            com.google.android.gms.common.internal.av.a(oVarArr);
            f().e();
            oo ooVar = new oo();
            ooVar.f6211a = 1;
            ooVar.i = "android";
            ooVar.o = appMetadata.f6280b;
            ooVar.n = appMetadata.e;
            ooVar.q = appMetadata.d;
            ooVar.r = Long.valueOf(appMetadata.f);
            ooVar.z = appMetadata.c;
            ooVar.w = appMetadata.g == 0 ? null : Long.valueOf(appMetadata.g);
            Pair<String, Boolean> b2 = d().b();
            if (b2.first != null && b2.second != null) {
                ooVar.t = (String) b2.first;
                ooVar.u = (Boolean) b2.second;
            }
            ooVar.k = n().b();
            ooVar.j = n().o();
            ooVar.m = Integer.valueOf((int) n().p());
            ooVar.l = n().q();
            ooVar.s = null;
            ooVar.d = null;
            ooVar.e = Long.valueOf(oVarArr[0].d);
            ooVar.f = Long.valueOf(oVarArr[0].d);
            b c = h().c(appMetadata.f6280b);
            if (c == null) {
                String str = appMetadata.f6280b;
                d();
                bVar = new b(str, ai.p(), appMetadata.c, d().o(), 0L, 0L, appMetadata.d, appMetadata.e, appMetadata.f, appMetadata.g, appMetadata.i);
            } else {
                bVar = c;
            }
            z e = e();
            long longValue = ooVar.f.longValue();
            com.google.android.gms.common.internal.av.a(e);
            long j = bVar.e + 1;
            if (j > 2147483647L) {
                e.f6389b.a("Bundle index overflow");
                j = 0;
            }
            b bVar2 = new b(bVar.f6333a, bVar.f6334b, bVar.c, bVar.d, j, longValue, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k);
            h().a(bVar2);
            ooVar.v = bVar2.f6334b;
            ooVar.x = Integer.valueOf((int) bVar2.e);
            ooVar.h = bVar.f == 0 ? null : Long.valueOf(bVar.f);
            ooVar.g = ooVar.h;
            List<e> b3 = h().b(appMetadata.f6280b);
            ooVar.c = new op[b3.size()];
            for (int i2 = 0; i2 < b3.size(); i2++) {
                op opVar = new op();
                ooVar.c[i2] = opVar;
                opVar.f6214b = b3.get(i2).f6366b;
                opVar.f6213a = Long.valueOf(b3.get(i2).c);
                g().a(opVar, b3.get(i2).d);
            }
            ooVar.f6212b = new ol[1];
            for (int i3 = 0; i3 <= 0; i3++) {
                ol olVar = new ol();
                ooVar.f6212b[i3] = olVar;
                olVar.f6207b = oVarArr[i3].f6378b;
                olVar.c = Long.valueOf(oVarArr[i3].d);
                olVar.f6206a = new om[oVarArr[i3].f.f6282b.size()];
                Iterator<String> it = oVarArr[i3].f.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    om omVar = new om();
                    olVar.f6206a[i4] = omVar;
                    omVar.f6208a = next;
                    g().a(omVar, oVarArr[i3].f.f6282b.get(next));
                    i4++;
                }
            }
            ooVar.y = e().b();
            h().a(ooVar);
            h().o();
            e().f.a("Event logged", oVar);
            h().p();
            l();
        } catch (Throwable th) {
            h().p();
            throw th;
        }
    }

    final void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        f().e();
        a();
        if (TextUtils.isEmpty(appMetadata.c)) {
            return;
        }
        g();
        g.a(userAttributeParcel.f6286b);
        g();
        Object b2 = g.b(userAttributeParcel.f6286b, userAttributeParcel.a());
        if (b2 != null) {
            e eVar = new e(appMetadata.f6280b, userAttributeParcel.f6286b, userAttributeParcel.c, b2);
            e().f.a("Setting user attribute", eVar.f6366b, b2);
            h().b();
            try {
                a(appMetadata);
                h().a(eVar);
                h().o();
                e().f.a("User attribute set", eVar.f6366b, eVar.d);
            } finally {
                h().p();
            }
        }
    }

    public final void k() {
        String str;
        List<Pair<oo, Long>> list;
        f().e();
        a();
        if (!i.B()) {
            Boolean q = d().q();
            if (q == null) {
                e().f6389b.a("Upload data called on the client side before use of service was decided");
                return;
            } else if (q.booleanValue()) {
                e().f6388a.a("Upload called in the client side when service should be used");
                return;
            }
        }
        f().e();
        if (this.w != null) {
            e().f6389b.a("Uploading requested multiple times");
            return;
        }
        if (!i().b()) {
            e().f6389b.a("Network not connected, ignoring upload request");
            l();
            return;
        }
        long a2 = d().c.a();
        if (a2 != 0) {
            e().f.a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(this.d.a() - a2)));
        }
        String q2 = h().q();
        if (TextUtils.isEmpty(q2)) {
            return;
        }
        List<Pair<oo, Long>> a3 = h().a(q2, i.H(), i.I());
        if (a3.isEmpty()) {
            return;
        }
        Iterator<Pair<oo, Long>> it = a3.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            oo ooVar = (oo) it.next().first;
            if (!TextUtils.isEmpty(ooVar.t)) {
                str = ooVar.t;
                break;
            }
        }
        if (str != null) {
            for (int i2 = 0; i2 < a3.size(); i2++) {
                oo ooVar2 = (oo) a3.get(i2).first;
                if (!TextUtils.isEmpty(ooVar2.t) && !ooVar2.t.equals(str)) {
                    list = a3.subList(0, i2);
                    break;
                }
            }
        }
        list = a3;
        on onVar = new on();
        onVar.f6210a = new oo[list.size()];
        ArrayList arrayList = new ArrayList(list.size());
        long a4 = this.d.a();
        for (int i3 = 0; i3 < onVar.f6210a.length; i3++) {
            onVar.f6210a[i3] = (oo) list.get(i3).first;
            arrayList.add(list.get(i3).second);
            onVar.f6210a[i3].s = Long.valueOf(i.A());
            onVar.f6210a[i3].d = Long.valueOf(a4);
            onVar.f6210a[i3].A = Boolean.valueOf(i.B());
        }
        byte[] a5 = g().a(onVar);
        String J = i.J();
        try {
            URL url = new URL(J);
            com.google.android.gms.common.internal.av.b(arrayList.isEmpty() ? false : true);
            if (this.w != null) {
                e().f6388a.a("Set uploading progress before finishing the previous upload");
            } else {
                this.w = new ArrayList(arrayList);
            }
            d().d.a(this.d.a());
            i().a(url, a5, new ar(this));
        } catch (MalformedURLException e) {
            e().f6388a.a("Failed to parse upload URL. Not uploading", J);
        }
    }

    final void l() {
        long j;
        f().e();
        a();
        if (!b() || !q()) {
            o().a();
            p().b();
            return;
        }
        long a2 = this.d.a();
        long N = i.N();
        long L = i.L();
        long a3 = d().c.a();
        long a4 = d().d.a();
        long a5 = h().a("select max(bundle_end_timestamp) from queue");
        if (a5 != 0) {
            long abs = a2 - Math.abs(a5 - a2);
            long j2 = N + abs;
            if (!g().a(a3, L)) {
                j2 = a3 + L;
            }
            if (a4 != 0 && a4 >= abs) {
                int i2 = 0;
                while (true) {
                    if (i2 >= i.P()) {
                        j = 0;
                        break;
                    }
                    j2 += (1 << i2) * i.O();
                    if (j2 > a4) {
                        j = j2;
                        break;
                    }
                    i2++;
                }
            } else {
                j = j2;
            }
        } else {
            j = 0;
        }
        if (j == 0) {
            o().a();
            p().b();
            return;
        }
        if (!i().b()) {
            ag o = o();
            o.f6298b.a();
            o.f6298b.f().e();
            if (!o.c) {
                o.f6298b.f6315a.registerReceiver(o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                o.d = o.f6298b.i().b();
                o.f6298b.e().g.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(o.d));
                o.c = true;
            }
            p().b();
            return;
        }
        long a6 = d().e.a();
        long K = i.K();
        if (!g().a(a6, K)) {
            j = Math.max(j, a6 + K);
        }
        o().a();
        long a7 = j - this.d.a();
        if (a7 <= 0) {
            p().a(1L);
        } else {
            e().g.a("Upload scheduled in approximately ms", Long.valueOf(a7));
            p().a(a7);
        }
    }

    final void a(AppMetadata appMetadata) {
        b bVar;
        b bVar2;
        f().e();
        a();
        com.google.android.gms.common.internal.av.a(appMetadata);
        com.google.android.gms.common.internal.av.a(appMetadata.f6280b);
        b c = h().c(appMetadata.f6280b);
        String o = d().o();
        boolean z = false;
        if (c == null) {
            String str = appMetadata.f6280b;
            d();
            z = true;
            c = new b(str, ai.p(), appMetadata.c, o, 0L, 0L, appMetadata.d, appMetadata.e, appMetadata.f, appMetadata.g, appMetadata.i);
        } else if (!o.equals(c.d)) {
            d();
            z = true;
            c = new b(c.f6333a, ai.p(), c.c, o, c.e, c.f, c.g, c.h, c.i, c.j, c.k);
        }
        if (!TextUtils.isEmpty(appMetadata.c) && (!appMetadata.c.equals(c.c) || appMetadata.f != c.i)) {
            z = true;
            c = new b(c.f6333a, c.f6334b, appMetadata.c, c.d, c.e, c.f, c.g, c.h, appMetadata.f, c.j, c.k);
        }
        if (!TextUtils.isEmpty(appMetadata.d) && (!appMetadata.d.equals(c.g) || !appMetadata.e.equals(c.h))) {
            z = true;
            c = new b(c.f6333a, c.f6334b, c.c, c.d, c.e, c.f, appMetadata.d, appMetadata.e, c.i, c.j, c.k);
        }
        if (appMetadata.g != c.j) {
            z = true;
            bVar = new b(c.f6333a, c.f6334b, c.c, c.d, c.e, c.f, c.g, c.h, c.i, appMetadata.g, c.k);
        } else {
            bVar = c;
        }
        if (appMetadata.i != bVar.k) {
            bVar2 = new b(bVar.f6333a, bVar.f6334b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, appMetadata.i);
            z = true;
        } else {
            bVar2 = bVar;
        }
        if (z) {
            h().a(bVar2);
        }
    }

    static /* synthetic */ void a(ap apVar, int i2, Throwable th, byte[] bArr) {
        apVar.f().e();
        apVar.a();
        if (bArr == null) {
            bArr = new byte[0];
        }
        List<Long> list = apVar.w;
        apVar.w = null;
        if ((i2 != 200 && i2 != 204) || th != null) {
            apVar.e().g.a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            apVar.d().d.a(apVar.d.a());
            if (i2 == 503 || i2 == 429) {
                apVar.d().e.a(apVar.d.a());
            }
            apVar.l();
            return;
        }
        apVar.d().c.a(apVar.d.a());
        apVar.d().d.a(0L);
        apVar.l();
        apVar.e().g.a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
        apVar.h().b();
        try {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                apVar.h().a(it.next().longValue());
            }
            apVar.h().o();
            apVar.h().p();
            if (apVar.i().b() && apVar.q()) {
                apVar.k();
            } else {
                apVar.l();
            }
        } catch (Throwable th2) {
            apVar.h().p();
            throw th2;
        }
    }
}
