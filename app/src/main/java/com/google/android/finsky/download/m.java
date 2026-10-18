package com.google.android.finsky.download;

import android.net.Uri;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f2721a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f2722b;

    m(j jVar, Uri uri) {
        this.f2722b = jVar;
        this.f2721a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a(this.f2722b, this.f2721a);
    }
}
