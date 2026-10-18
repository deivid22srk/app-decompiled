package com.google.android.finsky.utils;

import com.android.volley.ServerError;
import com.google.android.finsky.FinskyApp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class am {

    /* renamed from: a, reason: collision with root package name */
    private static am f4738a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<aq> f4739b;

    public abstract void a(String str);

    public abstract String b();

    public abstract void c();

    public abstract com.google.android.finsky.protos.gk d();

    public static synchronized am a() {
        am amVar;
        synchronized (am.class) {
            if (f4738a == null) {
                f4738a = new es();
            }
            amVar = f4738a;
        }
        return amVar;
    }

    public com.google.android.finsky.protos.fq e() {
        return null;
    }

    public final void a(com.google.android.finsky.api.b bVar, boolean z, ap apVar) {
        aq aqVar = new aq(bVar, z, apVar);
        if (this.f4739b == null) {
            this.f4739b = new ArrayList<>();
        }
        this.f4739b.add(aqVar);
        if (this.f4739b.size() == 1) {
            b(aqVar);
        }
    }

    final void a(aq aqVar) {
        if (this.f4739b == null || this.f4739b.size() == 0) {
            FinskyLog.e("Empty request queue", new Object[0]);
            return;
        }
        if (this.f4739b.remove(0) != aqVar) {
            FinskyLog.e("Completed request mismatch", new Object[0]);
        }
        if (this.f4739b.size() > 0) {
            b(this.f4739b.get(0));
        }
    }

    private void b(aq aqVar) {
        com.google.android.finsky.protos.gk d;
        String str;
        com.google.android.finsky.protos.fq fqVar;
        com.google.android.finsky.api.b bVar = aqVar.f4744a;
        ap apVar = aqVar.c;
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        if (aqVar.f4745b) {
            d = null;
        } else {
            try {
                d = d();
            } catch (Exception e) {
                FinskyLog.b(e, "Exception while getting device configuration.", new Object[0]);
                if (apVar != null) {
                    apVar.a(new ServerError());
                }
                a(aqVar);
                return;
            }
        }
        try {
            str = by.a(FinskyApp.a());
        } catch (Exception e2) {
            FinskyLog.b(e2, "Exception while getting gcm registration id.", new Object[0]);
            str = null;
        }
        if (com.google.android.finsky.cpkg.d.fE.b().booleanValue() && !FinskyApp.a().e().a(12605648L)) {
            try {
                fqVar = e();
            } catch (Exception e3) {
                FinskyLog.b(e3, "Exception while getting data service subscriber.", new Object[0]);
            }
            bVar.a(d, str, fqVar, b(), new an(this, h, str, d, bVar, apVar, aqVar), new ao(this, h, apVar, aqVar));
        }
        fqVar = null;
        bVar.a(d, str, fqVar, b(), new an(this, h, str, d, bVar, apVar, aqVar), new ao(this, h, apVar, aqVar));
    }

    public static int a(int i) {
        switch (i) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
        }
    }

    public static int b(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public static int d(int i) {
        switch (i & 15) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }
}
