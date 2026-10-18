package com.google.android.wallet.instrumentmanager.ui.b;

import com.google.android.wallet.ui.common.FormEditText;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7334a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7335b;
    final /* synthetic */ a c;

    e(a aVar, FormEditText formEditText, int i) {
        this.c = aVar;
        this.f7334a = formEditText;
        this.f7335b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7334a.setThreshold(this.f7335b);
        this.f7334a.f();
    }
}
