package com.google.android.a;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    static ContentResolver f1412a = null;

    /* renamed from: b, reason: collision with root package name */
    protected final String f1413b;
    protected final T c;

    protected abstract T a();

    public static void a(Context context) {
        f1412a = context.getContentResolver();
    }

    protected g(String str, T t) {
        this.f1413b = str;
        this.c = t;
    }

    public final T b() {
        return a();
    }

    public static g<Boolean> a(String str, boolean z) {
        return new h(str, Boolean.valueOf(z));
    }

    public static g<Long> a(String str, Long l) {
        return new i(str, l);
    }

    public static g<Integer> a(String str, Integer num) {
        return new j(str, num);
    }

    public static g<String> a(String str, String str2) {
        return new k(str, str2);
    }

    public static g<String> b(String str, String str2) {
        return new l(str, str2);
    }
}
