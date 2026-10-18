package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final ad f6293a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6294b;
    private final Throwable c;
    private final byte[] d;

    private ae(ad adVar, int i, Throwable th, byte[] bArr) {
        this.f6293a = adVar;
        this.f6294b = i;
        this.c = th;
        this.d = bArr;
    }

    /* synthetic */ ae(ad adVar, int i, Throwable th, byte[] bArr, byte b2) {
        this(adVar, i, th, bArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6293a.a(this.f6294b, this.c, this.d);
    }
}
