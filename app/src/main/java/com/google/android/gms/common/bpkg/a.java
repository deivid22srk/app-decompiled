package com.google.android.gms.common.bpkg;

import android.content.Intent;
import com.google.android.gms.common.internal.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f5590a = l.e;

    public static Intent a(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", str);
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", (String) null);
        intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE", (String) null);
        intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT", str2);
        return intent;
    }
}
