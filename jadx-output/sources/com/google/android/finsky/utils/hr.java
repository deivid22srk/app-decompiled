package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class hr implements ee {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hq f4973a;

    hr(hq hqVar) {
        this.f4973a = hqVar;
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a() {
        FinskyLog.e("Unexpected install success for %s", this.f4973a.f4971a);
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a(int i, String str) {
        FinskyApp.a().h().a(111, this.f4973a.f4971a, (String) null, i, str, this.f4973a.c.c);
    }
}
