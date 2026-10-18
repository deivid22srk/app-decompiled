package com.google.android.finsky.bpkg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ea;
import java.io.File;

/* loaded from: classes.dex */
public final class o implements com.google.android.finsky.receivers.aq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2126a;

    public o(Context context) {
        this.f2126a = context;
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        if (l.a(str)) {
            Intent intent = new Intent("com.google.android.gms.GMS_UPDATED");
            intent.setPackage("com.google.android.gms");
            this.f2126a.sendBroadcast(intent);
            try {
                int i = this.f2126a.getPackageManager().getApplicationInfo(str, 0).flags;
                boolean z = (i & 1) != 0;
                boolean z2 = (i & 128) != 0;
                if (z && !z2) {
                    a(str, 2, "downgrade");
                } else {
                    a(str, 1, "install/update");
                }
            } catch (PackageManager.NameNotFoundException e) {
                FinskyLog.c("NameNotFoundException getting info for %s", str);
                return;
            }
        }
        a(this.f2126a, str);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (!z && l.a(str)) {
            a(str, 2, "removed");
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
        a(this.f2126a, str);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }

    public void a(String str, int i, String str2) {
        a aVar = FinskyApp.a().s;
        aVar.a(new p(this, str, i, str2, aVar));
    }

    public static void a(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= com.google.android.finsky.cpkg.d.aZ.b().intValue() && Build.VERSION.SDK_INT <= com.google.android.finsky.cpkg.d.ba.b().intValue()) {
            str2 = l.f2122b;
            if (!str2.equals(str)) {
                str3 = l.f2121a;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                        str4 = l.f2121a;
                        if (str4.equals(packageInfo.sharedUserId)) {
                            FinskyLog.a("Found shared UID match between NLP and %s", str);
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                str6 = l.f2122b;
                                ea.a(FinskyApp.a(), Uri.fromFile(new File(packageManager.getApplicationInfo(str6, 0).sourceDir)), new q(), 2);
                            } catch (PackageManager.NameNotFoundException e) {
                                StringBuilder sb = new StringBuilder("NameNotFoundException getting info for ");
                                str5 = l.f2122b;
                                FinskyLog.c(sb.append(str5).toString(), new Object[0]);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        FinskyLog.c("NameNotFoundException getting info for %s", str);
                    }
                }
            }
        }
    }
}
