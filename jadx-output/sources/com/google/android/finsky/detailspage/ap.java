package com.google.android.finsky.detailspage;

import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
final class ap implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f2544a;

    ap(al alVar) {
        this.f2544a = alVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Document document;
        List<Document> list;
        aq aqVar = (aq) this.f2544a.f2559b;
        document = this.f2544a.v;
        aqVar.d = document;
        aq aqVar2 = (aq) this.f2544a.f2559b;
        list = this.f2544a.w;
        aqVar2.c = list;
        this.f2544a.a(true);
        Toast.makeText(this.f2544a.c, com.google.android.finsky.utils.aw.a(this.f2544a.c, volleyError), 0).show();
    }
}
