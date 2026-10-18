package com.google.android.play.layout;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f6982b = new b();

    /* renamed from: a, reason: collision with root package name */
    private List<c> f6983a = new ArrayList();

    private b() {
    }

    public static b a() {
        return f6982b;
    }

    public final synchronized void a(c cVar) {
        this.f6983a.add(cVar);
    }

    final synchronized void a(a aVar) {
        for (int size = this.f6983a.size() - 1; size >= 0; size--) {
            this.f6983a.get(size).a(aVar);
        }
    }

    final synchronized void b(a aVar) {
        for (int size = this.f6983a.size() - 1; size >= 0; size--) {
            this.f6983a.get(size).b(aVar);
        }
    }
}
