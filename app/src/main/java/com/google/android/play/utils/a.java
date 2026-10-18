package com.google.android.play.utils;

/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
