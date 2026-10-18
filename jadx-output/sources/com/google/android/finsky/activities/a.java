package com.google.android.finsky.activities;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hy;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1527a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1528b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public String[] g;
    public boolean h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private String n;

    public a(String str, com.google.android.finsky.b.a aVar, com.google.android.finsky.g.h hVar) {
        this.f1527a = false;
        this.f1528b = false;
        this.c = false;
        this.d = false;
        this.e = -1;
        this.f = false;
        this.g = com.google.android.finsky.g.q.f2834a;
        this.h = false;
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = str;
        com.google.android.finsky.b.b a2 = aVar.a(this.n);
        if (a2 != null && a2.c != null) {
            this.f1527a = true;
            com.google.android.finsky.b.y yVar = a2.c;
            this.e = yVar.c;
            this.c = yVar.d;
            this.d = yVar.e;
            this.f = yVar.h;
            boolean f = aVar.f2061b.f(this.n);
            this.l = yVar.f;
            this.m = yVar.g;
            this.j = f && !this.l;
        }
        if (this.f1527a) {
            this.g = a2.c.f2138b;
        }
        List<com.google.android.finsky.g.q> b2 = hVar.b(this.n, this.g);
        boolean z = !b2.isEmpty();
        this.f1528b = this.f1527a && z;
        this.i = a(a2 == null ? null : a2.d, b2, System.currentTimeMillis());
        this.h = this.i != null;
        if (this.f1527a && !z && !hVar.a(this.n).isEmpty()) {
            FinskyLog.a("%s is installed but certificate mistmatch", this.n);
        }
        if (a2 != null && a2.d != null) {
            this.k = TextUtils.isEmpty(a2.d.n) ? false : true;
        }
    }

    public final boolean a() {
        return this.f1527a && !this.f && (!this.c || this.d) && !a(this.n);
    }

    private static boolean a(String str, List<com.google.android.finsky.g.q> list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).g.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static String a(com.google.android.finsky.b.t tVar, List<com.google.android.finsky.g.q> list, long j) {
        long j2 = tVar != null ? tVar.j : 0L;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.google.android.finsky.g.q qVar = list.get(i);
            long j3 = qVar.c;
            if (j2 != 0) {
                j3 = Math.min(j3, qVar.d + j2);
            }
            if (j3 >= j) {
                return qVar.g;
            }
        }
        return null;
    }

    public static boolean a(Document document) {
        if (!FinskyApp.a().w.f5029a.c() || FinskyApp.a().v.a(document.f1963a.f3890a) != null) {
            return false;
        }
        try {
            PackageInfo packageInfo = FinskyApp.a().getPackageManager().getPackageInfo(document.f1963a.f3890a, 8256);
            int length = packageInfo.signatures.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = hy.a(packageInfo.signatures[i].toByteArray());
            }
            return !a(strArr, document.E().F);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @TargetApi(21)
    public static boolean a(String str) {
        return Build.VERSION.SDK_INT > 21 && ((DevicePolicyManager) FinskyApp.a().getSystemService("device_policy")).isUninstallBlocked(null, str);
    }

    public final boolean b(Document document) {
        return (this.f1528b || this.c) && document.E().f && document.E().e > this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean a(java.lang.String[] r7, com.google.android.finsky.protos.cg[] r8) {
        /*
            r4 = 1
            r1 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L31
            int r0 = r8.length
            if (r0 == 0) goto L12
            int r0 = r7.length
            if (r0 == 0) goto L12
            int r0 = r7.length
            int r2 = r8.length
            if (r0 <= r2) goto L13
        L12:
            return r1
        L13:
            r0 = r1
        L14:
            int r2 = r7.length
            if (r0 >= r2) goto L2f
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L12
            r3 = r7[r0]
            r5 = r8[r2]
            java.lang.String[] r5 = r5.f3674a
            r5 = r5[r1]
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L2c
            int r2 = r2 + 1
            goto L18
        L2c:
            int r0 = r0 + 1
            goto L14
        L2f:
            r1 = r4
            goto L12
        L31:
            int r0 = r8.length
            if (r0 == 0) goto L12
            int r0 = r7.length
            if (r0 == 0) goto L12
            r0 = r1
        L38:
            int r2 = r7.length
            if (r0 >= r2) goto L5e
            r2 = r1
        L3c:
            int r3 = r8.length
            if (r2 >= r3) goto L12
            r3 = r1
        L40:
            r5 = r8[r2]
            java.lang.String[] r5 = r5.f3674a
            int r5 = r5.length
            if (r3 >= r5) goto L58
            r5 = r7[r0]
            r6 = r8[r2]
            java.lang.String[] r6 = r6.f3674a
            r6 = r6[r3]
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L5b
            int r3 = r3 + 1
            goto L40
        L58:
            int r2 = r2 + 1
            goto L3c
        L5b:
            int r0 = r0 + 1
            goto L38
        L5e:
            r1 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.a.a(java.lang.String[], com.google.android.finsky.protos.cg[]):boolean");
    }

    public static String a(String str, String str2, com.google.android.finsky.b.a aVar, com.google.android.finsky.g.h hVar) {
        com.google.android.finsky.b.t a2 = aVar.f2060a.a(str);
        com.google.android.finsky.b.y a3 = aVar.f2061b.a(str);
        List<com.google.android.finsky.g.q> b2 = hVar.b(str, com.google.android.finsky.b.a.a(a3));
        boolean z = (a3 == null || b2.isEmpty()) ? false : true;
        if (z && a2 != null) {
            String str3 = a2.p;
            if (a(str3, b2)) {
                return str3;
            }
        }
        if (z && a2 != null) {
            String str4 = a2.i;
            if (a(str4, b2)) {
                return str4;
            }
        }
        if (a(str2, b2) || b2.size() <= 0) {
            return str2;
        }
        return b2.get(0).g;
    }
}
