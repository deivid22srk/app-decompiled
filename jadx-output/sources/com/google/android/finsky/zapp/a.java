package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.volley.a.ae;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.i;
import com.google.android.finsky.a.n;
import com.google.android.finsky.a.w;
import com.google.android.finsky.b.t;
import com.google.android.finsky.c.d;
import com.google.android.finsky.protos.ab;
import com.google.android.finsky.protos.jt;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.zapp.a.b;
import com.google.android.finsky.zapp.a.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5244a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f5245b;

    /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    private a(Context context) {
        this.f5244a = context;
        this.f5245b = context.getSharedPreferences("play_module_service_shared_prefs", 0);
    }

    @Override // com.google.android.finsky.zapp.a.a
    public final void a(String str, List<Bundle> list, c cVar) {
        boolean z;
        String str2;
        if (!FinskyApp.a().e().a(12605458L)) {
            FinskyLog.c("Module delivery is disabled.", new Object[0]);
            a(null, -5001, null, null);
            return;
        }
        if (cVar == null) {
            FinskyLog.c("Callbacks are missing.", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Package name is missing.", new Object[0]);
            a(null, -5011, null, null);
            return;
        }
        int callingUid = Binder.getCallingUid();
        if (!a(str, callingUid)) {
            FinskyLog.c("Package %s does not belong to uid %s.", str, Integer.valueOf(callingUid));
            a(str, -5010, null, null);
            return;
        }
        int h = FinskyApp.a().v.h(str);
        n nVar = new n();
        nVar.f1490a = h;
        nVar.f1491b = true;
        if (!a(str)) {
            FinskyLog.c("Module delivery is not enabled for package %s.", str);
            a(str, -5002, null, nVar);
            return;
        }
        long j = this.f5245b.getLong(str, -1L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= 0 || currentTimeMillis - j >= d.fB.b().longValue() || currentTimeMillis - j < 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            FinskyLog.c("Throttling the request for package %s.", str);
            a(str, -5003, null, nVar);
            a(1, Collections.emptyList(), a(-5003), cVar, str, nVar);
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).getString("name"));
        }
        FinskyLog.a("Received module info request for %s modules from package %s v=%d", arrayList, str, Integer.valueOf(h));
        t a2 = FinskyApp.a().r.a(str);
        if (a2 == null) {
            str2 = null;
        } else {
            str2 = a2.p;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = FinskyApp.a().j();
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.c("Account missing.", new Object[0]);
            a(str, -5004, null, nVar);
            a(1, Collections.emptyList(), a(-5004), cVar, str, nVar);
            return;
        }
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(str2);
        if (b2 == null) {
            FinskyLog.c("DfeApi is missing due to invalid account.", new Object[0]);
            a(str, -5005, null, nVar);
            a(1, Collections.emptyList(), a(-5005), cVar, str, nVar);
            return;
        }
        this.f5245b.edit().putLong(str, System.currentTimeMillis()).commit();
        ae a3 = ae.a();
        b2.a(str, h, arrayList, a3, a3);
        try {
            jt jtVar = (jt) a3.get();
            FinskyLog.a("Received response for moduleDelivery with status=%s", Integer.valueOf(jtVar.f4008a));
            if (jtVar.f4008a == 1) {
                ArrayList arrayList2 = new ArrayList(jtVar.c.length);
                for (ab abVar : jtVar.c) {
                    Bundle bundle = new Bundle();
                    bundle.putString("name", abVar.f3578a);
                    bundle.putLong("version", abVar.c);
                    bundle.putLong("size", abVar.e);
                    bundle.putString("hash_sha256", abVar.g);
                    bundle.putString("download_url", abVar.i);
                    if (abVar.k.length > 0) {
                        bundle.putString("download_auth_cookie", abVar.k[0].f3955a + "=" + abVar.k[0].c);
                    }
                    arrayList2.add(bundle);
                }
                a(str, 0, null, nVar);
                a(0, arrayList2, new Bundle(), cVar, str, nVar);
                return;
            }
            a(str, jtVar.f4008a, null, nVar);
            a(1, Collections.emptyList(), a(jtVar.f4008a), cVar, str, nVar);
        } catch (InterruptedException e) {
            FinskyLog.c("Interrupted while loading ModuleDelivery: %s", e);
            a(str, -5006, null, nVar);
            a(1, Collections.emptyList(), a(-5006), cVar, str, nVar);
        } catch (ExecutionException e2) {
            FinskyLog.c("Error while loading ModuleDelivery: %s", e2);
            a(str, -5007, e2.getCause(), nVar);
            a(1, Collections.emptyList(), a(-5007), cVar, str, nVar);
        }
    }

    @Override // com.google.android.finsky.zapp.a.a
    public final void a(String str, Bundle bundle) {
        int i = 140;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Ignoring event from unknown package", new Object[0]);
            return;
        }
        if (!a(str)) {
            FinskyLog.c("Unknown client %s", str);
            return;
        }
        int callingUid = Binder.getCallingUid();
        if (!a(str, callingUid)) {
            FinskyLog.c("Package %s does not belong to uid %s.", str, Integer.valueOf(callingUid));
            return;
        }
        String string = bundle.getString("module_name");
        long j = bundle.getLong("module_version", -1L);
        int i2 = bundle.getInt("type", -1);
        int i3 = bundle.getInt("error_code", 0);
        switch (i2) {
            case 1:
                i = 139;
                break;
            case 2:
            case 6:
                break;
            case 3:
                i = 141;
                break;
            case 4:
                i = 142;
                break;
            case 5:
                i = 143;
                break;
            case 7:
                i = 145;
                break;
            case 8:
                i = 146;
                break;
            default:
                FinskyLog.c("Ignoring unknown event type: %d from package: %s", Integer.valueOf(i2), str);
                return;
        }
        int h = FinskyApp.a().v.h(str);
        n nVar = new n();
        nVar.f1490a = h;
        nVar.f1491b = true;
        w wVar = new w();
        wVar.f1507a = string;
        wVar.f1508b = true;
        wVar.c = j;
        wVar.d = true;
        i h2 = FinskyApp.a().h();
        com.google.android.finsky.a.b a2 = new com.google.android.finsky.a.b(i).a(str).a(i3).a(nVar);
        a2.f1473a.ab = wVar;
        h2.b(a2.f1473a);
    }

    private static void a(int i, List<Bundle> list, Bundle bundle, c cVar, String str, n nVar) {
        try {
            cVar.a(i, list, bundle);
        } catch (DeadObjectException e) {
            FinskyLog.c("Calling process has died", new Object[0]);
            a(str, -5008, e.getCause(), nVar);
        } catch (RemoteException e2) {
            FinskyLog.c("Failed to send module delivery info to the calling process: %s", e2);
            a(str, -5009, e2.getCause(), nVar);
        }
    }

    private static boolean a(String str) {
        for (String str2 : jm.d(d.fA.b())) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i) {
        String[] packagesForUid = this.f5244a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        return bundle;
    }

    private static void a(String str, int i, Throwable th, n nVar) {
        FinskyApp.a().h().b(new com.google.android.finsky.a.b(137).a(str).a(i).a(th).a(nVar).f1473a);
    }
}
