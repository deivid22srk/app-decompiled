package com.google.android.finsky.wear;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class bd extends AsyncTask<Void, Void, Map<String, List<String>>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f5114a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5115b;
    final /* synthetic */ bg c;
    final /* synthetic */ String[] d;
    final /* synthetic */ bc e;

    bd(bc bcVar, Account account, int i, bg bgVar, String[] strArr) {
        this.e = bcVar;
        this.f5114a = account;
        this.f5115b = i;
        this.c = bgVar;
        this.d = strArr;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, List<String>> map) {
        Context context;
        com.google.android.finsky.b.a aVar;
        com.google.android.finsky.g.h hVar;
        com.google.android.finsky.api.k kVar;
        com.google.android.finsky.b.a aVar2;
        com.google.android.finsky.api.model.t tVar;
        com.google.android.finsky.api.model.t tVar2;
        com.google.android.finsky.api.model.t tVar3;
        com.google.android.finsky.api.model.t tVar4;
        Map<String, List<String>> map2 = map;
        Iterator<List<String>> it = map2.values().iterator();
        while (it.hasNext()) {
            com.google.android.finsky.b.l.a(it.next());
        }
        bc bcVar = this.e;
        context = this.e.f5112a;
        aVar = this.e.d;
        com.google.android.finsky.b.ab abVar = aVar.f2060a;
        hVar = this.e.c;
        kVar = this.e.g;
        aVar2 = this.e.d;
        bcVar.k = new com.google.android.finsky.api.model.t(context, abVar, hVar, kVar, aVar2.f2061b, true);
        tVar = this.e.k;
        tVar.a(this.f5114a.name, map2);
        tVar2 = this.e.k;
        tVar2.a(new be(this));
        tVar3 = this.e.k;
        tVar3.a(new bf(this));
        tVar4 = this.e.k;
        tVar4.a(map2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, List<String>> doInBackground(Void[] voidArr) {
        com.google.android.finsky.b.a aVar;
        com.google.android.finsky.g.h hVar;
        aVar = this.e.d;
        hVar = this.e.c;
        return aVar.a(hVar, true);
    }
}
