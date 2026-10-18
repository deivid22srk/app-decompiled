package com.google.android.finsky.widget.consumption;

import android.content.Context;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    final int f5179a;
    boolean c;
    g d;
    private int f;
    private int g;
    private int h;
    private int i;
    private SparseArray<int[]> j;

    /* renamed from: b, reason: collision with root package name */
    int f5180b = 1;
    int e = -1;

    public g(int i) {
        this.f5179a = i;
    }

    public final g a(int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = this.f;
        this.i = this.g;
        return this;
    }

    public final g a(int i, int i2, int i3) {
        this.f5180b = i;
        this.h = i2;
        this.i = i3;
        return this;
    }

    public final g b(int i, int i2, int i3) {
        if (this.j == null) {
            this.j = new SparseArray<>(this.f5180b);
        }
        this.j.put(i, new int[]{i2, i3});
        return this;
    }

    public final int a(int i) {
        return this.j != null ? this.j.get(i)[0] : this.h;
    }

    public final int b(int i) {
        return this.j != null ? this.j.get(i)[1] : this.i;
    }

    public final int a(Context context) {
        return com.google.android.finsky.widget.s.a(context, this.f);
    }

    public final int b(Context context) {
        return com.google.android.finsky.widget.s.a(context, this.g);
    }

    public final int hashCode() {
        return (this.f5179a * 31) + this.e;
    }
}
