package com.google.android.finsky.autoupdate;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t implements com.google.android.finsky.installer.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f2055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2056b;
    final /* synthetic */ List c;
    final /* synthetic */ Map d;
    final /* synthetic */ List e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ Document h;
    final /* synthetic */ p i;

    t(p pVar, Map map, String str, List list, Map map2, List list2, String str2, boolean z, Document document) {
        this.i = pVar;
        this.f2055a = map;
        this.f2056b = str;
        this.c = list;
        this.d = map2;
        this.e = list2;
        this.f = str2;
        this.g = z;
        this.h = document;
    }

    @Override // com.google.android.finsky.installer.f
    public final void a(List<Document> list) {
        if (!list.isEmpty()) {
            this.f2055a.put(this.f2056b, list);
        }
        this.i.a(this.c, this.d, this.f2055a, this.e, this.f, this.g);
    }

    @Override // com.google.android.finsky.installer.f
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Error %s while fetching dependencies for %s - dropping", volleyError, this.f2056b);
        this.e.remove(this.h);
        this.i.a(this.c, this.d, this.f2055a, this.e, this.f, this.g);
    }
}
