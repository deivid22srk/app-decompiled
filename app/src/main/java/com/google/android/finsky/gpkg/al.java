package com.google.android.finsky.gpkg;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f2799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2800b;
    public final /* synthetic */ aj c;

    al(aj ajVar, Runnable runnable, String str) {
        this.c = ajVar;
        this.f2799a = runnable;
        this.f2800b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            Collection<x> values = this.c.c.values();
            if (values.isEmpty()) {
                if (this.f2799a != null) {
                    this.c.f2795a.post(this.f2799a);
                }
            } else {
                am amVar = new am(this, values);
                Iterator<x> it = values.iterator();
                while (it.hasNext()) {
                    it.next().a(a.g, amVar, this.f2800b);
                }
            }
        }
    }
}
