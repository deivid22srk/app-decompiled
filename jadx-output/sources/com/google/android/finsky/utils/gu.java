package com.google.android.finsky.utils;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class gu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.protos.bm f4921a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4922b;
    final /* synthetic */ Document c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ Account f;

    gu(com.google.android.finsky.protos.bm bmVar, boolean z, Document document, String str, String str2, Account account) {
        this.f4921a = bmVar;
        this.f4922b = z;
        this.c = document;
        this.d = str;
        this.e = str2;
        this.f = account;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4921a.f3638a == 1 && this.f4922b && this.c.f1963a.e == 1) {
            FinskyApp.a().l.a(this.c);
            FinskyApp.a().s.f2060a.b(this.c.f1963a.c, this.d);
            if (this.f4921a.m != null) {
                if (!TextUtils.isEmpty(this.e)) {
                    FinskyApp.a().k.b(this.c.f1963a.f3890a, this.e);
                }
                Account account = this.f;
                Document document = this.c;
                if (document.E() == null) {
                    FinskyLog.e("Document does not contain AppDetails, cannot download: %s", document.f1963a.f3890a);
                }
                FinskyApp.a().k.a(document.E().w, document.E().e, account.name, document.f1963a.i, false, "single_install", 2, document.t());
                return;
            }
            FinskyLog.c("missing delivery data for %s", this.c.f1963a.f3890a);
        }
    }
}
