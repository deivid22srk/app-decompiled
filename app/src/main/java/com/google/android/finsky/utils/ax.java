package com.google.android.finsky.utils;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ax {
    public static void a(Bundle bundle, String str, int i) {
        bundle.putInt("expansion_state:" + str, i);
    }

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            return 1;
        }
        String str2 = "expansion_state:" + str;
        if (bundle.containsKey(str2)) {
            return bundle.getInt(str2);
        }
        return 1;
    }
}
