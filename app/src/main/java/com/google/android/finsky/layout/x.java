package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class x extends ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f3529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(u uVar) {
        super((byte) 0);
        this.f3529a = uVar;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(s sVar) {
        int d = sVar.d();
        for (int i = 0; i < d; i++) {
            if (sVar.a(i) == 1.0f) {
                return 1.0f;
            }
        }
        return 1.441f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return ((int) (((i - (this.f3529a.f3523a * 2)) * f) / 2.0f)) + (this.f3529a.f3523a * 2);
    }

    @Override // com.google.android.finsky.layout.ab, com.google.android.finsky.layout.t
    public final float a() {
        return 2.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return (int) ((((i * f2) / 2.0f) - (this.f3529a.f3523a * 2)) + (this.f3529a.f3523a * 2));
    }
}
