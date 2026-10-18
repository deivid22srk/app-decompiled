package android.support.v4.h;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class b<K, V> extends h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f280a;

    b(a aVar) {
        this.f280a = aVar;
    }

    @Override // android.support.v4.h.h
    protected final int a() {
        return this.f280a.h;
    }

    @Override // android.support.v4.h.h
    protected final Object a(int i, int i2) {
        return this.f280a.g[(i << 1) + i2];
    }

    @Override // android.support.v4.h.h
    protected final int a(Object obj) {
        return this.f280a.a(obj);
    }

    @Override // android.support.v4.h.h
    protected final int b(Object obj) {
        return this.f280a.b(obj);
    }

    @Override // android.support.v4.h.h
    protected final Map<K, V> b() {
        return this.f280a;
    }

    @Override // android.support.v4.h.h
    protected final void a(K k, V v) {
        this.f280a.put(k, v);
    }

    @Override // android.support.v4.h.h
    protected final V a(int i, V v) {
        return this.f280a.a(i, (int) v);
    }

    @Override // android.support.v4.h.h
    protected final void a(int i) {
        this.f280a.d(i);
    }

    @Override // android.support.v4.h.h
    protected final void c() {
        this.f280a.clear();
    }
}
