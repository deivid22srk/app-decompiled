package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.ji;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f1793a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ji f1794b;
    final /* synthetic */ boolean c;
    final /* synthetic */ d d;

    i(d dVar, boolean[] zArr, ji jiVar, boolean z) {
        this.d = dVar;
        this.f1793a = zArr;
        this.f1794b = jiVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1793a[0]) {
            FinskyLog.c("Timeout waiting for UserSettings, continuing start anyways.", new Object[0]);
            jb.b(this.f1794b);
            this.d.g(this.c);
        }
    }
}
