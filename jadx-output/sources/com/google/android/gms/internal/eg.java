package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class eg {
    public static Intent a(Context context, Map<String, String> map) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo a2;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str = map.get("u");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        boolean parseBoolean = Boolean.parseBoolean(map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean(map.get("use_running_process"));
        Uri build = "http".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("http").build() : null;
        ArrayList arrayList = new ArrayList();
        Intent a3 = a(parse);
        Intent a4 = a(build);
        ResolveInfo a5 = a(context, a3, arrayList);
        if (a5 != null) {
            return a(a3, a5);
        }
        if (a4 != null && (a2 = a(context, a4)) != null) {
            Intent a6 = a(a3, a2);
            if (a(context, a6) != null) {
                return a6;
            }
        }
        if (arrayList.size() == 0) {
            return a3;
        }
        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                while (it2.hasNext()) {
                    if (it2.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                        return a(a3, resolveInfo);
                    }
                }
            }
        }
        return parseBoolean ? a(a3, (ResolveInfo) arrayList.get(0)) : a3;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private static Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private static ResolveInfo a(Context context, Intent intent) {
        return a(context, intent, new ArrayList());
    }

    private static ResolveInfo a(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= queryIntentActivities.size()) {
                    break;
                }
                ResolveInfo resolveInfo2 = queryIntentActivities.get(i2);
                if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i = i2 + 1;
            }
        }
        resolveInfo = null;
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
