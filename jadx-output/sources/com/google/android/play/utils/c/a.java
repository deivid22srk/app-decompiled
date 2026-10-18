package com.google.android.play.utils.c;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f7074a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7075b;
    private final int c;
    private final float d;

    public a(c cVar, int i) {
        this.f7074a = cVar;
        if (i < 2) {
            throw new IllegalArgumentException("numBuckets must be greater than 1");
        }
        this.c = i;
        float a2 = this.f7074a.a() - this.f7074a.b();
        this.f7075b = a2 / this.c;
        this.d = a2 / (this.c - 1);
    }

    @Override // com.google.android.play.utils.c.c
    public final float a(int i) {
        float a2 = this.f7074a.a(i);
        if (this.f7075b != 0.0f) {
            return (this.d * Math.min(this.c - 1, (long) Math.floor((a2 - r1) / this.f7075b))) + b();
        }
        return a2;
    }

    @Override // com.google.android.play.utils.c.c
    public final float a() {
        return this.f7074a.a();
    }

    @Override // com.google.android.play.utils.c.c
    public final float b() {
        return this.f7074a.b();
    }
}
