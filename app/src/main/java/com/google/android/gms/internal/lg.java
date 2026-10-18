package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class lg extends com.google.android.gms.common.internal.aq {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<lc> f6131a;

    lg(lc lcVar) {
        this.f6131a = new WeakReference<>(lcVar);
    }

    @Override // com.google.android.gms.common.internal.ap
    public final void a(ResolveAccountResponse resolveAccountResponse) {
        lc lcVar = this.f6131a.get();
        if (lcVar == null) {
            return;
        }
        lcVar.f6125a.a(new lh(this, lcVar, lcVar, resolveAccountResponse));
    }
}
