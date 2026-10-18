package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ay implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.b.a f4754a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4755b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    ay(com.google.android.finsky.b.a aVar, String str, String str2, String str3) {
        this.f4754a = aVar;
        this.f4755b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = -1;
        com.google.android.finsky.b.b a2 = this.f4754a.a(this.f4755b);
        String a3 = ExternalReferrer.a(this.c, this.f4755b, a2, FinskyApp.a().k.i(this.f4755b), this.f4754a.f2060a);
        if (a3 == null) {
            if (TextUtils.isEmpty(this.c)) {
                FinskyLog.a("Capture referrer for %s (empty)", this.f4755b);
            } else {
                FinskyLog.a("Capture referrer for %s", this.f4755b);
            }
            ExternalReferrer.b(515, this.f4755b, -1, this.d);
            return;
        }
        FinskyLog.a("Dropped referrer for %s because %s", this.f4755b, a3);
        if (a2 != null && a2.c != null) {
            i = a2.c.c;
        }
        ExternalReferrer.b(516, this.f4755b, i, a3);
    }
}
