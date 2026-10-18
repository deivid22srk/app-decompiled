package com.a.a.apkg;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f984a;

    public abstract void a();

    public c(String str, Object... objArr) {
        this.f984a = String.format(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f984a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
