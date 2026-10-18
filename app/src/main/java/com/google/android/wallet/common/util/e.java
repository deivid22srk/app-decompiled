package com.google.android.wallet.common.util;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class e {
    public static Bundle a(Bundle bundle, int i, String str, String str2, com.google.b.a.a.a.b.a.bpkg.r rVar, String str3, String str4) {
        if (TextUtils.isEmpty(str) || ((TextUtils.isEmpty(str2) && rVar == null) || TextUtils.isEmpty(str4))) {
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = rVar == null ? null : rVar.f7687b;
            objArr[3] = str4;
            throw new IllegalArgumentException(String.format("Error title, message, and button text are required. Received values: title: %s  errorMessage: %s  infoMessage: %s  buttonText: %s", objArr));
        }
        if (!TextUtils.isEmpty(str2) && rVar != null) {
            throw new IllegalArgumentException(String.format("Error message and InfoMessage may not both be set. Received values: message: %s infoMessage: %s", str2, rVar.f7687b));
        }
        bundle.putInt("ErrorUtils.KEY_TYPE", i);
        bundle.putString("ErrorUtils.KEY_TITLE", str);
        if (rVar == null) {
            rVar = new com.google.b.a.a.a.b.a.bpkg.r();
            rVar.f7687b = str2;
        }
        bundle.putParcelable("ErrorUtils.KEY_ERROR_INFO_MESSAGE", ParcelableProto.a(rVar));
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("ErrorUtils.KEY_ERROR_CODE", str3);
        }
        bundle.putString("ErrorUtils.KEY_ERROR_BUTTON_TEXT", str4);
        return bundle;
    }
}
