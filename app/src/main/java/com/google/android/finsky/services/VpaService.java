package com.google.android.finsky.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.in;
import com.google.android.finsky.protos.lm;
import com.google.android.finsky.protos.lo;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class VpaService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static lm[] f4558a;
    private static VpaService f = null;
    private int c;
    private boolean e;
    private ay g;
    private int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<bg> f4559b = new ArrayList<>();
    private final IBinder h = new bh(this);

    static /* synthetic */ int a(VpaService vpaService) {
        int i = vpaService.d;
        vpaService.d = i - 1;
        return i;
    }

    static /* synthetic */ boolean d(VpaService vpaService) {
        vpaService.e = false;
        return false;
    }

    public static boolean a() {
        return f4558a == null || f4558a.length > 0;
    }

    public static void b() {
        FinskyApp a2 = FinskyApp.a();
        Intent intent = new Intent(a2, (Class<?>) VpaService.class);
        intent.setData(Uri.parse("playsetupservice://startvpa"));
        a2.startService(intent);
    }

    public static void c() {
        if (!com.google.android.finsky.cpkg.d.dN.b().booleanValue()) {
            FinskyLog.a("Skipping additional VPA because disabled.", new Object[0]);
            return;
        }
        if (com.google.android.finsky.utils.bg.ax.a().booleanValue()) {
            FinskyLog.a("Skipping additional VPA because already handled VPA.", new Object[0]);
            return;
        }
        if (!DailyHygiene.c()) {
            FinskyLog.a("Skipping additional VPA because not provisioned.", new Object[0]);
            return;
        }
        if (!com.google.android.finsky.utils.bg.aw.a().booleanValue()) {
            FinskyLog.a("Setting start-downloads flag, which was cleared", new Object[0]);
            com.google.android.finsky.utils.bg.aw.a((com.google.android.finsky.cpkg.o<Boolean>) true);
        }
        FinskyApp a2 = FinskyApp.a();
        Intent intent = new Intent(a2, (Class<?>) VpaService.class);
        intent.setData(Uri.parse("playsetupservice://startvpafornewaccount"));
        a2.startService(intent);
    }

    public static void a(lm[] lmVarArr) {
        a(FinskyApp.a().getApplicationContext(), FinskyApp.a().j(), lmVarArr, 2, true);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.h;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.c = i2;
        this.d++;
        FinskyApp.a().s.a(new az(this));
        return 3;
    }

    @Override // android.app.Service
    public void onCreate() {
        f = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        a(1);
        f = null;
    }

    public final boolean d() {
        if (this.e) {
            FinskyLog.e("Received command to load VPA while already handling", new Object[0]);
            return false;
        }
        this.e = true;
        com.google.android.finsky.utils.bg.ax.a((com.google.android.finsky.cpkg.o<Boolean>) true);
        jm.a(new ba(this), new Void[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        String c = b2.c();
        b2.b(str2, str, new bc(this, c), new be(this, c));
    }

    private static void a(Context context, String str, lm[] lmVarArr, int i, boolean z) {
        int length = lmVarArr.length;
        String[] strArr = new String[length];
        int[] iArr = new int[length];
        String[] strArr2 = new String[length];
        int[] iArr2 = new int[length];
        String[] strArr3 = new String[length];
        String[] strArr4 = new String[length];
        in[] inVarArr = new in[length];
        for (int i2 = 0; i2 < lmVarArr.length; i2++) {
            lm lmVar = lmVarArr[i2];
            strArr[i2] = lmVar.f4086a.f3740a;
            iArr[i2] = lmVar.f4087b;
            strArr2[i2] = lmVar.d;
            iArr2[i2] = i;
            strArr3[i2] = lmVar.g;
            if (lmVar.f != null && lmVar.f.g && lmVar.f.m && lmVar.f.l) {
                strArr4[i2] = lmVar.f.f;
            } else {
                strArr4[i2] = null;
            }
            inVarArr[i2] = lmVar.o;
            FinskyLog.a("Requesting preload of %s:%d", lmVar.f4086a.f3740a, Integer.valueOf(lmVar.f4087b));
        }
        RestoreService.a(context, false, str, z, strArr, iArr, strArr2, iArr2, strArr3, strArr4, inVarArr, true);
    }

    public static boolean e() {
        return f != null && f.e;
    }

    public static boolean a(ay ayVar) {
        if (ayVar == null) {
            if (f == null) {
                return true;
            }
            f.g = null;
            return true;
        }
        if (f == null || !f.e) {
            return false;
        }
        VpaService vpaService = f;
        vpaService.g = ayVar;
        new Handler(vpaService.getMainLooper()).post(new bf(vpaService));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.g != null) {
            this.g.a(i, null, false, "VpaService");
            if (i == 1) {
                this.g = null;
            }
        }
    }

    static /* synthetic */ void c(VpaService vpaService) {
        jm.a();
        if (vpaService.d != 0 || vpaService.e) {
            return;
        }
        if (f4558a == null) {
            f4558a = lm.b();
        }
        Iterator<bg> it = vpaService.f4559b.iterator();
        while (it.hasNext()) {
            it.next().a(f4558a);
        }
        vpaService.f4559b.clear();
        vpaService.a(1);
        vpaService.stopSelf(vpaService.c);
    }

    static /* synthetic */ void a(VpaService vpaService, String str) {
        com.google.android.finsky.utils.am a2 = com.google.android.finsky.utils.am.a();
        String b2 = a2.b();
        if (!TextUtils.isEmpty(b2)) {
            vpaService.a(str, b2);
        } else {
            a2.a(FinskyApp.a().b((String) null), false, new bb(vpaService, a2, str));
        }
    }

    static /* synthetic */ void a(VpaService vpaService, String str, lm lmVar) {
        lm[] lmVarArr = {lmVar};
        if (TextUtils.isEmpty(lmVar.d)) {
            lmVar.d = lmVar.f4086a.f3740a;
        }
        a(vpaService.getApplicationContext(), str, lmVarArr, 1, false);
    }

    static /* synthetic */ void a(lo loVar, com.google.android.finsky.bpkg.a aVar, String str) {
        boolean booleanValue;
        boolean booleanValue2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (loVar.f4091b.length > 0) {
            if (ik.a()) {
                booleanValue2 = true;
                booleanValue = false;
            } else {
                booleanValue = com.google.android.finsky.cpkg.d.fD.b().booleanValue();
                booleanValue2 = com.google.android.finsky.cpkg.d.fC.b().booleanValue();
            }
            for (lm lmVar : loVar.f4091b) {
                if (booleanValue) {
                    lmVar.i = false;
                }
                if (booleanValue2) {
                    lmVar.i = true;
                }
                if (lmVar.i) {
                    arrayList.add(lmVar);
                }
                com.google.android.finsky.bpkg.b a2 = aVar.a(lmVar.f4086a.f3740a);
                if (a2 == null) {
                    z = false;
                } else if (a2.c != null) {
                    z = true;
                } else {
                    z = (a2.d == null || a2.d.g == 0) ? false : true;
                }
                if (lmVar.i || !z) {
                    arrayList2.add(lmVar);
                }
            }
            if (arrayList.size() > 0) {
                a((lm[]) arrayList.toArray(new lm[arrayList.size()]));
            }
        }
        f4558a = (lm[]) arrayList2.toArray(new lm[arrayList2.size()]);
        FinskyApp.a().f(str).a(130, true);
    }
}
