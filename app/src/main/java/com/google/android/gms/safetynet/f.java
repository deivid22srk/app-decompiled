package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {
    public static String a(Context context) {
        m b2 = new n(context).a(a.c).b();
        if (!b2.a(15000L, TimeUnit.MILLISECONDS).b()) {
            return "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        }
        try {
            e a2 = a.e.a(b2).a(15000L, TimeUnit.MILLISECONDS);
            b2.d();
            String a3 = a2.a();
            return a3 == null ? "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa" : a3;
        } catch (Throwable th) {
            b2.d();
            throw th;
        }
    }
}
