package com.google.android.finsky.installer;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cy;
import com.google.android.volley.DisplayMessageError;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2864a;
    private static final List<String> i;
    private static final List<String> j;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.finsky.bpkg.a f2865b;
    public final ConnectivityManager c;
    public long d;
    public long e;
    private final com.google.android.finsky.bpkg.s f;
    private final PackageManager g;
    private final com.google.android.finsky.gpkg.h h;

    static {
        f2864a = Build.VERSION.SDK_INT >= 16;
        i = new ArrayList();
        j = new ArrayList();
    }

    public n(ContentResolver contentResolver, PackageManager packageManager, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.bpkg.s sVar, com.google.android.finsky.gpkg.h hVar) {
        this.e = com.google.android.finsky.cpkg.d.bt.b().longValue();
        this.d = com.google.android.finsky.cpkg.d.bs.b().longValue();
        try {
            long j2 = Settings.Secure.getLong(contentResolver, "download_manager_max_bytes_over_mobile");
            if (j2 > 0 && j2 < this.e) {
                this.e = j2;
            }
        } catch (Settings.SettingNotFoundException e) {
        }
        try {
            long j3 = Settings.Secure.getLong(contentResolver, "download_manager_recommended_max_bytes_over_mobile");
            if (j3 > 0 && j3 < this.d) {
                this.d = j3;
            }
        } catch (Settings.SettingNotFoundException e2) {
        }
        this.d = Math.min(this.d, this.e);
        this.g = packageManager;
        this.c = (ConnectivityManager) FinskyApp.a().getSystemService("connectivity");
        this.f2865b = aVar;
        this.f = sVar;
        this.h = hVar;
    }

    public final boolean a() {
        NetworkInfo networkInfo = this.c.getNetworkInfo(1);
        return networkInfo == null || !networkInfo.isConnected();
    }

    public final boolean b() {
        NetworkInfo networkInfo = this.c.getNetworkInfo(1);
        return networkInfo != null && networkInfo.isConnected();
    }

    public final boolean c() {
        return e() && !android.support.v4.f.a.a(this.c);
    }

    public final boolean d() {
        return this.c.getNetworkInfo(0) != null;
    }

    public final boolean e() {
        NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @TargetApi(18)
    public static boolean a(long j2, File file, ContentResolver contentResolver) {
        long j3;
        long j4;
        int i2;
        long j5;
        long min;
        StatFs statFs = new StatFs(file.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            j3 = statFs.getAvailableBytes();
            j4 = statFs.getTotalBytes();
        } else {
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks() * blockSize;
            long blockCount = statFs.getBlockCount() * blockSize;
            j3 = availableBlocks;
            j4 = blockCount;
        }
        long longValue = com.google.android.finsky.cpkg.d.bu.b().longValue();
        if (longValue > 0) {
            min = longValue;
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                i2 = Settings.Global.getInt(contentResolver, "sys_storage_threshold_percentage", 10);
                j5 = Settings.Global.getLong(contentResolver, "sys_storage_threshold_max_bytes", 524288000L);
            } else {
                i2 = Settings.Secure.getInt(contentResolver, "sys_storage_threshold_percentage", 10);
                j5 = Settings.Secure.getLong(contentResolver, "sys_storage_threshold_max_bytes", 524288000L);
            }
            min = Math.min(j5, (j4 * i2) / 100);
        }
        return j3 - ((((long) com.google.android.finsky.cpkg.d.bv.b().intValue()) * j2) / 100) >= min;
    }

    public final boolean a(com.google.android.finsky.bpkg.y yVar, Document document) {
        if (yVar == null) {
            return false;
        }
        if (!this.h.a()) {
            FinskyLog.e("Library not loaded.", new Object[0]);
            return false;
        }
        int i2 = yVar.c;
        int i3 = document.E().e;
        if (yVar.f) {
            return false;
        }
        String str = yVar.f2137a;
        if (i3 <= i2) {
            return false;
        }
        if (cy.a(document, (DfeToc) null, this.h)) {
            return true;
        }
        FinskyLog.a("Cannot update unavailable app: pkg=%s,restriction=%d", str, Integer.valueOf(document.Q()));
        return false;
    }

    public final void a(Document document) {
        if (document == null) {
            FinskyLog.e("Null document provided", new Object[0]);
            return;
        }
        ag E = document.E();
        if (E == null) {
            FinskyLog.e("Null app details provided for %s", document.f1963a.c);
            return;
        }
        String str = E.w;
        if (!E.S) {
            FinskyLog.c("No everExternallyHosted provided for %s", str);
        } else {
            a(str, E.R);
        }
    }

    public final void a(String str, boolean z) {
        int i2;
        com.google.android.finsky.bpkg.b a2 = this.f2865b.a(str);
        if (a2 == null || a2.c == null) {
            FinskyLog.a("Presetting external-hosting status for non-installed %s", str);
        }
        com.google.android.finsky.bpkg.t tVar = a2 == null ? null : a2.d;
        int i3 = tVar == null ? 0 : tVar.r;
        if (z) {
            i2 = i3 | 2 | 4;
        } else {
            i2 = (i3 & (-3)) | 4;
        }
        if (i2 != i3) {
            FinskyLog.a("Capturing ever-externally-hosted %b for %s", Boolean.valueOf(z), str);
            this.f.e(str, i2);
        }
    }

    public static int a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            return 920;
        }
        if (volleyError instanceof DisplayMessageError) {
            if (volleyError instanceof DfeServerError) {
                return 922;
            }
            return 921;
        }
        if (volleyError instanceof NetworkError) {
            if (volleyError instanceof NoConnectionError) {
                return 924;
            }
            return 923;
        }
        if (volleyError instanceof ParseError) {
            return 925;
        }
        if (volleyError instanceof ServerError) {
            return 926;
        }
        if (volleyError instanceof TimeoutError) {
            return 927;
        }
        return 928;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r4 != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.finsky.installer.o a(com.google.android.finsky.api.model.Document r11, boolean r12) {
        /*
            r10 = this;
            r7 = 22
            r4 = 0
            r3 = 1
            boolean r0 = r10.a()
            if (r0 == 0) goto L64
            long r0 = r10.d
        Lc:
            com.google.android.finsky.protos.ag r5 = r11.E()
            java.lang.String r6 = r5.w
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r7) goto L6a
            int r2 = r11.T()
            if (r2 <= r7) goto L6a
            r2 = r3
        L1d:
            com.google.android.finsky.installer.o r7 = new com.google.android.finsky.installer.o
            r7.<init>()
            java.util.List<java.lang.String> r8 = com.google.android.finsky.installer.n.i
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto L35
            java.lang.String r8 = "Forcing true for size limit for package %s"
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r4] = r6
            com.google.android.finsky.utils.FinskyLog.c(r8, r9)
            r7.f2866a = r3
        L35:
            long r8 = r11.s()
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L3f
            r7.f2866a = r3
        L3f:
            com.google.android.finsky.bpkg.a r0 = r10.f2865b
            java.lang.String r1 = r5.w
            com.google.android.finsky.bpkg.b r8 = r0.a(r1)
            if (r8 == 0) goto L4d
            com.google.android.finsky.bpkg.y r0 = r8.c
            if (r0 != 0) goto L6c
        L4d:
            r1 = r3
        L4e:
            if (r2 == 0) goto L6e
            r7.f2867b = r4
        L52:
            if (r1 != 0) goto L63
            if (r12 == 0) goto L63
            com.google.android.finsky.bpkg.t r0 = r8.d
            if (r0 == 0) goto L63
            com.google.android.finsky.bpkg.t r0 = r8.d
            int r0 = r0.f2131b
            r1 = 2
            if (r0 != r1) goto L63
            r7.c = r3
        L63:
            return r7
        L64:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lc
        L6a:
            r2 = r4
            goto L1d
        L6c:
            r1 = r4
            goto L4e
        L6e:
            if (r1 != 0) goto Lc0
            android.content.pm.PackageManager r0 = r10.g
            android.content.pm.PackageInfo r0 = com.google.android.finsky.layout.h.a(r0, r6)
            java.util.Set r0 = com.google.android.finsky.layout.h.a(r0)
            com.google.android.finsky.FinskyApp r2 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.bpkg.s r2 = r2.r
            boolean r2 = com.google.android.finsky.utils.er.b(r2, r6)
            java.lang.String[] r5 = r5.p
            com.google.android.finsky.utils.ep r2 = com.google.android.finsky.utils.er.a(r5, r0, r2)
            java.util.List<java.lang.String> r0 = com.google.android.finsky.installer.n.j
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto Lc0
            boolean r0 = r2.c
            if (r0 != 0) goto Lc0
            com.google.android.finsky.utils.eo[] r0 = r2.f4855a
            int r5 = r2.f4856b
            r0 = r0[r5]
            if (r0 == 0) goto Lc3
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc3
            r0 = r3
        La5:
            if (r0 != 0) goto Lc0
            com.google.android.finsky.utils.eo[] r2 = r2.f4855a
            int r5 = r2.length
            r0 = r4
        Lab:
            if (r0 >= r5) goto Lbe
            r6 = r2[r0]
            if (r6 == 0) goto Lc5
            boolean r9 = r6.a()
            if (r9 != 0) goto Lc5
            boolean r6 = r6.b()
            if (r6 == 0) goto Lc5
            r4 = r3
        Lbe:
            if (r4 == 0) goto L52
        Lc0:
            r7.f2867b = r3
            goto L52
        Lc3:
            r0 = r4
            goto La5
        Lc5:
            int r0 = r0 + 1
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.n.a(com.google.android.finsky.api.model.Document, boolean):com.google.android.finsky.installer.o");
    }

    public static Set<String> a(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        ComponentName component;
        HashSet hashSet = new HashSet();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (((PowerManager) context.getSystemService("power")).isScreenOn()) {
            List<ActivityManager.RecentTaskInfo> recentTasks = activityManager.getRecentTasks(1, 1);
            if (recentTasks.size() > 0) {
                ActivityManager.RecentTaskInfo recentTaskInfo = recentTasks.get(0);
                if (recentTaskInfo.baseIntent != null && (component = recentTaskInfo.baseIntent.getComponent()) != null) {
                    hashSet.add(component.getPackageName());
                }
            }
        }
        if (com.google.android.finsky.cpkg.d.aS.b().booleanValue() && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            int size = runningServices.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActivityManager.RunningServiceInfo runningServiceInfo = runningServices.get(i2);
                if (runningServiceInfo.foreground) {
                    hashSet.add(runningServiceInfo.service.getPackageName());
                }
            }
        }
        return hashSet;
    }
}
