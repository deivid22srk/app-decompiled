package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.js;

/* loaded from: classes.dex */
final class ao implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3133a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Account f3134b;
    final /* synthetic */ com.google.android.finsky.navigationmanager.b c;
    final /* synthetic */ DetailsSummaryWishlistView d;

    ao(DetailsSummaryWishlistView detailsSummaryWishlistView, Document document, Account account, com.google.android.finsky.navigationmanager.b bVar) {
        this.d = detailsSummaryWishlistView;
        this.f3133a = document;
        this.f3134b = account;
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        FinskyApp.a().h().a(js.a(this.f3133a, this.f3134b) ? 205 : 204, (byte[]) null, this.c.s());
        js.a(this.d, this.f3133a, b2);
    }
}
