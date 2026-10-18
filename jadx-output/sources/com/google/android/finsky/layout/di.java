package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class di implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReviewItemLayout f3223a;

    di(ReviewItemLayout reviewItemLayout) {
        this.f3223a = reviewItemLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dl dlVar;
        dl dlVar2;
        dlVar = this.f3223a.t;
        if (dlVar != null) {
            dlVar2 = this.f3223a.t;
            dlVar2.a(this.f3223a);
        }
    }
}
