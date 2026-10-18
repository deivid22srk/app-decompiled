package com.google.android.a;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
final class e extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentResolver f1410a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(String str, ContentResolver contentResolver) {
        super(str);
        this.f1410a = contentResolver;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.f1410a.registerContentObserver(d.f1408a, true, new f(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
