package com.google.android.finsky.billing.carrierbilling.a.a;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static h f2180a;

    static void a(int i) {
        if (f2180a != null) {
            new Handler(Looper.getMainLooper()).post(new g(i));
        }
    }
}
