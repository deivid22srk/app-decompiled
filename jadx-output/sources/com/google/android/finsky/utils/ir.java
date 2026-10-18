package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ir implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5003a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iq f5004b;

    ir(iq iqVar, String str) {
        this.f5004b = iqVar;
        this.f5003a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq iqVar = this.f5004b;
        String str = this.f5003a;
        com.google.android.finsky.activities.a aVar = new com.google.android.finsky.activities.a(str, FinskyApp.a().s, FinskyApp.a().p);
        if (!aVar.h) {
            return;
        }
        j.a(null, str, aVar.i, false, new is(iqVar));
    }
}
