package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.a.f;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5295a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5296b;

    public b(byte b2) {
        this.f5296b = false;
    }

    public final boolean a() {
        return !this.f5296b || this.f5295a;
    }

    public b() {
        this.f5296b = ((Boolean) d.j().a(f.i)).booleanValue();
    }
}
