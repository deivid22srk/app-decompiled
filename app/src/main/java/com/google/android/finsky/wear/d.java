package com.google.android.finsky.wear;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.protos.gk;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends com.google.android.finsky.utils.am {
    private static final byte[] t = new byte[0];
    private static boolean u;
    private static ArrayList<Runnable> v;
    private static Handler w;
    private static List<String> x;
    private static Map<String, d> y;

    /* renamed from: a, reason: collision with root package name */
    public final String f5122a;

    /* renamed from: b, reason: collision with root package name */
    public final gk f5123b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;

    static /* synthetic */ ArrayList k() {
        v = null;
        return null;
    }

    static /* synthetic */ boolean l() {
        u = true;
        return true;
    }

    public static synchronized String[] f() {
        String[] strArr;
        synchronized (d.class) {
            if (!u) {
                FinskyLog.e("Should not be called before nodes are loaded", new Object[0]);
            }
            strArr = (String[]) x.toArray(new String[x.size()]);
        }
        return strArr;
    }

    public static synchronized boolean b(String str) {
        boolean z;
        synchronized (d.class) {
            if (!u) {
                FinskyLog.e("Should not be called before nodes are loaded", new Object[0]);
            }
            Iterator<String> it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().equals(str)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public static synchronized d c(String str) {
        d dVar;
        synchronized (d.class) {
            if (!u) {
                FinskyLog.e("Should not be called before nodes are loaded", new Object[0]);
            }
            dVar = y.get(str);
        }
        return dVar;
    }

    public static synchronized void g() {
        synchronized (d.class) {
            u = false;
        }
    }

    public static synchronized boolean h() {
        boolean z;
        synchronized (d.class) {
            z = u;
        }
        return z;
    }

    public static synchronized void a(com.google.android.gms.common.api.m mVar, Runnable runnable) {
        synchronized (d.class) {
            if (w == null) {
                w = new Handler(Looper.getMainLooper());
            }
            if (u) {
                w.post(runnable);
            } else {
                if (v == null) {
                    v = new ArrayList<>();
                }
                v.add(runnable);
                if (v.size() == 1) {
                    com.google.android.gms.wearable.aa.f6462a.b(mVar, bi.f5119b).a(new e(new ArrayList(), mVar));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void b(com.google.android.gms.common.api.m mVar, com.google.android.gms.wearable.n nVar, List<String> list) {
        boolean z;
        synchronized (d.class) {
            x = Collections.emptyList();
            y = Collections.emptyMap();
            Status status = nVar.f6632b;
            if (!status.a()) {
                FinskyLog.c("Error %d getting data items. (%s)", Integer.valueOf(status.g), status.h);
            } else {
                int c = nVar.c();
                for (int i = 0; i < c; i++) {
                    com.google.android.gms.wearable.l a2 = nVar.a(i);
                    String b2 = bi.b(a2.b());
                    d dVar = new d(b2, a2);
                    if (dVar.c < 80400050) {
                        FinskyLog.a("Discard wear node %s because v=%d", b2, Integer.valueOf(dVar.c));
                    } else if (list.contains(b2)) {
                        FinskyLog.a("Discard wear node %s because inactive", b2);
                    } else if ("0".equals(dVar.e)) {
                        FinskyLog.a("Discard wear node %s because androidId is 0", b2);
                        com.google.android.gms.wearable.aa.c.a(mVar, b2, "get_device_configuration", t).a(new g());
                    } else {
                        String[] strArr = dVar.f5123b.v;
                        int length = strArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            } else {
                                if ("android.hardware.type.watch".equals(strArr[i2])) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                        }
                        if (!z) {
                            FinskyLog.a("Discard wear node %s because not watch", b2);
                        } else {
                            FinskyLog.a("Found wear node %s", b2);
                            if (x.size() == 0) {
                                x = new ArrayList();
                            }
                            x.add(b2);
                            if (y.size() == 0) {
                                y = new HashMap();
                            }
                            y.put(b2, dVar);
                        }
                    }
                }
            }
        }
    }

    private d(String str, com.google.android.gms.wearable.l lVar) {
        this.f5122a = str;
        com.google.android.gms.wearable.o a2 = com.google.android.gms.wearable.o.a(lVar.c());
        gk gkVar = new gk();
        gkVar.f3868a = b(a2.d("touchScreen"));
        gkVar.f3869b = true;
        gkVar.c = a(a2.d("keyboard"));
        gkVar.d = true;
        gkVar.e = c(a2.d("navigation"));
        gkVar.f = true;
        gkVar.g = d(a2.d("screenLayout"));
        gkVar.h = true;
        gkVar.i = a2.c("hasHardKeyboard");
        gkVar.j = true;
        gkVar.k = a2.c("hasFiveWayNavigation");
        gkVar.l = true;
        gkVar.m = a2.d("screenDensity");
        gkVar.n = true;
        gkVar.o = a2.d("screenWidth");
        gkVar.p = true;
        gkVar.q = a2.d("screenHeight");
        gkVar.r = true;
        gkVar.s = a2.d("glEsVersion");
        gkVar.t = true;
        gkVar.u = a2.j("systemSharedLibrary");
        gkVar.v = a2.j("systemAvailableFeatures");
        gkVar.w = a2.j("nativePlatform");
        gkVar.x = a2.j("systemSupportedLocales");
        gkVar.y = a2.j("glExtension");
        gkVar.B = a2.d("smallestScreenWidth");
        gkVar.C = true;
        if (a2.a("lowRamDevice")) {
            gkVar.D = a2.c("lowRamDevice");
            gkVar.E = true;
        }
        if (a2.a("totalMemoryBytes")) {
            gkVar.F = a2.e("totalMemoryBytes");
            gkVar.G = true;
        }
        if (a2.a("maxNumOfCpuCores")) {
            gkVar.H = a2.d("maxNumOfCpuCores");
            gkVar.I = true;
        }
        this.f5123b = gkVar;
        this.c = a2.d("wearskyVersionCode");
        this.d = a2.f("wearskyVersionName");
        this.e = a2.f("androidId");
        this.f = a2.f("deviceDataVersionInfo");
        this.g = a2.f("loggingId");
        this.h = a2.f("buildDevice");
        this.i = a2.f("buildFingerprint");
        this.j = a2.f("buildHardware");
        this.k = a2.f("buildId");
        this.l = a2.f("buildModel");
        this.m = a2.f("buildProduct");
        this.n = a2.f("buildVersionRelease");
        this.o = a2.d("buildVersionSdkInt");
        this.p = a2.f("simOperator");
        this.q = a2.f("simOperatorName");
        this.r = a2.f("networkOperator");
        this.s = a2.f("networkOperatorName");
    }

    @Override // com.google.android.finsky.utils.am
    public final String b() {
        return com.google.android.finsky.utils.bg.aD.b(this.f5122a).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.utils.am
    public final void a(String str) {
        com.google.android.finsky.utils.bg.aD.b(this.f5122a).a((com.google.android.finsky.cpkg.o<String>) str);
    }

    @Override // com.google.android.finsky.utils.am
    public final void c() {
        com.google.android.finsky.utils.bg.aD.b(this.f5122a).c();
    }

    @Override // com.google.android.finsky.utils.am
    public final gk d() {
        return this.f5123b;
    }
}
