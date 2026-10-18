package com.google.android.finsky.autoupdate;

/* loaded from: classes.dex */
public final class e implements c {
    @Override // com.google.android.finsky.autoupdate.c
    public final void a(a aVar) {
        if (com.google.android.finsky.bpkg.l.a(aVar.c)) {
            aVar.l |= 1;
            aVar.k |= 1;
            if (!com.google.android.finsky.cpkg.d.aU.b().booleanValue()) {
                aVar.f |= 256;
                return;
            }
            aVar.e = 4;
            if (com.google.android.finsky.cpkg.d.aV.b().booleanValue()) {
                aVar.e |= 64;
            }
            aVar.g = 0;
            aVar.i = 2;
            aVar.j = -1000;
        }
    }
}
