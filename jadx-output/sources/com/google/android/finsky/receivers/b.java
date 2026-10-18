package com.google.android.finsky.receivers;

import android.content.Context;
import com.google.android.finsky.services.DailyHygiene;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BootCompletedReceiver f4472b;

    b(BootCompletedReceiver bootCompletedReceiver, Context context) {
        this.f4472b = bootCompletedReceiver;
        this.f4471a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DailyHygiene.a(this.f4471a, DailyHygiene.f4546b);
    }
}
