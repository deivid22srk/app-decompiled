package com.google.android.finsky.cpkg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2456a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2457b;
    public final int c = 0;

    public e(String str) {
        this.f2457b = str;
    }

    public final SharedPreferences a() {
        return f2456a.getSharedPreferences(this.f2457b, this.c);
    }

    public final void b() {
        a().edit().clear().commit();
    }

    @SuppressLint({"NewApi"})
    public static boolean a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public final o<Long> a(String str, Long l) {
        return new f(this, this, str, l);
    }

    public final o<String> a(String str, String str2) {
        return new g(this, this, str, str2);
    }

    public final o<Boolean> a(String str, Boolean bool) {
        return new h(this, this, str, bool);
    }

    public final o<Integer> a(String str, Integer num) {
        return new i(this, this, str, num);
    }

    public final n<Long> b(String str, Long l) {
        return new j(this, this, str, l);
    }

    public final n<String> b(String str, String str2) {
        return new k(this, this, str, str2);
    }

    public final n<Boolean> b(String str, Boolean bool) {
        return new l(this, this, str, bool);
    }

    public final n<Integer> b(String str, Integer num) {
        return new m(this, this, str, num);
    }
}
