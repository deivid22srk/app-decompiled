package com.google.android.gms.car;

import java.util.List;

/* loaded from: classes.dex */
final class ez implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f5521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f5522b;
    final /* synthetic */ ex c;

    ez(ex exVar, List list, eu euVar) {
        this.c = exVar;
        this.f5521a = list;
        this.f5522b = euVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        boolean contains;
        for (f fVar : this.f5521a) {
            if (!this.f5522b.g()) {
                return;
            }
            synchronized (this.c) {
                list = this.f5522b.r;
                contains = list.contains(fVar);
            }
            if (contains) {
                fVar.b();
            }
        }
    }
}
