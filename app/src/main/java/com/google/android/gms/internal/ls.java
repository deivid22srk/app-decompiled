package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class ls implements lx {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lr f6147a;

    ls(lr lrVar) {
        this.f6147a = lrVar;
    }

    @Override // com.google.android.gms.internal.lx
    public final void a(ly<?> lyVar) {
        com.google.android.gms.common.api.aa aaVar;
        com.google.android.gms.common.api.aa aaVar2;
        this.f6147a.i.remove(lyVar);
        if (lyVar.b() != null) {
            aaVar = this.f6147a.u;
            if (aaVar != null) {
                aaVar2 = this.f6147a.u;
                lyVar.b().intValue();
                aaVar2.a();
            }
        }
    }
}
