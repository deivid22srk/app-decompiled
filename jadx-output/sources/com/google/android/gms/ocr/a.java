package com.google.android.gms.ocr;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6392a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f6393b = new Intent("com.google.android.gms.ocr.ACTION_CREDIT_CARD_OCR");

    public a(Context context) {
        this.f6392a = context;
        this.f6393b.setPackage("com.google.android.gms");
    }

    public final Intent a() {
        if (this.f6392a.getPackageManager().checkPermission("android.permission.CAMERA", "com.google.android.gms") != 0) {
            return null;
        }
        if (!ac.a(this.f6392a.getPackageManager(), this.f6393b)) {
            Log.d("CreditCardOcrIntentBuilder", "Google Play services OCR activity is disabled or not available");
            return null;
        }
        com.google.android.gms.common.b.a();
        int a2 = com.google.android.gms.common.b.a(this.f6392a);
        if (a2 == 0) {
            return this.f6393b;
        }
        Log.w("CreditCardOcrIntentBuilder", "Google Play services is unavailable. Result=" + a2);
        return null;
    }

    public final a a(int i) {
        av.a(i == 0 || i == 1, "Unexpected value for theme=%d", Integer.valueOf(i));
        this.f6393b.putExtra("com.google.android.gms.ocr.THEME", i);
        return this;
    }
}
