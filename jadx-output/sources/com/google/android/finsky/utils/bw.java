package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class bw implements com.google.android.gms.common.api.y<com.google.android.gms.people.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bu f4789a;

    bw(bu buVar) {
        this.f4789a = buVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.people.g gVar) {
        com.google.android.gms.people.g gVar2 = gVar;
        bu buVar = this.f4789a;
        jm.a();
        if (gVar2 != null) {
            try {
                if (gVar2.c() != null && gVar2.b().a()) {
                    if (gVar2.c().c() == 0) {
                        buVar.f = new String[0];
                    } else {
                        buVar.f = gVar2.c().a(0).a();
                    }
                    buVar.d = true;
                    buVar.a();
                    if (gVar2 != null) {
                        gVar2.a();
                        return;
                    }
                    return;
                }
            } finally {
                if (gVar2 != null) {
                    gVar2.a();
                }
            }
        }
        buVar.f4786a.a();
        buVar.f4787b.b((com.google.android.gms.common.api.p) buVar);
        buVar.f4787b.b((com.google.android.gms.common.api.q) buVar);
    }
}
