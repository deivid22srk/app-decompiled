package com.google.android.finsky;

import android.accounts.Account;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.SearchRecentSuggestions;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.a.a.aa;
import com.a.a.y;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.b.x;
import com.google.android.finsky.download.w;
import com.google.android.finsky.g.ah;
import com.google.android.finsky.receivers.AccountsChangedReceiver;
import com.google.android.finsky.receivers.BootCompletedReceiver;
import com.google.android.finsky.receivers.PackageMonitorReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.ak;
import com.google.android.finsky.utils.ar;
import com.google.android.finsky.utils.bf;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.db;
import com.google.android.finsky.utils.dd;
import com.google.android.finsky.utils.dl;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.gc;
import com.google.android.finsky.utils.hn;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.jj;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class FinskyApp extends Application {
    private static final Class<?>[] C = {BootCompletedReceiver.class, PackageMonitorReceiver.RegisteredReceiver.class, AccountsChangedReceiver.class};
    private static FinskyApp E;
    public SearchRecentSuggestions A;
    public int B;
    private s D;
    private com.google.android.vending.a.a.d F;
    private com.google.android.finsky.api.k G;
    private com.google.android.finsky.api.b H;
    private com.google.android.play.dfe.api.g J;
    private com.google.android.finsky.d.a N;
    private db O;
    private int P;

    /* renamed from: a, reason: collision with root package name */
    public com.android.volley.o f1434a;

    /* renamed from: b, reason: collision with root package name */
    public com.android.volley.a f1435b;
    public com.google.android.finsky.a.a c;
    public com.google.android.play.image.e d;
    public com.android.volley.o e;
    public com.android.volley.a f;
    public DfeToc g;
    public Account h;
    public PackageMonitorReceiver i;
    public com.google.android.finsky.receivers.f k;
    public com.google.android.finsky.installer.n l;
    public hn m;
    public dw n;
    public w o;
    public com.google.android.finsky.g.h p;
    public ah q;
    public com.google.android.finsky.b.s r;
    public com.google.android.finsky.b.a s;
    public com.google.android.finsky.b.c t;
    public com.google.android.finsky.api.m u;
    public x v;
    public jj w;
    public com.google.android.gms.ads.b.a x;
    public com.google.android.finsky.g.d y;
    public gc z;
    public final Map<String, com.google.android.finsky.api.b> j = new HashMap();
    private final Map<String, com.google.android.play.dfe.api.d> I = new HashMap();
    private final Map<String, ac> K = new HashMap();
    private final Map<String, com.google.android.finsky.a.i> L = new HashMap();
    private Map<String, com.google.android.finsky.d.d> M = new HashMap();

    public FinskyApp() {
        E = this;
    }

    public final void a(int i, int i2) {
        a(this.f1434a, i);
        com.google.android.play.image.e eVar = E.d;
        ArrayList arrayList = new ArrayList();
        for (String str : eVar.f6937a.keySet()) {
            if (eVar.f6937a.get(str).f6946a == null || eVar.f6937a.get(str).f6946a.a() < i2) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eVar.f6937a.remove((String) it.next());
        }
    }

    private static void a(com.android.volley.o oVar, int i) {
        oVar.a(new g(i));
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (Build.VERSION.SDK_INT < 21) {
            android.support.b.a.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0731  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.FinskyApp.onCreate():void");
    }

    private int n() {
        com.google.android.finsky.d.d e = e();
        int intValue = com.google.android.finsky.c.d.c.b().intValue();
        if (e.a(12603247L)) {
            return (int) (intValue * 0.5f);
        }
        if (e.a(12603248L)) {
            return (int) (intValue * 0.75f);
        }
        if (e.a(12603249L)) {
            return (int) (intValue * 1.0f);
        }
        if (e.a(12603250L)) {
            return (int) (intValue * 1.25f);
        }
        if (e.a(12603251L)) {
            return (int) (intValue * 1.5f);
        }
        return com.google.android.finsky.c.d.f2455b.b().intValue();
    }

    private void o() {
        PackageManager packageManager = getPackageManager();
        for (Class<?> cls : C) {
            try {
                ComponentName componentName = new ComponentName(this, cls);
                if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
            } catch (SecurityException e) {
                FinskyLog.e("Unable to enable %s", cls.getSimpleName());
            }
        }
    }

    private File g(String str) {
        File file = new File(getCacheDir(), str);
        file.mkdirs();
        return file;
    }

    private com.android.volley.i p() {
        com.android.volley.a.m cVar;
        if (!jm.a(this)) {
            return new ak();
        }
        com.google.android.finsky.d.d e = e();
        boolean a2 = e.a(12603642L);
        boolean z = e.a(12602748L) || e.a(12604235L) || e.a(12604236L);
        if (ic.b(this) || ((a2 || z) && com.google.android.finsky.c.d.eo.b().booleanValue())) {
            ArrayList a3 = cz.a(aa.HTTP_1_1);
            if (!a2) {
                a3.add(aa.SPDY_3);
            }
            y yVar = new y();
            List a4 = com.a.a.a.l.a(a3);
            if (!a4.contains(aa.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a4);
            }
            if (a4.contains(aa.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + a4);
            }
            if (a4.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            yVar.f = com.a.a.a.l.a(a4);
            yVar.u = false;
            cVar = new com.google.android.volley.ok.c(this, yVar, new com.google.android.volley.ok.h(this), null, com.google.android.finsky.c.d.T.b().booleanValue());
        } else {
            cVar = new com.google.android.volley.k(this, com.google.android.finsky.c.d.T.b().booleanValue());
        }
        return new com.android.volley.a.c(cVar, new com.android.volley.a.d(com.google.android.finsky.c.d.af.b().intValue() * 1024));
    }

    public static FinskyApp a() {
        return E;
    }

    public final synchronized ac a(String str) {
        ac acVar;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.e("No account specified.", new Object[0]);
        }
        acVar = this.K.get(str);
        if (acVar == null) {
            acVar = new ac(getApplicationContext(), str);
            this.K.put(str, acVar);
        }
        return acVar;
    }

    public final synchronized com.google.android.finsky.api.k b() {
        if (this.G == null) {
            this.G = new h(this);
        }
        return this.G;
    }

    public final synchronized com.google.android.play.dfe.api.g c() {
        if (this.J == null) {
            this.J = new i(this);
        }
        return this.J;
    }

    public final com.google.android.finsky.api.b b(String str) {
        com.google.android.finsky.api.b bVar;
        if (str == null && (str = j()) == null) {
            FinskyLog.c("No account configured on this device.", new Object[0]);
            return null;
        }
        synchronized (this.j) {
            bVar = this.j.get(str);
            com.google.android.finsky.d.d d = d(str);
            if (bVar == null) {
                int a2 = com.google.android.finsky.c.c.a(this).a();
                String a3 = bg.c.a();
                com.google.android.finsky.api.e eVar = new com.google.android.finsky.api.e(this, new com.android.volley.a.a(this, com.google.android.finsky.api.a.a(str, this), com.google.android.finsky.auth.g.a(d, 12604357L)), this.f1435b, d, this.u, Locale.getDefault(), ((TelephonyManager) getSystemService("phone")).getSimOperator(), com.google.android.finsky.api.d.r.b(), com.google.android.finsky.api.d.q.b(), a2, a3, this.x, f(str), Long.toHexString(com.google.android.finsky.api.d.p.b().longValue()), com.google.android.finsky.api.e.a(this), ar.a(this), null);
                FinskyLog.b("Created new context: %s", eVar);
                com.google.android.finsky.api.g gVar = new com.google.android.finsky.api.g(this.f1434a, eVar);
                this.j.put(str, gVar);
                bVar = gVar;
            }
        }
        return bVar;
    }

    public final synchronized com.google.android.finsky.api.b d() {
        if (this.H == null) {
            com.android.volley.a.ac acVar = new com.android.volley.a.ac();
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            this.H = new com.google.android.finsky.api.g(this.f1434a, new com.google.android.finsky.api.e(this, null, acVar, null, null, Locale.getDefault(), telephonyManager.getSimOperator(), com.google.android.finsky.api.d.r.b(), com.google.android.finsky.api.d.q.b(), 0, "", null, null, Long.toHexString(com.google.android.finsky.api.d.p.b().longValue()), com.google.android.finsky.api.e.a(this), null, null));
        }
        return this.H;
    }

    public final com.google.android.play.dfe.api.d a(Account account) {
        com.google.android.play.dfe.api.d dVar;
        if (account == null) {
            account = i();
        }
        if (account == null) {
            FinskyLog.c("No account configured on this device.", new Object[0]);
            return null;
        }
        synchronized (this.I) {
            dVar = this.I.get(account.name);
            if (dVar == null) {
                com.google.android.play.dfe.api.e a2 = com.google.android.play.dfe.api.e.a(this, getPackageName(), this.f1435b, account);
                FinskyLog.b("Created new PlayDfeApiContext: %s", a2);
                dVar = new com.google.android.play.dfe.api.f(this.f1434a, a2);
                this.I.put(account.name, dVar);
            }
        }
        return dVar;
    }

    public final com.google.android.vending.a.a.a c(String str) {
        Account a2 = com.google.android.finsky.api.a.a(str, this);
        if (a2 != null) {
            return b(a2);
        }
        FinskyLog.c("Account %s not configured on this device.", str);
        return null;
    }

    public final com.google.android.vending.a.a.a b(Account account) {
        return this.F.a(account);
    }

    public final synchronized com.google.android.finsky.d.d d(String str) {
        com.google.android.finsky.d.d dVar;
        dVar = this.M.get(str);
        if (dVar == null) {
            com.google.android.finsky.d.e[] eVarArr = {f(), jb.b(), new bf(), new dl()};
            dVar = ic.b(this) ? new com.google.android.finsky.d.f(str, eVarArr) : new com.google.android.finsky.d.d(str, eVarArr);
            this.M.put(str, dVar);
        }
        return dVar;
    }

    public final com.google.android.finsky.d.d e() {
        return d(j());
    }

    public final com.google.android.finsky.d.a f() {
        if (this.N == null) {
            this.N = new com.google.android.finsky.d.a(getApplicationContext());
        }
        return this.N;
    }

    public final db g() {
        if (this.O == null) {
            this.O = new db(getApplicationContext(), new dd(bg.aK));
        }
        return this.O;
    }

    public final com.google.android.finsky.a.a e(String str) {
        return new com.google.android.finsky.a.c(new Handler(Looper.getMainLooper()), b(str));
    }

    public final com.google.android.finsky.a.i c(Account account) {
        com.google.android.finsky.a.i iVar;
        synchronized (this.L) {
            String str = account == null ? null : account.name;
            iVar = this.L.get(str);
            if (iVar == null) {
                iVar = com.google.android.finsky.a.i.a(this, account, d(str), com.google.android.finsky.safemode.a.a());
                this.L.put(str, iVar);
            }
        }
        return iVar;
    }

    public final com.google.android.finsky.a.i f(String str) {
        Account account = null;
        if (!TextUtils.isEmpty(str)) {
            account = com.google.android.finsky.api.a.a(str, this);
        }
        return c(account);
    }

    public final com.google.android.finsky.a.i h() {
        return c(i());
    }

    public final void a(Runnable runnable) {
        j jVar = new j(this, runnable);
        this.f1434a.a(new com.android.volley.a.f(this.f1435b, jVar));
        this.e.a(new com.android.volley.a.f(this.f, jVar));
    }

    public final void b(Runnable runnable) {
        this.f1434a.a(new com.android.volley.a.f(this.f1435b, runnable));
    }

    public final Account i() {
        if (this.h == null) {
            Account a2 = com.google.android.finsky.api.a.a(this, bg.f);
            if (a2 == null) {
                FinskyLog.c("No account configured on this device.", new Object[0]);
                return null;
            }
            this.h = a2;
        }
        return this.h;
    }

    public final String j() {
        Account i = i();
        if (i != null) {
            return i.name;
        }
        return null;
    }

    public final void a(DfeToc dfeToc) {
        boolean z = this.g == null;
        this.g = dfeToc;
        if (this.g == null) {
            return;
        }
        com.google.android.finsky.c.n<String> nVar = bg.ah;
        boolean z2 = a(nVar.a(4), dfeToc.b(4)) || (a(nVar.a(1), dfeToc.b(1)) || (a(nVar.a(2), dfeToc.b(2)) || (a(nVar.a(6), dfeToc.b(6)) || (a(nVar.a(3), dfeToc.b(3)) || a(nVar.a(0), dfeToc.f1961a.x)))));
        if (z || z2) {
            sendBroadcast(new Intent("com.google.android.finsky.action.TOC_SET"));
        }
        com.google.android.play.utils.h.a(this.g.f1961a.J == 1);
    }

    private static boolean a(com.google.android.finsky.c.o<String> oVar, String str) {
        if (TextUtils.equals(oVar.a(), str)) {
            return false;
        }
        oVar.a((com.google.android.finsky.c.o<String>) str);
        return true;
    }

    public final synchronized int k() {
        if (this.P == 0) {
            try {
                this.P = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                FinskyLog.d("Could not find com.deivid22srk.store package", e);
            }
        }
        return this.P;
    }

    public final s l() {
        if (this.D == null) {
            this.D = new s();
        }
        return this.D;
    }

    public static void a(com.android.volley.o oVar) {
        a(oVar, oVar.f1251a.incrementAndGet());
    }
}
