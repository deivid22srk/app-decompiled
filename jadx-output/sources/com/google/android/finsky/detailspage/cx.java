package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class cx implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReviewSnippetsModuleLayout f2598a;

    cx(ReviewSnippetsModuleLayout reviewSnippetsModuleLayout) {
        this.f2598a = reviewSnippetsModuleLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        onClickListener = this.f2598a.l;
        if (onClickListener != null) {
            onClickListener2 = this.f2598a.l;
            onClickListener2.onClick(view);
        }
    }
}
