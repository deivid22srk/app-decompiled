package com.google.android.finsky.utils;

import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bv implements com.google.android.gms.common.api.y<com.google.android.gms.people.e> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bu f4788a;

    bv(bu buVar) {
        this.f4788a = buVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.people.e eVar) {
        com.google.android.gms.people.e eVar2 = eVar;
        bu buVar = this.f4788a;
        jm.a();
        if (eVar2 != null) {
            try {
                if (eVar2.b().a()) {
                    buVar.e = new ArrayList<>();
                    Iterator<com.google.android.gms.people.model.a> it = eVar2.c().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.people.model.a next = it.next();
                        buVar.e.add(AudienceMember.a(next.a(), next.b()));
                    }
                    buVar.c = true;
                    buVar.a();
                    if (eVar2 != null) {
                        eVar2.a();
                        return;
                    }
                    return;
                }
            } finally {
                if (eVar2 != null) {
                    eVar2.a();
                }
            }
        }
        buVar.f4786a.a();
        buVar.f4787b.b((com.google.android.gms.common.api.p) buVar);
        buVar.f4787b.b((com.google.android.gms.common.api.q) buVar);
    }
}
