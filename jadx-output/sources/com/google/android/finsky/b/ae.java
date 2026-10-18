package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2068a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2069b;
    final /* synthetic */ ab c;

    ae(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2068a = str;
        this.f2069b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.d(this.f2068a, this.f2069b);
    }
}
