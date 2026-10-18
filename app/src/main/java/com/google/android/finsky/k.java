package com.google.android.finsky;

import android.accounts.Account;
import com.google.android.finsky.utils.cz;
import java.util.List;

/* loaded from: classes.dex */
final class k implements com.google.android.finsky.gpkg.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyApp f2897a;

    k(FinskyApp finskyApp) {
        this.f2897a = finskyApp;
    }

    @Override // com.google.android.finsky.gpkg.d
    public final List<Account> a() {
        return cz.a(com.google.android.finsky.api.a.a(this.f2897a));
    }

    @Override // com.google.android.finsky.gpkg.d
    public final Account a(String str) {
        return com.google.android.finsky.api.a.a(str, this.f2897a);
    }
}
