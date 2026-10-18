package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@gw
/* loaded from: classes.dex */
public final class ek implements Iterable<ei> {

    /* renamed from: a, reason: collision with root package name */
    final List<ei> f5960a = new LinkedList();

    public static boolean a(im imVar) {
        return b(imVar) != null;
    }

    static ei b(im imVar) {
        Iterator<ei> it = com.google.android.gms.ads.internal.d.l().iterator();
        while (it.hasNext()) {
            ei next = it.next();
            if (next.f5957a == imVar) {
                return next;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<ei> iterator() {
        return this.f5960a.iterator();
    }
}
