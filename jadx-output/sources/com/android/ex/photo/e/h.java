package com.android.ex.photo.e;

import android.os.Build;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
