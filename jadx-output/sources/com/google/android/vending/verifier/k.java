package com.google.android.vending.verifier;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7163a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7164b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final byte[] h;

    public k(PackageVerificationService packageVerificationService, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr) {
        this.f7163a = packageVerificationService;
        this.f7164b = packageVerificationService;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = bArr;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r8) {
        ArrayList arrayList;
        com.google.android.vending.verifier.a.c.a(this.f7164b, this.c, this.d ? 1 : 0, this.e, this.f, this.g, this.h);
        arrayList = this.f7163a.e;
        arrayList.remove(this.c);
        this.f7163a.a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        c cVar = new c(this.f7164b);
        if (this.d) {
            FinskyLog.a("Uninstalling %s", this.c);
            PackageVerificationService.b(PackageVerificationService.a(this.c));
            cVar.b(this.c);
            return null;
        }
        cVar.a(this.c, this.e);
        return null;
    }
}
