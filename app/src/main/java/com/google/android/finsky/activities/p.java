package com.google.android.finsky.activities;

import android.content.Intent;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1864a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1865b;

    p(d dVar, String str) {
        this.f1865b = dVar;
        this.f1864a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1865b.a(this.f1864a, (Intent) null);
    }
}
