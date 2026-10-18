package com.google.android.play.search;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class z extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7063b;
    final /* synthetic */ PlaySearchSuggestionsList c;

    z(PlaySearchSuggestionsList playSearchSuggestionsList, int i, int i2) {
        this.c = playSearchSuggestionsList;
        this.f7062a = i;
        this.f7063b = i2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        recyclerView = this.c.f7019a;
        recyclerView.getLayoutParams().height = this.f7062a + ((int) (this.f7063b * f));
        recyclerView2 = this.c.f7019a;
        recyclerView2.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
