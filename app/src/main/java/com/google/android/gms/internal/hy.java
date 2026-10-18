package com.google.android.gms.internal;

import android.content.Context;

@gw
/* loaded from: classes.dex */
public final class hy {

    /* renamed from: a, reason: collision with root package name */
    static jt f6042a;
    private static final Object c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ic<Void> f6043b = new hz();

    public hy(Context context) {
        f6042a = a(context);
    }

    private static jt a(Context context) {
        jt jtVar;
        synchronized (c) {
            if (f6042a == null) {
                f6042a = c.a(context.getApplicationContext());
            }
            jtVar = f6042a;
        }
        return jtVar;
    }
}
