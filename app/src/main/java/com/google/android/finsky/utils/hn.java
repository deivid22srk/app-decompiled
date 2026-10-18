package com.google.android.finsky.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.on;

/* loaded from: classes.dex */
public final class hn implements com.google.android.finsky.download.aj {
    private static String i;
    private static String j;

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.download.w f4967a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4968b = false;
    com.google.android.finsky.apkg.n c = null;
    long d = -1;
    String e = null;
    com.google.android.finsky.download.b f = null;
    private n g;
    private int h;

    public hn(com.google.android.finsky.download.w wVar, int i2) {
        this.f4967a = wVar;
        this.h = i2;
    }

    public static int a(on onVar) {
        if (!onVar.d) {
            return -1;
        }
        return onVar.c;
    }

    public final boolean a(int i2, String str) {
        if (this.f4968b) {
            FinskyLog.a("Skipping DFE self-update check as there is an update already queued.", new Object[0]);
            return true;
        }
        if (this.h >= i2) {
            FinskyLog.a("Skipping DFE self-update. Local Version [%d] >= Server Version [%d]", Integer.valueOf(this.h), Integer.valueOf(i2));
            return false;
        }
        FinskyLog.a("Starting DFE self-update from local version [%d] to server version [%d]", Integer.valueOf(this.h), Integer.valueOf(i2));
        this.f4968b = true;
        this.c = new com.google.android.finsky.apkg.n();
        this.c.c = this.h;
        this.c.d = true;
        this.c.f1490a = i2;
        this.c.f1491b = true;
        this.c.e = true;
        this.c.f = true;
        FinskyApp a2 = FinskyApp.a();
        FinskyApp.a().b(str).a(a2.getPackageName(), null, Integer.valueOf(i2), null, null, a(a2), b(a2), null, new ho(this), new hp(this));
        return true;
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(com.google.android.finsky.download.b bVar) {
        if (bVar != this.f) {
            FinskyLog.a("Self-update ignoring completed download %s", bVar);
            return;
        }
        String packageName = FinskyApp.a().getPackageName();
        FinskyApp.a().h().a(102, packageName, (String) null, 0, (String) null, this.c);
        this.f = null;
        if (this.g != null) {
            FinskyLog.a("Self-update package Uri was already assigned!", new Object[0]);
            return;
        }
        FinskyLog.a("Self-update ready to be installed, waiting for market to close.", new Object[0]);
        this.g = new n(FinskyApp.a());
        this.g.a(new hq(this, packageName, bVar), 10000);
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, int i2) {
        if (bVar == this.f) {
            this.f4968b = false;
            FinskyApp.a().h().a(104, FinskyApp.a().getPackageName(), (String) null, i2, (String) null, this.c);
            FinskyLog.d("Self-update failed because of HTTP error code: %d", Integer.valueOf(i2));
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        if (bVar == this.f) {
            FinskyApp.a().h().a(101, FinskyApp.a().getPackageName(), (String) null, 0, (String) null, this.c);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(com.google.android.finsky.download.b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(com.google.android.finsky.download.b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, com.google.android.finsky.download.r rVar) {
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (hn.class) {
            if (i == null) {
                c(context);
            }
            str = i;
        }
        return str;
    }

    private static synchronized String b(Context context) {
        String str;
        synchronized (hn.class) {
            if (j == null) {
                c(context);
            }
            str = j;
        }
        return str;
    }

    private static void c(Context context) {
        String packageName = context.getPackageName();
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray();
            i = df.a(byteArray);
            j = hy.a(byteArray);
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.e("Unable to find package info for %s - %s", packageName, e);
            i = "signature-hash-NameNotFoundException";
            j = "certificate-hash-NameNotFoundException";
        }
    }
}
