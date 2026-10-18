package com.google.android.finsky.activities;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class ae implements as<aq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f1537a;

    ae(ab abVar) {
        this.f1537a = abVar;
    }

    @Override // com.google.android.finsky.activities.as
    public final /* bridge */ /* synthetic */ boolean a(aq aqVar) {
        this.f1537a.a(aqVar);
        return true;
    }

    @Override // com.google.android.finsky.activities.as
    public final /* synthetic */ boolean b(aq aqVar) {
        aq aqVar2 = aqVar;
        return TextUtils.equals(com.google.android.finsky.api.d.o.b(), aqVar2.f1554b) && TextUtils.equals(com.google.android.finsky.api.d.f1953a.b(), aqVar2.c);
    }

    @Override // com.google.android.finsky.activities.as
    public final /* synthetic */ aq a(String[] strArr) {
        if (strArr != null) {
            return new aq(strArr[0], strArr[1], strArr[2]);
        }
        return new aq(null, null, null);
    }
}
