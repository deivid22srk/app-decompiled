package com.google.android.finsky.wear;

import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class WearChangeListenerService extends com.google.android.gms.wearable.ae {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.wearable.ae, com.google.android.gms.wearable.h
    public final void a(com.google.android.gms.wearable.k kVar) {
        char c;
        ArrayList arrayList = null;
        FinskyLog.a("Wear received %d events", Integer.valueOf(kVar.c()));
        if (!FinskyApp.a().e().a(12603948L)) {
            FinskyLog.a("disabled", new Object[0]);
            return;
        }
        Iterator<com.google.android.gms.wearable.j> it = kVar.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            com.google.android.gms.wearable.j next = it.next();
            Uri b2 = next.b().b();
            if (!"wear".equals(b2.getScheme()) || TextUtils.isEmpty(b2.getHost()) || b2.getPathSegments().size() <= 0) {
                FinskyLog.c("Malformed DataEvent %s", b2);
            } else {
                String str = b2.getPathSegments().get(0);
                switch (str.hashCode()) {
                    case -1877302009:
                        if (str.equals("package_info")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1750600751:
                        if (str.equals("zapp_modules_response")) {
                            c = '\b';
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
                    case -831699946:
                        if (str.equals("uninstall_wearable")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 274870228:
                        if (str.equals("wearable_info")) {
                            c = 5;
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
                    case 1321437053:
                        if (str.equals("install_wearable")) {
                            c = 6;
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
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        switch (next.c()) {
                            case 1:
                                ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                arrayList3.add(b2.toString());
                                arrayList2 = arrayList3;
                                break;
                            case 2:
                                ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(b2.toString());
                                arrayList = arrayList4;
                                break;
                            default:
                                FinskyLog.c("Unexpected DataEvent type %d %s", Integer.valueOf(next.c()), b2);
                                break;
                        }
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                        break;
                    default:
                        FinskyLog.c("Unexpected DataEvent %s", b2);
                        break;
                }
            }
        }
        if (arrayList2 != null || arrayList != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                WearSupportService.a(this, (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    @Override // com.google.android.gms.wearable.ae, com.google.android.gms.wearable.u
    public final void a(com.google.android.gms.wearable.w wVar) {
        String a2;
        String b2;
        a2 = wVar.a();
        b2 = wVar.b();
        FinskyLog.a("Received wear message %s from node %s", a2, b2);
        switch (a2) {
            case "run_daily_hygiene":
                WearSupportService.a(FinskyApp.a(), b2, "hygiene_reason_node_request");
                break;
            case "checkin_complete":
                WearSupportService.a(FinskyApp.a(), b2, "hygiene_reason_retry");
                break;
            default:
                FinskyLog.c("Unknown message %s", a2);
                break;
        }
    }
}
