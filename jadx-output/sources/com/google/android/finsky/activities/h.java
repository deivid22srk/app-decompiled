package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.ji;

/* loaded from: classes.dex */
final class h implements ji {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f1791a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1792b;
    final /* synthetic */ d c;

    h(d dVar, boolean[] zArr, boolean z) {
        this.c = dVar;
        this.f1791a = zArr;
        this.f1792b = z;
    }

    @Override // com.google.android.finsky.utils.ji
    public final void H_() {
        this.f1791a[0] = false;
        jb.b(this);
        this.c.g(this.f1792b);
    }

    @Override // com.google.android.finsky.utils.ji
    public final void I_() {
        this.f1791a[0] = false;
        jb.b(this);
        FinskyLog.c("User settings failed to load, continuing start anyways.", new Object[0]);
        this.c.g(this.f1792b);
    }
}
