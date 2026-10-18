package com.google.android.finsky.utils;

/* loaded from: classes.dex */
public enum au {
    PURCHASE,
    RENTAL,
    HIGH_DEF,
    PURCHASE_HIGH_DEF,
    RENTAL_HIGH_DEF;

    public final boolean a(int i) {
        switch (this) {
            case PURCHASE:
                return i == 1 || i == 7;
            case RENTAL:
                return i == 3 || i == 4;
            case HIGH_DEF:
                return i == 7 || i == 4;
            case PURCHASE_HIGH_DEF:
                return i == 7;
            case RENTAL_HIGH_DEF:
                return i == 4;
            default:
                throw new IllegalArgumentException();
        }
    }
}
