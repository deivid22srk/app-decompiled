package com.google.android.finsky.a;

import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
final class h<T> {

    /* renamed from: a, reason: collision with root package name */
    Class<?> f1483a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1484b;
    private int c = 0;
    private int d = 0;
    private T[] e;

    public h(Class<?> cls, int i) {
        this.f1484b = i;
        this.e = (T[]) ((Object[]) Array.newInstance(cls, i));
        this.f1483a = cls;
    }

    public final T a() {
        synchronized (this) {
            if (this.c > 0) {
                this.c--;
                T t = this.e[this.c];
                this.e[this.c] = null;
                return t;
            }
            try {
                return (T) this.f1483a.newInstance();
            } catch (Exception e) {
                FinskyLog.e("Exception from mClazz.newInstance ", e);
                return null;
            }
        }
    }

    public final void a(T t) {
        synchronized (this) {
            if (this.c < this.f1484b) {
                this.e[this.c] = t;
                this.c++;
                if (this.c > this.d) {
                    this.d = this.c;
                }
            }
        }
    }
}
