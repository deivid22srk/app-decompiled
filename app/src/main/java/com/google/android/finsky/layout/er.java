package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.js;

/* loaded from: classes.dex */
public final class er implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3276a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Account f3277b;
    final /* synthetic */ com.google.android.finsky.navigationmanager.b c;
    final /* synthetic */ WishlistPlayActionButton d;

    public er(WishlistPlayActionButton wishlistPlayActionButton, Document document, Account account, com.google.android.finsky.navigationmanager.b bVar) {
        this.d = wishlistPlayActionButton;
        this.f3276a = document;
        this.f3277b = account;
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        FinskyApp.a().h().a(js.a(this.f3276a, this.f3277b) ? 205 : 204, (byte[]) null, this.c.s());
        js.a(this.d, this.f3276a, b2);
    }
}
