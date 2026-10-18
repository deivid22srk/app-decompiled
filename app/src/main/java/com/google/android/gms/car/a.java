package com.google.android.gms.car;

import android.content.Context;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.android.gms.common.api.h<eu> f5450a = new com.google.android.gms.common.api.h<>();
    private static final com.google.android.gms.common.api.f<eu, h> e = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<h> f5451b = new com.google.android.gms.common.api.a<>("Car.API", e, f5450a);
    public static final d c = new j(0);
    public static final g d = new k((byte) 0);

    public static com.google.android.gms.common.api.m a(Context context, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar, f fVar) {
        return new com.google.android.gms.common.api.n(context).a((com.google.android.gms.common.api.a<com.google.android.gms.common.api.a<h>>) f5451b, (com.google.android.gms.common.api.a<h>) new h(new i(fVar, (byte) 0), (byte) 0)).a(pVar).a(qVar).b();
    }

    static /* synthetic */ void a(com.google.android.gms.common.api.m mVar) {
        if (mVar == null) {
            throw new NullPointerException("GoogleApiClient is null");
        }
    }
}
