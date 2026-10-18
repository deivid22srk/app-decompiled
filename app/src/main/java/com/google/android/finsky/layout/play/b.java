package com.google.android.finsky.layout.play;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class b implements OnAccountsUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3423a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3424b;

    b(FinskyDrawerLayout finskyDrawerLayout, Context context) {
        this.f3424b = finskyDrawerLayout;
        this.f3423a = context;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] accountArr) {
        jm.b(this.f3423a);
        this.f3424b.e();
    }
}
