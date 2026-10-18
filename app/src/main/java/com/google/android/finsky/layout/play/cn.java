package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    private final int f3473a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3474b;

    public cn(int i, int i2) {
        this.f3473a = (i + i2) / 2;
        this.f3474b = ((this.f3473a - i2) / 4) + i2;
    }

    public final float a(float f) {
        return Math.min(1.0f, Math.max(0.0f, (f - this.f3474b) / (this.f3473a - this.f3474b)));
    }
}
