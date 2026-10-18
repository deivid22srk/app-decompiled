package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public AtomicInteger f1251a;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, Queue<l<?>>> f1252b;
    final Set<l<?>> c;
    final PriorityBlockingQueue<l<?>> d;
    List<Object> e;
    private final PriorityBlockingQueue<l<?>> f;
    private final a g;
    private final i h;
    private final u i;
    private j[] j;
    private c k;

    private o(a aVar, i iVar, int i, u uVar) {
        this.f1251a = new AtomicInteger();
        this.f1252b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.f = new PriorityBlockingQueue<>();
        this.e = new ArrayList();
        this.g = aVar;
        this.h = iVar;
        this.j = new j[i];
        this.i = uVar;
    }

    public o(a aVar, i iVar, int i) {
        this(aVar, iVar, i, new f(new Handler(Looper.getMainLooper())));
    }

    public o(a aVar, i iVar) {
        this(aVar, iVar, 4);
    }

    public final void a(q qVar) {
        synchronized (this.c) {
            for (l<?> lVar : this.c) {
                if (qVar.a(lVar)) {
                    lVar.d();
                }
            }
        }
    }

    public final void a() {
        if (this.k != null) {
            c cVar = this.k;
            cVar.f1231a = true;
            cVar.interrupt();
        }
        for (int i = 0; i < this.j.length; i++) {
            if (this.j[i] != null) {
                j jVar = this.j[i];
                jVar.f1241a = true;
                jVar.interrupt();
            }
        }
        this.k = new c(this.d, this.f, this.g, this.i);
        this.k.start();
        for (int i2 = 0; i2 < this.j.length; i2++) {
            j jVar2 = new j(this.f, this.h, this.g, this.i);
            this.j[i2] = jVar2;
            jVar2.start();
        }
    }

    public final <T> l<T> a(l<T> lVar) {
        lVar.d = this;
        synchronized (this.c) {
            this.c.add(lVar);
        }
        lVar.c = Integer.valueOf(this.f1251a.incrementAndGet());
        lVar.a("add-to-queue");
        if (!lVar.e) {
            this.f.add(lVar);
        } else {
            synchronized (this.f1252b) {
                String c = lVar.c();
                if (this.f1252b.containsKey(c)) {
                    Queue<l<?>> queue = this.f1252b.get(c);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(lVar);
                    this.f1252b.put(c, queue);
                    if (w.f1258b) {
                        w.a("Request for cacheKey=%s is in flight, putting on hold.", c);
                    }
                } else {
                    this.f1252b.put(c, null);
                    this.d.add(lVar);
                }
            }
        }
        return lVar;
    }
}
