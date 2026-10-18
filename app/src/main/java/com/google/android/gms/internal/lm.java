package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class lm extends lp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc f6140a;
    private final ArrayList<com.google.android.gms.common.api.g> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(lc lcVar, ArrayList<com.google.android.gms.common.api.g> arrayList) {
        super(lcVar, (byte) 0);
        this.f6140a = lcVar;
        this.c = arrayList;
    }

    @Override // com.google.android.gms.internal.lp
    public final void a() {
        if (this.f6140a.f6125a.m.e.isEmpty()) {
            this.f6140a.f6125a.m.e = this.f6140a.i();
        }
        Iterator<com.google.android.gms.common.api.g> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(this.f6140a.g, this.f6140a.f6125a.m.e);
        }
    }
}
