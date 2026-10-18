package com.google.android.finsky.utils;

import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class bo extends com.google.android.finsky.activities.gj {
    public static bo z() {
        bo boVar = new bo();
        com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
        gnVar.a(R.string.gplus_sign_up_prompt).d(R.string.join_google_plus).e(R.string.cancel);
        gnVar.a(boVar);
        return boVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.gj
    public final void y() {
        super.y();
        bp.a(f());
    }
}
