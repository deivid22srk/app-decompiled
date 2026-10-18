package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.kn;

/* loaded from: classes.dex */
final class fp implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kn f4881a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fk f4882b;

    fp(fk fkVar, kn knVar) {
        this.f4882b = fkVar;
        this.f4881a = knVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        this.f4882b.e.a(this.f4881a.c, FinskyApp.a().g, this.f4882b.f4873a.getPackageManager());
    }
}
