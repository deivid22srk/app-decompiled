package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ax implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EpisodeSnippet f3145a;

    ax(EpisodeSnippet episodeSnippet) {
        this.f3145a = episodeSnippet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3145a.setExpandedContentVisibility(r1.c() ? 8 : 0);
        FinskyApp.a().h().a(r4.c() ? 271 : 272, (byte[]) null, this.f3145a.h);
    }
}
