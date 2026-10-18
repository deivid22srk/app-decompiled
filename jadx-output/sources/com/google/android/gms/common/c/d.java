package com.google.android.gms.common.c;

import android.content.Context;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f5603a = null;

    public static int a(int i) {
        return i / 1000;
    }

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
