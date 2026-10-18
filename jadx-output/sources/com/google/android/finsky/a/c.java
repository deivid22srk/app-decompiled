package com.google.android.finsky.a;

import android.net.Uri;
import android.os.Handler;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ji;
import com.google.android.finsky.protos.jj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f1474b = com.google.android.finsky.c.d.o.b().intValue() * 1000;
    private static final int c = com.google.android.finsky.c.d.p.b().intValue();
    private static final boolean d = com.google.android.finsky.c.d.n.b().booleanValue();
    private com.google.android.finsky.api.b e;
    private final Handler f;

    /* renamed from: a, reason: collision with root package name */
    private List<ji> f1475a = new ArrayList();
    private final Runnable g = new f(this);

    public c(Handler handler, com.google.android.finsky.api.b bVar) {
        this.f = handler;
        this.e = bVar;
    }

    private void b(String str, int i) {
        if (d) {
            new Object[1][0] = str;
            ji jiVar = new ji();
            jiVar.f3994a = System.currentTimeMillis();
            jiVar.f3995b = true;
            jiVar.c = str;
            jiVar.d = true;
            if (i != 0) {
                jiVar.k = i;
                jiVar.l = true;
            }
            this.f1475a.add(jiVar);
            b();
        }
    }

    @Override // com.google.android.finsky.a.a
    public final void a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("deepLink").append("?url=").append(Uri.encode(str)).append("&action=").append(Uri.encode("android.intent.action.VIEW"));
        b(sb.toString(), i);
    }

    @Override // com.google.android.finsky.a.a
    public final void a(String str) {
        b("confirmFreeDownload?doc=" + str, 0);
    }

    @Override // com.google.android.finsky.a.a
    public final void b(String str) {
        b("completePurchase?doc=" + str, 0);
    }

    private void b() {
        this.f.removeCallbacks(this.g);
        this.f.post(this.g);
    }

    @Override // com.google.android.finsky.a.a
    public final void a() {
        com.google.android.finsky.api.b bVar = this.e;
        this.e = FinskyApp.a().b((String) null);
        if (bVar != null) {
            this.f1475a.clear();
        } else {
            b();
        }
    }

    static /* synthetic */ void a(c cVar) {
        int size;
        if (cVar.e == null || (size = cVar.f1475a.size()) == 0) {
            return;
        }
        jj jjVar = new jj();
        jjVar.f3996a = (ji[]) cVar.f1475a.toArray(new ji[0]);
        cVar.f1475a.clear();
        cVar.e.a(jjVar, new d(cVar, size), new e(cVar, size));
    }
}
