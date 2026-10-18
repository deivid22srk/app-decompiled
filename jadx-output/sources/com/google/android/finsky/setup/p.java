package com.google.android.finsky.setup;

import android.widget.TextView;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f4672a;

    p(o oVar) {
        this.f4672a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        TextView textView;
        o.a(this.f4672a);
        z = this.f4672a.f4671b;
        if (z) {
            textView = this.f4672a.f4670a;
            textView.postDelayed(this, 500L);
        }
    }
}
