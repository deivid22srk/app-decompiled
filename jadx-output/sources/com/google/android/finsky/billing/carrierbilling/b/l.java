package com.google.android.finsky.billing.carrierbilling.b;

import com.android.a.a.r;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f2191a;

    l(k kVar) {
        this.f2191a = kVar;
    }

    @Override // com.android.a.a.r
    public final void a() {
        ArrayList<Integer> integerArrayList = this.f2191a.r.getIntegerArrayList("highlight_address");
        if (integerArrayList != null) {
            this.f2191a.a((Collection<Integer>) k.a((ArrayList) integerArrayList));
        }
    }
}
