package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class jo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6092a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f6093b;
    final /* synthetic */ jn c;

    jo(jn jnVar, String str, long j) {
        this.c = jnVar;
        this.f6092a = str;
        this.f6093b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny nyVar;
        ny nyVar2;
        nyVar = this.c.f6090a;
        nyVar.a(this.f6092a, this.f6093b);
        nyVar2 = this.c.f6090a;
        nyVar2.a(toString());
    }
}
