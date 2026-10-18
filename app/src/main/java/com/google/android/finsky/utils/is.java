package com.google.android.finsky.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
final class is implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iq f5005a;

    is(iq iqVar) {
        this.f5005a = iqVar;
    }

    @Override // com.google.android.finsky.utils.m
    public final void a() {
    }

    @Override // com.google.android.finsky.utils.m
    public final void a(boolean z) {
        if (z) {
            new Handler(Looper.getMainLooper()).post(new it(this));
        }
    }
}
