package com.google.android.play.c;

import android.os.Build;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f6827a;

    static {
        byte b2 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            f6827a = new g(b2);
        } else {
            f6827a = new f(b2);
        }
    }
}
