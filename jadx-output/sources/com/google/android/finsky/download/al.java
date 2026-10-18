package com.google.android.finsky.download;

import com.google.android.finsky.protos.pf;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class al extends d {
    private final com.google.android.finsky.b.a h;
    private final com.google.android.finsky.installer.s i;
    private final String j;

    public al(com.google.android.finsky.b.a aVar, com.google.android.finsky.installer.s sVar, String str, pf pfVar) {
        super(str, pfVar.c, pfVar.g, pfVar.i, pfVar.e, pfVar.k, pfVar.m);
        this.h = aVar;
        this.i = sVar;
        this.j = pfVar.f4243a;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.finsky.download.d
    public final File b() {
        FinskyLog.e("getSourceFile called for %s (%s) is not supported for splits", this.f2697a, this.j);
        return null;
    }

    @Override // com.google.android.finsky.download.d
    public final int c() {
        return this.h.f2061b.h(this.f2697a);
    }

    @Override // com.google.android.finsky.download.d
    public final OutputStream d() {
        return this.i.a(this.f2697a, this.j, this.f2698b);
    }

    @Override // com.google.android.finsky.download.d
    public final void a(OutputStream outputStream) {
        this.i.a(outputStream);
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a(boolean z) {
        return this.i.a(z);
    }

    @Override // com.google.android.finsky.download.d
    public final String a(String str) {
        return str;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean f() {
        return true;
    }
}
