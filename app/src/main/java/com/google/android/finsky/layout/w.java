package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class w extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3527a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f3528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(u uVar, int i) {
        super((byte) 0);
        this.f3528b = uVar;
        this.f3527a = i;
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
        return ((int) ((i - (this.f3528b.f3523a * 2)) * f)) + (this.f3528b.f3523a * 2) + this.f3527a;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return (int) (((i - (this.f3528b.f3523a * 2)) * f) + this.f3527a + (this.f3528b.f3523a * 2));
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final int b(float f, float f2, int i) {
        if (f2 > f) {
            return (int) ((i - (this.f3528b.f3523a * 2)) * (f2 - f));
        }
        return 0;
    }
}
