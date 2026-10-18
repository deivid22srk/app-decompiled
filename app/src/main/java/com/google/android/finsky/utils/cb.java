package com.google.android.finsky.utils;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class cb {
    public static void a(com.google.android.finsky.api.b bVar, am amVar, cf cfVar) {
        if (TextUtils.isEmpty(amVar.b())) {
            a(true, bVar, amVar, cfVar);
        } else {
            b(true, bVar, amVar, cfVar);
        }
    }

    static void a(boolean z, com.google.android.finsky.api.b bVar, am amVar, cf cfVar) {
        amVar.a(bVar, false, new cc(z, bVar, amVar, cfVar));
    }

    static void b(boolean z, com.google.android.finsky.api.b bVar, am amVar, cf cfVar) {
        bVar.a(amVar.b(), new cd(z, cfVar, amVar, bVar), new ce(cfVar));
    }
}
