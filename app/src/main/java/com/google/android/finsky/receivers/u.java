package com.google.android.finsky.receivers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.installer.PatchFormatException;
import com.google.android.finsky.protos.il;
import com.google.android.finsky.protos.pf;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.hz;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
final class u {
    private com.google.android.finsky.download.apkg.a A;
    private com.google.android.finsky.download.apkg.a B;

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.bpkg.a f4498a;

    /* renamed from: b, reason: collision with root package name */
    final dw f4499b;
    final com.google.android.finsky.bpkg.s c;
    final com.google.android.finsky.installer.s d;
    public final String e;
    long f;
    long g;
    long h;
    int i;
    boolean j;
    com.google.android.finsky.apkg.n k;
    String l;
    int m;
    private final h s;
    private final com.google.android.finsky.download.w t;
    private final com.google.android.finsky.installer.n u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static final String[] r = {"1", "2", "3"};
    static g p = new g(0, 0, 0, 0);
    static g q = new g(3, 0, 0, 0);
    private List<String> C = new ArrayList();
    private List<String> D = new ArrayList();
    String n = null;
    com.google.android.finsky.download.d o = null;

    public u(String str, h hVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.download.w wVar, dw dwVar, com.google.android.finsky.installer.n nVar, com.google.android.finsky.installer.s sVar) {
        this.e = str;
        this.s = hVar;
        this.f4498a = aVar;
        this.t = wVar;
        this.f4499b = dwVar;
        this.c = aVar.f2060a;
        this.u = nVar;
        this.d = sVar;
    }

