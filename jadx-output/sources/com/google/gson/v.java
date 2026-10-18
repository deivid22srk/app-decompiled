package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class v extends y implements Iterable<y> {

    /* renamed from: a, reason: collision with root package name */
    private final List<y> f7872a = new ArrayList();

    public final void a(y yVar) {
        if (yVar == null) {
            yVar = z.f7873a;
        }
        this.f7872a.add(yVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<y> iterator() {
        return this.f7872a.iterator();
    }

    @Override // com.google.gson.y
    public final Number a() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.y
    public final String b() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.y
    public final double c() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.y
    public final long d() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.y
    public final int e() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.y
    public final boolean f() {
        if (this.f7872a.size() == 1) {
            return this.f7872a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof v) && ((v) obj).f7872a.equals(this.f7872a));
    }

    public final int hashCode() {
        return this.f7872a.hashCode();
    }
}
