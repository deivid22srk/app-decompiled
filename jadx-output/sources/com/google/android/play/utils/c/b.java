package com.google.android.play.utils.c;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final int f7076a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7077b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public b(int i, float f, int i2, float f2) {
        if (i == i2) {
            throw new IllegalArgumentException("Latencies cannot be equal");
        }
        this.c = Math.max(f, f2);
        this.d = Math.min(f, f2);
        this.f = (f - f2) / (i - i2);
        this.e = f - (this.f * i);
        this.f7076a = Math.max(i, i2);
        this.f7077b = Math.min(i, i2);
    }

    @Override // com.google.android.play.utils.c.c
    public final float a(int i) {
        if (i > this.f7076a) {
            return b(this.f7076a);
        }
        if (i < this.f7077b) {
            return b(this.f7077b);
        }
        return b(i);
    }

    @Override // com.google.android.play.utils.c.c
    public final float a() {
        return this.c;
    }

    @Override // com.google.android.play.utils.c.c
    public final float b() {
        return this.d;
    }

    private float b(int i) {
        return (this.f * i) + this.e;
    }
}
