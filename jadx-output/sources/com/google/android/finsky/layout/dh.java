package com.google.android.finsky.layout;

import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
final class dh implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3221a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewItemHeaderLayout f3222b;

    dh(ReviewItemHeaderLayout reviewItemHeaderLayout, String str) {
        this.f3222b = reviewItemHeaderLayout;
        this.f3221a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getContext().startActivity(com.google.android.finsky.utils.cr.a(Uri.parse(this.f3221a)));
    }
}
