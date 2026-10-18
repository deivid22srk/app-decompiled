package com.google.android.libraries.bind.a;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f6648a;

    i(h hVar) {
        this.f6648a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6648a.f.a()) {
            this.f6648a.c.execute(this.f6648a.f6646a);
        } else {
            this.f6648a.d.run();
        }
    }
}
