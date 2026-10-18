package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.WarmWelcomeCard;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
final class ao implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WarmWelcomeCard f1895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1896b;
    final /* synthetic */ an c;

    ao(an anVar, WarmWelcomeCard warmWelcomeCard, int i) {
        this.c = anVar;
        this.f1895a = warmWelcomeCard;
        this.f1896b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(1231, (byte[]) null, this.f1895a);
        bg.am.a((com.google.android.finsky.c.o<Boolean>) Boolean.TRUE);
        this.c.x = false;
        this.c.e(this.f1896b);
    }
}
