package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ks;

/* loaded from: classes.dex */
final class r extends a {

    /* renamed from: a, reason: collision with root package name */
    private final ks<com.google.android.gms.people.e> f6422a;

    public r(ks<com.google.android.gms.people.e> ksVar) {
        this.f6422a = ksVar;
    }

    @Override // com.google.android.gms.people.internal.a, com.google.android.gms.people.internal.d
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        if (t.a(3)) {
            t.a("PeopleClient", "Circles callback: status=" + i + "\nresolution=" + bundle + "\nholder=" + dataHolder);
        }
        this.f6422a.a(new p(m.a(i, bundle), dataHolder == null ? null : new com.google.android.gms.people.model.b(dataHolder)));
    }
}
