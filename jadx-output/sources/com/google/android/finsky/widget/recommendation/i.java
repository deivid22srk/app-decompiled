package com.google.android.finsky.widget.recommendation;

import com.google.android.finsky.widget.r;
import com.google.android.finsky.widget.s;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f5239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f5240b;
    final /* synthetic */ h c;

    i(h hVar, int[] iArr, Semaphore semaphore) {
        this.c = hVar;
        this.f5239a = iArr;
        this.f5240b = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        int i;
        rVar = this.c.i;
        i = this.c.f5238b;
        String b2 = rVar.b(RecommendedWidgetProvider.class, i);
        if (b2 == null) {
            this.f5239a[0] = -1;
        } else {
            this.f5239a[0] = s.a(b2);
        }
        this.f5240b.release();
    }
}
