package com.google.android.finsky.g;

import com.google.android.finsky.utils.ht;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class at extends ar {

    /* renamed from: a, reason: collision with root package name */
    private static Set<String> f2808a = Collections.unmodifiableSet(ht.a(com.google.android.finsky.c.d.de.b().split(",")));

    public at(s sVar) {
        super(2, sVar);
    }

    @Override // com.google.android.finsky.g.ar
    protected final boolean e(r rVar) {
        return super.e(rVar) || f2808a.contains(rVar.j);
    }
}
