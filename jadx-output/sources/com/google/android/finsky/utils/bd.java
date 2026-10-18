package com.google.android.finsky.utils;

import android.content.Context;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    static boolean f4771a = false;

    /* renamed from: b, reason: collision with root package name */
    static float f4772b = 1.0f;
    static int c = 0;
    private static final long[] d = {12605174, 12605175, 12605176, 12605177, 12605178, 12605179, 12605180};

    public static int a(Context context) {
        if (f4771a) {
            return b(context);
        }
        int a2 = com.google.android.play.utils.c.d.a();
        if (a2 == -1) {
            return b(context);
        }
        float f = f4772b;
        if (a2 < com.google.android.finsky.c.d.fs.b().intValue() + c) {
            return 0;
        }
        if (a2 < com.google.android.finsky.c.d.ft.b().intValue() * f) {
            return 1;
        }
        if (a2 < com.google.android.finsky.c.d.fu.b().intValue() * f) {
            return 2;
        }
        return 3;
    }

    private static int b(Context context) {
        switch (com.google.android.play.utils.e.a(context)) {
            case 1:
                return 3;
            case 2:
            case 5:
            default:
                return 2;
            case 3:
            case 4:
            case 6:
                return 1;
        }
    }

    public static boolean a() {
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        for (long j : d) {
            if (e.a(j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        f4771a = false;
        f4772b = 1.0f;
        c = 0;
        com.google.android.play.image.u.a((com.google.android.play.image.v) null);
    }

    public static void b() {
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        for (long j : d) {
            if (e.a(j)) {
                a(j);
                return;
            }
        }
        e();
    }

    public static void a(long j) {
        e();
        if (j == 12605174) {
            f4772b = 1.0f;
        } else if (j == 12605175) {
            f4772b = 1.5f;
        } else if (j == 12605176) {
            f4772b = 2.0f;
        } else if (j == 12605177) {
            f4772b = 2.0f;
            c = 300;
        } else if (j == 12605178) {
            f4772b = 2.5f;
        } else if (j == 12605179) {
            f4772b = 3.0f;
        } else if (j == 12605180) {
            f4771a = true;
        } else {
            FinskyLog.a("Bucket experiment disabled", new Object[0]);
            return;
        }
        FinskyLog.a("Enabling bucket experiment: factor=%.3f, zeroDelta=%dms, forceNetwork=%b", Float.valueOf(f4772b), Integer.valueOf(c), Boolean.valueOf(f4771a));
        com.google.android.play.image.u.a(new be());
    }
}
