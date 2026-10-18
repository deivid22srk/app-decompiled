package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.AgeVerificationActivity;
import com.google.android.finsky.layout.PlaylistControlButtons;

/* loaded from: classes.dex */
final class ef implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2639b;
    final /* synthetic */ SongListModuleLayout c;

    ef(SongListModuleLayout songListModuleLayout, boolean z, String str) {
        this.c = songListModuleLayout;
        this.f2638a = z;
        this.f2639b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaylistControlButtons playlistControlButtons;
        if (!this.f2638a || !FinskyApp.a().a(this.f2639b).a()) {
            playlistControlButtons = this.c.e;
            playlistControlButtons.onClick(view);
        } else {
            view.getContext().startActivity(AgeVerificationActivity.a(this.f2639b, 2, (String) null));
        }
    }
}
