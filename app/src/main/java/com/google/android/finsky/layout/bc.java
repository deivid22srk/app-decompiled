package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class bc implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f3152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ExtrasItemSnippet f3153b;

    bc(ExtrasItemSnippet extrasItemSnippet, Account account) {
        this.f3153b = extrasItemSnippet;
        this.f3152a = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.layout.play.cy cyVar;
        com.google.android.finsky.navigationmanager.b bVar;
        Document document;
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        cyVar = this.f3153b.g;
        h.a(218, (byte[]) null, cyVar);
        bVar = this.f3153b.d;
        Account account = this.f3152a;
        document = this.f3153b.f2984b;
        bVar.a(account, document, false);
    }
}
