package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.apkg.i;
import com.google.android.gms.ads.internal.apkg.j;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.purchase.g;
import com.google.android.gms.common.cpkg.f;
import com.google.android.gms.internal.co;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gu;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.it;

@gw
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5312a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static d f5313b;
    private final com.google.android.gms.ads.internal.bpkg.a c = new com.google.android.gms.ads.internal.bpkg.a();
    private final com.google.android.gms.ads.internal.overlay.a d = new com.google.android.gms.ads.internal.overlay.a();
    private final h e = new h();
    private final gu f = new gu();
    private final hk g = new hk();
    private final it h = new it();
    private final hm i;
    private final gz j;
    private final com.google.android.gms.common.cpkg.a k;
    private final co l;
    private final gx m;
    private final i n;
    private final com.google.android.gms.ads.internal.apkg.h o;
    private final j p;
    private final g q;
    private final er r;
    private final ie s;
    private final es t;
    private final ek u;

    public static com.google.android.gms.ads.internal.overlay.a a() {
        return m().d;
    }

    public static h b() {
        return m().e;
    }

    public static hk c() {
        return m().g;
    }

    public static it d() {
        return m().h;
    }

    public static hm e() {
        return m().i;
    }

    public static gz f() {
        return m().j;
    }

    public static com.google.android.gms.common.cpkg.a g() {
        return m().k;
    }

    public static i h() {
        return m().n;
    }

    public static com.google.android.gms.ads.internal.apkg.h i() {
        return m().o;
    }

    public static j j() {
        return m().p;
    }

    public static g k() {
        return m().q;
    }

    public static ek l() {
        return m().u;
    }

    private static d m() {
        d dVar;
        synchronized (f5312a) {
            dVar = f5313b;
        }
        return dVar;
    }

    protected d() {
        int i = Build.VERSION.SDK_INT;
        this.i = i >= 19 ? new hu() : i >= 18 ? new hs() : i >= 17 ? new hr() : i >= 16 ? new ht() : i >= 14 ? new hq() : i >= 11 ? new ho() : i >= 9 ? new hn() : new hm();
        this.j = new gz();
        this.k = new f();
        this.l = new co();
        this.m = new gx();
        this.n = new i();
        this.o = new com.google.android.gms.ads.internal.apkg.h();
        this.p = new j();
        this.q = new g();
        this.r = new er();
        this.s = new ie();
        this.t = new es();
        this.u = new ek();
    }

    static {
        d dVar = new d();
        synchronized (f5312a) {
            f5313b = dVar;
        }
    }
}
