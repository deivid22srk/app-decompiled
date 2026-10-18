package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class bb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExtrasItemSnippet f3151a;

    bb(ExtrasItemSnippet extrasItemSnippet) {
        this.f3151a = extrasItemSnippet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3151a.setExpandedContentVisibility(r1.b() ? 8 : 0);
        FinskyApp.a().h().a(r4.b() ? 271 : 272, (byte[]) null, this.f3151a.g);
    }
}
