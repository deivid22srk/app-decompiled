package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class ia implements jv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6046a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ id f6047b;
    final /* synthetic */ hy c;

    ia(hy hyVar, String str, id idVar) {
        this.c = hyVar;
        this.f6046a = str;
        this.f6047b = idVar;
    }

    @Override // com.google.android.gms.internal.jv
    public final void a(zzr zzrVar) {
        com.google.android.gms.ads.internal.util.client.b.e("Failed to load URL: " + this.f6046a + "\n" + zzrVar.toString());
        this.f6047b.a(null);
    }
}
