package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class pz {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.h<com.google.android.gms.signin.internal.n> f6240a = new com.google.android.gms.common.api.h<>();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.h<com.google.android.gms.signin.internal.n> f6241b = new com.google.android.gms.common.api.h<>();
    public static final com.google.android.gms.common.api.f<com.google.android.gms.signin.internal.n, qg> c = new qa();
    static final com.google.android.gms.common.api.f<com.google.android.gms.signin.internal.n, qc> d = new qb();
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final com.google.android.gms.common.api.a<qg> g = new com.google.android.gms.common.api.a<>("SignIn.API", c, f6240a);
    public static final com.google.android.gms.common.api.a<qc> h = new com.google.android.gms.common.api.a<>("SignIn.INTERNAL_API", d, f6241b);
    public static final qd i = new com.google.android.gms.signin.internal.m();
}
