package com.google.android.finsky.utils;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.kz;
import com.google.android.finsky.protos.lp;
import com.google.android.finsky.protos.qe;
import com.google.android.finsky.protos.qf;
import com.google.android.finsky.protos.qu;
import com.google.android.finsky.protos.qv;
import com.google.android.finsky.protos.qw;
import com.google.android.finsky.protos.qx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    private static final List<ji> f5020a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final long[] f5021b = {12603428};
    private static com.google.android.finsky.d.e c;

    public static void a(String str, qu... quVarArr) {
        if (quVarArr.length > 0) {
            for (qu quVar : quVarArr) {
                a(str, quVar.c);
            }
        }
        if (quVarArr.length == 1) {
            qu quVar2 = quVarArr[0];
            a(str, quVar2.f4313b ? quVar2.f4312a : 7);
        } else {
            a(str, 7);
        }
    }

    public static void a() {
        for (Account account : com.google.android.finsky.api.a.a(FinskyApp.a())) {
            a(account.name, 7);
        }
    }

    public static void a(String str) {
        a(str, 7);
    }

    public static void a(String str, int i) {
        FinskyLog.a("Refreshing user settings: account=%s", FinskyLog.a(str));
        com.google.android.finsky.c.o<String> b2 = bg.aJ.b(str);
        com.google.android.finsky.c.o<Integer> b3 = bg.aM.b(str);
        Integer a2 = b3.a();
        if (a2 == null) {
            b3.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(i));
        } else if (a2.intValue() != i) {
            b3.a((com.google.android.finsky.c.o<Integer>) 7);
        }
        int intValue = i(str).intValue();
        FinskyApp.a().b(str).a(e(str), intValue, new jc(str, intValue, b2), new jd());
    }

    public static void b(String str) {
        Integer i = i(str);
        if (i != null) {
            a(str, i.intValue());
        }
    }

    public static qv c(String str) {
        String a2 = bg.aJ.b(str).a();
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        qv qvVar = new qv();
        if (dg.a(a2, qvVar)) {
            return qvVar;
        }
        return null;
    }

    public static boolean d(String str) {
        return i(str) != null;
    }

    private static Integer i(String str) {
        com.google.android.finsky.c.o<Integer> b2 = bg.aM.b(str);
        if (c(str) == null) {
            return 7;
        }
        return b2.a();
    }

    public static qw e(String str) {
        jm.a();
        String a2 = bg.aN.b(str).a();
        qw qwVar = new qw();
        if (TextUtils.isEmpty(a2)) {
            return qwVar;
        }
        dg.a(a2, qwVar);
        return qwVar;
    }

    public static void a(String str, qw qwVar) {
        if (qwVar != null && qwVar.f4316a != null) {
            for (int i = 0; i < qwVar.f4316a.length; i++) {
                a(str, qwVar.f4316a[i]);
            }
        }
    }

    public static void a(String str, qx qxVar) {
        boolean z;
        if (qxVar == null || qxVar.f4317a == null || qxVar.c == null) {
            FinskyLog.e("Invalid argument: updatedTokenInfo missing required field", new Object[0]);
            return;
        }
        jm.a();
        qw e = e(str);
        if (e.f4316a != null) {
            z = false;
            for (qx qxVar2 : e.f4316a) {
                if (qxVar.f4317a.equals(qxVar2.f4317a)) {
                    qxVar2.c = qxVar.c;
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            int length = e.f4316a == null ? 0 : e.f4316a.length;
            qx[] qxVarArr = new qx[length + 1];
            if (length > 0) {
                System.arraycopy(e.f4316a, 0, qxVarArr, 0, length);
            }
            qxVarArr[length] = qxVar;
            e.f4316a = qxVarArr;
        }
        bg.aN.b(str).a((com.google.android.finsky.c.o<String>) dg.a(e));
        FinskyLog.a("Updated user setting consistency token.", new Object[0]);
    }

    public static com.google.android.finsky.d.e b() {
        if (c == null) {
            c = new je();
        }
        return c;
    }

    public static void a(ji jiVar) {
        f5020a.add(jiVar);
    }

    public static void b(ji jiVar) {
        f5020a.remove(jiVar);
    }

    public static kz f(String str) {
        qv c2 = c(str);
        if (c2 == null) {
            return null;
        }
        return c2.e;
    }

    public static void g(String str) {
        qe qeVar = new qe();
        qeVar.c = 1;
        qeVar.d = true;
        a(str, qeVar, 4, (com.android.volley.t<qf>) null, (com.android.volley.s) null);
    }

    public static com.google.android.finsky.protos.jm h(String str) {
        qv c2 = c(str);
        if (c2 == null) {
            return null;
        }
        return c2.f4314a;
    }

    public static void a(String str, boolean z, com.android.volley.s sVar) {
        qe qeVar = new qe();
        qeVar.f4290a = new com.google.android.finsky.protos.jm();
        qeVar.f4290a.f4000b = true;
        qeVar.f4290a.f3999a = z;
        a(str, qeVar, 1, (com.android.volley.t<qf>) null, sVar);
    }

    public static void a(String str, int i, int i2, com.android.volley.t<qf> tVar, com.android.volley.s sVar) {
        lp lpVar = new lp();
        lpVar.c = i2;
        lpVar.d = true;
        lpVar.f4092a = i;
        lpVar.f4093b = true;
        qe qeVar = new qe();
        qeVar.f4291b = lpVar;
        a(str, qeVar, 2, tVar, sVar);
    }

    private static void a(String str, qe qeVar, int i, com.android.volley.t<qf> tVar, com.android.volley.s sVar) {
        FinskyApp.a().b(str).a(qeVar, e(str), new jg(str, i, tVar), new jh(sVar));
    }

    static /* synthetic */ void b(String str, int i) {
        com.google.android.finsky.c.o<Integer> b2 = bg.aM.b(str);
        Integer a2 = b2.a();
        if (a2 == null || a2.intValue() != i) {
            return;
        }
        b2.c();
    }

    static /* synthetic */ void a(boolean z) {
        for (int size = f5020a.size() - 1; size >= 0; size--) {
            ji jiVar = f5020a.get(size);
            if (z) {
                jiVar.H_();
            } else {
                jiVar.I_();
            }
        }
    }
}
