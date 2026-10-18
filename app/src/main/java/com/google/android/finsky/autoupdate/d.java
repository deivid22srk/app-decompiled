package com.google.android.finsky.autoupdate;

import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
public final class d implements c {
    @Override // com.google.android.finsky.autoupdate.c
    public final void a(a aVar) {
        aVar.e |= 95;
        if (com.google.android.finsky.cpkg.d.aT.b().booleanValue()) {
            aVar.e |= 32;
        }
        if (bg.u.a().booleanValue()) {
            aVar.g |= 8;
        }
        aVar.g |= 1;
        if (jn.i.a().booleanValue()) {
            aVar.g |= 4;
        }
        aVar.h = "auto_update";
        aVar.i = 3;
        aVar.j = 0;
    }
}
