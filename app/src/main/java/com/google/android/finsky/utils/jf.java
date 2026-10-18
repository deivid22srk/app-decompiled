package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class jf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5024a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ je f5025b;

    jf(je jeVar, String str) {
        this.f5025b = jeVar;
        this.f5024a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb.a(this.f5024a);
    }
}
