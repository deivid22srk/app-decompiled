package com.google.android.finsky.utils;

import android.content.Context;
import com.google.android.finsky.FinskyApp;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* loaded from: classes.dex */
public final class dj {

    /* renamed from: b, reason: collision with root package name */
    private static com.google.android.gms.common.api.m f4829b;

    /* renamed from: a, reason: collision with root package name */
    private static int f4828a = -1;
    private static final long[] c = {12604072, 12604073, 12604074, 12604075, 12604076, 12604164, 12604165, 12604166, 12604167};

    static /* synthetic */ com.google.android.gms.common.api.m d() {
        f4829b = null;
        return null;
    }

    public static void a(Context context) {
        boolean z;
        jm.a();
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        long[] jArr = c;
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (!e.a(jArr[i])) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z && !bd.a()) {
            FinskyLog.a("Network quality prediction is disabled", new Object[0]);
            return;
        }
        if (f4829b == null) {
            f4829b = new com.google.android.gms.common.api.n(context.getApplicationContext()).a(com.google.android.gms.herrevad.a.f5857b).b();
        }
        f4829b.b();
        com.google.android.gms.herrevad.a.c.a(f4829b).a(new dk());
    }

    public static int a() {
        int i = f4828a;
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    static void a(PredictedNetworkQuality predictedNetworkQuality) {
        if (predictedNetworkQuality == null) {
            f4828a = -1;
        } else {
            f4828a = predictedNetworkQuality.c;
        }
    }

    public static com.google.android.play.utils.c.c b() {
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        for (long j : c) {
            if (e.a(j)) {
                return a(j);
            }
        }
        return null;
    }

    public static com.google.android.play.utils.c.c a(long j) {
        int i;
        if (j == 12604072) {
            i = 0;
        } else if (j == 12604073) {
            i = 500;
        } else if (j == 12604074) {
            i = 1000;
        } else if (j == 12604075) {
            i = 1500;
        } else if (j == 12604076) {
            i = 2000;
        } else if (j == 12604164) {
            i = 2500;
        } else if (j == 12604165) {
            i = 3000;
        } else if (j == 12604166) {
            i = 3500;
        } else if (j == 12604167) {
            i = 4000;
        } else {
            return null;
        }
        return new com.google.android.play.utils.c.a(new com.google.android.play.utils.c.b(i, com.google.android.finsky.c.d.fv.b().floatValue(), com.google.android.finsky.c.d.fx.b().intValue() + i, com.google.android.finsky.c.d.fw.b().floatValue()), com.google.android.finsky.c.d.fy.b().intValue());
    }
}
