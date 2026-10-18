package com.google.android.finsky.gpkg;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    Set<String> f2818a;

    /* renamed from: b, reason: collision with root package name */
    Set<String> f2819b;

    public e(s sVar) {
        super(3, sVar);
        this.f2818a = new HashSet();
        this.f2819b = new HashSet();
    }

    public final u a(String str) {
        return (u) a(new r(null, a.f2782a, 3, str, 15, 1));
    }

    public final t b(String str) {
        return (t) a(new r(null, a.f2782a, 3, str, 11, 1));
    }

    @Override // com.google.android.finsky.gpkg.f, com.google.android.finsky.gpkg.g
    public final synchronized void a() {
        this.f2818a.clear();
        this.f2819b.clear();
        super.a();
    }

    @Override // com.google.android.finsky.gpkg.f
    public final String toString() {
        return String.format("{num apps=%d}", Integer.valueOf(g()));
    }

    @Override // com.google.android.finsky.gpkg.f, com.google.android.finsky.gpkg.g
    public final void a(String str, String str2) {
        Log.d("FinskyLibrary", str2 + "AppLibrary (" + str + ") {");
        Log.d("FinskyLibrary", str2 + "  totalCount=" + g());
        Log.d("FinskyLibrary", str2 + "  subscriptionsCount=" + this.f2818a.size());
        Log.d("FinskyLibrary", str2 + "}");
    }

    @Override // com.google.android.finsky.gpkg.f, com.google.android.finsky.gpkg.g
    public final void c(r rVar) {
        int i = rVar.k;
        String str = rVar.j;
        if (i == 15) {
            this.f2818a.add(str);
        } else if (i == 11) {
            this.f2819b.add(str);
        }
        super.c(rVar);
    }

    @Override // com.google.android.finsky.gpkg.f, com.google.android.finsky.gpkg.g, com.google.android.finsky.gpkg.p
    public final void d(r rVar) {
        int i = rVar.k;
        String str = rVar.j;
        if (i == 15) {
            this.f2818a.remove(str);
        } else if (i == 11) {
            this.f2819b.remove(str);
        }
        super.d(rVar);
    }
}
