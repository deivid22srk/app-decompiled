package com.google.android.finsky.c;

/* loaded from: classes.dex */
public abstract class n<T> {

    /* renamed from: b, reason: collision with root package name */
    e f2466b;
    protected final String c;
    protected final T d;

    protected abstract o<T> a(String str);

    protected n(e eVar, String str, T t) {
        this.f2466b = eVar;
        this.c = str;
        this.d = t;
    }

    public final o<T> b(String str) {
        o<T> a2 = a(this.c + str);
        a2.f2467b = this.f2466b;
        return a2;
    }

    public final o<T> a(int i) {
        o<T> a2 = a(this.c + i);
        a2.f2467b = this.f2466b;
        return a2;
    }
}
