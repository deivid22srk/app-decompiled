package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Object f5337a;

    /* renamed from: b, reason: collision with root package name */
    final Context f5338b;
    final boolean c;

    public b(Context context) {
        this(context, (byte) 0);
    }

    private b(Context context, byte b2) {
        this.f5338b = context;
        this.c = true;
    }

    public final Bundle a(String str, String str2, String str3) {
        try {
            Class<?> loadClass = this.f5338b.getClassLoader().loadClass("com.deivid22srk.store.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getBuyIntent", Integer.TYPE, String.class, String.class, String.class, String.class).invoke(loadClass.cast(this.f5337a), 3, str, str2, "inapp", str3);
        } catch (Exception e) {
            if (this.c) {
                com.google.android.gms.ads.internal.util.client.b.c("IInAppBillingService is not available, please add com.deivid22srk.store.billing.IInAppBillingService to project.", e);
            }
            return null;
        }
    }
}
