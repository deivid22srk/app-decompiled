package com.google.android.gms.ads.internal.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class e extends a<String> {
    e(int i, String str, String str2) {
        super(i, str, str2, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.a.a
    public final /* synthetic */ String a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f5284a, (String) this.f5285b);
    }
}
