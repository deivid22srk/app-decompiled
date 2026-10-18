package com.google.android.gms.c;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.nn;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5391a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final q f5392b = new b();

    public static void a(Context context, Long l, Bundle bundle) {
        if (f5391a) {
            m b2 = new n(context).a(f5392b).a(nn.f6187b).b();
            b2.b();
            try {
                nn.c.a(b2, l, bundle).a(new c(b2));
            } catch (RuntimeException e) {
                Log.w("Herrevad", "Exception in logNetworkStats.  This call should always fail silently, so we will swallow this: " + e);
            }
        }
    }

    static /* synthetic */ boolean a() {
        f5391a = false;
        return false;
    }
}
