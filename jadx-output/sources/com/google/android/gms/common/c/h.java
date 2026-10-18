package com.google.android.gms.common.c;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class h {
    public static String a(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static String a(int i) {
        String str;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = i + 3;
        for (int i3 = 3; i3 < i2; i3++) {
            if (i3 + 4 >= stackTrace.length) {
                str = "<bottom of call stack>";
            } else {
                StackTraceElement stackTraceElement = stackTrace[i3 + 4];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            }
            stringBuffer.append(str).append(" ");
        }
        return stringBuffer.toString();
    }
}
