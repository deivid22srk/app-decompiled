package com.google.android.libraries.bind.data;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f6697a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f6698b;
    final /* synthetic */ j c;
    final /* synthetic */ Integer d;
    final /* synthetic */ k e;

    l(k kVar, ab abVar, ac acVar, j jVar, Integer num) {
        this.e = kVar;
        this.f6697a = abVar;
        this.f6698b = acVar;
        this.c = jVar;
        this.d = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6697a == this.e.c) {
            this.e.a(this.f6698b, this.c, this.d);
            this.e.c = null;
        }
    }
}
