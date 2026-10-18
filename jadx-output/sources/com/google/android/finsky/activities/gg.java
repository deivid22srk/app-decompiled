package com.google.android.finsky.activities;

import com.android.vending.R;

/* loaded from: classes.dex */
enum gg implements gi {
    ALWAYS(2, R.string.purchase_auth_value_always),
    SESSION(1, R.string.purchase_auth_value_session),
    NEVER(0, R.string.purchase_auth_value_never);

    final int d;
    private final int e;

    gg(int i, int i2) {
        this.e = i;
        this.d = i2;
    }

    @Override // com.google.android.finsky.activities.gi
    public final int a() {
        return this.d;
    }
}
