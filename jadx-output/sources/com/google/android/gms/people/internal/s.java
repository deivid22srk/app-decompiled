package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.mh;

/* loaded from: classes.dex */
final class s extends a {

    /* renamed from: a, reason: collision with root package name */
    final mh<Object> f6423a;

    @Override // com.google.android.gms.people.internal.a, com.google.android.gms.people.internal.d
    public final void a(int i, Bundle bundle, Bundle bundle2) {
        if (t.a(3)) {
            t.a("PeopleClient", "Bundle callback: status=" + i + "\nresolution=" + bundle + "\nbundle=" + bundle2);
        }
        if (i == 0) {
            this.f6423a.a(new q(bundle2.getString("account"), bundle2.getString("pagegaiaid"), bundle2.getInt("scope")));
        } else if (t.a(5)) {
            Log.w("PeopleClient", "Non-success data changed callback received.");
        }
    }
}
