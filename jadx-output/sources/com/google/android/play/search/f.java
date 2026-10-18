package com.google.android.play.search;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearch f7039a;

    f(PlaySearch playSearch) {
        this.f7039a = playSearch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        l lVar2;
        lVar = this.f7039a.c;
        if (lVar != null && !this.f7039a.hasFocus()) {
            lVar2 = this.f7039a.c;
            lVar2.b();
        }
    }
}
