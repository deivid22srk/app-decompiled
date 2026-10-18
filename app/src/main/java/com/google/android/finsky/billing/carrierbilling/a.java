package com.google.android.finsky.billing.carrierbilling;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.finsky.billing.k;
import com.google.android.finsky.billing.l;
import com.google.android.finsky.cpkg.d;
import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.utils.hy;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public static String a() {
        String d = k.d();
        if (d != null) {
            return hy.a(d.getBytes());
        }
        String e = k.e();
        if (e != null) {
            return hy.a(e.getBytes());
        }
        return "invalid_sim_id";
    }

    public static void a(boolean z, Map<String, String> map) {
        String b2 = k.b();
        if (!TextUtils.isEmpty(b2)) {
            map.put("dcbch", b2);
        }
        if (!z && !d.an.b().booleanValue()) {
            return;
        }
        boolean z2 = System.currentTimeMillis() - l.c.a().longValue() > SystemClock.elapsedRealtime();
        l.c.a((o<Long>) Long.valueOf(System.currentTimeMillis()));
        if (!z2) {
            return;
        }
        map.put("dcbdevicerebooted", "true");
    }
}
