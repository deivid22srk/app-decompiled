package com.google.android.finsky.bpkg;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ef;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.jm;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2121a = com.google.android.finsky.cpkg.d.aX.b();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2122b = com.google.android.finsky.cpkg.d.aY.b();
    public static com.google.android.finsky.apkg.n c = null;
    public static com.google.android.finsky.download.b d = null;

    public static void b(List<String> list) {
        list.remove("com.google.android.gms");
    }

    public static boolean a(Document document) {
        com.google.android.finsky.protos.ag E = document.E();
        if (E == null) {
            return false;
        }
        return "com.google.android.gms".equals(E.w);
    }

    public static boolean a(String str) {
        return "com.google.android.gms".equals(str);
    }

    public static void a(FinskyApp finskyApp) {
        String b2;
        String str;
        String str2;
        String str3;
        String str4;
        int intValue = com.google.android.finsky.cpkg.d.bb.b().intValue();
        if (intValue != bg.ae.a().intValue()) {
            FinskyLog.a("Resetting state because new config id %d", Integer.valueOf(intValue));
            bg.af.c();
            bg.ag.c();
            bg.ae.a((com.google.android.finsky.cpkg.o<Integer>) Integer.valueOf(intValue));
        }
        com.google.android.finsky.apkg.x xVar = new com.google.android.finsky.apkg.x();
        boolean a2 = a(finskyApp, xVar);
        FinskyLog.a("result=%b type=%d", Boolean.valueOf(a2), Integer.valueOf(xVar.f1509a));
        xVar.k = bg.af.a().booleanValue();
        xVar.l = true;
        xVar.o = bg.ag.a().booleanValue();
        xVar.p = true;
        if (a2) {
            if (bg.af.a().booleanValue() || bg.ag.a().booleanValue()) {
                FinskyLog.a("Skip repair because holdoff set", new Object[0]);
                xVar.f1509a = 3;
                xVar.f1510b = true;
            } else {
                com.google.android.finsky.apkg.n nVar = new com.google.android.finsky.apkg.n();
                c = nVar;
                nVar.c = xVar.e;
                c.d = true;
                c.e = true;
                c.f = true;
                c.f1490a = xVar.e;
                c.f1491b = true;
                if (xVar.i) {
                    String b3 = com.google.android.finsky.cpkg.d.bn.b();
                    String b4 = com.google.android.finsky.cpkg.d.bo.b();
                    b2 = com.google.android.finsky.cpkg.d.bp.b();
                    str = b3;
                    str2 = b4;
                } else {
                    String b5 = com.google.android.finsky.cpkg.d.bk.b();
                    String b6 = com.google.android.finsky.cpkg.d.bl.b();
                    b2 = com.google.android.finsky.cpkg.d.bm.b();
                    str = b5;
                    str2 = b6;
                }
                String format = String.format(Locale.US, str, Integer.valueOf(xVar.e));
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(b2)) {
                    str3 = null;
                    str4 = null;
                } else {
                    str4 = b2;
                    str3 = str2;
                }
                d = new com.google.android.finsky.download.e(format, "", null, null, str3, str4, null, -1L, -1L, null, false, true);
                com.google.android.finsky.download.w wVar = finskyApp.o;
                wVar.a(new m(finskyApp.h(), com.google.android.finsky.cpkg.d.aY.b()));
                wVar.e(d);
                finskyApp.h().a(100, com.google.android.finsky.cpkg.d.aY.b(), (String) null, 0, (String) null, c);
            }
        }
        if (!com.google.android.finsky.cpkg.d.br.b().booleanValue()) {
            int i = xVar.f1509a;
            if (i == 1 || i == 4) {
                return;
            }
        }
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(2);
        bVar.f1473a.y = xVar;
        h.b(bVar.f1473a);
    }

    public static void a() {
        bg.af.c();
    }

    public static boolean a(FinskyApp finskyApp, com.google.android.finsky.apkg.x xVar) {
        if (Build.VERSION.SDK_INT < com.google.android.finsky.cpkg.d.be.b().intValue()) {
            xVar.f1509a = 4;
            xVar.f1510b = true;
            return false;
        }
        if (Build.VERSION.SDK_INT > com.google.android.finsky.cpkg.d.bf.b().intValue()) {
            xVar.f1509a = 4;
            xVar.f1510b = true;
            return false;
        }
        Iterator<String> it = ((LocationManager) finskyApp.getSystemService("location")).getAllProviders().iterator();
        while (it.hasNext()) {
            if ("network".equals(it.next())) {
                xVar.f1509a = 1;
                xVar.f1510b = true;
                return false;
            }
        }
        try {
            String b2 = com.google.android.finsky.cpkg.d.aY.b();
            PackageManager packageManager = finskyApp.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(b2, 8256);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(b2);
            int i = packageInfo.applicationInfo.flags;
            xVar.c = i;
            xVar.d = true;
            int i2 = packageInfo.versionCode;
            xVar.e = i2;
            xVar.f = true;
            xVar.q = applicationEnabledSetting;
            xVar.r = true;
            if ((i & com.google.android.finsky.cpkg.d.bc.b().intValue()) != com.google.android.finsky.cpkg.d.bd.b().intValue()) {
                FinskyLog.a("NLP incorrect flags %d", Integer.valueOf(i));
                xVar.f1509a = 6;
                xVar.f1510b = true;
                return false;
            }
            if (i2 < com.google.android.finsky.cpkg.d.bg.b().intValue()) {
                FinskyLog.a("NLP version %d too low", Integer.valueOf(i2));
                xVar.f1509a = 7;
                xVar.f1510b = true;
                return false;
            }
            if (i2 > com.google.android.finsky.cpkg.d.bh.b().intValue()) {
                FinskyLog.a("NLP version %d too high", Integer.valueOf(i2));
                xVar.f1509a = 7;
                xVar.f1510b = true;
                return false;
            }
            String b3 = com.google.android.finsky.cpkg.d.bi.b();
            String b4 = com.google.android.finsky.cpkg.d.bj.b();
            String a2 = hy.a(packageInfo.signatures[0].toByteArray());
            if (!b3.equals(a2)) {
                if (b4.equals(a2)) {
                    xVar.i = true;
                    xVar.j = true;
                } else {
                    FinskyLog.a("NLP signature hash mismatch %s", a2);
                    xVar.g = a2;
                    xVar.h = a2 != null;
                    xVar.f1509a = 8;
                    xVar.f1510b = true;
                    return false;
                }
            }
            FinskyLog.a("NLP package found but reported inactive", new Object[0]);
            xVar.f1509a = 2;
            xVar.f1510b = true;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.c("NLP package not found", new Object[0]);
            xVar.f1509a = 5;
            xVar.f1510b = true;
            return false;
        }
    }

    public static void a(List<String> list) {
        if (com.google.android.finsky.cpkg.d.aU.b().booleanValue()) {
            if (!list.contains("com.google.android.gms")) {
                list.add("com.google.android.gms");
                return;
            }
            return;
        }
        FinskyLog.a("GMS Core auto updating is disabled", new Object[0]);
    }

    public static /* synthetic */ void a(com.google.android.finsky.download.b bVar, String str) {
        n nVar = new n(str);
        boolean booleanValue = com.google.android.finsky.cpkg.d.bq.b().booleanValue();
        FinskyApp.a().h().a(106, str, (String) null, 0, (String) null, c);
        jm.a(new ef(bVar.k(), -1L, null, nVar, false, str, booleanValue, (byte) 0), new Void[0]);
    }
}
