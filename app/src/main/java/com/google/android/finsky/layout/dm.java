package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class dm implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReviewReplyLayout f3227a;

    dm(ReviewReplyLayout reviewReplyLayout) {
        this.f3227a = reviewReplyLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        z = this.f3227a.d;
        if (z) {
            this.f3227a.a();
            this.f3227a.f3059b.setVisibility(8);
        } else {
            ReviewReplyLayout.c(this.f3227a);
            this.f3227a.f3059b.setVisibility(0);
        }
        ReviewReplyLayout reviewReplyLayout = this.f3227a;
        z2 = this.f3227a.d;
        reviewReplyLayout.d = z2 ? false : true;
    }
}
