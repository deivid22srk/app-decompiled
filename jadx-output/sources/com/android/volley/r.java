package com.android.volley;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1256b;
    public final VolleyError c;
    public boolean d;

    public static <T> r<T> a(T t, b bVar) {
        return new r<>(t, bVar);
    }

    public static <T> r<T> a(VolleyError volleyError) {
        return new r<>(volleyError);
    }

    public final boolean a() {
        return this.c == null;
    }

    private r(T t, b bVar) {
        this.d = false;
        this.f1255a = t;
        this.f1256b = bVar;
        this.c = null;
    }

    private r(VolleyError volleyError) {
        this.d = false;
        this.f1255a = null;
        this.f1256b = null;
        this.c = volleyError;
    }
}
