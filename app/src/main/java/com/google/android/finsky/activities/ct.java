package com.google.android.finsky.activities;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ct implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f1667a;

    ct(cr crVar) {
        this.f1667a = crVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        Document document;
        com.google.android.finsky.api.model.h hVar;
        document = this.f1667a.f1663a;
        if (document == null) {
            cr crVar = this.f1667a;
            hVar = this.f1667a.d;
            crVar.a(hVar.b());
            return;
        }
        FinskyLog.a("Ignoring soft TTL refresh.", new Object[0]);
    }
}
