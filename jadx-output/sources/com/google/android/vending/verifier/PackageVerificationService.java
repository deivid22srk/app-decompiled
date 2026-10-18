package com.google.android.vending.verifier;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class PackageVerificationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static PackageVerificationService f7107a;

    /* renamed from: b, reason: collision with root package name */
    private int f7108b;
    private m c = null;
    private ArrayList<l> d = cz.a(1);
    private ArrayList<String> e = cz.a(0);

    public static void a(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) PackageVerificationService.class);
        intent2.putExtra("broadcast_intent", intent);
        context.startService(intent2);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f7107a = this;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        l a2;
        Intent intent2 = (Intent) intent.getParcelableExtra("broadcast_intent");
        String action = intent2.getAction();
        if (!"android.intent.action.PACKAGE_NEEDS_VERIFICATION".equals(action) && !"android.intent.action.VIEW".equals(action) && !"android.intent.action.INSTALL_PACKAGE".equals(action)) {
            if (!"com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES".equals(action)) {
                if (!"com.google.android.vending.verifier.intent.action.REMOVAL_REQUEST_RESPONSE".equals(action)) {
                    if ("android.intent.action.PACKAGE_VERIFIED".equals(action) && (a2 = a((i3 = intent2.getExtras().getInt("android.content.pm.extra.VERIFICATION_ID")))) != null && a2.B != -1) {
                        FinskyLog.a("Cancel active verification id=%d", Integer.valueOf(i3));
                        b(a2);
                        this.d.remove(a2);
                    }
                } else {
                    Bundle extras = intent2.getExtras();
                    String string = extras.getString("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
                    if (string != null) {
                        this.e.add(string);
                        new k(this, string, extras.getBoolean("com.google.android.vending.verifier.intent.extra.UNINSTALL"), extras.getBoolean("com.google.android.vending.verifier.intent.extra.DONT_WARN"), extras.getBoolean("pressed_back_button"), extras.getBoolean("pressed_uninstall_action", false), extras.getByteArray("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN")).execute(new Void[0]);
                    }
                }
            } else if (this.c == null) {
                this.c = new m(this);
                jm.a(this.c, new Void[0]);
            } else {
                FinskyLog.c("Verify installed packages is already running.", new Object[0]);
            }
        } else {
            l lVar = new l(intent2);
            this.d.add(lVar);
            jm.a(new n(this, lVar), new Void[0]);
        }
        this.f7108b = i2;
        a();
        return 3;
    }

    public static Intent a(Context context, String str, byte[] bArr) {
        Intent intent = new Intent("com.google.android.vending.verifier.intent.action.REMOVAL_REQUEST_RESPONSE");
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.UNINSTALL", true);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.DONT_WARN", false);
        intent.putExtra("pressed_back_button", false);
        intent.putExtra("pressed_uninstall_action", true);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN", bArr);
        Intent intent2 = new Intent(context, (Class<?>) PackageVerificationService.class);
        intent2.putExtra("broadcast_intent", intent);
        intent2.setData(Uri.parse("verifyapps://removalrequest/" + str));
        return intent2;
    }

    public static void a(Context context, String str, boolean z, boolean z2, boolean z3, byte[] bArr) {
        Intent intent = new Intent("com.google.android.vending.verifier.intent.action.REMOVAL_REQUEST_RESPONSE");
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.UNINSTALL", z);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.DONT_WARN", z2);
        intent.putExtra("pressed_back_button", z3);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN", bArr);
        context.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, l lVar) {
        jm.a();
        a(context, lVar, lVar.B);
        this.d.remove(lVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        jm.a();
        if (this.d.isEmpty() && this.e.isEmpty() && this.c == null) {
            stopSelf(this.f7108b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, l lVar, int i) {
        if (lVar.h) {
            if (i == 1) {
                Intent intent = lVar.i;
                intent.setPackage("com.android.packageinstaller");
                intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.PackageInstallerActivity"));
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            return;
        }
        context.getPackageManager().verifyPendingInstall(lVar.f7165a, i);
    }

    private static void b(l lVar) {
        if (lVar.A != null) {
            lVar.A.finish();
            lVar.A = null;
        }
    }

    private l a(int i) {
        Iterator<l> it = this.d.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.f7165a == i) {
                return next;
            }
        }
        return null;
    }

    public static boolean a(int i, Activity activity) {
        l a2;
        jm.a();
        if (f7107a == null || (a2 = f7107a.a(i)) == null) {
            return false;
        }
        a2.A = activity;
        return true;
    }

    public static void a(int i, int i2, boolean z) {
        l a2;
        jm.a();
        FinskyLog.a("User selected %d for id=%d", Integer.valueOf(i2), Integer.valueOf(i));
        if (f7107a != null && (a2 = f7107a.a(i)) != null) {
            if (a2.B != -1) {
                com.google.android.vending.verifier.a.c.a(f7107a, a2.p, i2 == 1 ? 0 : 1, false, z, false, a2.D);
            }
            a2.B = i2;
            f7107a.a((Context) f7107a, a2);
        }
    }

    public static void a(int i, boolean z) {
        l a2;
        jm.a();
        FinskyLog.a("User consent %b for id=%d", Boolean.valueOf(z), Integer.valueOf(i));
        r.a().a(z ? 1 : -1, Boolean.valueOf(z));
        if (f7107a != null && (a2 = f7107a.a(i)) != null) {
            if (z) {
                f7107a.d(a2);
            } else {
                a2.B = 1;
                f7107a.a((Context) f7107a, a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(l lVar) {
        PackageInfo packageInfo;
        Uri uri = lVar.f7166b;
        if (uri == null) {
            FinskyLog.a("Null data for request id=%d", Integer.valueOf(lVar.f7165a));
            return false;
        }
        if (!"file".equalsIgnoreCase(uri.getScheme())) {
            FinskyLog.a("Unsupported scheme for %s in request id=%d", uri, Integer.valueOf(lVar.f7165a));
            return false;
        }
        File file = new File(uri.getPath());
        if (!file.exists()) {
            FinskyLog.a("Cannot find file for %s in request id=%d", uri, Integer.valueOf(lVar.f7165a));
            return false;
        }
        if (!file.canRead()) {
            FinskyLog.a("Cannot read file for %s in request id=%d", uri, Integer.valueOf(lVar.f7165a));
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21 && file.isDirectory()) {
                packageInfo = a(file, lVar);
            } else {
                PackageInfo packageArchiveInfo = getPackageManager().getPackageArchiveInfo(file.getPath(), 64);
                packageArchiveInfo.applicationInfo.sourceDir = file.getAbsolutePath();
                packageInfo = packageArchiveInfo;
            }
            if (packageInfo == null) {
                FinskyLog.a("Cannot read archive for %s in request id=%d", uri, Integer.valueOf(lVar.f7165a));
                return false;
            }
            File file2 = new File(packageInfo.applicationInfo.sourceDir);
            lVar.p = packageInfo.packageName;
            lVar.q = Integer.valueOf(packageInfo.versionCode);
            lVar.w = file2.length();
            try {
                lVar.v = b(file2);
                if (packageInfo.signatures != null) {
                    lVar.r = c(packageInfo.signatures);
                } else {
                    lVar.r = a.a(file2.getAbsolutePath());
                }
                try {
                    lVar.t = z.a(file2);
                } catch (IOException e) {
                    FinskyLog.c("Error while getting information about apk contents for file=%s, error=%s", uri, e);
                } catch (RuntimeException e2) {
                    FinskyLog.c("Error while getting information about apk contents for file=%s, error=%s", uri, e2);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(e3);
                }
                packageInfo.applicationInfo.publicSourceDir = file2.getAbsolutePath();
                CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(getPackageManager());
                if (loadLabel != null) {
                    lVar.u = loadLabel.toString();
                }
                lVar.s = (packageInfo.applicationInfo.flags & 2) != 0;
                return true;
            } catch (IOException e4) {
                FinskyLog.c("Error while calculating sha256 for file=%s, error=%s", uri, e4);
                return false;
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e5);
            }
        } catch (Exception e6) {
            FinskyLog.c("Exception reading %s in request id=%d %s", uri, Integer.valueOf(lVar.f7165a), e6);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return a(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    static byte[] a(InputStream inputStream) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return messageDigest.digest();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[][] c(Signature[] signatureArr) {
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        byte[][] bArr = new byte[signatureArr.length][];
        for (int i = 0; i < signatureArr.length; i++) {
            bArr[i] = signatureArr[i].toByteArray();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[][] d(Signature[] signatureArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            byte[][] bArr = new byte[signatureArr.length][];
            for (int i = 0; i < signatureArr.length; i++) {
                bArr[i] = messageDigest.digest(signatureArr[i].toByteArray());
            }
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:9|(3:11|12|13))(2:25|(1:27))|14|15|17|13) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        com.google.android.finsky.utils.FinskyLog.c("Error while calculating sha256 for split apk=%s, error=%s", r8.getAbsoluteFile(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.pm.PackageInfo a(java.io.File r13, com.google.android.vending.verifier.l r14) {
        /*
            r12 = this;
            r11 = 64
            r3 = 0
            android.content.pm.PackageManager r4 = r12.getPackageManager()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "base.apk"
            r0.<init>(r13, r1)
            java.lang.String r1 = r0.getAbsolutePath()
            android.content.pm.PackageInfo r1 = r4.getPackageArchiveInfo(r1, r11)
            if (r1 == 0) goto L20
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo
            java.lang.String r0 = r0.getAbsolutePath()
            r2.sourceDir = r0
        L20:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.io.File[] r6 = r13.listFiles()
            int r7 = r6.length
            r2 = r3
        L2b:
            if (r2 >= r7) goto L7f
            r8 = r6[r2]
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L8e
            if (r1 != 0) goto L4e
            java.lang.String r0 = r8.getAbsolutePath()
            android.content.pm.PackageInfo r0 = r4.getPackageArchiveInfo(r0, r11)
            if (r0 == 0) goto L5d
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo
            java.lang.String r8 = r8.toString()
            r1.sourceDir = r8
        L49:
            int r1 = r2 + 1
            r2 = r1
            r1 = r0
            goto L2b
        L4e:
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo
            java.lang.String r0 = r0.sourceDir
            java.lang.String r9 = r8.getAbsolutePath()
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L8e
            r0 = r1
        L5d:
            byte[] r1 = b(r8)     // Catch: java.io.IOException -> L65 java.security.NoSuchAlgorithmException -> L78
            r5.add(r1)     // Catch: java.io.IOException -> L65 java.security.NoSuchAlgorithmException -> L78
            goto L49
        L65:
            r1 = move-exception
            java.lang.String r9 = "Error while calculating sha256 for split apk=%s, error=%s"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.io.File r8 = r8.getAbsoluteFile()
            r10[r3] = r8
            r8 = 1
            r10[r8] = r1
            com.google.android.finsky.utils.FinskyLog.c(r9, r10)
            goto L49
        L78:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L7f:
            int r0 = r5.size()
            byte[][] r0 = new byte[r0][]
            java.lang.Object[] r0 = r5.toArray(r0)
            byte[][] r0 = (byte[][]) r0
            r14.x = r0
            return r1
        L8e:
            r0 = r1
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.verifier.PackageVerificationService.a(java.io.File, com.google.android.vending.verifier.l):android.content.pm.PackageInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(l lVar) {
        com.android.volley.t eVar;
        String locale = getResources().getConfiguration().locale.toString();
        long longValue = com.google.android.finsky.api.d.p.b().longValue();
        if (lVar.z) {
            eVar = new f(this, lVar);
        } else {
            eVar = new e(this, lVar);
        }
        FinskyApp.a().f1434a.a(new com.google.android.vending.verifier.a.g("https://safebrowsing.google.com/safebrowsing/clientreport/download", eVar, new g(this, lVar), com.google.android.vending.verifier.a.c.a(lVar.v, lVar.w, lVar.p, lVar.q, lVar.r, null, lVar.t, lVar.d, lVar.e, lVar.j, lVar.k, lVar.l, lVar.m, lVar.n, lVar.o, locale, Long.valueOf(longValue), lVar.y, null, false, (lVar.c & 1) != 0, false, false, false, lVar.s, false, lVar.x, lVar.z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ComponentName b() {
        String b2 = com.google.android.finsky.c.d.cl.b();
        ComponentName unflattenFromString = !TextUtils.isEmpty(b2) ? ComponentName.unflattenFromString(b2) : null;
        if (unflattenFromString == null) {
            return null;
        }
        try {
            if (getPackageManager().getPackageInfo(unflattenFromString.getPackageName(), 0) == null) {
                return null;
            }
            return unflattenFromString;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static ApplicationInfo a(String str) {
        try {
            return FinskyApp.a().getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static String a(ApplicationInfo applicationInfo) {
        CharSequence applicationLabel = FinskyApp.a().getPackageManager().getApplicationLabel(applicationInfo);
        return applicationLabel == null ? applicationInfo.packageName : applicationLabel.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context) {
        try {
            int intValue = com.google.android.finsky.c.d.cB.b().intValue();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                if (packageInfo.versionCode >= intValue) {
                    try {
                        return com.google.android.gms.safetynet.f.a(context);
                    } catch (RuntimeException e) {
                        FinskyLog.d("Unable to fetch SafetyNet ID: %s", e);
                        return null;
                    }
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            FinskyLog.d("Could not get GMS Core package info for verifier shared ID", new Object[0]);
            return null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        jm.a();
        while (!this.d.isEmpty()) {
            l remove = this.d.remove(0);
            FinskyLog.c("Destroying orphaned verification id=%d", Integer.valueOf(remove.f7165a));
            a(this, remove, 1);
            b(remove);
        }
        if (this.c != null) {
            this.c.cancel(true);
            this.c = null;
        }
        f7107a = null;
        super.onDestroy();
    }

    static /* synthetic */ boolean a(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (byte[] bArr3 : bArr) {
            hashSet.add(new Signature(bArr3));
        }
        HashSet hashSet2 = new HashSet();
        for (byte[] bArr4 : bArr2) {
            hashSet2.add(new Signature(bArr4));
        }
        return hashSet.equals(hashSet2);
    }

    static /* synthetic */ void a(l lVar) {
        if (lVar.d != null) {
            String host = lVar.d.getHost();
            try {
                lVar.j = InetAddress.getByName(host);
            } catch (UnknownHostException e) {
                FinskyLog.c("Could not resolve host %s", host);
            }
        }
        if (lVar.e != null) {
            String host2 = lVar.e.getHost();
            try {
                lVar.k = InetAddress.getByName(host2);
            } catch (UnknownHostException e2) {
                FinskyLog.c("Could not resolve host %s", host2);
            }
        }
    }

    static /* synthetic */ void a(PackageVerificationService packageVerificationService, Map map, String str) {
        boolean z;
        com.android.volley.t hVar;
        String locale = packageVerificationService.getResources().getConfiguration().locale.toString();
        long longValue = com.google.android.finsky.api.d.p.b().longValue();
        boolean b2 = r.b();
        ArrayList<b> a2 = cz.a(map.values());
        if (r.a() instanceof t) {
            z = true;
            hVar = new i(packageVerificationService, a2);
        } else {
            z = false;
            hVar = new h(packageVerificationService, a2);
        }
        j jVar = new j(packageVerificationService);
        Long valueOf = Long.valueOf(longValue);
        com.google.android.vending.verifier.b.n nVar = new com.google.android.vending.verifier.b.n();
        nVar.f7142a = new com.google.android.vending.verifier.b.b[a2.size()];
        nVar.f7143b = b2;
        nVar.c = true;
        long longValue2 = bg.E.a().longValue();
        if (longValue2 > 0) {
            nVar.d = System.currentTimeMillis() - longValue2;
            nVar.e = true;
        }
        nVar.f = com.google.android.finsky.c.d.co.b().longValue();
        nVar.g = true;
        int i = 0;
        String str2 = str;
        for (b bVar : a2) {
            nVar.f7142a[i] = com.google.android.vending.verifier.a.c.a(bVar.c, bVar.d, bVar.f7116a, null, null, bVar.k, null, null, null, null, null, null, null, null, null, locale, valueOf, str2, Integer.valueOf(i), bVar.g, bVar.e, bVar.h, bVar.i, bVar.j, false, bVar.f, null, z);
            locale = null;
            valueOf = null;
            str2 = null;
            i++;
        }
        FinskyApp.a().f1434a.a(new com.google.android.vending.verifier.a.f("https://safebrowsing.google.com/safebrowsing/clientreport/download-multi", hVar, jVar, nVar));
    }

    static /* synthetic */ void a(PackageVerificationService packageVerificationService, boolean z) {
        jm.a();
        if (z) {
            bg.E.a((com.google.android.finsky.c.o<Long>) Long.valueOf(System.currentTimeMillis()));
        }
        packageVerificationService.c = null;
        packageVerificationService.a();
    }

    static /* synthetic */ void b(ApplicationInfo applicationInfo) {
        int i;
        if (applicationInfo == null) {
            return;
        }
        boolean z = (applicationInfo.flags & 1) != 0;
        if (z && Build.VERSION.SDK_INT >= 14) {
            i = 3;
        } else {
            i = 2;
        }
        try {
            FinskyApp.a().getPackageManager().setApplicationEnabledSetting(applicationInfo.packageName, i, 0);
        } catch (RuntimeException e) {
            FinskyLog.d("Error disabling application: %s", e);
        }
        if (z) {
            return;
        }
        com.google.android.finsky.installer.u.f2871a.a(applicationInfo.packageName, false);
    }

    static /* synthetic */ void c(PackageVerificationService packageVerificationService, l lVar) {
        try {
            Intent intent = new Intent("com.google.android.gms.security.verifyapps.UPLOAD_APK");
            intent.putExtra("package_name", lVar.p);
            intent.putExtra("digest", lVar.v);
            intent.putExtra("version_code", lVar.q);
            intent.putExtra("length", lVar.w);
            intent.putExtra("token", lVar.D);
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.security.verifier.ApkUploadService"));
            packageVerificationService.startService(intent);
        } catch (SecurityException e) {
            FinskyLog.d("Could not access ApkUploadService", new Object[0]);
        } catch (RuntimeException e2) {
            FinskyLog.a(e2, "Error occured while sending UPLOAD_APK intent", new Object[0]);
        }
    }

    static /* synthetic */ int a(VolleyError volleyError) {
        if (volleyError instanceof TimeoutError) {
            return 2;
        }
        if (volleyError instanceof NoConnectionError) {
            return 1;
        }
        if (volleyError instanceof NetworkError) {
            return 3;
        }
        if (volleyError instanceof ParseError) {
            return 4;
        }
        if (volleyError instanceof AuthFailureError) {
            return 5;
        }
        if (volleyError instanceof ServerError) {
            return 6;
        }
        return 7;
    }

    static /* synthetic */ void b(String str) {
        if (Build.VERSION.SDK_INT >= 20) {
            FinskyLog.a("Attempting to stop application: %s", str);
            try {
                ActivityManager.class.getMethod("forceStopPackage", String.class).invoke((ActivityManager) f7107a.getSystemService("activity"), str);
            } catch (IllegalAccessException e) {
                FinskyLog.b(e, "Cannot stop application due to reflection access exception", new Object[0]);
            } catch (NoSuchMethodException e2) {
                FinskyLog.c("Cannot stop applications on this platform", new Object[0]);
            } catch (SecurityException e3) {
                FinskyLog.b(e3, "Cannot stop application due to security exception", new Object[0]);
            } catch (InvocationTargetException e4) {
                FinskyLog.b(e4, "Cannot stop application due to reflection invocation exception", new Object[0]);
            }
        }
    }
}
