package com.google.android.play.drawer;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f6876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6877b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final Runnable f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    final int j;
    final int k;
    final t l;
    final t m;

    public w() {
        this.f6876a = null;
        this.j = -1;
        this.k = -1;
        this.f6877b = -1;
        this.c = -1;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = true;
        this.h = false;
        this.i = false;
        this.l = null;
        this.m = null;
    }

    public w(String str, t tVar, int i, boolean z, Runnable runnable) {
        this(str, tVar, null, i, z, false, runnable);
    }

    public w(String str, t tVar, t tVar2, int i, boolean z, boolean z2, Runnable runnable) {
        this(str, tVar, tVar2, i, z, z2, false, runnable);
    }

    public w(String str, t tVar, t tVar2, int i, boolean z, boolean z2, boolean z3, Runnable runnable) {
        this.f6876a = str;
        this.c = i;
        this.f6877b = -1;
        this.d = z;
        this.e = false;
        this.f = runnable;
        this.j = 0;
        this.k = 0;
        this.g = false;
        this.h = z2;
        this.i = z3;
        this.l = tVar;
        this.m = tVar2;
    }
}
