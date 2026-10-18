package com.google.android.finsky.api;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2006a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2007b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;

    public static void a() {
        com.google.android.finsky.d.d e2 = FinskyApp.a().e();
        f2007b = e2.a(12603144L);
        c = e2.a(12603145L);
        d = e2.a(12603146L);
        e = e2.a(12603147L);
        f = e2.a(12603148L);
        g = e2.a(12603149L);
        f2006a = (f2007b || c || d || e || f || g) ? false : true;
    }

    public static boolean b() {
        return f2006a;
    }

    private static Uri.Builder c(String str, int i) {
        if (i == 9) {
            i = 0;
        }
        return b.d.buildUpon().appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("q", str);
    }

    public static String a(String str, int i) {
        return c(str, i).build().toString();
    }

    public static String b(String str, int i) {
        Uri.Builder c2 = c(str, i);
        c2.appendQueryParameter("fpr", "0");
        return c2.build().toString();
    }

    public static String a(String str) {
        return "details?doc=" + str;
    }

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getQueryParameter("doc"), Uri.parse(str2).getQueryParameter("doc"));
    }

    public static int c() {
        int intValue;
        if (f2006a) {
            return Math.round(d.e.b().intValue() * z.b());
        }
        switch (com.google.android.play.utils.e.a(FinskyApp.a().getApplicationContext())) {
            case 1:
                intValue = d.f.b().intValue();
                break;
            case 2:
                intValue = d.g.b().intValue();
                break;
            case 3:
                intValue = d.h.b().intValue();
                break;
            case 4:
            case 6:
                intValue = d.i.b().intValue();
                break;
            case 5:
            default:
                intValue = d.g.b().intValue();
                break;
        }
        if (f2007b) {
            return (int) (intValue * 0.5f);
        }
        if (c) {
            return (int) (intValue * 0.75f);
        }
        if (d) {
            return (int) (intValue * 1.0f);
        }
        if (e) {
            return (int) (intValue * 1.25f);
        }
        if (f) {
            return (int) (intValue * 1.5f);
        }
        if (g) {
            return (int) (intValue * 1.75f);
        }
        return intValue;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 10);
    }
}
