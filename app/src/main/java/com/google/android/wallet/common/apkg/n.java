package com.google.android.wallet.common.apkg;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.c.a.b> f7263b;

    public n(Context context, List<com.google.c.a.b> list) {
        super("LocalAddressSource", context);
        this.f7263b = list;
    }

    @Override // com.google.android.wallet.common.apkg.m
    public final List<com.google.c.a.b> c() {
        return this.f7263b;
    }

    @Override // com.google.android.wallet.common.apkg.m
    public final int b() {
        return com.google.android.wallet.a.a.e.b().intValue();
    }
}
