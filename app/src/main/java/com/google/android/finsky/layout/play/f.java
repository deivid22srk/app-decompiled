package com.google.android.finsky.layout.play;

import com.google.android.finsky.activities.MainActivity;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3494a;

    f(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3494a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity;
        this.f3494a.d(129);
        mainActivity = this.f3494a.n;
        com.google.android.finsky.utils.cp.b(mainActivity);
    }
}
