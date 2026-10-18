package com.google.android.finsky.e;

import com.google.android.finsky.layout.ContentFrame;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentFrame f2767a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f2768b;

    r(q qVar, ContentFrame contentFrame) {
        this.f2768b = qVar;
        this.f2767a = contentFrame;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2768b.av != null) {
            this.f2767a.addView(this.f2768b.av);
        }
    }
}
