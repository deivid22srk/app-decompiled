package com.google.android.gms.car;

import java.util.List;

/* loaded from: classes.dex */
final class ey implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f5519a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f5520b;
    final /* synthetic */ int c;
    final /* synthetic */ ex d;

    ey(ex exVar, List list, eu euVar, int i) {
        this.d = exVar;
        this.f5519a = list;
        this.f5520b = euVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        boolean contains;
        for (f fVar : this.f5519a) {
            if (!this.f5520b.g()) {
                return;
            }
            synchronized (this.d) {
                list = this.f5520b.r;
                contains = list.contains(fVar);
            }
            if (contains) {
                fVar.a();
            }
        }
    }
}
