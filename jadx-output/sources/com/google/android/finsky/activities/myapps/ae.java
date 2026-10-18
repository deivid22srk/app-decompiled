package com.google.android.finsky.activities.myapps;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.jr;
import java.util.List;

/* loaded from: classes.dex */
final class ae implements com.android.volley.t<jr> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f1810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f1811b;

    ae(ac acVar, List list) {
        this.f1811b = acVar;
        this.f1810a = list;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(jr jrVar) {
        com.google.android.finsky.api.b bVar;
        com.google.android.finsky.g.ah ahVar = FinskyApp.a().q;
        bVar = this.f1811b.aq;
        ahVar.a(bVar.b(), "myapps-archive", new af(this), jrVar.f4005a);
    }
}
