package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f1876a;

    w(v vVar) {
        this.f1876a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyLog.a("Exiting process due to toc change", new Object[0]);
        System.exit(0);
    }
}
