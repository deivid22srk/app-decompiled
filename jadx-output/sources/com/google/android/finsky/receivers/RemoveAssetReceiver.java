package com.google.android.finsky.receivers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.dw;

/* loaded from: classes.dex */
public class RemoveAssetReceiver extends com.google.android.finsky.download.ak {

    /* renamed from: a, reason: collision with root package name */
    private static dw f4431a;

    public static void a(dw dwVar) {
        f4431a = dwVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
            setResultCode(-1);
            if (intent.getStringExtra("from").equals("google.com") && intent.getCategories().contains("REMOVE_ASSET")) {
                FinskyApp.a().s.a(new ar(this, context, intent));
            }
        }
    }

    static /* synthetic */ void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("asset_package");
        String stringExtra2 = intent.getStringExtra("asset_name");
        boolean parseBoolean = Boolean.parseBoolean(intent.getStringExtra("asset_malicious"));
        if (TextUtils.isEmpty(stringExtra)) {
            FinskyLog.c("Unexpected empty package name", new Object[0]);
            return;
        }
        com.google.android.finsky.b.b a2 = FinskyApp.a().s.a(stringExtra);
        FinskyLog.a("Removing package '%s'. Malicious='%s'", stringExtra, Boolean.valueOf(parseBoolean));
        com.google.android.finsky.installer.s sVar = com.google.android.finsky.installer.u.f2871a;
        if (parseBoolean) {
            PackageManager packageManager = context.getPackageManager();
            try {
                String[] packagesForUid = packageManager.getPackagesForUid(packageManager.getPackageInfo(stringExtra, 0).applicationInfo.uid);
                for (String str : packagesForUid) {
                    FinskyLog.a("Removing package '%s' (child of '%s')", str, stringExtra);
                    sVar.a(str, false);
                }
            } catch (PackageManager.NameNotFoundException e) {
                FinskyLog.c("'%s' not found in PM.", stringExtra);
            }
        } else {
            sVar.a(stringExtra, false);
        }
        if (a2 != null && a2.c != null) {
            if (parseBoolean) {
                f4431a.a(stringExtra2);
            } else {
                f4431a.c(stringExtra2, stringExtra);
            }
        }
    }
}
