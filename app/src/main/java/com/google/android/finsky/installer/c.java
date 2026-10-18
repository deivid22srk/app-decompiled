package com.google.android.finsky.installer;

import android.content.Context;
import com.google.android.finsky.protos.fw;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class c implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.model.t f2858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f2859b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;
    final /* synthetic */ fw[] e;
    final /* synthetic */ Map f;
    final /* synthetic */ boolean g;
    final /* synthetic */ String h;
    final /* synthetic */ f i;
    final /* synthetic */ e j;
    final /* synthetic */ Map k;

    c(com.google.android.finsky.api.model.t tVar, List list, Context context, String str, fw[] fwVarArr, Map map, boolean z, String str2, f fVar, e eVar, Map map2) {
        this.f2858a = tVar;
        this.f2859b = list;
        this.c = context;
        this.d = str;
        this.e = fwVarArr;
        this.f = map;
        this.g = z;
        this.h = str2;
        this.i = fVar;
        this.j = eVar;
        this.k = map2;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        b.a(this.f2858a.f1990a, this.f2859b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
