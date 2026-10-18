package com.google.android.finsky.autoupdate;

import android.accounts.Account;
import android.os.AsyncTask;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class q extends AsyncTask<Void, Void, Map<String, List<String>>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f2051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2052b;
    final /* synthetic */ u c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    final /* synthetic */ p f;

    q(p pVar, Account account, int i, u uVar, String str, boolean z) {
        this.f = pVar;
        this.f2051a = account;
        this.f2052b = i;
        this.c = uVar;
        this.d = str;
        this.e = z;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, List<String>> map) {
        Map<String, List<String>> map2 = map;
        if (map2.isEmpty()) {
            return;
        }
        Iterator<List<String>> it = map2.values().iterator();
        while (it.hasNext()) {
            com.google.android.finsky.b.l.a(it.next());
        }
        this.f.j = new com.google.android.finsky.api.model.t(this.f.f2049a, this.f.c.f2060a, this.f.f2050b, this.f.d, this.f.c.f2061b, true);
        this.f.j.a(this.f2051a.name, map2);
        this.f.j.a(new r(this));
        this.f.j.a(new s(this));
        this.f.j.a(map2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, List<String>> doInBackground(Void[] voidArr) {
        return this.f.c.a(this.f.f2050b, true);
    }
}
