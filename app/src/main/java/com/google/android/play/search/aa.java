package com.google.android.play.search;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;

/* loaded from: classes.dex */
final class aa implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f7023a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearchSuggestionsList f7024b;

    aa(PlaySearchSuggestionsList playSearchSuggestionsList, boolean z) {
        this.f7024b = playSearchSuggestionsList;
        this.f7023a = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        RecyclerView recyclerView;
        if (!this.f7023a) {
            this.f7024b.setVisibility(8);
            recyclerView = this.f7024b.f7019a;
            recyclerView.setVisibility(8);
        }
        PlaySearchSuggestionsList.c(this.f7024b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
