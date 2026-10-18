package com.a.a.apkg.apkg;

import java.util.Comparator;

/* loaded from: classes.dex */
final class v implements Comparator<String> {
    v() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (str3 == str4) {
            return 0;
        }
        if (str3 == null) {
            return -1;
        }
        if (str4 == null) {
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
    }
}
