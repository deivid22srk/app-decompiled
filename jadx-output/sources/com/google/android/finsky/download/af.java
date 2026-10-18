package com.google.android.finsky.download;

import android.net.Uri;

/* loaded from: classes.dex */
final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f2691a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f2692b;

    af(ae aeVar, Uri uri) {
        this.f2692b = aeVar;
        this.f2691a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2692b.f2689a.m()) {
            this.f2692b.f2690b.d.a(this.f2691a);
        } else {
            this.f2692b.f2689a.a(this.f2691a);
            this.f2692b.f2690b.b(this.f2692b.f2689a, 2);
        }
    }
}
