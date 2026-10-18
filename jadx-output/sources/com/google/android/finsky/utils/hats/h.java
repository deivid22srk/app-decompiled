package com.google.android.finsky.utils.hats;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ad;
import com.google.android.finsky.a.ah;
import com.google.android.finsky.c.o;
import com.google.android.finsky.e.t;
import com.google.android.finsky.protos.pj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {
    public static boolean a(String str) {
        o<Long> b2 = bg.az.b(str);
        return b2 == null || !b2.b();
    }

    public static void a(long j, int i) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        k b3 = FinskyApp.a().a(FinskyApp.a().j()).b();
        b3.d.b(j, null);
        b3.a();
        if (b2 != null) {
            b2.a(j, i, new i(b2), new j());
        }
    }

    public static void a(int i, long j, int i2, int i3) {
        ah ahVar = new ah();
        ahVar.f1451a = i;
        ahVar.f1452b = true;
        ahVar.c = j;
        ahVar.d = j != -1;
        ahVar.e = i2;
        ahVar.f = i2 != -1;
        ahVar.g = i3;
        ahVar.h = i3 != -1;
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        if (com.google.android.finsky.a.i.a() && com.google.android.finsky.a.i.a()) {
            StringBuilder sb = new StringBuilder("Sending survey event");
            sb.append(" type=").append(ahVar.f1451a);
            sb.append(" survey_id=").append(ahVar.c);
            sb.append(" answer_id=").append(ahVar.e);
            sb.append(" survey_context=").append(ahVar.g);
            FinskyLog.a("%s", sb);
        }
        ad b2 = h.f1485a.b();
        b2.f = ahVar;
        h.a("7", b2);
    }

    public static void a(int i, t tVar) {
        pj pjVar;
        FinskyApp a2 = FinskyApp.a();
        String j = a2.j();
        if (!TextUtils.isEmpty(j)) {
            k b2 = a2.a(j).b();
            if (b2.f4947b != null) {
                Iterator<pj> it = b2.f4947b.iterator();
                while (it.hasNext()) {
                    pjVar = it.next();
                    if (pjVar.e == i && b2.d.c(pjVar.f4251a) < 0) {
                        break;
                    }
                }
            }
            pjVar = null;
            if (pjVar != null) {
                tVar.a(pjVar);
            } else {
                tVar.m();
            }
        }
    }
}
