package org.a.a;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f7880a;

    public static a a(Class<?> cls) {
        return new a(cls);
    }

    private a(Class<?> cls) {
        this.f7880a = cls.getSimpleName();
    }

    public final void a(Object obj) {
        new StringBuilder().append(this.f7880a).append(": ").append(obj);
    }

    public final void b(Object obj) {
        FinskyLog.c(this.f7880a + ": " + obj, new Object[0]);
    }

    public static boolean a() {
        return FinskyLog.a();
    }
}
