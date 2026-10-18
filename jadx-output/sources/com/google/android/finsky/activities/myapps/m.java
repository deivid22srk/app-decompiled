package com.google.android.finsky.activities.myapps;

import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class m extends AsyncTask<Void, Void, Map<String, List<String>>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1831a;

    m(l lVar) {
        this.f1831a = lVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, List<String>> map) {
        boolean z;
        Map map2;
        Map<String, List<String>> map3 = map;
        Iterator<List<String>> it = map3.values().iterator();
        while (it.hasNext()) {
            com.google.android.finsky.b.l.b(it.next());
        }
        if (this.f1831a.k != 0) {
            ((com.google.android.finsky.api.model.t) this.f1831a.k).a(this.f1831a.f.c(), map3);
            map2 = this.f1831a.n;
            if (!map2.equals(map3)) {
                this.f1831a.l();
                z = true;
            }
            this.f1831a.m_();
        }
        z = false;
        this.f1831a.k = new com.google.android.finsky.api.model.t(this.f1831a.d, FinskyApp.a().r, FinskyApp.a().p, FinskyApp.a().b(), FinskyApp.a().v, false);
        if (!z) {
            ((com.google.android.finsky.api.model.t) this.f1831a.k).a(this.f1831a.f.c(), map3);
        }
        this.f1831a.n = map3;
        ((com.google.android.finsky.api.model.t) this.f1831a.k).a((com.google.android.finsky.api.model.x) this.f1831a);
        ((com.google.android.finsky.api.model.t) this.f1831a.k).a((com.android.volley.s) this.f1831a);
        ((com.google.android.finsky.api.model.t) this.f1831a.k).a(map3);
        Iterator<Map.Entry<String, List<String>>> it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().size() > 0) {
                return;
            }
        }
        this.f1831a.m_();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, List<String>> doInBackground(Void[] voidArr) {
        return FinskyApp.a().s.a(FinskyApp.a().p, false);
    }
}
