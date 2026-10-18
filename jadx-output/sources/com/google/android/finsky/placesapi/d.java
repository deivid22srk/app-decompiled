package com.google.android.finsky.placesapi;

/* loaded from: classes.dex */
enum d {
    ADR_STREET_ADDRESS("street-address"),
    ADR_EXTENDED_ADDRESS("extended-address"),
    ADR_LOCALITY("locality"),
    ADR_REGION("region"),
    ADR_POSTAL_CODE("postal-code"),
    UNKNOWN(null),
    SEPARATOR(null);

    final String h;

    d(String str) {
        this.h = str;
    }
}
