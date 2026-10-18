package com.google.android.finsky.services;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ai extends x {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.g.h f4575a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.b.x f4576b;
    private final com.google.android.finsky.b.a c;
    private final com.google.android.finsky.d.d d;
    private final aj e;
    private final Context f;

    public ai(com.google.android.finsky.g.h hVar, com.google.android.finsky.b.x xVar, com.google.android.finsky.b.a aVar, com.google.android.finsky.d.d dVar, aj ajVar, Context context) {
        this.f4575a = hVar;
        this.f4576b = xVar;
        this.c = aVar;
        this.d = dVar;
        this.e = ajVar;
        this.f = context;
    }

    @Override // com.google.android.finsky.services.w
    public final Bundle a(String str) {
        boolean z;
        com.google.android.finsky.g.q d;
        Bundle bundle = new Bundle();
        if (!this.d.a(12603513L)) {
            return bundle;
        }
        if (!aj.a(this.f.getPackageManager())) {
            throw new SecurityException("Only AfwApp can access this service");
        }
        bundle.putBoolean("IsValid", false);
        com.google.android.finsky.b.y a2 = this.f4576b.a(str);
        if (a2 == null) {
            return bundle;
        }
        this.c.a((Runnable) null);
        this.f4575a.c();
        Iterator<Account> it = this.f4575a.a(a2.f2137a, a2.f2138b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Account next = it.next();
            if ("com.google.work".equals(next.type) && (d = this.f4575a.a(next).d(str)) != null && d.e) {
                z = true;
                break;
            }
        }
        if (!z) {
            return bundle;
        }
        this.c.f2060a.c();
        com.google.android.finsky.b.t a3 = this.c.f2060a.a(str);
        if (a3 != null) {
            int i = a3.r;
            if ((i & 4) == 0) {
                return bundle;
            }
            if ((i & 2) != 0) {
                return bundle;
            }
        }
        bundle.putBoolean("IsValid", true);
        return bundle;
    }
}
