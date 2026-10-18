package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class aq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2093b;
    public final /* synthetic */ ab c;

    aq(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2092a = str;
        this.f2093b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.a(this.f2092a, this.f2093b);
    }
}
