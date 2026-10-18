package com.google.android.finsky.gpkg;

import com.google.android.finsky.utils.ht;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class at extends ar {

    /* renamed from: a, reason: collision with root package name */
    public static Set<String> f2808a = Collections.unmodifiableSet(ht.a(com.google.android.finsky.cpkg.d.de.b().split(",")));

    public at(s sVar) {
        super(2, sVar);
    }

    @Override // com.google.android.finsky.gpkg.ar
    public final boolean e(r rVar) {
        return super.e(rVar) || f2808a.contains(rVar.j);
    }
}
