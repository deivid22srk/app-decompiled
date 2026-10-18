package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class dk implements mv {

    /* renamed from: a, reason: collision with root package name */
    private int f5945a;

    /* renamed from: b, reason: collision with root package name */
    private int f5946b;
    private final int c;
    private final float d;

    public dk() {
        this((byte) 0);
    }

    private dk(byte b2) {
        this.f5945a = 2500;
        this.c = 1;
        this.d = 1.0f;
    }

    @Override // com.google.android.gms.internal.mv
    public final int a() {
        return this.f5945a;
    }

    @Override // com.google.android.gms.internal.mv
    public final int b() {
        return this.f5946b;
    }

    @Override // com.google.android.gms.internal.mv
    public final void a(zzr zzrVar) {
        this.f5946b++;
        this.f5945a = (int) (this.f5945a + (this.f5945a * this.d));
        if (!(this.f5946b <= this.c)) {
            throw zzrVar;
        }
    }
}
