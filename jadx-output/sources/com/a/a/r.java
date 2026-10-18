package com.a.a;

import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private int f1045a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f1046b = 5;
    private final Deque<Object> c = new ArrayDeque();
    private final Deque<Object> d = new ArrayDeque();
    private final Deque<f> e = new ArrayDeque();

    final synchronized void a(f fVar) {
        this.e.add(fVar);
    }

    final synchronized void b(f fVar) {
        if (!this.e.remove(fVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
