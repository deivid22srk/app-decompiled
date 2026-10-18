package com.google.android.play.apkg;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6793a;

    y(v vVar) {
        this.f6793a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ab b2;
        ab b3;
        b2 = this.f6793a.b();
        if (b2 != null) {
            b3 = this.f6793a.b();
            b3.a();
        }
    }
}
