package com.google.android.wallet.common.pub.a;

import android.util.Log;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static b f7286a;

    public static void a(com.google.android.wallet.analytics.a.a aVar) {
        if (f7286a != null) {
            f7286a.a(aVar);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            Log.d("OrchAnalyticsDispatcher", new StringBuilder(66).append("No listener found for sending background event of type ").append(aVar.f7236a).toString());
        }
    }
}
