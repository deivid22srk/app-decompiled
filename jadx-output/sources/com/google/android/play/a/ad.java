package com.google.android.play.a;

import android.util.Log;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class ad<T> {

    /* renamed from: a, reason: collision with root package name */
    Class<?> f6746a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6747b;
    private int c = 0;
    private int d = 0;
    private T[] e;

    public ad(Class<?> cls, int i) {
        this.f6747b = i;
        this.e = (T[]) ((Object[]) Array.newInstance(cls, i));
        this.f6746a = cls;
    }

    public final T a() {
        String str;
        synchronized (this) {
            if (this.c > 0) {
                this.c--;
                T t = this.e[this.c];
                this.e[this.c] = null;
                return t;
            }
            try {
                return (T) this.f6746a.newInstance();
            } catch (Exception e) {
                str = ac.c;
                Log.wtf(str, "Exception from mClazz.newInstance ", e);
                return null;
            }
        }
    }

    public final void a(T t) {
        synchronized (this) {
            if (this.c < this.f6747b) {
                this.e[this.c] = t;
                this.c++;
                if (this.c > this.d) {
                    this.d = this.c;
                }
            }
        }
    }
}
