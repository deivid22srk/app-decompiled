package com.a.a.a.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    int f974a;

    /* renamed from: b, reason: collision with root package name */
    final a.i f975b;
    private final a.n c;

    public s(a.i iVar) {
        this.c = new a.n(new t(this, iVar), new u(this));
        this.f975b = a.o.a(this.c);
    }

    public final List<e> a(int i) {
        this.f974a += i;
        int i2 = this.f975b.i();
        if (i2 < 0) {
            throw new IOException("numberOfPairs < 0: " + i2);
        }
        if (i2 > 1024) {
            throw new IOException("numberOfPairs > 1024: " + i2);
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            a.j c = a().c();
            a.j a2 = a();
            if (c.f13b.length == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new e(c, a2));
        }
        if (this.f974a > 0) {
            this.c.b();
            if (this.f974a != 0) {
                throw new IOException("compressedLimit > 0: " + this.f974a);
            }
        }
        return arrayList;
    }

    private a.j a() {
        return this.f975b.c(this.f975b.i());
    }
}
