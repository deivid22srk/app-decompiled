package com.a.a.apkg;

import com.a.a.ai;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Set<ai> f999a = new LinkedHashSet();

    public final synchronized void a(ai aiVar) {
        this.f999a.add(aiVar);
    }

    public final synchronized void b(ai aiVar) {
        this.f999a.remove(aiVar);
    }

    public final synchronized boolean c(ai aiVar) {
        return this.f999a.contains(aiVar);
    }
}
