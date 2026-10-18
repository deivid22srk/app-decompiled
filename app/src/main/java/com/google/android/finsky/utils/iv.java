package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class iv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5009a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iu f5010b;

    iv(iu iuVar, String str) {
        this.f5010b = iuVar;
        this.f5009a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iu iuVar = this.f5010b;
        String str = this.f5009a;
        if (!as.a(iuVar.f5008b, str)) {
            return;
        }
        iuVar.c = new com.google.android.finsky.api.model.h(FinskyApp.a().b((String) null), com.google.android.finsky.api.s.a(str));
        iuVar.c.a(new iw(iuVar, str));
    }
}
