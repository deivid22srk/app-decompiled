package com.google.android.finsky.api.model;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ay;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.utils.dd;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class e extends j implements com.android.volley.t<ay> {

    /* renamed from: b, reason: collision with root package name */
    private static String f1972b;

    /* renamed from: a, reason: collision with root package name */
    public ay f1973a;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ay ayVar) {
        j();
        this.f1973a = ayVar;
        l();
    }

    public e(com.google.android.finsky.api.b bVar, String str, qm qmVar) {
        bVar.a(str, qmVar, this, this);
    }

    public static qm a(String str) {
        if (f1972b == null) {
            f1972b = com.google.android.finsky.cpkg.d.eF.b();
        }
        for (String str2 : jm.d(f1972b)) {
            if (str2.equals(str)) {
                qm qmVar = new qm();
                qmVar.f4299a = dd.a(FinskyApp.a().g().b());
                return qmVar;
            }
        }
        return null;
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.f1973a != null;
    }

    public final boolean b() {
        return this.f1973a != null && this.f1973a.w;
    }
}
