package com.google.android.finsky.layout;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
abstract class ab implements t {
    private ab() {
    }

    /* synthetic */ ab(byte b2) {
        this();
    }

    @Override // com.google.android.finsky.layout.t
    public float a() {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public int b() {
        return 0;
    }

    @Override // com.google.android.finsky.layout.t
    public final float c() {
        return FinskyApp.a().e().a(12604267L) ? 0.25f : 0.5f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i) {
        throw new IllegalStateException("Override the base implementation for fixed mode");
    }

    @Override // com.google.android.finsky.layout.t
    public int b(float f, float f2, int i) {
        return 0;
    }
}
