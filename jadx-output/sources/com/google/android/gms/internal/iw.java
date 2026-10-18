package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class iw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iv f6073a;

    iw(iv ivVar) {
        this.f6073a = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
