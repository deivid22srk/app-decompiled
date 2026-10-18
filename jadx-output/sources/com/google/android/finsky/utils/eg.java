package com.google.android.finsky.utils;

import android.os.Handler;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class eg implements ek {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ef f4847a;

    eg(ef efVar) {
        this.f4847a = efVar;
    }

    @Override // com.google.android.finsky.utils.ek
    public final void a(String str, int i) {
        String str2;
        Handler handler;
        String str3;
        Handler handler2;
        Handler handler3;
        com.google.android.finsky.b.x xVar = FinskyApp.a().v;
        str2 = this.f4847a.f;
        xVar.e(str2);
        try {
            str3 = this.f4847a.f;
            FinskyLog.a("Package install status for %s is %d", str3, Integer.valueOf(i));
            if (i == 1) {
                handler3 = this.f4847a.j;
                handler3.post(new eh(this));
            } else {
                handler2 = this.f4847a.j;
                handler2.post(new ei(this, i));
            }
        } catch (Exception e) {
            String simpleName = e.getClass().getSimpleName();
            handler = this.f4847a.j;
            handler.post(new ej(this, simpleName));
            FinskyLog.b(e, "Package install observer exception", new Object[0]);
        }
    }
}
