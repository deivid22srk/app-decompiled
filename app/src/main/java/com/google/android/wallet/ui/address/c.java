package com.google.android.wallet.ui.address;

import java.util.Comparator;

/* loaded from: classes.dex */
final class c implements Comparator<Object> {
    c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj.toString(), obj2.toString());
    }
}
