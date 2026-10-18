package com.google.android.finsky.activities;

import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ee implements com.google.android.finsky.utils.ds {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1712a;

    ee(MainActivity mainActivity) {
        this.f1712a = mainActivity;
    }

    @Override // com.google.android.finsky.utils.ds
    public final boolean a(String str, String str2, String str3, String str4) {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        com.google.android.finsky.navigationmanager.b bVar3;
        bVar = this.f1712a.o;
        if (bVar.v() == null) {
            return false;
        }
        bVar2 = this.f1712a.o;
        if (!bVar2.v().f1963a.f3890a.equals(str)) {
            bVar3 = this.f1712a.o;
            if (!com.google.android.finsky.api.s.a(str4, bVar3.v().f1963a.D)) {
                return false;
            }
        }
        this.f1712a.a(str2, str3, false);
        return true;
    }

    @Override // com.google.android.finsky.utils.ds
    public final boolean a(String str, String str2, String str3, int i) {
        com.google.android.finsky.navigationmanager.b bVar;
        boolean a2;
        bVar = this.f1712a.o;
        Document v = bVar.v();
        if (v == null || v.f1963a.g != 3 || !v.E().w.equals(str)) {
            return false;
        }
        a2 = this.f1712a.a(str2, str3, i, str);
        return a2;
    }

    @Override // com.google.android.finsky.utils.ds
    public final boolean a(String str, ci ciVar) {
        com.google.android.finsky.navigationmanager.b bVar;
        bVar = this.f1712a.o;
        Document v = bVar.v();
        if (v == null || v.f1963a.g != 3 || !v.E().w.equals(str)) {
            return false;
        }
        ciVar.b().a(this.f1712a.d());
        return true;
    }

    @Override // com.google.android.finsky.utils.ds
    public final boolean a(String str) {
        com.google.android.finsky.navigationmanager.b bVar;
        bVar = this.f1712a.o;
        Document v = bVar.v();
        return (v != null && v.f1963a.g == 3 && v.E().w.equals(str)) ? false : true;
    }
}
