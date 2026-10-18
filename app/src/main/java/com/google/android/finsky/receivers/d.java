package com.google.android.finsky.receivers;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class d implements Runnable {
    d() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlushLogsReceiver.a(FinskyApp.a(), com.google.android.finsky.cpkg.d.fb.b().longValue());
    }
}
