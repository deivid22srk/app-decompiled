package com.google.android.finsky.download;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.finsky.utils.jm;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class s implements h {

    /* renamed from: b, reason: collision with root package name */
    final Handler f2734b;
    final g c;
    private final w e;
    private Map<Uri, r> d = null;

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f2733a = com.google.android.finsky.utils.t.a("Download progress manager runner");

    public s(x xVar) {
        this.e = xVar;
        this.c = xVar.d;
        this.f2733a.start();
        this.f2734b = new Handler(this.f2733a.getLooper());
        this.f2734b.post(new t(this));
    }

    @Override // com.google.android.finsky.download.h
    public final void a() {
        b();
    }

    final void b() {
        jm.b();
        HashSet hashSet = new HashSet();
        if (this.d != null) {
            hashSet.addAll(this.d.keySet());
        }
        List<r> a2 = this.c.a((Uri) null, this);
        HashMap hashMap = new HashMap();
        for (r rVar : a2) {
            hashMap.put(rVar.f2731a, rVar);
        }
        Map<Uri, r> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        if (this.d == null || !this.d.equals(unmodifiableMap)) {
            this.d = unmodifiableMap;
            HashSet hashSet2 = new HashSet();
            if (this.d != null) {
                hashSet2.addAll(this.d.keySet());
            }
            hashSet.removeAll(hashSet2);
            new Handler(Looper.getMainLooper()).post(new v(this.e, hashSet, hashSet2, unmodifiableMap));
        }
    }
}
