package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class j {
    public static void a(android.support.v4.app.aa aaVar, String str, String str2, boolean z, m mVar) {
        mVar.a();
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(str2);
        b2.f(str, new com.google.android.finsky.gpkg.au(FinskyApp.a().q, b2.b(), new k(z, str, mVar)), new l(aaVar, mVar));
    }
}
