package com.google.android.play.image;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.play.utils.PlayCommonLog;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6952a;

    /* renamed from: b, reason: collision with root package name */
    private static com.google.android.play.utils.cpkg.c f6953b;
    private static float c;
    private static v d;

    static {
        f6952a = com.google.android.play.utils.bpkg.j.w.b().booleanValue() && Build.VERSION.SDK_INT >= 17;
        c = 1.0f;
        d = null;
    }

    public static void a(v vVar) {
        d = vVar;
    }

    public static void a(float f) {
        if (f > 0.0f) {
            c = f;
        }
    }

    public static float a() {
        return c;
    }

    public static void a(com.google.android.play.utils.cpkg.c cVar) {
        f6953b = cVar;
    }

    public static float a(Context context) {
        if (d != null) {
            return 1.0f;
        }
        com.google.android.play.utils.cpkg.c cVar = f6953b;
        if (cVar == null) {
            return b(context);
        }
        if (!((com.google.android.play.utils.cpkg.d.f7078a == null || com.google.android.play.utils.cpkg.d.f7078a.a() == -1) ? false : true)) {
            PlayCommonLog.a("No latency prediction available, falling back to network type", new Object[0]);
            return b(context);
        }
        return cVar.a(com.google.android.play.utils.cpkg.d.a());
    }

    private static float b(Context context) {
        switch (com.google.android.play.utils.e.a(context)) {
            case 1:
                return com.google.android.play.utils.bpkg.j.A.b().floatValue();
            case 2:
                return com.google.android.play.utils.bpkg.j.z.b().floatValue();
            case 3:
                return com.google.android.play.utils.bpkg.j.y.b().floatValue();
            case 4:
            case 6:
                return com.google.android.play.utils.bpkg.j.x.b().floatValue();
            case 5:
            default:
                return com.google.android.play.utils.bpkg.j.z.b().floatValue();
        }
    }

    public static String a(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (f6952a) {
                sb.append("rw");
            }
            if (i > 0) {
                if (sb.length() != 0) {
                    sb.append('-');
                }
                sb.append('w').append(i);
            }
            if (i2 > 0) {
                if (sb.length() != 0) {
                    sb.append('-');
                }
                sb.append('h').append(i2);
            }
            v vVar = d;
            if (vVar != null) {
                if (sb.length() != 0) {
                    sb.append('-');
                }
                sb.append('v').append(vVar.a());
            }
            if (sb.length() != 0) {
                String sb2 = sb.toString();
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameter("fife") != null) {
                    StringBuilder sb3 = new StringBuilder(str);
                    if (str.indexOf(61) >= 0) {
                        sb3.append("-");
                    } else {
                        sb3.append("=");
                    }
                    return sb3.append(sb2).toString();
                }
                String b2 = w.b(parse);
                StringBuilder sb4 = new StringBuilder();
                if (!TextUtils.isEmpty(b2)) {
                    sb4.append(b2).append('-');
                }
                sb4.append(sb2);
                return w.a(w.a(sb4.toString(), parse));
            }
            return str;
        }
        return str;
    }
}
