package com.google.android.finsky.utils;

import android.os.RemoteException;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MotionEvent f4790a;

    c(MotionEvent motionEvent) {
        this.f4790a = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!a.a()) {
            return;
        }
        try {
            a.f4719a.f5256a.d(com.google.android.gms.dynamic.d.a(this.f4790a));
        } catch (RemoteException e) {
            FinskyLog.d("Error accessing AdShield: %s", e);
        }
    }
}
