package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class bx implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f1634a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Account f1635b;
    final /* synthetic */ bw c;

    bx(bw bwVar, Document document, Account account) {
        this.c = bwVar;
        this.f1634a = document;
        this.f1635b = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.r.a(224, (byte[]) null, this.c.s);
        if (!com.google.android.finsky.utils.cr.a(this.c.e.getPackageManager(), this.f1634a.f1963a.g)) {
            this.c.c.b(this.f1634a.f1963a.g);
        } else {
            this.c.e.startActivity(com.google.android.finsky.utils.cr.b(this.c.e, this.f1634a, this.f1635b.name));
        }
    }
}
