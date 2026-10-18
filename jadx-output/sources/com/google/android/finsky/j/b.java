package com.google.android.finsky.j;

import android.media.AudioManager;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.pe;
import com.google.android.finsky.utils.jm;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final d f2886a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final l f2887b;

    public b(l lVar) {
        d dVar = f2886a;
        if (dVar.f == null) {
            dVar.f = FinskyApp.a().f1434a;
        }
        if (dVar.h == null) {
            dVar.h = (AudioManager) FinskyApp.a().getSystemService("audio");
        }
        dVar.f2890b.setOnPreparedListener(dVar.j);
        dVar.f2890b.setOnCompletionListener(dVar.k);
        this.f2887b = lVar;
        f2886a.d.add(lVar);
    }

    public final void a() {
        d dVar = f2886a;
        dVar.d.remove(this.f2887b);
    }

    public static void a(Collection<Document> collection) {
        d dVar = f2886a;
        jm.a();
        dVar.c.clear();
        Iterator<Document> it = collection.iterator();
        while (it.hasNext()) {
            pe G = it.next().G();
            if (G != null && G.i && !TextUtils.isEmpty(G.h)) {
                dVar.c.add(G);
            }
        }
        dVar.b();
        dVar.c();
    }

    public static void a(pe peVar) {
        boolean z;
        d dVar = f2886a;
        if (dVar.g != null) {
            dVar.g.d();
        }
        int i = dVar.f2890b.f2884a;
        if (dVar.e == null && peVar == null) {
            z = true;
        } else if (dVar.e == null || peVar == null) {
            z = false;
        } else {
            z = peVar.h.equals(dVar.e.h);
        }
        if (z) {
            if (i == 4) {
                dVar.f2890b.pause();
                return;
            }
            if (i == 5) {
                dVar.f2890b.start();
                return;
            } else {
                if (i == 2) {
                    dVar.f2889a.c();
                    dVar.a();
                    return;
                }
                return;
            }
        }
        jm.a();
        dVar.c.clear();
        dVar.c.add(peVar);
        dVar.b();
        dVar.c();
    }

    public static void b() {
        f2886a.c();
    }

    public static pe c() {
        return f2886a.e;
    }

    public static void a(l lVar) {
        switch (f2886a.f2890b.f2884a) {
            case 2:
                lVar.d();
                break;
            case 3:
                lVar.e();
                break;
            case 4:
                lVar.a();
                break;
            case 5:
                lVar.b();
                break;
            case 7:
                lVar.c();
                break;
            case 8:
                lVar.g();
                break;
        }
    }

    public static int d() {
        return f2886a.c.size();
    }

    public static void e() {
        f2886a.a();
    }

    public static void a(com.google.android.finsky.navigationmanager.b bVar) {
        c cVar = new c(bVar);
        bVar.b(cVar);
        bVar.a(cVar);
    }
}
