package com.google.android.play.utils;

import android.content.Context;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static f f7080a;

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 8;
        }
        if (networkInfo.getType() == 1) {
            return 4;
        }
        if (networkInfo.getType() == 6) {
            return 3;
        }
        if (networkInfo.getType() == 0) {
            switch (networkInfo.getSubtype()) {
            }
            return 3;
        }
        if (networkInfo.getType() == 9) {
            return 6;
        }
        return networkInfo.getType() == 7 ? 7 : 0;
    }

    public static int a(Context context) {
        NetworkInfo a2;
        if (f7080a == null) {
            PlayCommonLog.d("NetworkInfoCache instance is not set in NetworkInfoUtil", new Object[0]);
            a2 = null;
        } else {
            a2 = f7080a.a(context);
        }
        return a(a2);
    }
}
