package com.google.android.play.utils.bpkg;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static h f7069a = null;

    /* renamed from: b, reason: collision with root package name */
    public final String f7070b;

    public abstract T a();

    /* synthetic */ a(String str, byte b2) {
        this(str);
    }

    public static void a(Context context, String[] strArr) {
        f7069a = new i(context.getContentResolver(), strArr);
    }

    public a(String str) {
        this.f7070b = str;
    }

    public final T b() {
        return a();
    }

    public static a<Boolean> a(String str, Boolean bool) {
        return new b(str, str, bool);
    }

    public static a<Long> a(String str, Long l) {
        return new c(str, str, l);
    }

    public static a<Integer> a(String str, Integer num) {
        return new d(str, str, num);
    }

    public static a<Float> a(String str, Float f) {
        return new e(str, str, f);
    }

    public static a<String> a(String str, String str2) {
        return new f(str, str, str2);
    }

    public static a<String> b(String str, String str2) {
        return new g(str, str, str2);
    }
}
