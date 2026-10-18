package com.google.android.finsky.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    private static List<Signature> f4984a;

    public static boolean a(Activity activity) {
        String a2 = com.google.android.wallet.common.util.a.a(activity);
        if (a2 == null) {
            FinskyLog.a("Couldn't determine caller. Either use startActivityForResult or set FLAG_ACTIVITY_FORWARD_RESULT.", new Object[0]);
            return false;
        }
        if (a2.equals(activity.getPackageName())) {
            return true;
        }
        return a(activity, a2);
    }

    private static boolean a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (a(context, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkSignatures(str, context.getPackageName()) == 0) {
            return true;
        }
        a(context);
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (str.equals("com.quickoffice.android")) {
                Signature a2 = a("MIICVzCCAcCgAwIBAgIESVJ9+TANBgkqhkiG9w0BAQUFADBvMQswCQYDVQQGEwJVUzELMAkGA1UECBMCVFgxDzANBgNVBAcTBkRhbGxhczEUMBIGA1UEChMLUXVpY2tvZmZpY2UxDzANBgNVBAsTBlFPLURFVjEbMBkGA1UEAxMSQWxleGFuZGVyIFN0ZXBhbm92MCAXDTA4MTIyNDE4MjI0OVoYDzIwNjMwOTI3MTgyMjQ5WjBvMQswCQYDVQQGEwJVUzELMAkGA1UECBMCVFgxDzANBgNVBAcTBkRhbGxhczEUMBIGA1UEChMLUXVpY2tvZmZpY2UxDzANBgNVBAsTBlFPLURFVjEbMBkGA1UEAxMSQWxleGFuZGVyIFN0ZXBhbm92MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQChx/LvhUKzh2bdxAYelxtLR+EU7hWRFw/GmJHgTSvhAVKReWUZolS2bOk0xaybV499hHEAGutl2mX90KJ4EIZh3LZNk3qjy3terL8YDqoayWI+EZtSAifFEBbn3bPdhX6pqI/1v/SivKf/LQrw5VASStE2dylHtRAnLLJGbvOWeQIDAQABMA0GCSqGSIb3DQEBBQUAA4GBABU7YooXGdyniqWBK44g0XjN9NLTKTpXec856AVBQWv+PnqAvGS282KChu2tMYyJHRok0jxvTlYwgXZIa31Sw57372zJ6hDqgnBQdBdF7FnKDhyZZ+XPZHGEr+TXe/3jZwl5tZo7WmoWMAkWnMqda/CQ7TVgr+8gacujXGyhUsWv");
                for (Signature signature : packageInfo.signatures) {
                    if (signature.equals(a2)) {
                        return true;
                    }
                }
            }
            Signature[] signatureArr = packageInfo.signatures;
            for (Signature signature2 : signatureArr) {
                for (int i = 0; i < f4984a.size(); i++) {
                    if (signature2.equals(f4984a.get(i))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.c("Couldn't get info for package %s", str);
            return false;
        }
    }

    private static synchronized void a(Context context) {
        synchronized (ib.class) {
            if (f4984a == null) {
                ArrayList arrayList = new ArrayList();
                f4984a = arrayList;
                arrayList.add(a("MIICUjCCAbsCBEk0mH4wDQYJKoZIhvcNAQEEBQAwcDELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUsIEluYzEUMBIGA1UECxMLR29vZ2xlLCBJbmMxEDAOBgNVBAMTB1Vua25vd24wHhcNMDgxMjAyMDIwNzU4WhcNMzYwNDE5MDIwNzU4WjBwMQswCQYDVQQGEwJVUzELMAkGA1UECBMCQ0ExFjAUBgNVBAcTDU1vdW50YWluIFZpZXcxFDASBgNVBAoTC0dvb2dsZSwgSW5jMRQwEgYDVQQLEwtHb29nbGUsIEluYzEQMA4GA1UEAxMHVW5rbm93bjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAn0gDGZD5sUcmOE4EU9GPjAu/jcd7JQSksSB8TGxEurwArcZhD6a2qy2oDjPy7vFrJqP2uFua+sqQn/u+s/TJT36BIqeY4OunXO090in6c2X0FRZBWqnBYX3Vg84Zuuigu9iF/BeptL0mQIBRIarbk3fetAATOBQYiC7FIoL8WA0CAwEAATANBgkqhkiG9w0BAQQFAAOBgQBAhmae1jHaQ4Td0GHSJuBzuYzEuZ34teS+njy+l1Aeg98cb6lZwM5gXE/SrG0chM7eIEdsurGb6PIgOv93F61lLY/MiQcI0SFtqERXWSZJ4OnTxLtM9Y2hnbHU/EG8uVhPZOZfQQ0FKf1baIOMFB0Km9HbEZHLKg33kOoMsS2zpA=="));
                if (b(context)) {
                    FinskyLog.a("Apps signed by first-party test keys will be allowed", new Object[0]);
                    f4984a.add(a("MIIEqDCCA5CgAwIBAgIJAIR+T/LWtd6OMA0GCSqGSIb3DQEBBQUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0xMDAxMjAwMTAxMzVaFw0zNzA2MDcwMTAxMzVaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANgocXw20RcP1E0Kew8HESboW7/fM7A0YABalMz7ZaXboLJD32Cxkb+dBt8dilwKM+LRY/UT3x0iU0HqPDN5IuhcAuw0ztlMuAcjpiP/S6/7tOXv5nc7PqK+uLyyAmfP54VRH4Mu+YerdZT+HinPvE0IOh8SUgB3c5byFltpewCjoME6zDCKk/IhY8FunD1KshSfNkxFwEMUMnA58doJYJPxs/wYtlYQlcYiX8cQK5h8bxOkXSTj4MVOhZ1n41tnCCcT0tbwV900V9GfxP6N3eyMOk8/lyMFGacKKDY0rDWBo0q9oX2EWgoJhfv4BgsDaid4YIFj+gw3uefyoQ52vHcCAQOjgfwwgfkwHQYDVR0OBBYEFLXH+RJveA06+8plc3M/9SJrmxc3MIHJBgNVHSMEgcEwgb6AFLXH+RJveA06+8plc3M/9SJrmxc3oYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJAIR+T/LWtd6OMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBAEw+p2V9Jua71xEMjxnfH42hCX0zhg9p3r/K20ajfoflsw+7NHscdVW8uzyZVBSARpZfnHkqAtDb5aZHYbN5R6tr/7C6xqLBoM34Yvh3qWcN/W8GLkBuzhgGDGBJjfw2nycRcZjlb8uhUuYFjc6UzlkfxPSpmCszutgZbXdvVbfQGs8x3dcM7LeJeHYGZRD5SaVSSjExs8tlQc+LNUIOvMRSJVmWP0JmaQVyZmJPs5jP21IXiB0RHG4DRhb4USEY0KKmnRPXkvDNEdvVjiODWlSlSsJR59IsRGo/7hQSEOlER0tAYwe7JoQrT2vTVYIcc5ZR/6JgWwXiJJXXFdh6kfY="));
                } else {
                    FinskyLog.a("Will not allow first-party apps signed by test keys", new Object[0]);
                }
            }
        }
    }

    private static boolean b(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            Signature a2 = a("MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVyxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8XW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexAcKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkwHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0cxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrPzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXclaXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05aIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+aayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUWEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs=");
            for (Signature signature : signatureArr) {
                if (a2.equals(signature)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.b(e, "Unable to look up our own PackageInfo", new Object[0]);
            return false;
        }
    }

    private static Signature a(String str) {
        return new Signature(Base64.decode(str, 0));
    }

    public static String a(Context context, String str, com.google.android.play.utils.b.a<Boolean> aVar, com.google.android.finsky.a.i iVar, int i) {
        String str2;
        int callingUid = Binder.getCallingUid();
        PackageManager packageManager = context.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            FinskyLog.d("getPackagesForUid %d returned 0 packages", Integer.valueOf(callingUid));
            a(iVar, i, str, "no-packages-for-uid", null, null);
            return null;
        }
        if (packagesForUid.length == 1) {
            str2 = packagesForUid[0];
        } else {
            String nameForUid = packageManager.getNameForUid(callingUid);
            if (nameForUid == null) {
                FinskyLog.d("getNameForUid %d returned null", Integer.valueOf(callingUid));
                a(iVar, i, str, "no-name-for-uid", null, null);
                return null;
            }
            str2 = "sharedUserId=" + nameForUid;
        }
        if ((aVar != null && aVar.b().booleanValue()) || a(context, packagesForUid)) {
            return str2;
        }
        FinskyLog.a("Unable to authorize API access for %s", str2);
        a(iVar, i, str, "auth-rejection", str2, null);
        return null;
    }

    public static void a(com.google.android.finsky.a.i iVar, int i, String str, String str2, String str3, String str4) {
        iVar.b(new com.google.android.finsky.a.b(i).a(str).b(str2).a(str2 == null).d(str3).c(str4).f1473a);
    }
}
