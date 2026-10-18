package com.google.android.finsky.utils.hats;

import com.android.volley.t;
import com.google.android.finsky.protos.pm;
import com.google.android.finsky.utils.cz;

/* loaded from: classes.dex */
public final class l implements t<pm> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f4948a;

    public l(k kVar) {
        this.f4948a = kVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(pm pmVar) {
        boolean z = false;
        this.f4948a.f4947b = cz.a(pmVar.f4257a);
        android.support.v4.h.f fVar = new android.support.v4.h.f();
        for (int i = 0; i < this.f4948a.f4947b.size(); i++) {
            fVar.b(this.f4948a.f4947b.get(i).f4251a, null);
        }
        int i2 = 0;
        while (i2 < this.f4948a.d.a()) {
            long a2 = this.f4948a.d.a(i2);
            if (fVar.c(a2) >= 0) {
                i2++;
            } else {
                this.f4948a.d.b(a2);
                z = true;
            }
        }
        if (!z) {
            return;
        }
        this.f4948a.a();
    }
}
