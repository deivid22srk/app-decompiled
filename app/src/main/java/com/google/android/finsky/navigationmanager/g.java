package com.google.android.finsky.navigationmanager;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.au;

/* loaded from: classes.dex */
final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3548a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f3549b;
    final /* synthetic */ Account c;
    final /* synthetic */ Document d;
    final /* synthetic */ int e;
    final /* synthetic */ au f;
    final /* synthetic */ String g;
    final /* synthetic */ b h;

    g(b bVar, int i, cy cyVar, Account account, Document document, int i2, au auVar, String str) {
        this.h = bVar;
        this.f3548a = i;
        this.f3549b = cyVar;
        this.c = account;
        this.d = document;
        this.e = i2;
        this.f = auVar;
        this.g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(this.f3548a, (byte[]) null, this.f3549b);
        this.h.a(this.c, this.d, this.e, this.f, this.g, false);
    }
}
