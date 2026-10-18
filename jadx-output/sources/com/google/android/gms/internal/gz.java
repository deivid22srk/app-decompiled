package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

@gw
/* loaded from: classes.dex */
public final class gz {
    private Context l;
    private VersionInfoParcel m;
    private String u;

    /* renamed from: a, reason: collision with root package name */
    final Object f6012a = new Object();
    private BigInteger e = BigInteger.ONE;
    private final HashSet<Object> f = new HashSet<>();
    private final HashMap<String, Object> g = new HashMap<>();
    private boolean h = false;
    private boolean i = true;
    private int j = 0;
    private boolean k = false;
    private cn n = null;
    private boolean o = true;
    private bv p = null;
    private bw q = null;
    private bu r = null;
    private final LinkedList<Thread> s = new LinkedList<>();
    private final gv t = null;

    /* renamed from: b, reason: collision with root package name */
    Boolean f6013b = null;
    private boolean v = false;
    private boolean w = false;
    private final String c = hk.a();
    private final ha d = new ha(this.c);

    public final cn a() {
        cn cnVar;
        synchronized (this.f6012a) {
            cnVar = this.n;
        }
        return cnVar;
    }

    public final String a(int i, String str) {
        Resources resources = this.m.e ? this.l.getResources() : com.google.android.gms.common.c.d(this.l);
        return resources == null ? str : resources.getString(i);
    }

    public final void a(Throwable th, boolean z) {
        new gv(this.l, this.m).a(th, z);
    }

    public final String b() {
        String str;
        synchronized (this.f6012a) {
            str = this.u;
        }
        return str;
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (this.f6012a) {
            bool = this.f6013b;
        }
        return bool;
    }
}
