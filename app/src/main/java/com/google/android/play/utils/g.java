package com.google.android.play.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class g {
    @TargetApi(16)
    public static void a(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        if (Build.VERSION.SDK_INT >= 16 && !TextUtils.isEmpty(str)) {
            accessibilityNodeInfo.setClassName(str);
        }
    }
}
