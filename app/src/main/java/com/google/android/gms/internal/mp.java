package com.google.android.gms.internal;

import android.os.Binder;

/* loaded from: classes.dex */
public abstract class mp<T> {

    /* renamed from: b, reason: collision with root package name */
    protected final String f6173b;
    protected final T c;
    private T g = null;
    private static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    static mu f6172a = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";

    protected mp(String str, T t) {
        this.f6173b = str;
        this.c = t;
    }

    public static int a() {
        return e;
    }

    public static mp<Boolean> a(String str) {
        return new mq(str, true);
    }

    public static mp<Integer> a(String str, Integer num) {
        return new ms(str, num);
    }

    public static mp<Long> a(String str, Long l) {
        return new mr(str, l);
    }

    public static mp<String> a(String str, String str2) {
        return new mt(str, str2);
    }

    public static boolean b() {
        return f6172a != null;
    }

    protected abstract T c();

    public final T d() {
        return this.g != null ? this.g : c();
    }

    public final T e() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return d();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
