package com.google.android.wallet.common.c;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.volley.a.c;
import com.android.volley.a.g;
import com.android.volley.i;
import com.android.volley.o;
import com.google.android.volley.k;
import com.google.android.wallet.a.d;
import java.io.File;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7268a = String.format(Locale.US, "unused/0 (%s %s); gzip", Build.DEVICE, Build.ID);

    /* renamed from: b, reason: collision with root package name */
    private static o f7269b;
    private static o c;

    public static synchronized void a(o oVar) {
        synchronized (a.class) {
            if (oVar != f7269b) {
                if (f7269b == null || oVar == null) {
                    f7269b = oVar;
                } else {
                    Log.e("WalletRequestQueue", "Trying to set request queue when one already exists");
                }
            }
        }
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (a.class) {
            if (f7269b == null) {
                o oVar2 = new o(new g(new File(context.getCacheDir(), "wallet_im_volley_api_cache"), 1048576), c(context), 2);
                f7269b = oVar2;
                oVar2.a();
            }
            oVar = f7269b;
        }
        return oVar;
    }

    public static synchronized void b(o oVar) {
        synchronized (a.class) {
            if (oVar != c) {
                if (c == null || oVar == null) {
                    c = oVar;
                } else {
                    Log.e("WalletRequestQueue", "Trying to set image request queue when one already exists");
                }
            }
        }
    }

    public static synchronized o b(Context context) {
        o oVar;
        synchronized (a.class) {
            if (c == null) {
                o oVar2 = new o(new g(new File(context.getCacheDir(), "wallet_im_volley_image_cache"), d.f7229b.b().intValue()), c(context), 6);
                c = oVar2;
                oVar2.a();
            }
            oVar = c;
        }
        return oVar;
    }

    private static i c(Context context) {
        return new c(new k(context, com.google.android.wallet.a.a.g.b().booleanValue()));
    }
}
