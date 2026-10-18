package com.android.volley;

/* loaded from: classes.dex */
public class e implements v {

    /* renamed from: a, reason: collision with root package name */
    public final float f1234a;

    /* renamed from: b, reason: collision with root package name */
    private int f1235b;
    private int c;
    private final int d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public e(int i, int i2, float f) {
        this.f1235b = i;
        this.d = i2;
        this.f1234a = f;
    }

    @Override // com.android.volley.v
    public final int a() {
        return this.f1235b;
    }

    @Override // com.android.volley.v
    public final int b() {
        return this.c;
    }

    @Override // com.android.volley.v
    public void a(VolleyError volleyError) {
        this.c++;
        this.f1235b = (int) (this.f1235b + (this.f1235b * this.f1234a));
        if (!(this.c <= this.d)) {
            throw volleyError;
        }
    }
}
