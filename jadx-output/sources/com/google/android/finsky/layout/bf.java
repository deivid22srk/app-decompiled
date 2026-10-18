package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class bf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3156b;
    final /* synthetic */ Account c;
    final /* synthetic */ Document d;
    final /* synthetic */ FreeSongOfTheDaySummary e;

    public bf(FreeSongOfTheDaySummary freeSongOfTheDaySummary, com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.navigationmanager.b bVar, Account account, Document document) {
        this.e = freeSongOfTheDaySummary;
        this.f3155a = cyVar;
        this.f3156b = bVar;
        this.c = account;
        this.d = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(218, (byte[]) null, this.f3155a);
        this.f3156b.a(this.c, this.d, false);
    }
}
