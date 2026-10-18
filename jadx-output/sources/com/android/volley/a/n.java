package com.android.volley.a;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    final com.android.volley.o f1215a;

    /* renamed from: b, reason: collision with root package name */
    final s f1216b;
    Runnable e;
    private int f = 100;
    final HashMap<String, r> c = new HashMap<>();
    final HashMap<String, r> d = new HashMap<>();
    private final Handler g = new Handler(Looper.getMainLooper());

    public n(com.android.volley.o oVar, s sVar) {
        this.f1215a = oVar;
        this.f1216b = sVar;
    }

    final void a(String str, r rVar) {
        this.d.put(str, rVar);
        if (this.e == null) {
            this.e = new q(this);
            this.g.postDelayed(this.e, this.f);
        }
    }
}
