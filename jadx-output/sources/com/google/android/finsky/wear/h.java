package com.google.android.finsky.wear;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class h implements com.google.android.finsky.download.aj {

    /* renamed from: a, reason: collision with root package name */
    final a f5127a;

    /* renamed from: b, reason: collision with root package name */
    final WearSupportService f5128b;
    final com.google.android.finsky.installer.n c;
    final com.google.android.finsky.download.w d;
    final com.google.android.gms.common.api.m e;
    m f;
    private final com.google.android.finsky.g.h h;
    private final Handler i = new Handler(Looper.getMainLooper());
    int g = 0;

    public h(WearSupportService wearSupportService, a aVar, com.google.android.finsky.g.h hVar, com.google.android.finsky.download.w wVar, com.google.android.finsky.installer.n nVar, com.google.android.gms.common.api.m mVar) {
        this.f5128b = wearSupportService;
        this.f5127a = aVar;
        this.h = hVar;
        this.d = wVar;
        this.c = nVar;
        this.e = mVar;
    }

    public final void a(String str, String str2, int i, String str3, String str4) {
        int i2;
        if (a(str, str2) != 0) {
            FinskyLog.a("Dropping install request on %s for %s because already installing", str, str2);
            return;
        }
        com.google.android.finsky.b.a a2 = this.f5127a.a(str);
        com.google.android.finsky.b.b a3 = a2.a(str2);
        com.google.android.finsky.b.y yVar = a3 != null ? a3.c : null;
        int i3 = yVar != null ? yVar.c : -1;
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.f1490a = i;
        nVar.f1491b = true;
        if (i3 >= 0) {
            nVar.c = i3;
            nVar.d = true;
        }
        if (yVar != null) {
            nVar.e = a3.c.d;
            nVar.f = true;
        }
        if (i <= i3) {
            FinskyLog.d("Skipping attempt to download %s version %d over version %d", str2, Integer.valueOf(i), Integer.valueOf(i3));
            bh.a(112, str2, "older-version", 0, null, nVar, str);
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = com.google.android.finsky.activities.a.a(str2, FinskyApp.a().j(), a2, this.h);
            if (TextUtils.isEmpty(str3)) {
                FinskyLog.a("Cannot update on %s of %s because cannot determine update account.", str, str2);
                return;
            }
        }
        FinskyLog.a("Request install on %s of %s v=%d for %s", str, str2, Integer.valueOf(i), str4);
        bh.a(105, str2, str4, 0, null, nVar, str);
        com.google.android.finsky.b.t tVar = a3 != null ? a3.d : null;
        com.google.android.finsky.b.u a4 = com.google.android.finsky.b.u.a(tVar, str2);
        a4.b(i);
        a4.c(i);
        a4.c(str3);
        a4.a((com.google.android.finsky.protos.aa) null, 0L);
        a4.d(0);
        a4.a((String) null);
        a4.i(null);
        if (tVar == null) {
            i2 = 0;
        } else {
            i2 = tVar.m;
        }
        a4.e((i2 & (-13) & (-1537) & (-12289) & (-16385)) | 32768);
        a2.f2060a.a(a4.f2132a);
    }

    final void a(com.google.android.finsky.b.b bVar) {
        if (bVar != null && bVar.d != null) {
            com.google.android.finsky.b.ab b2 = this.f5127a.b(bVar.f2105b);
            com.google.android.finsky.b.u a2 = com.google.android.finsky.b.u.a(bVar.d, bVar.f2104a);
            a2.b(-1);
            a2.d(0);
            a2.a((String) null);
            a2.e(0);
            a2.g((String) null);
            a2.b((String[]) null);
            a2.h(null);
            a2.i(null);
            b2.a(a2.f2132a);
        }
    }

    public final int a(String str, String str2) {
        m b2 = b(str, str2);
        if (b2 == null) {
            if (!d.b(str)) {
                return 0;
            }
            com.google.android.finsky.b.b a2 = this.f5127a.a(str).a(str2);
            if (a2 != null && a2.d != null) {
                com.google.android.finsky.b.t tVar = a2.d;
                if (tVar.g == 90) {
                    return 5;
                }
                int i = -1;
                if (a2.c != null) {
                    i = a2.c.c;
                }
                if (tVar.c > i) {
                    return 1;
                }
            }
            return 0;
        }
        com.google.android.finsky.b.b a3 = b2.l.a(b2.f5136a);
        if (a3 == null || a3.d == null) {
            return 0;
        }
        switch (a3.d.g) {
            case 0:
            case 70:
            case 80:
                return 0;
            case 52:
            case 57:
            case 60:
                return 3;
            case 90:
                return 5;
            default:
                return 2;
        }
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.f == null) {
            z = this.g <= 0;
        }
        return z;
    }

    public final synchronized void b() {
        this.g++;
        this.i.post(new i(this));
    }

    final void a(m mVar) {
        if (this.f != null && mVar != this.f) {
            FinskyLog.e("Unexpected (late?) finish of task for %s (%s)", mVar.f5136a, mVar.f5137b);
        }
        this.f = null;
        b();
    }

    private m b(String str, String str2) {
        if (this.f != null && this.f.f5136a.equals(str2) && this.f.f5137b.equals(str)) {
            return this.f;
        }
        return null;
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        m e = e(bVar);
        if (bVar.b() != null) {
            bh.a(101, bVar.p(), null, 0, null, e == null ? null : e.i, bVar.b());
        }
        if (e != null) {
            String a2 = bVar.a();
            com.google.android.finsky.b.t tVar = e.l.a(a2).d;
            int i = tVar.g;
            if (i == 40 || i == 45) {
                e.a(45, bVar.k());
                return;
            }
            FinskyLog.d("Unexpected download start state for %s (%s): %d", a2, e.f5137b, Integer.valueOf(tVar.g), Integer.valueOf(i));
            e.b();
            e.a(a2, 903);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(com.google.android.finsky.download.b bVar) {
        m e = e(bVar);
        if (bVar.b() != null) {
            bh.a(102, bVar.p(), null, 0, null, e == null ? null : e.i, bVar.b());
        }
        if (e != null) {
            com.google.android.finsky.b.t tVar = e.l.a(e.f5136a).d;
            if (tVar.g == 45) {
                e.a(50, bVar.k());
                e.a();
            } else {
                FinskyLog.d("Unexpected download completion state for %s (%s): %d", e.f5136a, e.f5137b, Integer.valueOf(tVar.g));
                e.b();
                e.a(e.f5136a, 904);
            }
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(com.google.android.finsky.download.b bVar) {
        m e = e(bVar);
        if (bVar.b() != null) {
            bh.a(103, bVar.p(), null, 0, null, e == null ? null : e.i, bVar.b());
        }
        if (e != null) {
            e.b();
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, int i) {
        m e = e(bVar);
        if (bVar.b() != null) {
            bh.a(104, bVar.p(), null, i, null, e == null ? null : e.i, bVar.b());
        }
        if (e == null) {
            return;
        }
        e.b();
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, com.google.android.finsky.download.r rVar) {
        m e = e(bVar);
        if (e == null) {
            return;
        }
        e.c = rVar.f2732b;
        if (rVar.f2732b > 0 && e.l.f2060a.a(e.f5136a).j == 0) {
            e.m.a(e.f5136a, System.currentTimeMillis());
        }
        e.d = rVar.d;
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(com.google.android.finsky.download.b bVar) {
    }

    private m e(com.google.android.finsky.download.b bVar) {
        String b2 = bVar.b();
        if (b2 == null) {
            return null;
        }
        if (!d.b(b2)) {
            FinskyLog.c("Cancel download %s because bad node", bVar);
            this.d.g(bVar);
            return null;
        }
        String a2 = bVar.a();
        m b3 = b(b2, a2);
        if (b3 == null) {
            FinskyLog.c("Cancel download %s because no InstallerTask", bVar);
            this.d.g(bVar);
            return null;
        }
        if (!b3.f5137b.equals(bVar.b())) {
            FinskyLog.c("Cancel download %s because InstallerTask node %s", bVar, b3.f5137b);
            this.d.g(bVar);
            return null;
        }
        com.google.android.finsky.b.b a3 = this.f5127a.a(b2).a(a2);
        if (a3 != null && a3.d != null) {
            return b3;
        }
        FinskyLog.c("Cancel download %s no installerdata", bVar);
        this.d.g(bVar);
        return null;
    }

    static void a(String str, com.google.android.finsky.b.b bVar, int i, String str2) {
        int i2;
        if (i == 0) {
            i2 = 110;
            FinskyLog.c("Successful remote install of %s (%s)", bVar.f2104a, str);
        } else {
            i2 = 111;
            FinskyLog.c("Failed remote install of %s (%s) because %d (%s)", bVar.f2104a, str, Integer.valueOf(i), str2);
        }
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.f1491b = true;
        nVar.f1490a = bVar.d.c;
        if (bVar.c != null && nVar.f1490a != bVar.c.c) {
            nVar.d = true;
            nVar.c = bVar.c.c;
        }
        nVar.e = bVar.c.d;
        nVar.f = true;
        bh.a(i2, bVar.f2104a, null, i, null, nVar, str);
    }
}
