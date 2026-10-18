package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@gw
/* loaded from: classes.dex */
final class ik {

    /* renamed from: a, reason: collision with root package name */
    final Object f6059a = new Object();
    private final List<Runnable> d = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final List<Runnable> f6060b = new ArrayList();
    boolean c = false;

    static void a(Runnable runnable) {
        com.google.android.gms.ads.internal.util.client.a.f5353a.post(runnable);
    }

    public final void a() {
        synchronized (this.f6059a) {
            if (this.c) {
                return;
            }
            Iterator<Runnable> it = this.d.iterator();
            while (it.hasNext()) {
                he.a(it.next());
            }
            Iterator<Runnable> it2 = this.f6060b.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.d.clear();
            this.f6060b.clear();
            this.c = true;
        }
    }
}
