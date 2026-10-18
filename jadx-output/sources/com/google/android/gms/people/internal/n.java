package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ks;

/* loaded from: classes.dex */
final class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private final ks<com.google.android.gms.people.g> f6415a;

    public n(ks<com.google.android.gms.people.g> ksVar) {
        this.f6415a = ksVar;
    }

    @Override // com.google.android.gms.people.internal.a, com.google.android.gms.people.internal.d
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        if (t.a(3)) {
            t.a("PeopleClient", "People callback: status=" + i + "\nresolution=" + bundle + "\nholder=" + dataHolder);
        }
        this.f6415a.a(new o(m.a(i, bundle), m.a(dataHolder)));
    }
}
