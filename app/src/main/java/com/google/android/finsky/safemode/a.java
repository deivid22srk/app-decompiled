package com.google.android.finsky.safemode;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.cpkg.d;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4511a;

    /* renamed from: b, reason: collision with root package name */
    public static File f4512b;
    public static Boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        com.google.android.finsky.safemode.a.c = java.lang.Boolean.valueOf("com.deivid22srk.store:safe_mode".equals(r0.processName));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            r1 = 0
            java.lang.Boolean r0 = com.google.android.finsky.safemode.a.c
            if (r0 == 0) goto Lc
            java.lang.Boolean r0 = com.google.android.finsky.safemode.a.c
            boolean r0 = r0.booleanValue()
        Lb:
            return r0
        Lc:
            com.google.android.play.utils.bpkg.a<java.lang.Boolean> r0 = com.google.android.finsky.cpkg.d.fG
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            r0 = r1
            goto Lb
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.android.finsky.safemode.a.c = r0
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L5d
            android.content.Context r0 = com.google.android.finsky.safemode.a.f4511a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> L5d
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L5d
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L5d
        L38:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L5d
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Throwable -> L5d
            int r3 = r0.pid     // Catch: java.lang.Throwable -> L5d
            if (r3 != r1) goto L38
            java.lang.String r1 = "com.deivid22srk.store:safe_mode"
            java.lang.String r0 = r0.processName     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            com.google.android.finsky.safemode.a.c = r0     // Catch: java.lang.Throwable -> L5d
        L56:
            java.lang.Boolean r0 = com.google.android.finsky.safemode.a.c
            boolean r0 = r0.booleanValue()
            goto Lb
        L5d:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.safemode.a.a():boolean");
    }

    public static boolean b() {
        if (!d.fG.b().booleanValue()) {
            c();
            return false;
        }
        if (!f4512b.exists()) {
            c();
            return false;
        }
        long lastModified = f4512b.lastModified();
        long currentTimeMillis = System.currentTimeMillis() - lastModified;
        boolean z = lastModified > 0 && currentTimeMillis >= 0 && currentTimeMillis < d.fH.b().longValue();
        if (!z) {
            c();
            return z;
        }
        return z;
    }

    public static void c() {
        f4512b.delete();
        f4511a.stopService(new Intent(f4511a, (Class<?>) SafeModeService.class));
    }

    public static void d() {
        Intent intent = new Intent(f4511a, (Class<?>) SafeModeActivity.class);
        intent.addFlags(884998144);
        f4511a.startActivity(intent);
    }
}
