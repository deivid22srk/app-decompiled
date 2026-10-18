package com.google.android.finsky.utils;

/* loaded from: classes.dex */
public final class ij {
    public static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            FinskyLog.d("Could not find " + str, new Object[0]);
            return null;
        }
    }
}
