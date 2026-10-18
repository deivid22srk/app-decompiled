package com.google.android.finsky.utils.b;

import java.util.HashMap;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4766a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HashMap f4767b;
    final /* synthetic */ c c;

    e(c cVar, String str, HashMap hashMap) {
        this.c = cVar;
        this.f4766a = str;
        this.f4767b = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        bVar = this.c.f4762a;
        bVar.a(this.f4766a, this.f4767b);
    }
}
