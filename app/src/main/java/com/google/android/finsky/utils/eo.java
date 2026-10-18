package com.google.android.finsky.utils;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    public final int f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4854b;
    public final int c;
    public final int d;
    public final List<String> e = new ArrayList();
    public final List<String> f = new ArrayList();

    public eo(int i, int i2, int i3, int i4) {
        this.f4853a = i;
        this.d = i2;
        this.f4854b = i3;
        this.c = i4;
    }

    public final boolean a() {
        return this.e.size() > 0;
    }

    public final boolean b() {
        return this.f.size() > 0;
    }
}
