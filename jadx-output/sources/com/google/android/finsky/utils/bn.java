package com.google.android.finsky.utils;

import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class bn extends com.google.android.finsky.activities.gj {
    public static bn z() {
        bn bnVar = new bn();
        com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
        gnVar.a(R.string.gplus_public_reviews).d(R.string.join_google_plus).e(R.string.cancel);
        gnVar.a(bnVar);
        return bnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.gj
    public final void y() {
        super.y();
        bp.a(f());
        bg.ad.b(FinskyApp.a().j()).a((com.google.android.finsky.c.o<Boolean>) true);
    }
}
