package com.google.android.finsky.layout.play;

import com.google.android.finsky.activities.MainActivity;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3493a;

    e(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3493a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity;
        this.f3493a.d(112);
        mainActivity = this.f3493a.n;
        com.google.android.finsky.utils.cp.a(mainActivity);
    }
}
