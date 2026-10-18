package com.google.android.finsky.services;

import android.os.Bundle;

/* loaded from: classes.dex */
final class ak extends z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayGearheadService f4577a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.gpkg.h f4578b;
    private final com.google.android.finsky.bpkg.x c;
    private final com.google.android.finsky.bpkg.a d;

    public ak(PlayGearheadService playGearheadService, com.google.android.finsky.gpkg.h hVar, com.google.android.finsky.bpkg.x xVar, com.google.android.finsky.bpkg.a aVar) {
        this.f4577a = playGearheadService;
        this.f4578b = hVar;
        this.c = xVar;
        this.d = aVar;
    }

    @Override // com.google.android.finsky.services.y
    public final Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("Finsky.IsValid", false);
        com.google.android.finsky.bpkg.y a2 = this.c.a(str);
        if (a2 == null) {
            return bundle;
        }
        this.d.a((Runnable) null);
        this.f4578b.c();
        if (this.f4578b.a(a2.f2137a, a2.f2138b).isEmpty()) {
            return bundle;
        }
        if (com.google.android.finsky.cpkg.d.ec.b().booleanValue()) {
            this.d.f2060a.c();
            com.google.android.finsky.bpkg.t a3 = this.d.f2060a.a(str);
            if (a3 != null) {
                int i = a3.r;
                if ((i & 4) == 0) {
                    return bundle;
                }
                if ((i & 2) != 0) {
                    return bundle;
                }
            }
        }
        bundle.putBoolean("Finsky.IsValid", true);
        return bundle;
    }
}
