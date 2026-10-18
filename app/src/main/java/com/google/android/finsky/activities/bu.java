package com.google.android.finsky.activities;

import android.accounts.Account;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.WishlistPlayActionButton;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class bu extends cc {
    public bu(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final boolean a(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        return b(playActionButton, playActionButton2, playActionButton3, playActionButton4, playActionButton5, wishlistPlayActionButton);
    }
}
