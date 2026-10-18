package com.google.android.finsky.layout.play;

import android.view.View;

/* loaded from: classes.dex */
final class ba implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardFriendReviewHeaderView f3425a;

    ba(PlayCardFriendReviewHeaderView playCardFriendReviewHeaderView) {
        this.f3425a = playCardFriendReviewHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.f3425a.I;
        if (z) {
            PlayCardFriendReviewHeaderView.b(this.f3425a);
        } else {
            PlayCardFriendReviewHeaderView.c(this.f3425a);
        }
    }
}
