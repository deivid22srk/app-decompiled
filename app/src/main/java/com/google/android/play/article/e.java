package com.google.android.play.article;

import java.util.Set;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f6805a;

    e(c cVar) {
        this.f6805a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        set = this.f6805a.f6802b.e;
        set.remove(this.f6805a.f6801a);
        a.a(this.f6805a.f6802b, this.f6805a.f6801a);
    }
}
