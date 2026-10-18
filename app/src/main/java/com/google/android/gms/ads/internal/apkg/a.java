package com.google.android.gms.ads.internal.apkg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f5284a;

    /* renamed from: b, reason: collision with root package name */
    public final T f5285b;
    public final int c;

    /* synthetic */ a(int i, String str, Object obj, byte b2) {
        this(i, str, obj);
    }

    public static a<Integer> a(int i, String str, int i2) {
        return new c(i, str, Integer.valueOf(i2));
    }

    public static a<Boolean> a(int i, String str, Boolean bool) {
        return new b(i, str, bool);
    }

    public static a<String> a(int i, String str, String str2) {
        return new e(i, str, str2);
    }

    public static a<Long> a(String str, long j) {
        return new d(str, Long.valueOf(j));
    }

    public abstract T a(SharedPreferences sharedPreferences);

    public a(int i, String str, T t) {
        this.c = i;
        this.f5284a = str;
        this.f5285b = t;
        com.google.android.gms.ads.internal.d.i().f5289a.add(this);
    }

    public static a<String> a(int i, String str) {
        a<String> a2 = a(i, str, (String) null);
        com.google.android.gms.ads.internal.d.i().f5290b.add(a2);
        return a2;
    }

    public static a<String> a(String str) {
        a<String> a2 = a(0, str, (String) null);
        com.google.android.gms.ads.internal.d.i().c.add(a2);
        return a2;
    }
}
