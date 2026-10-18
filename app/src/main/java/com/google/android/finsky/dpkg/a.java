package com.google.android.finsky.dpkg;

import android.content.Context;
import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.n;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2470a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2471b;
    public boolean c;
    public n d;

    public a(Context context) {
        this.f2470a = context;
        if (bg.aU.a().booleanValue()) {
            this.c = true;
        }
    }

    @Override // com.google.android.finsky.dpkg.e
    public final void a() {
        bg.aU.a((o<Boolean>) true);
        b();
    }

    @Override // com.google.android.finsky.dpkg.e
    public final void a(android.support.v4.h.f<Object> fVar, android.support.v4.h.f<Object> fVar2) {
    }

    public final void b() {
        if (!this.f2471b) {
            FinskyLog.a("Application close deferrer set because of stale process stable experiments", new Object[0]);
            c().a(new b(this), com.google.android.finsky.cpkg.d.fm.b().intValue());
            this.f2471b = true;
        }
    }

    public final n c() {
        if (this.d == null) {
            this.d = new n(this.f2470a);
        }
        return this.d;
    }
}
