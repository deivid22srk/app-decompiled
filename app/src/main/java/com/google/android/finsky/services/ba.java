package com.google.android.finsky.services;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class ba extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VpaService f4606a;

    ba(VpaService vpaService) {
        this.f4606a = vpaService;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (str2 == null) {
            FinskyLog.a("No VPA stub found - stopping service", new Object[0]);
            VpaService.d(this.f4606a);
            VpaService.c(this.f4606a);
            return;
        }
        VpaService.a(this.f4606a, str2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ String doInBackground(Void[] voidArr) {
        Intent intent = new Intent();
        intent.setAction("android.autoinstalls.config.action.PLAY_AUTO_INSTALL");
        List<ResolveInfo> queryBroadcastReceivers = FinskyApp.a().getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() > 0) {
            String str = queryBroadcastReceivers.get(0).activityInfo.packageName;
            com.google.android.finsky.bpkg.y a2 = FinskyApp.a().v.a(str);
            if (a2 == null) {
                FinskyLog.e("Null PackageState for potential VPA stub %s", str);
            } else {
                int i = a2.c;
                boolean z = a2.d;
                boolean z2 = a2.e;
                if ((i == 1 && z && !z2) || z2) {
                    FinskyLog.a("Found VPA stub %s:%d", str, Integer.valueOf(i));
                    return str;
                }
                FinskyLog.a("Rejected VPA stub %s:%d", str, Integer.valueOf(i));
            }
        }
        return null;
    }
}
