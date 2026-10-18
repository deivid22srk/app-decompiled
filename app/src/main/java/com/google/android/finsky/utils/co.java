package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class co implements com.google.android.gms.common.api.y<com.google.android.gms.bpkg.d> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cn f4807a;

    co(cn cnVar) {
        this.f4807a = cnVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.bpkg.d dVar) {
        com.google.android.finsky.apkg.t tVar;
        com.google.android.gms.bpkg.d dVar2 = dVar;
        if (dVar2.b().a()) {
            com.google.android.gms.bpkg.apkg.b c = dVar2.c();
            try {
                cn cnVar = this.f4807a;
                if (c.c() != 0 && FinskyApp.a().i() != null) {
                    ArrayList arrayList = new ArrayList();
                    long longValue = bg.l.a().longValue();
                    for (int i = 0; i < c.c(); i++) {
                        com.google.android.gms.bpkg.apkg.a a2 = c.a(i);
                        long b2 = a2.b();
                        if (b2 >= longValue) {
                            com.google.android.finsky.apkg.u uVar = new com.google.android.finsky.apkg.u();
                            uVar.f1503a = a2.a();
                            uVar.f1504b = true;
                            uVar.c = b2;
                            uVar.d = true;
                            arrayList.add(uVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        tVar = null;
                    } else {
                        tVar = new com.google.android.finsky.apkg.t();
                        tVar.f1502a = new com.google.android.finsky.apkg.u[arrayList.size()];
                        arrayList.toArray(tVar.f1502a);
                    }
                    if (tVar == null) {
                        bg.l.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                    } else {
                        FinskyLog.a("Logging %d device features.", Integer.valueOf(tVar.f1502a.length));
                        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(4);
                        bVar.f1473a.O = tVar;
                        FinskyApp.a().h().b(bVar.f1473a);
                        bg.l.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                        cnVar.f4806b.d();
                    }
                }
            } finally {
                c.a();
            }
        }
    }
}
