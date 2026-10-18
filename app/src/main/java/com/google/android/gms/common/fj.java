package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class fj extends i {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakReference<byte[]> f5649b = new WeakReference<>(null);

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<byte[]> f5650a;

    fj(byte[] bArr) {
        super(bArr);
        this.f5650a = f5649b;
    }

    @Override // com.google.android.gms.common.i
    final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f5650a.get();
            if (bArr == null) {
                bArr = b();
                this.f5650a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] b();
}
