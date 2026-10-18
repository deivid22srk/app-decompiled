package com.google.android.finsky.g;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private final int f2820a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<r, r> f2821b;

    public f(int i, s sVar) {
        super(sVar);
        this.f2821b = new HashMap();
        this.f2820a = i;
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized boolean b(r rVar) {
        return this.f2821b.containsKey(rVar);
    }

    @Override // com.google.android.finsky.g.g
    public synchronized void c(r rVar) {
        super.c(rVar);
        this.f2821b.put(rVar, rVar);
    }

    @Override // com.google.android.finsky.g.p
    public final r a(r rVar) {
        return this.f2821b.get(rVar);
    }

    @Override // com.google.android.finsky.g.g, com.google.android.finsky.g.p
    public synchronized void d(r rVar) {
        super.d(rVar);
        this.f2821b.remove(rVar);
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized int g() {
        return this.f2821b.size();
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<r> iterator() {
        return this.f2821b.values().iterator();
    }

    @Override // com.google.android.finsky.g.g
    public synchronized void a() {
        super.a();
        this.f2821b.clear();
    }

    public String toString() {
        return String.format("{backend=%d, num entries=%d}", Integer.valueOf(this.f2820a), Integer.valueOf(g()));
    }

    @Override // com.google.android.finsky.g.g
    public void a(String str, String str2) {
        Log.d("FinskyLibrary", str2 + "Library (" + str + ") {");
        Log.d("FinskyLibrary", str2 + "  backend=" + this.f2820a);
        Log.d("FinskyLibrary", str2 + "  entryCount=" + this.f2821b.size());
        Log.d("FinskyLibrary", str2 + "}");
    }
}
