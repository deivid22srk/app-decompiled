package com.google.android.finsky.wear;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class bh {
    public static void a(int i, String str, String str2, int i2, String str3, com.google.android.finsky.apkg.n nVar, String str4) {
        d c;
        if (nVar == null) {
            nVar = new com.google.android.finsky.apkg.n();
        }
        nVar.p = true;
        nVar.o = true;
        com.google.android.finsky.apkg.ap apVar = new com.google.android.finsky.apkg.ap();
        if (!TextUtils.isEmpty(str4) && d.h() && (c = d.c(str4)) != null) {
            apVar.f1468b = true;
            apVar.f1467a = c.e;
        }
        com.google.android.finsky.apkg.b a2 = new com.google.android.finsky.apkg.b(i).a(str).b(str2).a(i2).c(str3).a(nVar);
        a2.f1473a.X = apVar;
        FinskyApp.a().h().b(a2.f1473a);
    }
}
