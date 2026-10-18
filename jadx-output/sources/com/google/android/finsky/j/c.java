package com.google.android.finsky.j;

import android.support.v4.app.ac;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class c implements ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f2888a;

    c(com.google.android.finsky.navigationmanager.b bVar) {
        this.f2888a = bVar;
    }

    @Override // android.support.v4.app.ac
    public final void a() {
        d dVar;
        d dVar2;
        d dVar3;
        dVar = b.f2886a;
        jm.a();
        dVar.c.clear();
        dVar2 = b.f2886a;
        switch (dVar2.f2890b.f2884a) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                dVar2.f2890b.stop();
                break;
        }
        dVar3 = b.f2886a;
        dVar3.a();
        this.f2888a.b(this);
    }
}
