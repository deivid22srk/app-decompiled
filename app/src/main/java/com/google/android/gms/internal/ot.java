package com.google.android.gms.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class ot implements com.google.android.gms.people.c {
    @Override // com.google.android.gms.people.c
    public final com.google.android.gms.common.api.u<com.google.android.gms.people.e> a(com.google.android.gms.common.api.m mVar, String str, com.google.android.gms.people.d dVar) {
        if (Log.isLoggable("PeopleClientCall", 3)) {
            com.google.android.gms.people.internal.k.a("loadCircles", str, null, dVar);
        }
        return mVar.a((com.google.android.gms.common.api.m) new ou(this, mVar, str, dVar));
    }

    @Override // com.google.android.gms.people.c
    public final com.google.android.gms.common.api.u<com.google.android.gms.people.g> a(com.google.android.gms.common.api.m mVar, String str, com.google.android.gms.people.f fVar) {
        if (Log.isLoggable("PeopleClientCall", 3)) {
            com.google.android.gms.people.internal.k.a("loadPeople", str, null, fVar);
        }
        return mVar.a((com.google.android.gms.common.api.m) new ow(this, mVar, str, fVar));
    }
}
