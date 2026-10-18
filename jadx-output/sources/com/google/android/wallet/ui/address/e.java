package com.google.android.wallet.ui.address;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7381a;

    e(b bVar) {
        this.f7381a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout linearLayout;
        linearLayout = this.f7381a.aC;
        if (!linearLayout.hasFocus()) {
            this.f7381a.J();
        }
    }
}
