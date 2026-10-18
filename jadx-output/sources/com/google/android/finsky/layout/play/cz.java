package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class cz implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f3484a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f3485b;
    final /* synthetic */ PlayYoutubeCardContentView c;

    cz(PlayYoutubeCardContentView playYoutubeCardContentView, cy cyVar, Intent intent) {
        this.c = playYoutubeCardContentView;
        this.f3484a = cyVar;
        this.f3485b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        FinskyApp.a().h().a(2908, (byte[]) null, this.f3484a);
        context = this.c.e;
        context.startActivity(this.f3485b);
    }
}
