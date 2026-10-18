package com.google.android.finsky.search;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ao;
import com.google.android.finsky.utils.jm;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.v;
import java.util.List;

/* loaded from: classes.dex */
public class FinskySearch extends PlaySearch {
    private final Context e;
    private final boolean f;
    private final g g;
    private final int h;
    private long i;
    private int j;
    private AsyncTask<Void, Void, List<v>> k;
    private com.google.android.finsky.navigationmanager.b l;
    private String m;

    public FinskySearch(Context context) {
        this(context, null);
    }

    public FinskySearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        this.e = context;
        this.f = !e.a(12603102L);
        this.g = new g();
        this.h = com.google.android.finsky.c.d.eG.b().intValue();
    }

    public void setNavigationManager(com.google.android.finsky.navigationmanager.b bVar) {
        this.l = bVar;
    }

    public void setCurrentBackendId(int i) {
        this.j = i;
    }

    @Override // com.google.android.play.search.PlaySearch, com.google.android.play.search.n
    public final void a(String str) {
        super.a(str);
        a(str, this.j);
    }

    @Override // com.google.android.play.search.PlaySearch, com.google.android.play.search.n
    public final void a(int i) {
        super.a(i);
        if (i == 3 || i == 4) {
            a();
        }
    }

    private synchronized void a() {
        this.i = 0L;
    }

    @Override // com.google.android.play.search.PlaySearch, com.google.android.play.search.n
    public final void a(String str, boolean z) {
        super.a(str, z);
        if (!this.c.a() && z) {
            if (this.k != null) {
                this.k.cancel(true);
            }
            this.k = new a(this, str);
            jm.a(this.k, new Void[0]);
        }
    }

    @Override // com.google.android.play.search.PlaySearch, com.google.android.play.search.n
    public final void a(v vVar) {
        b bVar = (b) vVar;
        super.a(vVar);
        String str = vVar.e;
        if (bVar.c) {
            String str2 = this.m;
            ao f = com.google.android.finsky.a.i.f();
            f.g = 4;
            f.h = true;
            f.f1465a = str2;
            f.f1466b = true;
            f.c = str;
            f.d = true;
            f.o = bVar.d;
            f.p = true;
            FinskyApp.a().h().b(new com.google.android.finsky.a.b(511).a(f).f1473a);
        } else {
            g gVar = this.g;
            if (gVar.f4527a != null && !bVar.c) {
                ao f2 = com.google.android.finsky.a.i.f();
                g.a(gVar.f4527a, f2);
                if (bVar.f4518b != null && bVar.f4518b.length > 0) {
                    f2.m = bVar.f4518b;
                    f2.n = true;
                }
                f2.c = TextUtils.isEmpty(bVar.g) ? str : bVar.g;
                f2.d = true;
                f2.o = bVar.d;
                f2.p = true;
                FinskyApp.a().h().b(new com.google.android.finsky.a.b(511).a(f2).f1473a);
            }
        }
        if (bVar.f4517a == null) {
            a(str, bVar.d);
        } else {
            this.l.a(bVar.f4517a, FinskyApp.a().g, this.e.getPackageManager());
        }
    }

    private void a(String str, int i) {
        b(2);
        a();
        FinskyApp.a().A.saveRecentQuery(str, Integer.toString(i));
        if (this.l != null) {
            this.l.a(str, i);
        }
    }
}
