package com.google.android.finsky.utils;

import android.accounts.Account;
import android.os.SystemClock;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class gt implements com.android.volley.t<com.google.android.finsky.protos.bg> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f4919a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f4920b;
    final /* synthetic */ Document c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ gw g;
    final /* synthetic */ boolean h;

    gt(Account account, long j, Document document, int i, String str, boolean z, gw gwVar, boolean z2) {
        this.f4919a = account;
        this.f4920b = j;
        this.c = document;
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = gwVar;
        this.h = z2;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.bg bgVar) {
        com.google.android.finsky.protos.bg bgVar2 = bgVar;
        com.google.android.finsky.a.i c = FinskyApp.a().c(this.f4919a);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4920b;
        if (bgVar2.f3626a == null) {
            FinskyLog.c("Expected PurchaseResponse.", new Object[0]);
            return;
        }
        com.google.android.finsky.protos.bl blVar = bgVar2.f3626a;
        if (blVar.f3636a != 0) {
            c.a(301, this.c.f1963a.f3890a, this.d, null, blVar.f3636a, null, elapsedRealtime);
            if (this.h) {
                String string = FinskyApp.a().getString(R.string.error);
                String str = blVar.e;
                FinskyApp.a().n.a(string, str, str, this.c.f1963a.f3890a, this.c.f1963a.D);
                return;
            }
            return;
        }
        if (bgVar2.f3627b == null) {
            FinskyLog.c("Expected PurchaseStatusResponse.", new Object[0]);
            return;
        }
        c.a(301, this.c.f1963a.f3890a, this.d, null, 0, bgVar2.z, elapsedRealtime);
        Account account = this.f4919a;
        Document document = this.c;
        String str2 = this.e;
        com.google.android.finsky.protos.bm bmVar = bgVar2.f3627b;
        FinskyApp.a().q.a(account, "free_purchase", new gu(bmVar, this.f, document, str2, bgVar2.B, account), bmVar.k);
        if (this.g != null) {
            this.g.a();
        }
    }
}
