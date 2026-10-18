package com.google.android.finsky.layout;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class cn implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyReviewReplyLayout f3198a;

    public cn(MyReviewReplyLayout myReviewReplyLayout) {
        this.f3198a = myReviewReplyLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        TextView textView2;
        textView = this.f3198a.d;
        textView.setVisibility(8);
        textView2 = this.f3198a.c;
        textView2.setVisibility(0);
    }
}
