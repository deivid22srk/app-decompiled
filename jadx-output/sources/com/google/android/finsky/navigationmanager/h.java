package com.google.android.finsky.navigationmanager;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f3550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Account f3551b;
    final /* synthetic */ Document c;
    final /* synthetic */ b d;

    h(b bVar, cy cyVar, Account account, Document document) {
        this.d = bVar;
        this.f3550a = cyVar;
        this.f3551b = account;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(218, (byte[]) null, this.f3550a);
        this.d.a(this.f3551b, this.c, false);
    }
}
