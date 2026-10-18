package com.google.android.finsky.activities;

import com.android.vending.R;

/* loaded from: classes.dex */
enum gf implements gi {
    DOWNLOAD_ALWAYS(2, R.string.download_settings_value_download_always),
    DOWNLOAD_ASK(1, R.string.download_settings_value_ask),
    DOWNLOAD_WIFI(3, R.string.download_settings_value_wifi_only);

    int d;
    private final int e;

    gf(int i, int i2) {
        this.e = i;
        this.d = i2;
    }

    @Override // com.google.android.finsky.activities.gi
    public final int a() {
        return this.d;
    }
}
