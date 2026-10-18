package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class z extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3532a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3533b;
    final /* synthetic */ int c;
    final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(u uVar, int i, int i2, int i3) {
        super((byte) 0);
        this.d = uVar;
        this.f3532a = i;
        this.f3533b = i2;
        this.c = i3;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(s sVar) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return ((int) ((i - (this.d.f3523a * 2)) * f)) + (this.d.f3523a * 2) + this.f3532a + this.f3533b + this.c;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return (int) (((i - (this.d.f3523a * 2)) * f) + this.f3532a + (this.d.f3523a * 2) + this.f3533b + this.c);
    }
}
