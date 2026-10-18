package com.google.android.gms.common.stats;

import com.google.android.gms.internal.mp;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static mp<Integer> f5779a = mp.a("gms:common:stats:connections:level", Integer.valueOf(e.f5782b));

    /* renamed from: b, reason: collision with root package name */
    public static mp<String> f5780b = mp.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static mp<String> c = mp.a("gms:common:stats:connections:ignored_calling_services", "");
    public static mp<String> d = mp.a("gms:common:stats:connections:ignored_target_processes", "");
    public static mp<String> e = mp.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static mp<Long> f = mp.a("gms:common:stats:connections:time_out_duration", (Long) 600000L);
}
