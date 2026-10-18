package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class ar implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f5093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f5094b;
    private int c = 0;

    ar(aq aqVar, String[] strArr) {
        this.f5094b = aqVar;
        this.f5093a = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 2) {
            WearSupportService.a(this.f5094b.f5092a, new as(this));
        }
    }
}
