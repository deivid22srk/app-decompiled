package com.google.android.gms.car;

import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ag extends Cdo {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<s> f5465a;

    @Override // com.google.android.gms.car.dn
    public final void a(String str, String str2, int i) {
        if (this.f5465a.get() != null) {
            Log.d("CAR.TEL.Manager", "Action: " + i + " with number: " + str + " id: " + str2);
        }
    }
}
