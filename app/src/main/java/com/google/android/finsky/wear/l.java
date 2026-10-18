package com.google.android.finsky.wear;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    final Uri f5134a;

    /* renamed from: b, reason: collision with root package name */
    final String f5135b;
    final String c;
    final String d;
    final String e;
    final String[] f;
    Uri g;
    Uri h;
    int i;
    String j;
    public com.google.android.finsky.bpkg.b k;

    l(com.google.android.gms.wearable.l lVar) {
        this.f5134a = lVar.b();
        List<String> pathSegments = this.f5134a.getPathSegments();
        if (pathSegments != null && pathSegments.size() >= 3) {
            this.c = pathSegments.get(1);
            this.d = pathSegments.get(2);
        } else {
            this.c = null;
            this.d = null;
        }
        com.google.android.gms.wearable.o a2 = com.google.android.gms.wearable.o.a(lVar.c());
        this.e = a2.f("assetIdentifier");
        this.f = a2.j("nodeIds");
        if (this.f != null && this.f.length == 1) {
            this.f5135b = this.f[0];
        } else {
            this.f5135b = null;
        }
    }

    public final void a(List<Uri> list) {
        if (this.g != null) {
            list.add(this.g);
        }
        if (this.h != null) {
            list.add(this.h);
        }
        list.add(this.f5134a);
    }
}
