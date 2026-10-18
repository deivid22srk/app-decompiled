package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f5080a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5081b;
    final /* synthetic */ String c;
    final /* synthetic */ WearSupportService d;

    ai(WearSupportService wearSupportService, Uri uri, String str, String str2) {
        this.d = wearSupportService;
        this.f5080a = uri;
        this.f5081b = str;
        this.c = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        com.google.android.gms.common.api.m mVar;
        WearSupportService.a(this.d);
        List<String> pathSegments = this.f5080a.getPathSegments();
        String str = pathSegments.get(0);
        switch (str.hashCode()) {
            case -1877302009:
                if (str.equals("package_info")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1704809566:
                if (str.equals("request_status")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -889462529:
                if (str.equals("zapp_modules_request")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1138071245:
                if (str.equals("device_configuration")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1418454339:
                if (str.equals("liveness")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                String str2 = pathSegments.get(1);
                WearSupportService wearSupportService = this.d;
                String str3 = this.f5081b;
                mVar = this.d.f;
                z.a(wearSupportService, str3, mVar).e(str2);
                break;
            case 1:
                WearSupportService.b(this.d, this.f5081b);
                break;
            case 2:
                pathSegments.get(1);
                break;
            case 3:
                break;
            case 4:
                WearSupportService.a(this.d, this.f5080a);
                break;
            default:
                FinskyLog.e("Unexpected command in %s", this.c);
                break;
        }
        this.d.b();
    }
}
