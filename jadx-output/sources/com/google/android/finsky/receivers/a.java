package com.google.android.finsky.receivers;

import android.content.Context;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4433a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AccountsChangedReceiver f4434b;

    a(AccountsChangedReceiver accountsChangedReceiver, Context context) {
        this.f4434b = accountsChangedReceiver;
        this.f4433a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String j = FinskyApp.a().j();
        if (j != null && !com.google.android.finsky.api.a.b(j, this.f4433a)) {
            System.exit(0);
        }
    }
}
