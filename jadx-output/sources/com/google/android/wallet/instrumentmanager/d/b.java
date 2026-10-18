package com.google.android.wallet.instrumentmanager.d;

import com.google.android.wallet.common.util.s;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7322a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7323b;

    public b(a aVar, byte[] bArr) {
        this.f7322a = aVar;
        this.f7323b = bArr;
    }

    @Override // com.google.android.wallet.common.util.s
    public final void a(int i) {
        int i2;
        if (i != 1) {
            a.a(this.f7322a, a.i);
            this.f7322a.a(3, 1000);
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
            default:
                i2 = 4;
                break;
            case 3:
                i2 = 30;
                break;
            case 4:
                i2 = 31;
                break;
            case 5:
                i2 = 32;
                break;
        }
        com.google.android.wallet.common.b.a.a.b(771, i2, this.f7323b);
    }
}
