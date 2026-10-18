package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class eh implements ea {

    /* renamed from: a, reason: collision with root package name */
    private final Map<im, Integer> f5956a = new WeakHashMap();

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            com.google.android.gms.ads.internal.client.j.a();
            return com.google.android.gms.ads.internal.util.client.a.a(context, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not parse " + str + " in a video GMSG: " + str2);
            return i;
        }
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        com.google.android.gms.ads.internal.overlay.m a2;
        String str = map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.b.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.b.a("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.b.e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                int parseColor = Color.parseColor(str2);
                il q = imVar.q();
                if (q == null || (a2 = q.a()) == null) {
                    this.f5956a.put(imVar, Integer.valueOf(parseColor));
                } else {
                    a2.setBackgroundColor(parseColor);
                }
                return;
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.b.e("Invalid color parameter in video GMSG.");
                return;
            }
        }
        il q2 = imVar.q();
        if (q2 == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = imVar.getContext();
            int a3 = a(context, map, "x", 0);
            int a4 = a(context, map, "y", 0);
            int a5 = a(context, map, "w", -1);
            int a6 = a(context, map, "h", -1);
            try {
                Integer.parseInt(map.get("player"));
            } catch (NumberFormatException e2) {
            }
            if (!equals || q2.a() != null) {
                com.google.android.gms.common.internal.av.b("The underlay may only be modified from the UI thread.");
                if (q2.d != null) {
                    q2.d.a(a3, a4, a5, a6);
                    return;
                }
                return;
            }
            if (q2.d == null) {
                cp.a(q2.f6061a.s().f5937b, q2.f6061a.r(), "vpr");
                cp.a(q2.f6061a.s().f5937b);
                q2.d = new com.google.android.gms.ads.internal.overlay.m(q2.f6062b, q2.f6061a);
                q2.c.addView(q2.d, 0, new ViewGroup.LayoutParams(-1, -1));
                q2.d.a(a3, a4, a5, a6);
                q2.f6061a.i().i = false;
            }
            if (this.f5956a.containsKey(imVar)) {
                int intValue = this.f5956a.get(imVar).intValue();
                com.google.android.gms.ads.internal.overlay.m a7 = q2.a();
                a7.setBackgroundColor(intValue);
                a7.b();
                return;
            }
            return;
        }
        com.google.android.gms.ads.internal.overlay.m a8 = q2.a();
        if (a8 == null) {
            com.google.android.gms.ads.internal.overlay.m.a(imVar);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = imVar.getContext();
            int a9 = a(context2, map, "x", 0);
            int a10 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a9, a10, 0);
            if (a8.d != null) {
                a8.d.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str3 = map.get("time");
            if (str3 == null) {
                com.google.android.gms.ads.internal.util.client.b.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                Float.parseFloat(str3);
                return;
            } catch (NumberFormatException e3) {
                com.google.android.gms.ads.internal.util.client.b.e("Could not parse time parameter from currentTime video GMSG: " + str3);
                return;
            }
        }
        if ("hide".equals(str)) {
            a8.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            a8.a();
            return;
        }
        if ("mimetype".equals(str)) {
            a8.setMimeType(map.get("mimetype"));
            return;
        }
        if ("muted".equals(str)) {
            Boolean.parseBoolean(map.get("muted"));
            return;
        }
        if ("pause".equals(str) || "play".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            a8.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            a8.i = map.get("src");
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                a8.b();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.b.e("Unknown video action: " + str);
                return;
            }
        }
        String str4 = map.get("volume");
        if (str4 == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            Float.parseFloat(str4);
        } catch (NumberFormatException e4) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not parse volume parameter from volume video GMSG: " + str4);
        }
    }
}
