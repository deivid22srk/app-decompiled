package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class aa extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3107b;
    final /* synthetic */ int c;
    final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(u uVar, int i, int i2, int i3) {
        super((byte) 0);
        this.d = uVar;
        this.f3106a = i;
        this.f3107b = i2;
        this.c = i3;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(s sVar) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return this.f3106a + (this.f3107b * 2) + this.c;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return this.f3106a + (this.f3107b * 2);
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final int b() {
        return 3;
    }
}
