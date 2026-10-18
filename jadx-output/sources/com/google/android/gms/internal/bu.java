package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

@gw
/* loaded from: classes.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    final Object f5901a;

    /* renamed from: b, reason: collision with root package name */
    int f5902b;
    List<bt> c;

    public final boolean a(bt btVar) {
        boolean z;
        synchronized (this.f5901a) {
            z = this.c.contains(btVar);
        }
        return z;
    }

    public final boolean b(bt btVar) {
        boolean z;
        synchronized (this.f5901a) {
            Iterator<bt> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                bt next = it.next();
                if (btVar != next && next.e.equals(btVar.e)) {
                    it.remove();
                    z = true;
                    break;
                }
            }
        }
        return z;
    }
}
