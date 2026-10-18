package com.a.a.apkg.bpkg;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public final okio2.f f958a;

    i(okio2.f fVar) {
        this.f958a = fVar;
    }

    public final void a(List<e> list) {
        Map map;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            okio2.j c = list.get(i).h.c();
            map = g.f955b;
            Integer num = (Integer) map.get(c);
            if (num != null) {
                a(num.intValue() + 1, 15);
                a(list.get(i).i);
            } else {
                this.f958a.g(0);
                a(c);
                a(list.get(i).i);
            }
        }
    }

    public void a(int i, int i2) {
        if (i < i2) {
            this.f958a.g(i | 0);
            return;
        }
        this.f958a.g(i2 | 0);
        int i3 = i - i2;
        while (i3 >= 128) {
            this.f958a.g((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f958a.g(i3);
    }

    public void a(okio2.j jVar) {
        a(jVar.f13b.length, 127);
        this.f958a.b(jVar);
    }
}
