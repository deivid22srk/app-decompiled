package com.google.android.finsky.services;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4605b;
    final /* synthetic */ List c;
    final /* synthetic */ a d;

    b(a aVar, Context context, int i, List list) {
        this.d = aVar;
        this.f4604a = context;
        this.f4605b = i;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f4604a, this.f4605b, this.c);
    }
}
