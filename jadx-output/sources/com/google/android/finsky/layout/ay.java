package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ay implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3147b;
    final /* synthetic */ Account c;
    final /* synthetic */ Document d;

    ay(com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.navigationmanager.b bVar, Account account, Document document) {
        this.f3146a = cyVar;
        this.f3147b = bVar;
        this.c = account;
        this.d = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(218, (byte[]) null, this.f3146a);
        this.f3147b.a(this.c, this.d, false);
    }
}
