package com.google.android.finsky.billing.lightpurchase.c;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.gms.auth.GoogleAuthException;
import java.io.IOException;

/* loaded from: classes.dex */
final class e extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.billing.lightpurchase.o f2350a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f2351b;

    e(d dVar, com.google.android.finsky.billing.lightpurchase.o oVar) {
        this.f2351b = dVar;
        this.f2350a = oVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ String doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        this.f2350a.ai.a(str, (String) null);
    }

    private String a() {
        com.google.android.finsky.a.i iVar;
        com.google.android.finsky.a.i iVar2;
        com.google.android.finsky.a.i iVar3;
        String str = "weblogin:continue=" + Uri.encode(this.f2351b.f2348a);
        iVar = this.f2351b.f2349b.au;
        iVar.b(new com.google.android.finsky.a.b(940).f1473a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String a2 = com.google.android.gms.auth.b.a(this.f2351b.f2349b.f(), this.f2351b.f2349b.e, str);
            iVar3 = this.f2351b.f2349b.au;
            iVar3.b(new com.google.android.finsky.a.b(941).b(SystemClock.elapsedRealtime() - elapsedRealtime).f1473a);
            return a2;
        } catch (GoogleAuthException | IOException e) {
            iVar2 = this.f2351b.f2349b.au;
            iVar2.b(new com.google.android.finsky.a.b(941).b(SystemClock.elapsedRealtime() - elapsedRealtime).a(1).a(e).f1473a);
            return this.f2351b.f2348a;
        }
    }
}
