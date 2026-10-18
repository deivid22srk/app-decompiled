package com.google.android.finsky.widget.consumption;

import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f5172a;

    b(a aVar) {
        this.f5172a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedBlockingQueue linkedBlockingQueue;
        while (true) {
            try {
                a aVar = this.f5172a;
                linkedBlockingQueue = this.f5172a.c;
                a.a(aVar, (j) linkedBlockingQueue.take());
            } catch (InterruptedException e) {
                FinskyLog.d("Interrupted while trying to load images!", new Object[0]);
            }
        }
    }
}
