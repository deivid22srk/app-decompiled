package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    int f974a;

    /* renamed from: b, reason: collision with root package name */
    public final okio2.i f975b;
    public final okio2.n c;

    public s(okio2.i iVar) {
        this.c = new okio2.n(new t(this, iVar), new u(this));
        this.f975b = okio2.o.a(this.c);
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
            okio2.j c = a().c();
            okio2.j a2 = a();
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

    public okio2.j a() {
        return this.f975b.c(this.f975b.i());
    }
}
