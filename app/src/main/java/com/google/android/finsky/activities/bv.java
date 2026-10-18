package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.WishlistPlayActionButton;
import com.google.android.play.layout.PlayActionButton;
import java.util.List;

/* loaded from: classes.dex */
public final class bv extends cc {

    /* renamed from: a, reason: collision with root package name */
    private List<Document> f1633a;

    public bv(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    @Override // com.google.android.finsky.activities.cc
    public final void a(Document document, boolean z, View... viewArr) {
        this.f1633a = com.google.android.finsky.utils.as.c(document, this.n, FinskyApp.a().p.a(this.f));
        super.a(document, z, viewArr);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final void a(boolean z) {
        super.a(z);
        b(R.id.download_button).setVisibility(8);
        g();
    }

    @Override // com.google.android.finsky.activities.cc
    protected final boolean d() {
        return com.google.android.finsky.utils.cy.a(this.f1633a, FinskyApp.a().p, this.f) == null;
    }

    @Override // com.google.android.finsky.activities.cc
    protected final boolean a(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        return b(playActionButton, playActionButton2, playActionButton3, playActionButton4, playActionButton5, wishlistPlayActionButton);
    }
}
