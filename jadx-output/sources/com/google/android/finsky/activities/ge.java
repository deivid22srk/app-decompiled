package com.google.android.finsky.activities;

import com.deivid22srk.store.R;

/* loaded from: classes.dex */
enum ge implements gi {
    AUTO_UPDATE_NEVER(R.string.auto_update_value_disabled),
    AUTO_UPDATE_ALWAYS(R.string.auto_update_value_enabled),
    AUTO_UPDATE_WIFI(R.string.auto_update_value_wifi_only);

    private final int d;

    ge(int i) {
        this.d = i;
    }

    @Override // com.google.android.finsky.activities.gi
    public final int a() {
        return this.d;
    }
}
