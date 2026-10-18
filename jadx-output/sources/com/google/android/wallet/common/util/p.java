package com.google.android.wallet.common.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7304a;

    /* renamed from: b, reason: collision with root package name */
    public s f7305b;

    public p(Context context, s sVar) {
        this.f7304a = context;
        this.f7305b = sVar;
    }

    public final void a(int i) {
        if (this.f7305b != null) {
            new Handler(Looper.getMainLooper()).post(new r(this, i));
        }
    }
}
