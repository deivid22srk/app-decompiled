package com.google.android.finsky.b;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ee;

/* loaded from: classes.dex */
final class n implements ee {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2125a;

    n(String str) {
        this.f2125a = str;
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a() {
        com.google.android.finsky.a.n nVar;
        FinskyLog.a("Installed Nlp Fixer", new Object[0]);
        bg.ag.a((com.google.android.finsky.c.o<Boolean>) true);
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        String str = this.f2125a;
        nVar = l.c;
        h.a(110, str, (String) null, 0, (String) null, nVar);
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a(int i, String str) {
        com.google.android.finsky.a.n nVar;
        FinskyLog.c("Error installing Nlp fixer %d %s", Integer.valueOf(i), str);
        bg.af.a((com.google.android.finsky.c.o<Boolean>) true);
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        String str2 = this.f2125a;
        nVar = l.c;
        h.a(111, str2, (String) null, i, str, nVar);
    }
}
