package com.google.android.finsky.b;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2128b;
    final /* synthetic */ String c;
    final /* synthetic */ a d;
    final /* synthetic */ o e;

    p(o oVar, String str, int i, String str2, a aVar) {
        this.e = oVar;
        this.f2127a = str;
        this.f2128b = i;
        this.c = str2;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyLog.a("Set autoupdate of %s to %d (%s)", this.f2127a, Integer.valueOf(this.f2128b), this.c);
        this.d.f2060a.a(this.f2127a, this.f2128b);
    }
}
