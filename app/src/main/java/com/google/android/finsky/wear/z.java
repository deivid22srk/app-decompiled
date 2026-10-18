package com.google.android.finsky.wear;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.jm;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class z implements com.google.android.finsky.bpkg.x {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.finsky.bpkg.y f5161a = new com.google.android.finsky.bpkg.y(null, null, false, false, false, false, -1, false);

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, z> f5162b = new HashMap();
    private final Context c;
    private final com.google.android.gms.common.api.m d;
    private final String e;
    private boolean g;
    private List<Runnable> i;
    private Map<String, com.google.android.finsky.bpkg.y> f = null;
    private long j = -1;
    private Handler h = new Handler(Looper.getMainLooper());

    static /* synthetic */ List c(z zVar) {
        zVar.i = null;
        return null;
    }

    static /* synthetic */ boolean d(z zVar) {
        zVar.g = true;
        return true;
    }

    public static synchronized z a(Context context, String str, com.google.android.gms.common.api.m mVar) {
        z zVar;
        synchronized (z.class) {
            if (!f5162b.containsKey(str)) {
                f5162b.put(str, new z(context, str, mVar));
            }
            zVar = f5162b.get(str);
        }
        return zVar;
    }

    private z(Context context, String str, com.google.android.gms.common.api.m mVar) {
        this.c = context.getApplicationContext();
        this.e = str;
        this.d = mVar;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.g) {
            this.h.post(runnable);
        } else {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(runnable);
            if (this.i.size() == 1) {
                com.google.android.gms.wearable.aa.f6462a.a(this.d).a(new aa(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(com.google.android.gms.wearable.n nVar) {
        Status status = nVar.f6632b;
        if (!status.a()) {
            FinskyLog.c("Error %d getting data items. (%s)", Integer.valueOf(status.g), status.h);
        } else {
            this.f = new HashMap();
            String str = this.e + "/package_info";
            int c = nVar.c();
            for (int i = 0; i < c; i++) {
                com.google.android.gms.wearable.l a2 = nVar.a(i);
                if (a2.b().toString().contains(str)) {
                    com.google.android.finsky.bpkg.y b2 = b(a2);
                    this.f.put(b2.f2137a, b2);
                }
            }
            this.j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.google.android.finsky.bpkg.x
    public final synchronized com.google.android.finsky.bpkg.y a(String str) {
        com.google.android.finsky.bpkg.y yVar;
        yVar = this.f.get(str);
        if (yVar == f5161a) {
            yVar = null;
        }
        return yVar;
    }

    @Override // com.google.android.finsky.bpkg.x
    public final synchronized void e(String str) {
        com.google.android.gms.wearable.aa.f6462a.a(this.d, Uri.parse("wear://" + this.e + "/package_info/" + str)).a(new ac(this, str));
    }

    @Override // com.google.android.finsky.bpkg.x
    public final boolean f(String str) {
        return false;
    }

    @Override // com.google.android.finsky.bpkg.x
    public final String g(String str) {
        FinskyLog.e("Calling getVersionName on wearable package", new Object[0]);
        return "";
    }

    @Override // com.google.android.finsky.bpkg.x
    public final int h(String str) {
        com.google.android.finsky.bpkg.y a2 = a(str);
        if (a2 == null) {
            return -1;
        }
        return a2.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    public static com.google.android.finsky.bpkg.y b(com.google.android.gms.wearable.l lVar) {
        String[] strArr;
        boolean z;
        boolean z2;
        boolean z3 = true;
        String a2 = bi.a(lVar.b());
        com.google.android.gms.wearable.o a3 = com.google.android.gms.wearable.o.a(lVar.c());
        ArrayList<com.google.android.gms.wearable.o> h = a3.h("signatures");
        if (h != null) {
            strArr = new String[h.size()];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = hy.a(h.get(i).i("signature"));
            }
        } else {
            strArr = null;
        }
        int d = a3.d("applicationFlags");
        boolean z4 = (d & 1) != 0;
        boolean z5 = (d & 128) != 0;
        int d2 = a3.d("applicationEnabledSetting");
        if (d2 == 0) {
            z = false;
        } else {
            z = d2 == 3 || d2 == 4;
            if (z || d2 == 2) {
                z2 = z;
                return new com.google.android.finsky.bpkg.y(a2, strArr, z4, z5, z3, z2, a3.d("versionCode"), false);
            }
        }
        z3 = false;
        z2 = z;
        return new com.google.android.finsky.bpkg.y(a2, strArr, z4, z5, z3, z2, a3.d("versionCode"), false);
    }

    @Override // com.google.android.finsky.bpkg.x
    public final Collection<com.google.android.finsky.bpkg.y> a() {
        jm.b();
        Semaphore semaphore = new Semaphore(0);
        a(new ab(this, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            FinskyLog.b(e, "Unexpected interruption", new Object[0]);
        }
        return this.f.values();
    }
}
