package com.google.android.finsky.billing;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static com.google.android.finsky.cpkg.o<String> f2271a;

    /* renamed from: b, reason: collision with root package name */
    public static com.google.android.finsky.cpkg.o<Long> f2272b;
    public static com.google.android.finsky.cpkg.o<Long> c;
    private static com.google.android.finsky.cpkg.e d;

    static {
        com.google.android.finsky.cpkg.e eVar = new com.google.android.finsky.cpkg.e("billing_preferences");
        d = eVar;
        f2271a = eVar.a("billing_countries_v2", (String) null);
        f2272b = d.a("last_billing_countries_check_v2", (Long) 0L);
        c = d.a("last_dcb3_provisioning_time_millis", (Long) 0L);
    }
}
