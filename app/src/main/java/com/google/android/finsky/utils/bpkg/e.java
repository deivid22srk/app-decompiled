package com.google.android.finsky.utils.bpkg;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f4767b;
    public final /* synthetic */ c c;

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
