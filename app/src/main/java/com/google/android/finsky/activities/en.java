package com.google.android.finsky.activities;

import com.google.android.finsky.layout.play.FinskyDrawerLayout;

/* loaded from: classes.dex */
final class en implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1722a;

    en(MainActivity mainActivity) {
        this.f1722a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyDrawerLayout finskyDrawerLayout;
        if (!this.f1722a.l) {
            finskyDrawerLayout = this.f1722a.q;
            finskyDrawerLayout.e();
        }
    }
}
