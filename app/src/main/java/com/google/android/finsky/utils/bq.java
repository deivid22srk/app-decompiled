package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.lj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bq implements com.android.volley.t<lj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.t f4783a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4784b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ bt d;

    public bq(android.support.v4.app.t tVar, String str, ArrayList arrayList, bt btVar) {
        this.f4783a = tVar;
        this.f4784b = str;
        this.c = arrayList;
        this.d = btVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        lj ljVar2 = ljVar;
        if (!this.f4783a.isFinishing()) {
            if (ljVar2.f4082a == null) {
                bm.a(this.f4783a.d(), this.f4783a.getBaseContext());
                return;
            }
            android.support.v4.app.t tVar = this.f4783a;
            String str = this.f4784b;
            ArrayList arrayList = this.c;
            bt btVar = this.d;
            if (!bp.b(tVar) || bp.c) {
                return;
            }
            com.google.android.gms.common.apkg.a.a aVar = new com.google.android.gms.common.apkg.a.a("com.google.android.gms.common.acl.UPDATE_CIRCLES");
            aVar.c(FinskyApp.a().j());
            aVar.b(bp.a(str));
            aVar.a(arrayList);
            aVar.a("121");
            tVar.startActivityForResult(aVar.a(), 39);
            bp.f4781a = btVar;
            bp.f4782b = str;
            bp.c = true;
        }
    }
}
