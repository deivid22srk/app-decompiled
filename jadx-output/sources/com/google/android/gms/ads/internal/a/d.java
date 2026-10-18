package com.google.android.gms.ads.internal.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class d extends a<Long> {
    d(String str, Long l) {
        super(0, str, l, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.a.a
    public final /* synthetic */ Long a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f5284a, ((Long) this.f5285b).longValue()));
    }
}
