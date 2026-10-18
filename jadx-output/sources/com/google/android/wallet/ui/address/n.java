package com.google.android.wallet.ui.address;

import com.google.android.wallet.ui.common.au;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class n implements au {

    /* renamed from: a, reason: collision with root package name */
    final String f7393a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f7394b;
    final String c;
    final String d;
    final String e;
    JSONObject f;

    n(String str, boolean z, String str2, String str3, String str4) {
        this.f7393a = str;
        this.f7394b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.google.android.wallet.ui.common.au
    public final String a() {
        return this.c;
    }

    public final String toString() {
        return this.d;
    }
}
