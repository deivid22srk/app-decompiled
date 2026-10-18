package com.google.android.gms.internal;

import android.view.View;

/* loaded from: classes.dex */
final class bx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f5907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bw f5908b;

    bx(bw bwVar, View view) {
        this.f5908b = bwVar;
        this.f5907a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw bwVar = this.f5908b;
        View view = this.f5907a;
        try {
            bt btVar = new bt(bwVar.c, bwVar.d, bwVar.e, bwVar.f);
            ca a2 = bwVar.a(view, btVar);
            btVar.c();
            if (a2.f5912a == 0 && a2.f5913b == 0) {
                return;
            }
            if (a2.f5913b == 0 && btVar.f5900b == 0) {
                return;
            }
            if (a2.f5913b == 0 && bwVar.f5905a.a(btVar)) {
                return;
            }
            bu buVar = bwVar.f5905a;
            synchronized (buVar.f5901a) {
                if (buVar.c.size() >= 10) {
                    com.google.android.gms.ads.internal.util.client.b.a("Queue is full, current size = " + buVar.c.size());
                    buVar.c.remove(0);
                }
                int i = buVar.f5902b;
                buVar.f5902b = i + 1;
                btVar.c = i;
                buVar.c.add(btVar);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.b.b("Exception in fetchContentOnUIThread", e);
            bwVar.f5906b.a(e, true);
        }
    }
}
