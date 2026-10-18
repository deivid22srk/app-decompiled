package com.google.android.gms.ads.internal.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class c extends a<Integer> {
    c(int i, String str, Integer num) {
        super(i, str, num, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.a.a
    public final /* synthetic */ Integer a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f5284a, ((Integer) this.f5285b).intValue()));
    }
}