    final void a(com.google.android.finsky.bpkg.b bVar) {
        com.google.android.finsky.bpkg.t tVar = bVar.d;
        this.z = bVar.c != null;
        this.l = tVar.l;
        a("populateFields", this.e, this.l, tVar);
        int i = tVar.m;
        this.x = (i & 16) == 0;
        this.j = (i & 1) == 0;
        this.y = (i & 128) == 0;
        this.k = new com.google.android.finsky.apkg.n();
        this.k.f1490a = tVar.c;
        this.k.f1491b = true;
        if (bVar.c != null) {
            this.k.c = bVar.c.c;
            this.k.d = true;
            this.k.e = bVar.c.d;
            this.k.f = true;
        }
        if ((i & 4096) != 0) {
            this.k.g = true;
            this.k.h = true;
        }
        if ((i & 512) != 0) {
            this.k.i = true;
            this.k.j = true;
        }
        if ((i & 4) != 0) {
            this.k.k = true;
            this.k.l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.google.android.finsky.bpkg.t tVar) {
        this.D.clear();
        for (String str : tVar.b()) {
            this.D.add(str);
        }
        this.n = tVar.u;
        if (!TextUtils.isEmpty(this.n)) {
            a(this.n, tVar.e);
        }
        f();
    }

    private void f() {
        if (this.C.size() < 2 || TextUtils.isEmpty(this.n)) {
            this.k.m = "";
            this.k.n = false;
        } else {
            this.k.m = this.n;
            this.k.n = true;
        }
        if (this.o != null && this.o.g != null) {
            this.k.s = this.o.g.g;
            this.k.t = true;
            if (a(this.o)) {
                this.k.i = true;
                this.k.j = true;
            }
        }
    }

    public static void a(String str, String str2, String str3, com.google.android.finsky.bpkg.t tVar) {
        if (TextUtils.isEmpty(str3)) {
            if (tVar == null) {
                FinskyLog.d("b/11413796 - installerData is null", new Object[0]);
            } else {
                FinskyLog.d("b/11413796 - acct:  %s", FinskyLog.a(tVar.i));
                FinskyLog.d("b/11413796 - vers:  %d", Integer.valueOf(tVar.c));
                FinskyLog.d("b/11413796 - uri:   %s", tVar.h);
                FinskyLog.d("b/11413796 - flags: %d", Integer.valueOf(tVar.m));
                FinskyLog.d("b/11413796 - state: %d", Integer.valueOf(tVar.g));
                FinskyLog.d("b/11413796 - pkg:   %s", tVar.f2130a);
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(tVar.e != null);
                FinskyLog.d("b/11413796 - data?  %b", objArr);
            }
            if (str3 == null) {
                FinskyLog.e("b/11413796 - %s for %s (null title)", str, str2);
            } else {
                FinskyLog.e("b/11413796 - %s for %s (empty title)", str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, String str) {
        if (this.j) {
            this.f4499b.a(this.l, this.e, i, str, this.z);
        }
    }

    public final void a(boolean z) {
        com.google.android.finsky.bpkg.b a2 = this.f4498a.a(this.e);
        if (a2 != null && a2.d != null && a2.d.g >= 50) {
            FinskyLog.a("Cannot cancel installing %s (%s) - too late", this.e, this.n);
            return;
        }
        a(a2, true);
        if (z) {
            a(2, 0);
        }
    }

    final void a(com.google.android.finsky.bpkg.b bVar, boolean z) {
        FinskyLog.a("Cancel running installation of %s (%s)", this.e, this.n);
        com.google.android.finsky.download.b a2 = this.t.a(this.e, null);
        if (a2 != null) {
            this.t.g(a2);
        }
        this.d.b(this.e);
        this.s.a(bVar, z);
        h();
        if (this.A == null && this.B == null && bVar != null && bVar.d != null && bVar.d.e != null) {
            b(bVar.d);
        }
        if (this.A != null) {
            File g = this.A.g();
            if (g != null) {
                g.delete();
            }
            if (!this.z && this.A.i()) {
                this.A.f().delete();
            }
        }
        if (this.B != null) {
            File g2 = this.B.g();
            if (g2 != null) {
                g2.delete();
            }
            if (!this.z && this.B.i()) {
                this.B.f().delete();
            }
        }
        this.s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x022c, code lost:
    
        a(r3, false);
        a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0237, code lost:
    
        c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0012, code lost:
    
        com.google.android.finsky.utils.FinskyLog.e("Unexpected missing installer data for %s (%s)", r24.e, r24.n);
        a(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.receivers.u.b():void");
    }

    private int b(com.google.android.finsky.bpkg.b bVar) {
        if (!FinskyApp.a().w.f5029a.c() || bVar.c != null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = FinskyApp.a().getPackageManager().getPackageInfo(this.e, 8192);
            if ((packageInfo.applicationInfo.flags & 8388608) != 0) {
                return -1;
            }
            FinskyLog.a("Found %s version %d installed for another user", this.e, Integer.valueOf(packageInfo.versionCode));
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    private String g() {
        if (!FinskyApp.a().w.f5029a.c()) {
            return null;
        }
        try {
            PackageInfo packageInfo = FinskyApp.a().getPackageManager().getPackageInfo(this.e, 8256);
            if ((packageInfo.applicationInfo.flags & 8388608) != 0) {
                return null;
            }
            Object[] objArr = new Object[2];
            objArr[0] = this.e;
            objArr[1] = Integer.valueOf(packageInfo.signatures != null ? packageInfo.signatures.length : 0);
            FinskyLog.a("Found %s with %d signatures installed for another user or hidden", objArr);
            if (packageInfo.signatures == null || packageInfo.signatures.length == 0) {
                return null;
            }
            return hy.a(packageInfo.signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    final boolean a(String str, com.google.android.finsky.protos.aa aaVar) {
        this.o = b(str, aaVar);
        return this.o != null;
    }

    private com.google.android.finsky.download.d b(String str, com.google.android.finsky.protos.aa aaVar) {
        int i = 0;
        if ("..obb_main".equals(str)) {
            com.google.android.finsky.protos.ah[] ahVarArr = aaVar.l;
            int length = ahVarArr.length;
            while (i < length) {
                com.google.android.finsky.protos.ah ahVar = ahVarArr[i];
                if (ahVar.f3590a != 0) {
                    i++;
                } else {
                    return new com.google.android.finsky.download.apkg.b(this.e, this.A, ahVar);
                }
            }
        } else if ("..obb_patch".equals(str)) {
            com.google.android.finsky.protos.ah[] ahVarArr2 = aaVar.l;
            int length2 = ahVarArr2.length;
            while (i < length2) {
                com.google.android.finsky.protos.ah ahVar2 = ahVarArr2[i];
                if (1 != ahVar2.f3590a) {
                    i++;
                } else {
                    return new com.google.android.finsky.download.apkg.b(this.e, this.B, ahVar2);
                }
            }
        } else {
            if (this.e.equals(str)) {
                return new com.google.android.finsky.download.a(this.f4498a, this.d, this.e, aaVar);
            }
            pf[] pfVarArr = aaVar.y;
            int length3 = pfVarArr.length;
            while (i < length3) {
                pf pfVar = pfVarArr[i];
                if (!str.equals(pfVar.f4243a)) {
                    i++;
                } else {
                    return new com.google.android.finsky.download.al(this.f4498a, this.d, this.e, pfVar);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.android.finsky.bpkg.t tVar, ai aiVar, aj ajVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!aiVar.c) {
            aiVar.c = true;
            if ((aiVar.f4450a & 65536) != 0) {
                z3 = true;
            } else if (this.o.e()) {
                aiVar.f4451b |= 4096;
                z3 = true;
            } else if ((aiVar.f4450a & 8192) != 0) {
                z3 = true;
            } else if ((aiVar.f4450a & 4096) != 0) {
                aiVar.f4451b |= 4096;
                z3 = true;
            } else {
                long j = this.o.f2698b;
                long longValue = com.google.android.finsky.cpkg.d.bz.b().longValue();
                if (FinskyApp.a().e().a(12602358L)) {
                    longValue = 0;
                }
                if (j < longValue) {
                    z3 = true;
                } else {
                    jm.a(new ad(this, aiVar, j, tVar, ajVar), new Void[0]);
                    z3 = false;
                }
            }
            if (!z3) {
                return;
            }
        }
        if ((aiVar.f4451b & 4096) != 0) {
            this.k.g = true;
            this.k.h = true;
        }
        if (!aiVar.d) {
            aiVar.d = true;
            if ((aiVar.f4450a & 8) != 0) {
                z2 = true;
            } else if ((aiVar.f4450a & 4) != 0) {
                aiVar.f4451b |= 4;
                z2 = true;
            } else if (!this.o.a()) {
                FinskyLog.a("Download %s (%s) cannot be patched (yet)", this.e, this.n);
                z2 = true;
            } else {
                com.google.android.finsky.protos.ad adVar = this.o.g;
                if (adVar == null) {
                    z2 = true;
                } else {
                    switch (adVar.g) {
                        case 1:
                        case 2:
                        case 3:
                            int i = adVar.f3582a;
                            int c = this.o.c();
                            if (c != i) {
                                a(this.e, c > 0 ? "wrong-base-app-installed" : "no-base-app-installed", 0, (Exception) null);
                                FinskyLog.a("Cannot patch %s (%s), need version %d but has %d", this.e, this.n, Integer.valueOf(i), Integer.valueOf(c));
                                z2 = true;
                                break;
                            } else {
                                File b2 = this.o.b();
                                if (b2 == null) {
                                    a(this.e, "base-app-dirs-mismatch", 0, (Exception) null);
                                    FinskyLog.a("Cannot patch %s (%s), existing version is %d", this.e, this.n, Integer.valueOf(c));
                                    z2 = true;
                                    break;
                                } else if (!b2.exists()) {
                                    a(this.e, "base-file-exists", 0, (Exception) null);
                                    FinskyLog.a("Cannot patch %s (%s), file does not exist %s", this.e, this.n, b2);
                                    z2 = true;
                                    break;
                                } else {
                                    jm.a(new af(this, aiVar, b2, adVar, tVar, ajVar), new Void[0]);
                                    z2 = false;
                                    break;
                                }
                            }
                        default:
                            FinskyLog.e("Can't download patch %s (%s) because format (%d) is unsupported", this.e, this.n, Integer.valueOf(adVar.g));
                            z2 = true;
                            break;
                    }
                }
            }
            if (!z2) {
                return;
            }
        }
        if ((aiVar.f4451b & 4) != 0) {
            com.google.android.finsky.protos.ad adVar2 = this.o.g;
            this.k.k = true;
            this.k.l = true;
            this.k.s = adVar2.g;
            this.k.t = true;
            if (a(this.o)) {
                this.k.i = true;
                this.k.j = true;
            }
            a(adVar2.e, -1L, adVar2.i, aiVar, ajVar);
            return;
        }
        if (!aiVar.e) {
            aiVar.e = true;
            if ((aiVar.f4450a & 1024) != 0) {
                z = true;
            } else if ((aiVar.f4450a & 512) != 0) {
                aiVar.f4451b |= 512;
                z = true;
            } else if (TextUtils.isEmpty(this.o.f)) {
                z = true;
            } else {
                jm.a(new ae(this, aiVar, tVar, ajVar), new Void[0]);
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if ((aiVar.f4451b & 512) != 0) {
            this.k.i = true;
            this.k.j = true;
            a(this.o.f, -1L, this.o.e, aiVar, ajVar);
        } else {
            FinskyLog.a("Downloading full file for %s (%s)", this.e, this.n);
            a(this.o.d, this.o.f2698b, this.o.f2698b, aiVar, ajVar);
        }
    }

    private void a(String str, long j, long j2, ai aiVar, aj ajVar) {
        com.google.android.finsky.bpkg.t a2 = this.c.a(this.e);
        if (a2.g != 40) {
            FinskyLog.a("Detected cancellation of install of %s", this.e);
            return;
        }
        int i = aiVar.f4451b;
        if (a2.m != i) {
            this.c.d(this.e, i);
        }
        Uri uri = null;
        if ((i & 4096) != 0) {
            if ((i & 4) == 0 && (i & 512) == 0 && !this.o.a(true) && this.o.g() != null) {
                uri = Uri.fromFile(this.o.g());
            } else {
                uri = Uri.fromFile(new File(FinskyApp.a().getExternalFilesDir(null), String.valueOf(System.currentTimeMillis())));
            }
        }
        String a3 = this.o.a(a2.l);
        il ilVar = a2.e.m[0];
        ajVar.a(new com.google.android.finsky.download.e(str, a3, this.e, null, ilVar.f3955a, ilVar.c, uri, j, j2, this.o.h(), !this.w, !this.x));
    }

    public final void c() {
        FinskyApp a2 = FinskyApp.a();
        if (!ik.a()) {
            if (!new com.google.android.finsky.activities.a(this.e, FinskyApp.a().s, FinskyApp.a().p).j) {
                FinskyLog.a("Skip shortcut for non-launchable %s", this.e);
                return;
            }
            PackageManager packageManager = a2.getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.e, 0);
                Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
                String resourceName = resourcesForApplication.getResourceName(applicationInfo.icon);
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.e);
                int i = packageManager.getActivityInfo(launchIntentForPackage.getComponent(), 0).labelRes;
                CharSequence string = i != 0 ? resourcesForApplication.getString(i) : packageManager.getApplicationLabel(applicationInfo);
                Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent.putExtra("android.intent.extra.shortcut.NAME", string);
                intent.putExtra("android.intent.extra.shortcut.INTENT", launchIntentForPackage);
                Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                shortcutIconResource.packageName = this.e;
                shortcutIconResource.resourceName = resourceName;
                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", shortcutIconResource);
                intent.putExtra("duplicate", false);
                a2.sendBroadcast(intent);
                FinskyLog.a("Requested shortcut for %s", this.e);
            } catch (Resources.NotFoundException e) {
                FinskyLog.c("Unable to load resources for %s", this.e);
            } catch (Exception e2) {
                FinskyLog.b(e2, "Unable to add shortcut for %s", this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        File[] listFiles;
        File externalFilesDir = FinskyApp.a().getExternalFilesDir(null);
        if (externalFilesDir != null && (listFiles = externalFilesDir.listFiles()) != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
    }

    final long d() {
        long j = this.f;
        com.google.android.finsky.protos.aa aaVar = this.f4498a.f2060a.a(this.e).e;
        Iterator<String> it = this.D.iterator();
        while (true) {
            long j2 = j;
            if (it.hasNext()) {
                com.google.android.finsky.download.d b2 = b(it.next(), aaVar);
                j = b2 != null ? b2.f2698b + j2 : j2;
            } else {
                return j2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        this.s.a(this.e, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, String str) {
        this.c.a(this.e, i, str);
    }

    final void a(int i, Uri uri) {
        b(i, uri != null ? uri.toString() : null);
    }

    public final String toString() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, Exception exc) {
        if (i == 0) {
            i = 917;
        }
        FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(108).a(str).b(str2).a(i).a(exc).a(this.k).f1473a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, int i) {
        FinskyApp.a().h().a(104, str, (String) null, i, (String) null, this.k);
        a(3, i);
        a(i, (String) null);
    }

    final void a(int i) {
        long j;
        s sVar;
        if (FinskyApp.a().e().a(12605260L) && this.g >= 0) {
            com.google.android.finsky.bpkg.b a2 = this.f4498a.a(this.e);
            if (a2 == null || a2.d == null) {
                j = 0;
            } else {
                j = (FinskyApp.a().e().a(12605260L) && (sVar = this.s.f4478a.get(this.e)) != null && sVar.f4495a == a2.d.c) ? sVar.f4496b : 0L;
            }
            if (j > 0) {
                com.google.android.finsky.apkg.b a3 = new com.google.android.finsky.apkg.b(136).a(this.e).a(this.k).a(i);
                long j2 = this.g;
                com.google.android.finsky.apkg.v vVar = new com.google.android.finsky.apkg.v();
                vVar.f1505a = j;
                vVar.f1506b = true;
                vVar.c = j2;
                vVar.d = true;
                a3.f1473a.Y = vVar;
                FinskyApp.a().h().b(a3.f1473a);
                this.g = -1L;
                this.s.l(this.e);
            }
        }
    }

    static boolean a(List<String> list, String str) {
        for (String str2 : list) {
            if (!str2.equals(str) && !str2.equals("..obb_main") && !str2.equals("..obb_patch")) {
                return true;
            }
        }
        return false;
    }

    final boolean a(com.google.android.finsky.download.d dVar, String str, RandomAccessFile randomAccessFile, InputStream inputStream, OutputStream outputStream, long j, String str2) {
        try {
            switch (dVar.g.g) {
                case 1:
                case 2:
                    com.google.android.finsky.installer.g.a(randomAccessFile, inputStream, outputStream, j);
                    return true;
                case 3:
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 16384);
                    try {
                        com.google.android.finsky.installer.a.a(randomAccessFile, bufferedOutputStream, bufferedInputStream, j);
                        bufferedOutputStream.flush();
                        return true;
                    } catch (Throwable th) {
                        bufferedOutputStream.flush();
                        throw th;
                    }
                default:
                    FinskyLog.e("Package %s (%s): unexpected patch format (%d)", this.e, str, Integer.valueOf(dVar.g.g));
                    return false;
            }
        } catch (PatchFormatException e) {
            String type = FinskyApp.a().getContentResolver().getType(Uri.parse(str2.replaceFirst("my_downloads", "public_downloads")));
            a(this.e, "applyPatch-FileFormatException", 0, e);
            FinskyLog.c("Patch %s (%s) (content-type '%s') is invalid", this.e, str, type);
            return false;
        } catch (IOException e2) {
            a(this.e, "applyPatch-IOException", 0, e2);
            FinskyLog.c("Patch %s (%s) failed with exception %s", this.e, str, e2);
            return false;
        } catch (Exception e3) {
            a(this.e, "applyPatch-Exception", 0, e3);
            FinskyLog.c("Patch %s (%s) failed with exception %s", this.e, str, e3);
            return false;
        }
    }

    final InputStream a(Context context, Uri uri, com.google.android.finsky.download.d dVar) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            return a(dVar) ? new GZIPInputStream(openInputStream, 8192) : openInputStream;
        } catch (FileNotFoundException e) {
            FinskyLog.c("FileNotFoundException %s %s", uri, e.getMessage());
            a(this.e, "patch-FileNotFoundException", 0, e);
            return null;
        } catch (IOException e2) {
            FinskyLog.c("IOException %s %s", uri, e2.getMessage());
            a(this.e, "patch-IOException", 0, e2);
            return null;
        }
    }

    private static boolean a(com.google.android.finsky.download.d dVar) {
        if (dVar == null || dVar.g == null) {
            return false;
        }
        return dVar.g.g == 2 || dVar.g.g == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.D.add(this.n);
        this.c.b(this.e, (String[]) this.D.toArray(new String[this.D.size()]));
        int i = this.c.a(this.e).m;
        int i2 = i & (-13837);
        if (i != i2) {
            this.c.d(this.e, i2);
        }
        b(40, (String) null);
        b();
    }

    private static boolean a(String str) {
        try {
            ApplicationInfo applicationInfo = FinskyApp.a().getPackageManager().getApplicationInfo(str, 0);
            String str2 = applicationInfo.sourceDir;
            return TextUtils.isEmpty(str2) || !str2.equals(applicationInfo.publicSourceDir);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i, int i2) {
        FinskyLog.a("Retry download of %s (%s) (inhibit %d)", this.e, this.n, Integer.valueOf(i2));
        com.google.android.finsky.bpkg.s sVar = this.c;
        int i3 = sVar.a(this.e).m;
        boolean z = (i3 & i) != 0;
        if (z) {
            sVar.d(this.e, (i3 | i2) & (i ^ (-1)));
            if ((i & 4) != 0) {
                this.k.k = false;
                this.k.l = false;
                this.k.i = false;
                this.k.j = false;
                this.k.s = 0;
                this.k.t = false;
            }
            if ((i & 512) != 0) {
                this.k.i = false;
                this.k.j = false;
            }
            if ((i & 4096) != 0) {
                this.k.g = false;
                this.k.h = false;
            }
            b(40, (String) null);
            b();
        }
        return z;
    }

    public final void a() {
        int i;
        try {
            com.google.android.finsky.bpkg.b a2 = this.f4498a.a(this.e);
            if (a2 == null || a2.d == null) {
                FinskyLog.e("Unexpected missing installer data for %s", this.e);
                a(true);
                return;
            }
            com.google.android.finsky.bpkg.t tVar = a2.d;
            int i2 = tVar.g;
            this.g = i2 == 0 ? 0L : -1L;
            a(a2);
            if (i2 > 0 && tVar.e != null) {
                a(tVar, false);
                a(tVar);
            }
            this.m = i2;
            switch (i2) {
                case 0:
                    i = -1;
                    break;
                case 10:
                    i = 0;
                    break;
                case 20:
                case 30:
                case 40:
                    i = 10;
                    break;
                case 25:
                case 35:
                case 45:
                    FinskyLog.c("Cannot restart %s (%s) from downloading state %d", this.e, this.n, Integer.valueOf(i2));
                    a(false);
                    a(this.e, 905);
                    return;
                case 50:
                    FinskyLog.c("Restarting %d for %s (%s)", Integer.valueOf(i2), this.e, this.n);
                    a(a2, true);
                    a(this.e, 909);
                    return;
                case 52:
                case 55:
                case 57:
                case 58:
                    FinskyLog.c("Restarting %d for %s (%s)", Integer.valueOf(i2), this.e, this.n);
                    a(a2, true);
                    a(this.e, 907);
                    return;
                case 60:
                case 70:
                    i = 70;
                    break;
                case 80:
                    i = -1;
                    break;
                default:
                    FinskyLog.e("Unknown state %d for %s (%s)", Integer.valueOf(i2), this.e, this.n);
                    a(true);
                    return;
            }
            if (i != -1 && i != i2) {
                b(i, tVar.h);
            }
            b();
        } catch (Exception e) {
            FinskyLog.c("Exception starting %s: %s", this.e, e);
            try {
                a(this.f4498a.a(this.e), true);
            } catch (Exception e2) {
                FinskyLog.c("Exception cleaning %s: %s", this.e, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.google.android.finsky.bpkg.t tVar, boolean z) {
        int i;
        com.google.android.finsky.protos.aa aaVar = tVar.e;
        this.C.clear();
        this.h = 0L;
        this.v = 0L;
        b(tVar);
        if (this.A != null && this.A.d() == 4) {
            this.C.add("..obb_main");
            this.h += this.A.c();
        }
        if (this.B != null && this.B.d() == 4) {
            this.C.add("..obb_patch");
            this.h += this.B.c();
        }
        this.C.add(this.e);
        this.h += aaVar.f3576a;
        this.v += aaVar.f3576a;
        for (pf pfVar : aaVar.y) {
            this.C.add(pfVar.f4243a);
            this.h += pfVar.c;
            this.v = pfVar.c + this.v;
        }
        this.f = 0L;
        int i2 = tVar.m;
        if ((i2 & 2048) != 0) {
            this.w = false;
        } else {
            this.w = (i2 & 2) != 0;
            if (z && !this.w) {
                this.w = this.h < this.u.d;
                if (this.w) {
                    this.s.a(this.e);
                }
            }
        }
        if (this.d.a(this.e)) {
            return;
        }
        String str = tVar.l;
        a("processDeliveryData", this.e, str, tVar);
        if (!aaVar.A) {
            i = 0;
        } else {
            i = aaVar.z;
        }
        this.d.a(this.e, this.v, str, h.a(i));
    }

    private void b(com.google.android.finsky.bpkg.t tVar) {
        com.google.android.finsky.protos.aa aaVar = tVar.e;
        if (aaVar != null && aaVar.l.length > 0) {
            this.A = com.google.android.finsky.hpkg.a.a(aaVar, tVar.f2130a, false);
            if (this.A != null) {
                this.A.e();
            }
            this.B = com.google.android.finsky.hpkg.a.a(aaVar, tVar.f2130a, true);
            if (this.B != null) {
                this.B.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.google.android.finsky.bpkg.t tVar) {
        boolean z;
        boolean z2;
        int i = tVar.g;
        if (i > 40) {
            FinskyLog.d("Unexpected download start states for %s (%s): %d %d", this.e, this.n, Integer.valueOf(tVar.g), Integer.valueOf(i));
            a(false);
            a(this.e, 902);
            return;
        }
        b(40, (String) null);
        if (this.D.isEmpty()) {
            com.google.android.finsky.protos.aa aaVar = tVar.e;
            long j = aaVar.f3576a;
            pf[] pfVarArr = aaVar.y;
            long j2 = j;
            for (pf pfVar : pfVarArr) {
                j2 += pfVar.c;
            }
            if (com.google.android.finsky.installer.n.a(j2, Environment.getDataDirectory(), FinskyApp.a().getContentResolver())) {
                z2 = false;
            } else {
                FinskyLog.d("Cancel download of %s because insufficient free space", this.e);
                a(false);
                a(3, 908);
                FinskyApp.a().h().a(112, this.e, "no-internal-storage", 908, (String) null, this.k);
                if (this.j) {
                    this.f4499b.a(tVar.l, this.e);
                }
                z2 = true;
            }
            if (z2) {
                return;
            }
        }
        if (tVar.e.k == null) {
            if (!a((String) null, tVar)) {
                b(60, (String) null);
                b();
                return;
            }
            if (!this.o.f()) {
                i();
                return;
            }
            if (this.o.e()) {
                if (com.google.android.finsky.download.am.a()) {
                    z = false;
                } else {
                    FinskyLog.d("Cancel download of %s because no external storage for OBB", this.e);
                    a(false);
                    a(3, 901);
                    FinskyApp.a().h().a(112, this.e, "obb-no-external-storage", 901, (String) null, this.k);
                    if (this.j) {
                        this.f4499b.d(tVar.l, this.e);
                    }
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            a(tVar, new ac(this));
            return;
        }
        String str = tVar.f2130a;
        FinskyLog.e("Server sent encryption params for %s", str);
        a(false);
        a(str, 913);
    }

    final boolean a(String str, com.google.android.finsky.bpkg.t tVar) {
        com.google.android.finsky.protos.aa aaVar = tVar.e;
        if (TextUtils.isEmpty(str)) {
            ArrayList a2 = cz.a(this.C);
            a2.removeAll(this.D);
            if (a2.isEmpty()) {
                return false;
            }
            str = (String) a2.get(0);
        }
        if (!a(str, aaVar)) {
            FinskyLog.e("Cannot find download id %s for package %s", str, this.e);
            return false;
        }
        this.n = str;
        this.c.e(this.e, this.n);
        f();
        return true;
    }

    final void a(com.google.android.finsky.bpkg.t tVar, aj ajVar) {
        int i = tVar.m;
        a(tVar, new ai(i, i & (-4613)), ajVar);
    }

    static /* synthetic */ int b(int i) {
        switch (i) {
            case 2:
                return 940;
            case 3:
                return 941;
            case 4:
                return 942;
            case 5:
                return 944;
            case 6:
                return 945;
            default:
                return 943;
        }
    }

    static /* synthetic */ long a(ai aiVar) {
        if ((aiVar.f4451b & 4096) == 0) {
            if (aiVar.g <= 0) {
                aiVar.g = com.google.android.finsky.download.am.c();
            }
            return aiVar.g;
        }
        if (aiVar.f <= 0) {
            aiVar.f = com.google.android.finsky.download.am.b();
        }
        return aiVar.f;
    }

    static /* synthetic */ void a(u uVar, String str, String str2, int i, Exception exc) {
        if (i == 0) {
            i = 963;
        }
        FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(127).a(str).b(str2).a(i).a(exc).a(uVar.k).f1473a);
    }

    static /* synthetic */ void b(u uVar, String str, int i) {
        dw dwVar = FinskyApp.a().n;
        dwVar.b(str);
        dwVar.a(uVar.l, str, i);
    }

    static /* synthetic */ int a(u uVar, String str, hz hzVar, long j, String str2) {
        if (hzVar == null) {
            FinskyLog.d("No digestResult for %s (%s)", str, uVar.n);
            return 961;
        }
        if (j != hzVar.f4980a) {
            FinskyLog.d("Signature check of %s (%s) failed, size expected=%d actual=%d", str, uVar.n, Long.valueOf(j), Long.valueOf(hzVar.f4980a));
            return 919;
        }
        if (str2.equals(hzVar.f4981b)) {
            return 0;
        }
        FinskyLog.d("Signature check of %s (%s) failed, hash expected=%s actual=%s", str, uVar.n, str2, hzVar.f4981b);
        return 960;
    }
}
