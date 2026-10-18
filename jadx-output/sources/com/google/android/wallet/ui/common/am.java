package com.google.android.wallet.ui.common;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    static int f7484a = 1;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<Integer> f7485b;
    private AtomicInteger d = new AtomicInteger();
    int c = -1;

    private am(ArrayList<Integer> arrayList) {
        this.f7485b = arrayList;
        a(0);
    }

    public final synchronized int a() {
        if (this.d.get() == this.f7485b.get(this.c).intValue() + 32) {
            a(this.c + 1);
        }
        return this.d.getAndIncrement();
    }

    public final void a(Bundle bundle) {
        bundle.putIntegerArrayList("idGenerator.startingIdList", this.f7485b);
    }

    private void a(int i) {
        if (i >= this.f7485b.size()) {
            i = this.f7485b.size();
            this.f7485b.add(Integer.valueOf(d()));
        }
        this.d.set(this.f7485b.get(i).intValue());
        this.c = i;
    }

    public static am b() {
        return new am(new ArrayList(2));
    }

    public static am b(Bundle bundle) {
        if (bundle.containsKey("idGenerator.startingIdList")) {
            return new am(bundle.getIntegerArrayList("idGenerator.startingIdList"));
        }
        return null;
    }

    private static synchronized void c() {
        synchronized (am.class) {
            f7484a = 1;
        }
    }

    private static synchronized int d() {
        int i;
        synchronized (am.class) {
            if (f7484a > 16777184) {
                c();
            }
            i = f7484a;
            f7484a += 32;
        }
        return i;
    }
}
