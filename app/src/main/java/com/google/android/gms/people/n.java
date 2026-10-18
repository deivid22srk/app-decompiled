package com.google.android.gms.people;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
final class n extends com.google.android.gms.common.api.f<com.google.android.gms.people.internal.m, o> {
    n() {
    }

    @Override // com.google.android.gms.common.api.f
    public final /* synthetic */ com.google.android.gms.people.internal.m a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, o oVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        o oVar2 = oVar;
        av.a(oVar2, "Must provide valid PeopleOptions!");
        return new com.google.android.gms.people.internal.m(context, looper, pVar, qVar, String.valueOf(oVar2.f6432a), hVar);
    }
}
