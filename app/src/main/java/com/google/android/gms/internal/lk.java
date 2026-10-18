package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* loaded from: classes.dex */
final class lk extends lp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc f6137a;
    private final Map<com.google.android.gms.common.api.g, com.google.android.gms.common.api.t> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(lc lcVar, Map<com.google.android.gms.common.api.g, com.google.android.gms.common.api.t> map) {
        super(lcVar, (byte) 0);
        this.f6137a = lcVar;
        this.c = map;
    }

    @Override // com.google.android.gms.internal.lp
    public final void a() {
        int a2 = com.google.android.gms.common.b.a(this.f6137a.c);
        if (a2 != 0) {
            this.f6137a.f6125a.a(new ll(this, this.f6137a, new ConnectionResult(a2, null)));
            return;
        }
        if (this.f6137a.e) {
            this.f6137a.d.c();
        }
        for (com.google.android.gms.common.api.g gVar : this.c.keySet()) {
            gVar.a(this.c.get(gVar));
        }
    }
}
