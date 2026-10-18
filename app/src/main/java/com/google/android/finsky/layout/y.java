package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class y extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3530a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f3531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(u uVar, int i) {
        super((byte) 0);
        this.f3531b = uVar;
        this.f3530a = i;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(s sVar) {
        return 0.5f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return ((int) ((i - (this.f3531b.f3523a * 2)) * f)) + (this.f3531b.f3523a * 2) + this.f3530a;
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final float a() {
        return 2.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return (int) (((i - (this.f3531b.f3523a * 2)) * f) + this.f3530a + (this.f3531b.f3523a * 2));
    }
}
