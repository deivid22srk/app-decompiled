package com.google.android.play.cpkg;

import android.os.Build;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6829a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f6830b;

    static {
        byte b2 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            f6829a = new m(b2);
        } else {
            f6829a = new l((byte) 0);
        }
        f6830b = new k();
    }
}
