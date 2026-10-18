package com.google.android.finsky.utils;

import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f4721a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4722b;
    final /* synthetic */ z c;

    aa(z zVar, com.google.android.finsky.a.i iVar, Document document) {
        this.c = zVar;
        this.f4721a = iVar;
        this.f4722b = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4721a.b(new com.google.android.finsky.a.b(851).a(this.f4722b.f1963a.f3890a).b(1).f1473a);
        dh.f4825a = System.currentTimeMillis();
        Toast.makeText(FinskyApp.a(), R.string.cancel_subscription_okay, 0).show();
        z.z();
    }
}
