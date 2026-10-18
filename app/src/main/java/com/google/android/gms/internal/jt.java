package com.google.android.gms.internal;

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
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, Queue<jn<?>>> f6097a;

    /* renamed from: b, reason: collision with root package name */
    final Set<jn<?>> f6098b;
    final PriorityBlockingQueue<jn<?>> c;
    List<Object> d;
    private AtomicInteger e;
    private final PriorityBlockingQueue<jn<?>> f;
    private final bf g;
    private final fc h;
    private final kz i;
    private gg[] j;
    private ck k;

    private jt(bf bfVar, fc fcVar) {
        this(bfVar, fcVar, new eo(new Handler(Looper.getMainLooper())));
    }

    public jt(bf bfVar, fc fcVar, byte b2) {
        this(bfVar, fcVar);
    }

    private jt(bf bfVar, fc fcVar, kz kzVar) {
        this.e = new AtomicInteger();
        this.f6097a = new HashMap();
        this.f6098b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.f = new PriorityBlockingQueue<>();
        this.d = new ArrayList();
        this.g = bfVar;
        this.h = fcVar;
        this.j = new gg[4];
        this.i = kzVar;
    }

    public final void a() {
        if (this.k != null) {
            ck ckVar = this.k;
            ckVar.f5926a = true;
            ckVar.interrupt();
        }
        for (int i = 0; i < this.j.length; i++) {
            if (this.j[i] != null) {
                gg ggVar = this.j[i];
                ggVar.f6000a = true;
                ggVar.interrupt();
            }
        }
        this.k = new ck(this.c, this.f, this.g, this.i);
        this.k.start();
        for (int i2 = 0; i2 < this.j.length; i2++) {
            gg ggVar2 = new gg(this.f, this.h, this.g, this.i);
            this.j[i2] = ggVar2;
            ggVar2.start();
        }
    }

    public final <T> jn<T> a(jn<T> jnVar) {
        jnVar.h = this;
        synchronized (this.f6098b) {
            this.f6098b.add(jnVar);
        }
        jnVar.g = Integer.valueOf(this.e.incrementAndGet());
        jnVar.a("add-to-queue");
        if (jnVar.i) {
            synchronized (this.f6097a) {
                String str = jnVar.d;
                if (this.f6097a.containsKey(str)) {
                    Queue<jn<?>> queue = this.f6097a.get(str);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(jnVar);
                    this.f6097a.put(str, queue);
                    if (nx.f6191b) {
                        nx.a("Request for cacheKey=%s is in flight, putting on hold.", str);
                    }
                } else {
                    this.f6097a.put(str, null);
                    this.c.add(jnVar);
                }
            }
        } else {
            this.f.add(jnVar);
        }
        return jnVar;
    }
}
