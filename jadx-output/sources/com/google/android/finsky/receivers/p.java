package com.google.android.finsky.receivers;

import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4490a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f4491b;

    p(h hVar, String str) {
        this.f4491b = hVar;
        this.f4490a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.installer.h hVar;
        try {
            hVar = this.f4491b.y;
            hVar.b(this.f4490a);
        } catch (RemoteException e) {
            FinskyLog.c("Couldn't release %s *** received %s", this.f4490a, e);
        }
    }
}
