package com.google.android.finsky.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5053a;

    public n(Context context) {
        this.f5053a = context;
    }

    public final void a(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new o(this, runnable, i), i);
    }

    public final boolean a() {
        List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) this.f5053a.getSystemService("activity")).getRecentTasks(1, 0);
        if (recentTasks.size() == 0) {
            return true;
        }
        ActivityManager.RecentTaskInfo recentTaskInfo = recentTasks.get(0);
        return (recentTaskInfo.baseIntent == null || recentTaskInfo.baseIntent.getComponent() == null || this.f5053a.getPackageName().equals(recentTaskInfo.baseIntent.getComponent().getPackageName())) ? false : true;
    }
}
