package com.google.android.finsky.c;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class o<T> {

    /* renamed from: b, reason: collision with root package name */
    e f2467b;
    final String c;
    final T d;

    protected abstract T a(SharedPreferences sharedPreferences);

    protected abstract void a(SharedPreferences.Editor editor, T t);

    protected o(e eVar, String str, T t) {
        this.f2467b = eVar;
        this.c = str;
        this.d = t;
    }

    public final T a() {
        return a(this.f2467b.a());
    }

    public final boolean b() {
        return this.f2467b.a().contains(this.c);
    }

    public final void a(T t) {
        SharedPreferences.Editor edit = this.f2467b.a().edit();
        a(edit, t);
        e.a(edit);
    }

    public final void c() {
        e.a(this.f2467b.a().edit().remove(this.c));
    }
}
