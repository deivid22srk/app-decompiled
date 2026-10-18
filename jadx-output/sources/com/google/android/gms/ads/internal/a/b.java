package com.google.android.gms.ads.internal.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class b extends a<Boolean> {
    b(int i, String str, Boolean bool) {
        super(i, str, bool, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.a.a
    public final /* synthetic */ Boolean a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f5284a, ((Boolean) this.f5285b).booleanValue()));
    }
}
