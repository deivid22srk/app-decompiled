package com.google.android.gms.d;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.av;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.b f5787a = com.google.android.gms.common.b.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5788b = new Object();
    private static Method c = null;

    public static void a(Context context, c cVar) {
        av.a(context, "Context must not be null");
        av.a(cVar, "Listener must not be null");
        av.b("Must be called on the UI thread");
        new b(context, cVar).execute(new Void[0]);
    }

    public static void a(Context context) {
        av.a(context, "Context must not be null");
        com.google.android.gms.common.b.b(context);
        Context e = com.google.android.gms.common.c.e(context);
        if (e == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized (f5788b) {
            try {
                if (c == null) {
                    c = e.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
                }
                c.invoke(null, e);
            } catch (Exception e2) {
                Log.e("ProviderInstaller", "Failed to install provider: " + e2.getMessage());
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }
}
