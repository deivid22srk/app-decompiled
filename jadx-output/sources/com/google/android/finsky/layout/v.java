package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class v extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3525a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3526b;
    final /* synthetic */ u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(u uVar, int i, int i2) {
        super((byte) 0);
        this.c = uVar;
        this.f3525a = i;
        this.f3526b = i2;
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final float a() {
        return this.f3525a / (this.f3525a + 1);
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(s sVar) {
        int d = sVar.d();
        for (int i = 0; i < d; i++) {
            if (sVar.a(i) == 1.441f) {
                return 1.441f;
            }
        }
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return ((int) ((i - (this.c.f3523a * 2)) * f)) + (this.c.f3523a * 2) + this.f3526b;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return (int) (((i - (this.c.f3523a * 2)) * f) + this.f3526b + (this.c.f3523a * 2));
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final int b(float f, float f2, int i) {
        if (f2 > f) {
            return (int) ((i - (this.c.f3523a * 2)) * (f2 - f));
        }
        return 0;
    }
}
