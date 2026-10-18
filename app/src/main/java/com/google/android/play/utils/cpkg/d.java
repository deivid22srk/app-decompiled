package com.google.android.play.utils.cpkg;

import com.google.android.play.utils.PlayCommonLog;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static e f7078a;

    public static int a() {
        if (f7078a != null) {
            return f7078a.a();
        }
        PlayCommonLog.d("NetworkQualityCache instance is not set in NetworkQualityUtil", new Object[0]);
        return -1;
    }
}
