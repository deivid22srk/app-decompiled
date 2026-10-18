package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    int f2699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2700b;
    private Uri c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Uri i;
    private r j;
    private int k;
    private final com.google.android.finsky.download.apkg.a l;
    private long m;
    private final long n;
    private final boolean o;
    private final boolean p;

    public e(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, long j, long j2, com.google.android.finsky.download.apkg.a aVar, boolean z, boolean z2) {
        this.f2700b = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = uri;
        this.m = j;
        this.n = j2;
        this.l = aVar;
        this.o = z;
        this.p = z2;
        a(0);
    }

    @Override // com.google.android.finsky.download.b
    public final r l() {
        jm.a();
        return this.j;
    }

    @Override // com.google.android.finsky.download.b
    public final void a(r rVar) {
        jm.a();
        this.j = rVar;
        if (this.m == -1 && rVar != null && rVar.c > 0) {
            this.m = rVar.c;
        }
    }

    @Override // com.google.android.finsky.download.b
    public final String a() {
        return this.e;
    }

    @Override // com.google.android.finsky.download.b
    public final String b() {
        return this.f;
    }

    @Override // com.google.android.finsky.download.b
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.finsky.download.b
    public final boolean m() {
        return this.f2699a == 4 || this.f2699a == 5 || this.f2699a == 3;
    }

    @Override // com.google.android.finsky.download.b
    public final String c() {
        return this.f2700b;
    }

    @Override // com.google.android.finsky.download.b
    public final Uri k() {
        jm.a();
        return this.c;
    }

    @Override // com.google.android.finsky.download.b
    public final void a(Uri uri) {
        this.c = uri;
    }

    @Override // com.google.android.finsky.download.b
    public final long e() {
        return this.n;
    }

    @Override // com.google.android.finsky.download.b
    public final int n() {
        jm.a();
        return this.f2699a;
    }

    @Override // com.google.android.finsky.download.b
    public final Uri f() {
        return this.i;
    }

    @Override // com.google.android.finsky.download.b
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.finsky.download.b
    public final String h() {
        return this.h;
    }

    @Override // com.google.android.finsky.download.b
    public final boolean i() {
        return this.p;
    }

    @Override // com.google.android.finsky.download.b
    public final boolean j() {
        return this.o;
    }

    @Override // com.google.android.finsky.download.b
    public final void a(int i) {
        if (m()) {
            throw new IllegalStateException("Received state update when already completed.");
        }
        if (this.f2699a == i) {
            FinskyLog.a("Duplicate state set for '%s' (%d). Already in that state", this, Integer.valueOf(this.f2699a));
        } else {
            FinskyLog.a("%s from %d to %d.", this, Integer.valueOf(this.f2699a), Integer.valueOf(i));
        }
        this.f2699a = i;
    }

    public final int hashCode() {
        return this.f2700b.hashCode();
    }

    @Override // com.google.android.finsky.download.b
    public final void b(int i) {
        this.k = i;
    }

    @Override // com.google.android.finsky.download.b
    public final int o() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f2700b.equals(((e) obj).f2700b);
    }

    @Override // com.google.android.finsky.download.b
    public final String p() {
        if (this.l != null) {
            return "obb-for-" + this.l.b();
        }
        if (this.e == null) {
            return "com.deivid22srk.store";
        }
        return this.e;
    }

    public final String toString() {
        String p = p();
        return this.f == null ? p : String.format("%s (node %s)", p, this.f);
    }
}
