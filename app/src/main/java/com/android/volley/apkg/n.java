package com.android.volley.apkg;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.volley.o f1215a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1216b;
    Runnable e;
    public int f = 100;
    public final HashMap<String, r> c = new HashMap<>();
    public final HashMap<String, r> d = new HashMap<>();
    public final Handler g = new Handler(Looper.getMainLooper());

    public n(com.android.volley.o oVar, s sVar) {
        this.f1215a = oVar;
        this.f1216b = sVar;
    }

    public final void a(String str, r rVar) {
        this.d.put(str, rVar);
        if (this.e == null) {
            this.e = new q(this);
            this.g.postDelayed(this.e, this.f);
        }
    }
}
