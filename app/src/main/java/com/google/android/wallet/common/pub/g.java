package com.google.android.wallet.common.pub;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f7291a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7292b;

    public g(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("SecurePaymentsData.key must be > 0");
        }
        if (str == null) {
            throw new IllegalArgumentException("SecurePaymentsData.value must not be null");
        }
        this.f7291a = i;
        this.f7292b = str;
    }
}
