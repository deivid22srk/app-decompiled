package com.google.android.finsky.utils;

import android.view.View;

/* loaded from: classes.dex */
final class in implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4998a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ip f4999b;

    in(View view, ip ipVar) {
        this.f4998a = view;
        this.f4999b = ipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4998a.startAnimation(et.b(this.f4998a.getContext(), 150L, new io(this)));
    }
}
