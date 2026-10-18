package com.google.android.finsky.receivers;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ea;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
final class ah extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.b f4448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4449b;

    ah(u uVar, com.google.android.finsky.bpkg.b bVar) {
        this.f4449b = uVar;
        this.f4448a = bVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Integer doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Integer num) {
        int intValue;
        com.google.android.finsky.apkg.n nVar;
        boolean z;
        Integer num2 = num;
        FinskyApp.a().v.e(this.f4448a.f2104a);
        if (num2.intValue() == 1) {
            z = this.f4449b.y;
            if (z && jn.l.a().booleanValue()) {
                this.f4449b.c();
                intValue = 0;
            } else {
                intValue = 0;
            }
        } else {
            u.b(this.f4449b, this.f4448a.f2104a, num2.intValue());
            intValue = num2.intValue();
        }
        FinskyLog.a("installExistingPackage %s result %d", this.f4448a.f2104a, num2);
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        String str = this.f4449b.e;
        nVar = this.f4449b.k;
        h.a(109, str, (String) null, intValue, (String) null, nVar);
        this.f4449b.b(70, (String) null);
        this.f4449b.b();
    }

    private Integer a() {
        try {
            return Integer.valueOf(ea.a(FinskyApp.a(), this.f4448a.f2104a));
        } catch (PackageManager.NameNotFoundException e) {
            return -3;
        }
    }
}
