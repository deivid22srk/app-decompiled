package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.WishlistPlayActionButton;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class bw extends cc {
    public bw(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final View.OnClickListener a(Document document, Account account) {
        return new bx(this, document, account);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final View.OnClickListener a(Document document) {
        return new by(this, document);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final boolean a(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        return b(playActionButton, playActionButton2, playActionButton3, playActionButton4, playActionButton5, wishlistPlayActionButton);
    }
}
