package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ec implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f3253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SongSnippet f3254b;

    ec(SongSnippet songSnippet, Account account) {
        this.f3254b = songSnippet;
        this.f3253a = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar;
        Document document;
        FinskyApp.a().h().a(218, (byte[]) null, this.f3254b);
        bVar = this.f3254b.e;
        Account account = this.f3253a;
        document = this.f3254b.d;
        bVar.a(account, document, false);
    }
}
