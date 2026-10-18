package com.google.android.finsky.download;

import java.io.File;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2697a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2698b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final com.google.android.finsky.protos.ad g;

    public abstract String a(String str);

    public abstract void a(OutputStream outputStream);

    public abstract boolean a();

    public abstract boolean a(boolean z);

    public abstract File b();

    public abstract int c();

    public abstract OutputStream d();

    public abstract boolean e();

    public abstract boolean f();

    public d(String str, long j, String str2, String str3, long j2, String str4, com.google.android.finsky.protos.ad adVar) {
        this.f2697a = str;
        this.f2698b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        this.g = adVar;
    }

    public File g() {
        return null;
    }

    public com.google.android.finsky.download.apkg.a h() {
        return null;
    }

    public boolean i() {
        return true;
    }
}
