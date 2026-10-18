package com.google.android.finsky.utils;

import android.content.Context;

/* loaded from: classes.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f4985a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4986b = null;

    public static synchronized boolean a(Context context) {
        boolean booleanValue;
        String str;
        synchronized (ic.class) {
            if (f4985a == null) {
                if (ik.a()) {
                    str = "tubesky";
                } else if (b(context)) {
                    str = "sidewinder";
                } else {
                    str = "classic";
                }
                f4985a = Boolean.valueOf(str.equals("classic"));
            }
            booleanValue = f4985a.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized boolean b(Context context) {
        boolean booleanValue;
        synchronized (ic.class) {
            if (f4986b == null) {
                f4986b = Boolean.valueOf(com.google.android.gms.common.c.h(context));
            }
            booleanValue = f4986b.booleanValue();
        }
        return booleanValue;
    }
}
