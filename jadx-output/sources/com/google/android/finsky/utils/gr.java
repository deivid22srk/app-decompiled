package com.google.android.finsky.utils;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class gr {

    /* renamed from: a, reason: collision with root package name */
    public int f4917a;

    /* renamed from: b, reason: collision with root package name */
    public String f4918b;
    public String c;
    public long d;
    public int e;

    public gr() {
        this.f4917a = -1;
        this.f4918b = null;
        this.c = null;
    }

    public gr(gr grVar) {
        this.f4917a = -1;
        this.f4918b = null;
        this.c = null;
        this.f4917a = grVar.f4917a;
        this.f4918b = grVar.f4918b;
        this.c = grVar.c;
        this.d = grVar.d;
        this.e = grVar.e;
    }

    public final void a() {
        this.f4917a = -1;
        this.f4918b = null;
        this.c = null;
        this.d = 0L;
    }

    public final String a(Context context) {
        Resources resources = context.getResources();
        String a2 = this.d > 0 ? as.a(this.d, resources) : null;
        if (this.f4917a == -1) {
            return this.f4918b;
        }
        if (this.f4918b == null && a2 == null) {
            return resources.getString(this.f4917a);
        }
        return this.f4918b == null ? resources.getString(this.f4917a, a2) : a2 == null ? resources.getString(this.f4917a, this.f4918b) : resources.getString(this.f4917a, this.f4918b, a2);
    }
}
