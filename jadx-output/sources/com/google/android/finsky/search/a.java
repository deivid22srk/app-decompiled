package com.google.android.finsky.search;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.play.search.v;
import java.util.List;

/* loaded from: classes.dex */
final class a extends AsyncTask<Void, Void, List<v>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4515a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskySearch f4516b;
    private l c;

    a(FinskySearch finskySearch, String str) {
        this.f4516b = finskySearch;
        this.f4515a = str;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ List<v> doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(List<v> list) {
        List<v> list2 = list;
        if (isCancelled()) {
            return;
        }
        this.f4516b.setSuggestions(list2);
    }

    private List<v> a() {
        long j;
        int i;
        Context context;
        int i2;
        int i3;
        Context context2;
        int i4;
        boolean z;
        g gVar;
        Context context3;
        g gVar2;
        synchronized (this.f4516b) {
            j = this.f4516b.i;
        }
        if (j > 0) {
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                try {
                    Thread.sleep(currentTimeMillis);
                } catch (InterruptedException e) {
                    cancel(false);
                }
            }
        }
        if (isCancelled()) {
            return null;
        }
        synchronized (this.f4516b) {
            FinskySearch finskySearch = this.f4516b;
            long currentTimeMillis2 = System.currentTimeMillis();
            i = this.f4516b.h;
            finskySearch.i = currentTimeMillis2 + i;
        }
        context = this.f4516b.e;
        i2 = this.f4516b.j;
        o oVar = new o(context, i2);
        i3 = this.f4516b.j;
        if (i3 != 2 || FinskyApp.a().e().a(12603044L)) {
            context2 = this.f4516b.e;
            i4 = this.f4516b.j;
            String str = this.f4515a;
            z = this.f4516b.f;
            gVar = this.f4516b.g;
            this.c = new h(context2, i4, str, oVar, z, gVar);
        } else {
            String str2 = this.f4515a;
            Context context4 = this.f4516b.getContext();
            gVar2 = this.f4516b.g;
            this.c = new c(str2, context4, oVar, gVar2);
        }
        this.f4516b.m = this.f4515a;
        String str3 = this.f4515a;
        context3 = this.f4516b.e;
        new f(str3, context3, oVar).c();
        this.c.c();
        return oVar.f4538a;
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        if (this.c != null && FinskyApp.a().e().a(12605728L)) {
            this.c.a();
            this.c = null;
        }
    }
}
