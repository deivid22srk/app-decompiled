package com.google.android.finsky.wear;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5066a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.m f5067b;
    private final Handler c;
    private final Handler d;
    private Map<String, com.google.android.finsky.bpkg.ab> e = new HashMap();

    public a(Context context, com.google.android.gms.common.api.m mVar, Handler handler, Handler handler2) {
        this.f5066a = context;
        this.f5067b = mVar;
        this.c = handler;
        this.d = handler2;
    }

    public final void a(String str, Runnable runnable) {
        b bVar = new b(this, runnable);
        b(str).a(bVar);
        z.a(this.f5066a, str, this.f5067b).a(bVar);
    }

    public final com.google.android.finsky.bpkg.a a(String str) {
        return new com.google.android.finsky.bpkg.a(str, b(str), z.a(this.f5066a, str, this.f5067b));
    }

    public final synchronized com.google.android.finsky.bpkg.ab b(String str) {
        com.google.android.finsky.bpkg.ab abVar;
        abVar = this.e.get(str);
        if (abVar == null) {
            abVar = new com.google.android.finsky.bpkg.ab(new com.google.android.finsky.bpkg.r(), new com.google.android.finsky.bpkg.z(this.f5066a, str), this.d, this.c);
            this.e.put(str, abVar);
        }
        return abVar;
    }
}
