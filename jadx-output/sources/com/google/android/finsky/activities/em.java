package com.google.android.finsky.activities;

import android.os.Bundle;
import com.android.vending.R;

/* loaded from: classes.dex */
final class em implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1721a;

    em(MainActivity mainActivity) {
        this.f1721a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((d) this.f1721a).l) {
            android.support.v4.app.aa d = this.f1721a.d();
            gn gnVar = new gn();
            gnVar.b(R.layout.play_games_install_dialog).d(R.string.install).e(R.string.not_now).a(new Bundle()).a(null, 38, null).a(318, null, 274, 275, null);
            gnVar.b().a(d, "dialog.play_games_install_suggestion");
            com.google.android.finsky.utils.bg.m.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(com.google.android.finsky.utils.bg.m.a().intValue() + 1));
            com.google.android.finsky.utils.bg.n.a((com.google.android.finsky.c.o<Long>) Long.valueOf(System.currentTimeMillis()));
        }
    }
}
