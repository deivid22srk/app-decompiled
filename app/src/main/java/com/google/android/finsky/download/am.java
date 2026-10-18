package com.google.android.finsky.download;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;

/* loaded from: classes.dex */
public final class am {
    public static boolean a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long b() {
        if (a()) {
            return a(Environment.getExternalStorageDirectory().getPath());
        }
        return -1L;
    }

    public static long c() {
        return a(Environment.getDataDirectory().getPath());
    }

    public static long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getTotalBytes();
        }
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    @TargetApi(18)
    private static long a(String str) {
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
