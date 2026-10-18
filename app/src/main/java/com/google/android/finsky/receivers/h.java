package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.installer.MultiUserCoordinatorService;
import com.google.android.finsky.protos.hr;
import com.google.android.finsky.protos.in;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.dt;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.jj;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements com.google.android.finsky.download.aj, aq, f {
    private static final g t = new g(0, 0, 0, 0);
    private static final g u = new g(1, 0, 0, 0);
    private static final g v = new g(2, 0, 0, 196);
    private static final g w = new g(4, 0, 0, 0);
    private final Context c;
    private final com.google.android.finsky.bpkg.a d;
    private final com.google.android.finsky.gpkg.h e;
    private final com.google.android.finsky.download.w f;
    private final dw g;
    private final com.google.android.finsky.installer.n h;
    private final PackageMonitorReceiver i;
    private final com.google.android.finsky.bpkg.s j;
    private final jj l;
    private final com.google.android.finsky.installer.s m;
    private u p;
    private com.google.android.finsky.installer.h y;

    /* renamed from: a, reason: collision with root package name */
    Map<String, s> f4478a = new HashMap();
    private final BroadcastReceiver s = new i(this);
    private t x = null;
    private ArrayList<Runnable> z = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    com.google.android.finsky.installer.k f4479b = new q(this);
    private final List<com.google.android.finsky.installer.p> n = new ArrayList();
    private final Handler k = new Handler(Looper.getMainLooper());
    private boolean o = false;
    private Set<String> q = new HashSet();
    private List<String> r = new ArrayList();

    static /* synthetic */ boolean f(h hVar) {
        hVar.o = true;
        return true;
    }

    public h(Context context, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.gpkg.h hVar, com.google.android.finsky.download.w wVar, dw dwVar, com.google.android.finsky.installer.n nVar, PackageMonitorReceiver packageMonitorReceiver, jj jjVar, com.google.android.finsky.installer.s sVar) {
        this.c = context;
        this.d = aVar;
        this.e = hVar;
        this.f = wVar;
        this.g = dwVar;
        this.h = nVar;
        this.i = packageMonitorReceiver;
        this.l = jjVar;
        this.m = sVar;
        this.j = aVar.f2060a;
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(Runnable runnable) {
        this.g.b();
        this.f.a(this);
        this.i.a(this);
        this.c.registerReceiver(this.s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        new j(this, runnable).execute(new Void[0]);
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(String str, String str2) {
        if (this.m.a(str)) {
            FinskyLog.c("Promising install for already-existing session for %s", str);
            this.m.b(str);
        }
        this.m.a(str, 0L, str2, a(0));
    }

    public static int a(int i) {
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 2;
            default:
                return 1;
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(String str, int i, String str2, String str3, boolean z, String str4, int i2, in inVar) {
        int i3;
        int i4;
        u.a("requestInstall", str, str3, (com.google.android.finsky.bpkg.t) null);
        if (i(str) != 0) {
            FinskyLog.a("Dropping install request for %s because already installing", str);
            return;
        }
        com.google.android.finsky.bpkg.b a2 = this.d.a(str);
        com.google.android.finsky.bpkg.y yVar = a2 != null ? a2.c : null;
        int i5 = yVar != null ? yVar.c : -1;
        com.google.android.finsky.apkg.n nVar = new com.google.android.finsky.apkg.n();
        nVar.f1490a = i;
        nVar.f1491b = true;
        if (i5 >= 0) {
            nVar.c = i5;
            nVar.d = true;
        }
        if (yVar != null) {
            nVar.e = a2.c.d;
            nVar.f = true;
        }
        if (i <= i5) {
            FinskyLog.d("Skipping attempt to download %s version %d over version %d", str, Integer.valueOf(i), Integer.valueOf(i5));
            this.m.b(str);
            FinskyApp.a().h().a(112, str, "older-version", 0, (String) null, nVar);
            if (a2.d == null) {
                i4 = 0;
            } else {
                i4 = a2.d.m;
            }
            if ((i4 & 1) == 0) {
                this.g.a(str3, str, -1);
                return;
            }
            return;
        }
        FinskyLog.a("Request install of %s v=%d pri=%d for %s", str, Integer.valueOf(i), Integer.valueOf(i2), str4);
        FinskyApp.a().h().a(105, str, str4, 0, (String) null, nVar);
        if (!this.m.a(str)) {
            this.m.a(str, inVar != null ? inVar.c : 0L, str3, a(inVar != null ? inVar.f3959a : 0));
        }
        com.google.android.finsky.bpkg.t tVar = a2 != null ? a2.d : null;
        com.google.android.finsky.bpkg.u a3 = com.google.android.finsky.bpkg.u.a(tVar, str);
        a3.b(i);
        a3.c(i);
        a3.c(str2);
        a3.d(str3);
        a3.a((com.google.android.finsky.protos.aa) null, 0L);
        a3.d(0);
        a3.a((String) null);
        a3.b((String[]) null);
        if (tVar == null) {
            i3 = 0;
        } else {
            i3 = tVar.m;
        }
        int i6 = i3 & (-13) & (-1537) & (-12289) & (-49153);
        if (i2 == 1) {
            i6 |= 16384;
            this.r.add(0, str);
        } else if (i2 == 2) {
            i6 |= 32768;
            this.r.add(str);
        }
        a3.e(i6);
        this.j.a(a3.f2132a);
        a(str, 0, 0);
        if (!z) {
            a(false);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(String str, int i, String str2, String str3, boolean z, int i2, in inVar) {
        com.google.android.finsky.bpkg.b a2;
        u.a("updateSingleInstalledApp", str, str2, (com.google.android.finsky.bpkg.t) null);
        if (!com.google.android.finsky.bpkg.l.a(str) && ((a2 = this.d.a(str)) == null || a2.c == null)) {
            FinskyLog.a("Cannot update %s because not installed.", str);
            this.m.b(str);
            return;
        }
        String a3 = com.google.android.finsky.activities.a.a(str, FinskyApp.a().j(), this.d, this.e);
        if (TextUtils.isEmpty(a3)) {
            FinskyLog.a("Cannot update %s because cannot determine update account.", str);
            this.m.b(str);
        } else {
            a(str, i, a3, str2, z, str3, i2, inVar);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(String str) {
        com.google.android.finsky.bpkg.ab abVar = this.d.f2060a;
        com.google.android.finsky.bpkg.t a2 = abVar.a(str);
        int i = 0;
        if (a2 != null) {
            i = a2.m;
        }
        int i2 = (i | 2) & (-2049);
        if (i2 != i) {
            abVar.d(str, i2);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void e(String str) {
        com.google.android.finsky.bpkg.ab abVar = this.d.f2060a;
        com.google.android.finsky.bpkg.t a2 = abVar.a(str);
        int i = 0;
        if (a2 != null) {
            i = a2.m;
        }
        int i2 = (i | 2048) & (-3);
        if (i2 != i) {
            abVar.d(str, i2);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(String str, boolean z, boolean z2, boolean z3) {
        int i;
        com.google.android.finsky.bpkg.ab abVar = this.d.f2060a;
        com.google.android.finsky.bpkg.t a2 = abVar.a(str);
        if (a2 == null) {
            i = 0;
        } else {
            i = a2.m;
        }
        int i2 = i & (-146);
        if (!z) {
            i2 |= 16;
        }
        if (!z2) {
            i2 |= 1;
        }
        if (!z3) {
            i2 |= 128;
        }
        if (i2 != i) {
            abVar.d(str, i2);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void f(String str) {
        a(str, 65536);
    }

    @Override // com.google.android.finsky.receivers.f
    public final void g(String str) {
        a(str, 131072);
    }

    private void a(String str, int i) {
        com.google.android.finsky.bpkg.ab abVar = this.d.f2060a;
        com.google.android.finsky.bpkg.t a2 = abVar.a(str);
        int i2 = 0;
        if (a2 != null) {
            i2 = a2.m;
        }
        int i3 = i2 | i;
        if (i3 != i2) {
            abVar.d(str, i3);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void b(String str, String str2) {
        this.d.f2060a.d(str, str2);
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a() {
        a(true);
    }

    @Override // com.google.android.finsky.receivers.f
    public final void k(String str) {
        u n = n(str);
        if (n != null) {
            n.a(true);
        } else {
            com.google.android.finsky.bpkg.b a2 = this.d.a(str);
            if (a2 != null) {
                String str2 = a2.f2104a;
                FinskyLog.a("Cancel pending install of %s", str2);
                this.m.b(str2);
                if (a2.d != null) {
                    a(a2, true);
                    a(str2, 2, 0);
                }
            }
        }
        a(true);
    }

    final void a(com.google.android.finsky.bpkg.b bVar, boolean z) {
        if (bVar != null && bVar.d != null) {
            com.google.android.finsky.bpkg.u a2 = com.google.android.finsky.bpkg.u.a(bVar.d, bVar.f2104a);
            a2.d(0);
            if (z) {
                a2.b(-1);
                a2.a((String) null);
                a2.e(0);
                a2.g((String) null);
            }
            a2.b((String[]) null);
            a2.h(null);
            this.j.a(a2.f2132a);
        }
    }

    private boolean a(Uri uri, int i) {
        String uri2;
        com.google.android.finsky.bpkg.t tVar;
        boolean z;
        if (uri != null) {
            try {
                uri2 = uri.toString();
            } catch (Exception e) {
                FinskyLog.c("Caught exception while recovering %s: %s", uri, e);
                return false;
            }
        } else {
            uri2 = null;
        }
        if (TextUtils.isEmpty(uri2)) {
            return false;
        }
        if (this.p != null) {
            FinskyLog.c("tried recovery while already handling %s", this.p.e);
            return false;
        }
        Iterator<com.google.android.finsky.bpkg.t> it = this.d.f2060a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                tVar = null;
                break;
            }
            tVar = it.next();
            if (uri2.equals(tVar.h)) {
                break;
            }
        }
        if (tVar == null) {
            return false;
        }
        String str = tVar.f2130a;
        FinskyLog.a("Recovering download for running %s", str);
        if (b()) {
            try {
                if (!this.y.a(str)) {
                    FinskyLog.c("Can't recover %s *** cannot acquire", str);
                    return false;
                }
            } catch (RemoteException e2) {
                FinskyLog.c("Acquiring %s *** received %s", str, e2);
            }
        }
        u uVar = new u(str, this, this.d, this.f, this.g, this.h, this.m);
        com.google.android.finsky.bpkg.b a2 = uVar.f4498a.a(uVar.e);
        com.google.android.finsky.bpkg.t tVar2 = a2.d;
        if (tVar2 == null || tVar2.e == null) {
            FinskyLog.a("Recovery of %s skipped because incomplete installerdata", uVar.e);
            z = false;
        } else {
            uVar.g = -1L;
            uVar.a(a2);
            uVar.a(tVar2, false);
            uVar.a(tVar2);
            int i2 = tVar2.g;
            if (uVar.n == null) {
                if (i2 == 25) {
                    uVar.n = "..obb_main";
                } else if (i2 == 35) {
                    uVar.n = "..obb_patch";
                }
            }
            if (TextUtils.isEmpty(uVar.n)) {
                FinskyLog.a("Recovery of %s skipped because missing mActiveDownloadId", uVar.e);
                z = false;
            } else {
                int i3 = a2.c != null ? a2.c.c : -1;
                int i4 = tVar2.c;
                uVar.m = i2;
                switch (i2) {
                    case 25:
                    case 35:
                    case 45:
                    case 50:
                        if (i4 <= i3) {
                            FinskyLog.a("Recovery of %s (%s) skipped because desired= %d installed= %d", uVar.e, uVar.n, Integer.valueOf(i4), Integer.valueOf(i3));
                            z = false;
                            break;
                        } else {
                            if (!((i >= 200 && i < 300) || (i >= 400 && i < 600)) && i != 198) {
                                FinskyLog.a("Recovery of %s (%s) into downloading APK state", uVar.e, uVar.n);
                                uVar.a(uVar.n, a2.d);
                                uVar.a(a2.d, new v(uVar, uri));
                                z = true;
                                break;
                            } else if (com.google.android.finsky.download.f.a(i)) {
                                FinskyLog.a("Recovery of %s (%s) into postprocess state", uVar.e, uVar.n);
                                uVar.b(50, uri.toString());
                                uVar.b();
                                z = true;
                                break;
                            } else {
                                FinskyLog.a("Recovery of %s (%s) into error state, status= %d", uVar.e, uVar.n, Integer.valueOf(i));
                                uVar.a(false);
                                uVar.a(uVar.e, i);
                                z = false;
                                break;
                            }
                        }
                        break;
                    case 52:
                    case 58:
                        FinskyLog.a("Recovery of %s (%s) skipped because state= %d", uVar.e, uVar.n, Integer.valueOf(i2));
                        uVar.a(a2, true);
                        z = false;
                        break;
                    case 55:
                        FinskyLog.a("Recovery of %s (%s) skipped because state= %d", uVar.e, uVar.n, Integer.valueOf(i2));
                        uVar.a(a2, true);
                        z = false;
                        break;
                    case 57:
                        FinskyLog.a("Recovery of %s (%s) skipped because state= %d", uVar.e, uVar.n, Integer.valueOf(i2));
                        uVar.a(a2, true);
                        z = false;
                        break;
                    case 60:
                        if (i4 < i3) {
                            FinskyLog.a("Recovery of %s skipped because desired= %d installed= %d", uVar.e, Integer.valueOf(i4), Integer.valueOf(i3));
                            z = false;
                            break;
                        } else if (i4 == i3) {
                            FinskyLog.a("Recovery of %s - installation seems complete", uVar.e);
                            uVar.b(70, uri.toString());
                            uVar.b();
                            z = false;
                            break;
                        } else {
                            FinskyLog.a("Recovery of %s with incomplete installation", uVar.e);
                            uVar.a(false);
                            uVar.a(8, i);
                            z = false;
                            break;
                        }
                    default:
                        FinskyLog.a("Recovery of %s (%s) skipped because state= %d", uVar.e, uVar.n, Integer.valueOf(i2));
                        z = false;
                        break;
                }
            }
        }
        if (z) {
            this.p = uVar;
            return true;
        }
        if (b()) {
            try {
                this.y.b(str);
            } catch (RemoteException e3) {
                FinskyLog.c("Releasing %s *** received %s", str, e3);
            }
        }
        return false;
    }

    @Override // com.google.android.finsky.receivers.f
    public final void b(String str, boolean z) {
        PackageInfo packageInfo;
        com.google.android.finsky.apkg.n nVar;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Unexpected empty package name", new Object[0]);
            return;
        }
        u n = n(str);
        if (n != null) {
            n.a(true);
        }
        try {
            packageInfo = this.c.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            nVar = new com.google.android.finsky.apkg.n();
            nVar.c = packageInfo.versionCode;
            nVar.d = true;
            nVar.e = (packageInfo.applicationInfo.flags & 1) != 0;
            nVar.f = true;
        } else {
            nVar = null;
        }
        FinskyApp.a().h().a(114, str, (String) null, 0, (String) null, nVar);
        if (this.j.a(str) != null) {
            this.j.b(str, -1);
        }
        try {
            this.c.getPackageManager().getPackageInfo(str, 0);
            this.q.add(str);
            a(str, 7, 0);
            com.google.android.finsky.installer.u.f2871a.a(str, z);
        } catch (PackageManager.NameNotFoundException e2) {
            FinskyLog.a("Skipping uninstall of %s - already uninstalled.", str);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void h(String str) {
        PackageManager packageManager = this.c.getPackageManager();
        try {
            String[] packagesForUid = packageManager.getPackagesForUid(packageManager.getPackageInfo(str, 0).applicationInfo.uid);
            for (String str2 : packagesForUid) {
                FinskyLog.a("Removing package '%s' (child of '%s')", str2, str);
                b(str2, true);
            }
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.a("Skipping uninstall of %s - already uninstalled.", str);
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final int i(String str) {
        return j(str).f4476a;
    }

    @Override // com.google.android.finsky.receivers.f
    public final g j(String str) {
        char c = 0;
        u n = n(str);
        if (n == null) {
            if (this.q.contains(str)) {
                return w;
            }
            com.google.android.finsky.bpkg.b a2 = this.d.a(str);
            if (a2 != null) {
                int i = -1;
                if (a2.c != null) {
                    i = a2.c.c;
                }
                if (a2.d != null && a2.d.c > i) {
                    if (b(a2, this.h.c())) {
                        return v;
                    }
                    return u;
                }
            }
            return t;
        }
        com.google.android.finsky.bpkg.b a3 = n.f4498a.a(n.e);
        if (a3 != null && a3.d != null) {
            switch (a3.d.g) {
                case 0:
                case 70:
                case 80:
                    break;
                case 52:
                case 55:
                case 57:
                case 60:
                    c = 3;
                    break;
                default:
                    c = 2;
                    break;
            }
        }
        switch (c) {
            case 0:
                return u.p;
            case 1:
            case 2:
            default:
                return new g(2, n.d(), n.h, n.i);
            case 3:
                return u.q;
        }
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(com.google.android.finsky.installer.p pVar) {
        jm.a();
        this.n.add(pVar);
    }

    @Override // com.google.android.finsky.receivers.f
    public final void b(com.google.android.finsky.installer.p pVar) {
        jm.a();
        this.n.remove(pVar);
    }

    final void a(String str, int i, int i2) {
        this.k.post(new l(this, str, i, i2));
    }

    private void a(com.google.android.finsky.download.b bVar, com.google.android.finsky.apkg.n nVar) {
        if (nVar != null) {
            com.google.android.finsky.download.r l = bVar.l();
            if (l != null) {
                nVar.r = true;
                nVar.q = l.f2732b;
            }
            nVar.v = true;
            nVar.u = this.h.c() ? false : true;
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        char c;
        u e = e(bVar);
        if (bVar.b() == null) {
            com.google.android.finsky.apkg.n nVar = e == null ? null : e.k;
            a(bVar, nVar);
            FinskyApp.a().h().a(101, bVar.p(), (String) null, 0, (String) null, nVar);
        }
        if (e != null) {
            String a2 = bVar.a();
            com.google.android.finsky.bpkg.t tVar = e.f4498a.a(a2).d;
            switch (tVar.g) {
                case 20:
                case 25:
                case 30:
                case 35:
                case 40:
                case 45:
                    c = '-';
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c >= 0) {
                e.a(45, bVar.k());
                e.a(1, 0);
            } else {
                FinskyLog.d("Unexpected download start states for %s (%s): %d %d", a2, e.n, Integer.valueOf(tVar.g), -1);
                e.a(false);
                e.a(a2, 903);
            }
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(com.google.android.finsky.download.b bVar) {
        char c;
        u e = e(bVar);
        if (bVar.b() == null) {
            com.google.android.finsky.apkg.n nVar = e == null ? null : e.k;
            a(bVar, nVar);
            FinskyApp.a().h().a(102, bVar.p(), (String) null, 0, (String) null, nVar);
        }
        if (e != null) {
            if (e.g >= 0) {
                e.g += bVar.l().f2732b;
            }
            com.google.android.finsky.bpkg.t tVar = e.f4498a.a(e.e).d;
            switch (tVar.g) {
                case 25:
                case 35:
                case 45:
                    c = '2';
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c >= 0) {
                e.a(50, bVar.k());
                e.b();
            } else {
                FinskyLog.d("Unexpected download completion states for %s (%s): %d %d", e.e, e.n, Integer.valueOf(tVar.g), -1);
                e.a(false);
                e.a(e.e, 904);
            }
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(com.google.android.finsky.download.b bVar) {
        u e = e(bVar);
        if (bVar.b() == null) {
            com.google.android.finsky.apkg.n nVar = e == null ? null : e.k;
            a(bVar, nVar);
            FinskyApp.a().h().a(103, bVar.p(), (String) null, 0, (String) null, nVar);
        }
        if (e != null) {
            e.a(true);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, int i) {
        u e = e(bVar);
        if (bVar.b() == null) {
            com.google.android.finsky.apkg.n nVar = e == null ? null : e.k;
            a(bVar, nVar);
            FinskyApp.a().h().a(104, bVar.p(), (String) null, i, (String) null, nVar);
        }
        if (e != null) {
            if (i == 420 || (i >= 500 && i <= 599)) {
                if (e.b(4, 8)) {
                    if (e.g >= 0) {
                        e.g = -1L;
                        return;
                    }
                    return;
                } else if (e.b(512, 1024)) {
                    if (e.g >= 0) {
                        e.g = -1L;
                        return;
                    }
                    return;
                }
            }
            if (e.g >= 0) {
                e.g += bVar.l().f2732b;
            }
            e.a(i);
            e.a(false);
            if (i == 198) {
                if (e.j) {
                    e.a(e.n, e.c.a(e.e).e);
                    if (e.o != null && e.o.e()) {
                        e.f4499b.b(e.l, e.e);
                    } else {
                        e.f4499b.a(e.l, e.e);
                    }
                }
            } else {
                e.a(i, (String) null);
            }
            e.a(3, i);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, com.google.android.finsky.download.r rVar) {
        u e = e(bVar);
        if (e != null) {
            com.google.android.finsky.apkg.n nVar = e.k;
            if (nVar != null && FinskyApp.a().e().a(12606007L)) {
                if (nVar.u != (!this.h.c())) {
                    a(bVar, nVar);
                    FinskyApp.a().h().a(138, bVar.p(), (String) null, 0, (String) null, nVar);
                }
            }
            e.f = rVar.f2732b;
            if (rVar.f2732b > 0 && e.f4498a.f2060a.a(e.e).j == 0) {
                e.c.a(e.e, System.currentTimeMillis());
            }
            e.i = rVar.d;
            e.a(1, 0);
            e.d.a(e.e, e.d(), e.h);
        }
        if (rVar.d == 196) {
            a(true);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(com.google.android.finsky.download.b bVar) {
        String a2 = bVar.a();
        if (a2 == null) {
            FinskyLog.a("Discarding notification click, no packageName for %s", bVar);
            return;
        }
        Intent a3 = dt.a(this.c, a2, (String) null, (String) null, com.google.android.finsky.api.s.a(a2));
        a3.setFlags(268435456);
        this.c.startActivity(a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        com.google.android.finsky.bpkg.b bVar;
        if (z) {
            this.k.post(new m(this));
            return;
        }
        if (!this.o) {
            FinskyLog.a("Installer kick - no action, not running yet", new Object[0]);
            return;
        }
        if (!b()) {
            boolean c = this.h.c();
            if (this.p == null) {
                bVar = null;
            } else if (b(this.d.a(this.p.e), c) && (bVar = a(this.d.a(), this.r, c)) != null) {
                u uVar = this.p;
                uVar.a(uVar.f4498a.a(uVar.e), false);
                this.p = null;
            } else {
                return;
            }
            com.google.android.finsky.bpkg.b a2 = bVar == null ? a(this.d.a(), this.r, c) : bVar;
            if (a2 != null) {
                FinskyLog.a("Installer kick - starting %s", a2.f2104a);
                this.p = new u(a2.f2104a, this, this.d, this.f, this.g, this.h, this.m);
                this.p.a();
                return;
            }
            return;
        }
        if (this.p == null) {
            List<com.google.android.finsky.bpkg.b> a3 = this.d.a();
            if (!a3.isEmpty()) {
                if (this.y == null) {
                    b(new o(this));
                    return;
                }
                com.google.android.finsky.bpkg.b a4 = a(a3, this.r, this.y);
                if (a4 == null) {
                    return;
                }
                FinskyLog.a("Installer kick - starting %s", a4.f2104a);
                this.p = new u(a4.f2104a, this, this.d, this.f, this.g, this.h, this.m);
                this.p.a();
                return;
            }
            jm.a();
            if (this.x == null) {
                return;
            }
            try {
                if (this.y != null) {
                    this.y.a((com.google.android.finsky.installer.k) null);
                    this.y.a();
                }
            } catch (RemoteException e) {
                FinskyLog.c("Couldn't sign out from coordinator *** received %s", e);
            }
            this.y = null;
            this.c.unbindService(this.x);
            this.x = null;
        }
    }

    private boolean b(com.google.android.finsky.bpkg.b bVar, boolean z) {
        com.google.android.finsky.download.b a2 = this.f.a(bVar.f2104a, null);
        if (a2 == null || a2.l() == null) {
            return !z && ((bVar.d.m & 2048) != 0);
        }
        return a2.l().d == 196;
    }

    private com.google.android.finsky.bpkg.b a(List<com.google.android.finsky.bpkg.b> list, List<String> list2, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        a(list, list2);
        HashSet hashSet = new HashSet();
        Set<String> a2 = com.google.android.finsky.installer.n.a(this.c);
        for (com.google.android.finsky.bpkg.b bVar : list) {
            if (!b(bVar, z)) {
                if (!a(bVar) && a2.contains(bVar.f2104a)) {
                    FinskyLog.a("Installer - skip %s, the app is in foreground", bVar.f2104a);
                    hashSet.add(bVar);
                } else {
                    list2.remove(bVar.f2104a);
                    return bVar;
                }
            }
        }
        a(hashSet);
        return null;
    }

    private static boolean a(com.google.android.finsky.bpkg.b bVar) {
        return (bVar.d.m & 180224) != 0;
    }

    private com.google.android.finsky.bpkg.b a(List<com.google.android.finsky.bpkg.b> list, List<String> list2, com.google.android.finsky.installer.h hVar) {
        a(list, list2);
        Set<String> a2 = com.google.android.finsky.installer.n.a(this.c);
        a2.removeAll(list2);
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            com.google.android.finsky.bpkg.b bVar = list.get(i);
            try {
                if (!a(bVar) && a2.contains(bVar.f2104a)) {
                    FinskyLog.a("Installer - skip %s, the app is in foreground", bVar.f2104a);
                    hashSet.add(bVar);
                } else {
                    if (hVar.a(bVar.f2104a)) {
                        list2.remove(bVar.f2104a);
                        return bVar;
                    }
                    FinskyLog.a("Skipping install of %s - not acquired", bVar.f2104a);
                }
            } catch (RemoteException e) {
                FinskyLog.c("Couldn't acquire %s (proceed anyway) received %s", bVar.f2104a, e);
                return bVar;
            }
        }
        a(hashSet);
        return null;
    }

    private void a(List<com.google.android.finsky.bpkg.b> list, List<String> list2) {
        boolean z;
        for (int size = list2.size() - 1; size >= 0; size--) {
            String str = list2.get(size);
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    if (!list.get(i).f2104a.equals(str)) {
                        i++;
                    } else {
                        list.add(0, list.remove(i));
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                FinskyLog.a("Priority package %s no longer installable", str);
                list2.remove(size);
            }
        }
        if (FinskyApp.a().e().a(12605214L)) {
            Collections.sort(list, new n(this));
        }
    }

    private void a(Collection<com.google.android.finsky.bpkg.b> collection) {
        for (com.google.android.finsky.bpkg.b bVar : collection) {
            a(bVar, true);
            FinskyApp.a().h().a(111, bVar.f2104a, "foreground", 978, (String) null, (com.google.android.finsky.apkg.n) null);
            a(bVar.f2104a, 5, 978);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.l.f5029a.a();
    }

    private u n(String str) {
        if (this.p == null || !this.p.e.equals(str)) {
            return null;
        }
        return this.p;
    }

    private u e(com.google.android.finsky.download.b bVar) {
        String a2;
        if (bVar.b() != null || (a2 = bVar.a()) == null) {
            return null;
        }
        u n = n(a2);
        if (n == null) {
            this.f.g(bVar);
            return null;
        }
        com.google.android.finsky.bpkg.b a3 = this.d.a(a2);
        if (a3 != null && a3.d != null) {
            return n;
        }
        this.f.g(bVar);
        return null;
    }

    final void a(u uVar) {
        if (this.p != null && uVar != this.p) {
            FinskyLog.e("Unexpected (late?) finish of task for %s", uVar.e);
        }
        this.p = null;
        if (b()) {
            b(new p(this, uVar.e));
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Runnable runnable) {
        jm.a();
        if (this.y != null) {
            runnable.run();
            return;
        }
        this.z.add(runnable);
        if (this.x == null) {
            this.x = new t(this);
            Intent a2 = MultiUserCoordinatorService.a(this.c);
            if (!this.c.bindService(a2, this.x, 5)) {
                FinskyLog.c("Couldn't start service for %s", a2);
            }
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        this.g.d(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r2.c.c < r3.c) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // com.google.android.finsky.receivers.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r5 = -1
            if (r8 == 0) goto L3c
            com.google.android.finsky.utils.dw r2 = r6.g
            r2.b()
        La:
            java.util.Set<java.lang.String> r2 = r6.q
            r2.remove(r7)
            com.google.android.finsky.bpkg.a r2 = r6.d
            com.google.android.finsky.bpkg.b r2 = r2.a(r7)
            if (r2 == 0) goto L36
            com.google.android.finsky.bpkg.t r3 = r2.d
            if (r3 == 0) goto L36
            com.google.android.finsky.bpkg.t r3 = r2.d
            int r4 = r3.c
            if (r4 == r5) goto L47
            if (r8 == 0) goto L2f
            com.google.android.finsky.bpkg.y r4 = r2.c
            if (r4 == 0) goto L2f
            int r3 = r3.c
            com.google.android.finsky.bpkg.y r2 = r2.c
            int r2 = r2.c
            if (r2 >= r3) goto L47
        L2f:
            if (r0 == 0) goto L36
            com.google.android.finsky.bpkg.s r0 = r6.j
            r0.b(r7, r5)
        L36:
            r0 = 8
            r6.a(r7, r0, r1)
            return
        L3c:
            com.google.android.finsky.utils.dw r2 = r6.g
            r2.b(r7)
            com.google.android.finsky.utils.dw r2 = r6.g
            r2.c(r7)
            goto La
        L47:
            r0 = r1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.receivers.h.a(java.lang.String, boolean):void");
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }

    @Override // com.google.android.finsky.receivers.f
    public final void a(Document document) {
        com.google.android.finsky.protos.ag E;
        long j;
        hr hrVar;
        if (FinskyApp.a().e().a(12605260L) && (E = document.E()) != null) {
            hr hrVar2 = null;
            hr hrVar3 = null;
            hr[] hrVarArr = E.C;
            int length = hrVarArr.length;
            int i = 0;
            hr hrVar4 = null;
            while (i < length) {
                hr hrVar5 = hrVarArr[i];
                switch (hrVar5.f3924a) {
                    case 0:
                        if (TextUtils.isEmpty(hrVar5.j)) {
                            hr hrVar6 = hrVar3;
                            hrVar = hrVar5;
                            hrVar5 = hrVar6;
                            break;
                        }
                        break;
                    case 1:
                        hrVar = hrVar2;
                        continue;
                    case 2:
                        hrVar4 = hrVar5;
                        hrVar5 = hrVar3;
                        hrVar = hrVar2;
                        continue;
                }
                hrVar5 = hrVar3;
                hrVar = hrVar2;
                i++;
                hrVar2 = hrVar;
                hrVar3 = hrVar5;
            }
            if (hrVar2 != null) {
                l(E.w);
                long j2 = 0;
                String str = "";
                if (hrVar2.h && hrVar2.g > 0) {
                    j2 = hrVar2.g;
                    str = "compressed";
                }
                if (j2 == 0) {
                    j2 = hrVar2.e;
                    str = "plain";
                }
                boolean z = this.d.f2061b.a(E.w) != null;
                if (hrVar3 != null) {
                    boolean z2 = false;
                    if (!z) {
                        z2 = true;
                    } else {
                        com.google.android.finsky.download.apkg.a a2 = com.google.android.finsky.download.apkg.c.a(false, E.w, hrVar3.c, hrVar3.e);
                        a2.e();
                        if (a2.d() != 3) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        j2 += (!hrVar3.h || hrVar3.g <= 0) ? hrVar3.e : hrVar3.g;
                    }
                }
                if (hrVar4 != null) {
                    boolean z3 = false;
                    if (!z) {
                        z3 = true;
                    } else {
                        com.google.android.finsky.download.apkg.a a3 = com.google.android.finsky.download.apkg.c.a(true, E.w, hrVar4.c, hrVar4.e);
                        a3.e();
                        if (a3.d() != 3) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        j = ((!hrVar4.h || hrVar4.g <= 0) ? hrVar4.e : hrVar4.g) + j2;
                        FinskyLog.a("For %s %d predicting total download size %d because %s", E.w, Integer.valueOf(E.e), Long.valueOf(j), str);
                        this.f4478a.put(E.w, new s(E.e, j, (byte) 0));
                    }
                }
                j = j2;
                FinskyLog.a("For %s %d predicting total download size %d because %s", E.w, Integer.valueOf(E.e), Long.valueOf(j), str);
                this.f4478a.put(E.w, new s(E.e, j, (byte) 0));
            }
        }
    }

    public final void l(String str) {
        this.f4478a.remove(str);
    }

    static /* synthetic */ void m(String str) {
        File[] listFiles;
        File file = new File(FinskyApp.a().getCacheDir(), str);
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            file2.delete();
        }
    }

    static /* synthetic */ void a(h hVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.finsky.bpkg.b bVar = (com.google.android.finsky.bpkg.b) it.next();
            int i = bVar.d.m;
            if ((i & 16384) != 0) {
                hVar.r.add(0, bVar.f2104a);
            } else if ((i & 32768) != 0) {
                hVar.r.add(bVar.f2104a);
            }
        }
    }

    static /* synthetic */ void b(h hVar, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.android.finsky.download.r rVar = (com.google.android.finsky.download.r) it.next();
            FinskyLog.a("Attempt recovery of %s %d", rVar.f2731a, Integer.valueOf(rVar.d));
            if (z || !hVar.a(rVar.f2731a, rVar.d)) {
                FinskyLog.a("Releasing %s %d", rVar.f2731a, Integer.valueOf(rVar.d));
                hVar.f.b(rVar.f2731a);
            } else {
                z = true;
            }
        }
    }

    static /* synthetic */ void e(h hVar) {
        List<com.google.android.finsky.bpkg.b> a2 = hVar.d.a();
        ArrayList a3 = cz.a(a2.size());
        Iterator<com.google.android.finsky.bpkg.b> it = a2.iterator();
        while (it.hasNext()) {
            a3.add(it.next().f2104a);
        }
        hVar.m.a(a3);
    }
}
