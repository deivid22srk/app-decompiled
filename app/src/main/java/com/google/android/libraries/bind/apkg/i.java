package com.google.android.libraries.bind.apkg;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6648a;

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
