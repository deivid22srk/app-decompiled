package com.google.android.gms.ads.internal.a;

import android.content.SharedPreferences;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ig;

@gw
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    final Object f5291a = new Object();

    /* renamed from: b, reason: collision with root package name */
    boolean f5292b = false;
    SharedPreferences c = null;

    public final <T> T a(a<T> aVar) {
        synchronized (this.f5291a) {
            if (this.f5292b) {
                return (T) ig.a(new k(this, aVar));
            }
            return aVar.f5285b;
        }
    }
}
