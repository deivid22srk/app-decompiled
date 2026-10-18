package com.google.android.libraries.bind.cpkg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, b> f6660a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static a f6661b = new c();
    public static boolean e;
    public String c;
    public boolean d;

    public static b a(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (f6660a.containsKey(simpleName)) {
            return f6660a.get(simpleName);
        }
        b bVar = new b(simpleName);
        f6660a.put(simpleName, bVar);
        return bVar;
    }

    public b(String str) {
        this.c = str;
    }

    public final boolean a() {
        return this.d || e;
    }

    public final void a(String str, Object... objArr) {
        if (a()) {
            f6661b.a(3, this.c, e(str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (a()) {
            f6661b.a(2, this.c, e(str, objArr));
        }
    }

    public static String e(String str, Object... objArr) {
        String format = (str == null || objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
        return format == null ? "" : format;
    }

    public final void c(String str, Object... objArr) {
        f6661b.a(6, this.c, e(str, objArr));
    }

    public final void d(String str, Object... objArr) {
        if (!a()) {
            return;
        }
        f6661b.a(4, this.c, e(str, objArr));
    }
}
