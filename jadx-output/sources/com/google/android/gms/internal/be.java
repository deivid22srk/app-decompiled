package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class be extends bj {

    /* renamed from: a, reason: collision with root package name */
    private final as f5891a;

    /* renamed from: b, reason: collision with root package name */
    private final au f5892b;
    private final ar c;
    private boolean d = false;

    @Override // com.google.android.gms.internal.bi
    public final com.google.android.gms.dynamic.a a(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        return a(aVar, aVar2, true);
    }

    @Override // com.google.android.gms.internal.bi
    public final String a() {
        return "ms";
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean a(com.google.android.gms.dynamic.a aVar) {
        return this.f5892b.a((Uri) com.google.android.gms.dynamic.d.a(aVar));
    }

    @Override // com.google.android.gms.internal.bi
    public final com.google.android.gms.dynamic.a b(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        return a(aVar, aVar2, false);
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean b(com.google.android.gms.dynamic.a aVar) {
        return this.f5892b.b((Uri) com.google.android.gms.dynamic.d.a(aVar));
    }

    @Override // com.google.android.gms.internal.bi
    public final void d(com.google.android.gms.dynamic.a aVar) {
        this.f5892b.a((MotionEvent) com.google.android.gms.dynamic.d.a(aVar));
    }

    public be(String str, Context context) {
        this.f5891a = as.a(str, context);
        if (((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.az)).booleanValue()) {
            as.a();
        }
        if (((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.aA)).booleanValue()) {
            as.b();
        }
        this.f5892b = new au(this.f5891a);
        this.c = new ar(context, new d(), new ax(239));
    }

    @Override // com.google.android.gms.internal.bi
    public final void a(String str, String str2) {
        au auVar = this.f5892b;
        auVar.f5884a = str;
        auVar.f5885b = str2;
    }

    @Override // com.google.android.gms.internal.bi
    public final void a(String str) {
        this.f5892b.c = str.split(",");
    }

    @Override // com.google.android.gms.internal.bi
    public final String c(com.google.android.gms.dynamic.a aVar) {
        Context context = (Context) com.google.android.gms.dynamic.d.a(aVar);
        String a2 = this.f5891a.a(context, (String) null, false);
        if (this.c == null || !this.d) {
            return a2;
        }
        String a3 = this.c.a(a2, this.c.a(context, (String) null, false));
        this.d = false;
        return a3;
    }

    @Override // com.google.android.gms.internal.bi
    public final String a(com.google.android.gms.dynamic.a aVar, String str) {
        return this.f5891a.a((Context) com.google.android.gms.dynamic.d.a(aVar), str, true);
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean a(String str, boolean z) {
        if (this.c == null) {
            return false;
        }
        this.c.e = new com.google.android.gms.ads.b.c(str, z);
        this.d = true;
        return true;
    }

    private com.google.android.gms.dynamic.a a(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, boolean z) {
        try {
            Uri uri = (Uri) com.google.android.gms.dynamic.d.a(aVar);
            Context context = (Context) com.google.android.gms.dynamic.d.a(aVar2);
            return com.google.android.gms.dynamic.d.a(z ? this.f5892b.a(uri, context, null, false) : this.f5892b.a(uri, context));
        } catch (zzap e) {
            return null;
        }
    }
}
