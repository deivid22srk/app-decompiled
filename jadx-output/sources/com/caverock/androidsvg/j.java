package com.caverock.androidsvg;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List<k> f1377a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1378b = 0;

    public final int a() {
        if (this.f1377a == null) {
            return 0;
        }
        return this.f1377a.size();
    }

    public final k a(int i) {
        return this.f1377a.get(i);
    }

    public final boolean b() {
        if (this.f1377a == null) {
            return true;
        }
        return this.f1377a.isEmpty();
    }

    public final void c() {
        this.f1378b += 100;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<k> it = this.f1377a.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(' ');
        }
        return sb.append('(').append(this.f1378b).append(')').toString();
    }
}
