package com.google.android.finsky.utils.bpkg;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c implements b {
    public static final ExecutorService d = Executors.newSingleThreadExecutor(new t());

    /* renamed from: a, reason: collision with root package name */
    public final b f4762a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Map<String, String>> f4763b = null;
    public List<Runnable> c = new ArrayList();
    public final Handler e = new Handler(Looper.getMainLooper());

    public c(b bVar) {
        this.f4762a = bVar;
    }

    public final void a(Runnable runnable) {
        b();
        if (this.f4763b != null) {
            this.e.post(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.c.size() != 1) {
            return;
        }
        d.submit(new f(this));
    }

    public final Map<String, String> b(String str) {
        c();
        Map<String, String> map = this.f4763b.get(str);
        if (map != null) {
            return Collections.unmodifiableMap(map);
        }
        return null;
    }

    @Override // com.google.android.finsky.utils.bpkg.b
    public final void a(String str) {
        c();
        this.f4763b.remove(str);
        d.submit(new d(this, str));
    }

    @Override // com.google.android.finsky.utils.bpkg.b
    public final Map<String, Map<String, String>> a() {
        c();
        if (this.f4763b.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f4763b.keySet()) {
            hashMap.put(str, Collections.unmodifiableMap(this.f4763b.get(str)));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.finsky.utils.bpkg.b
    public final void a(String str, Map<String, String> map) {
        c();
        this.f4763b.put(str, map);
        d.submit(new e(this, str, new HashMap(map)));
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Tried to access data off of the main thread.");
        }
    }

    public void c() {
        if (this.f4763b == null) {
            throw new IllegalStateException("Tried to access data before initializing.");
        }
        b();
    }

    public static /* synthetic */ void a(c cVar, Map map) {
        cVar.f4763b = map;
        int size = cVar.c.size();
        for (int i = 0; i < size; i++) {
            cVar.c.get(i).run();
        }
        cVar.c.clear();
    }
}
