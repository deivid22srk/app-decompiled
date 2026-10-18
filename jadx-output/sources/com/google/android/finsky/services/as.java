package com.google.android.finsky.services;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.protos.nx;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class as implements com.android.volley.t<nx> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RestoreService f4592a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4593b;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(nx nxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        long longValue;
        Intent d;
        boolean a2;
        int i5;
        nx nxVar2 = nxVar;
        RestoreService.c(this.f4592a);
        RestoreService.d(this.f4592a);
        RestoreService.e(this.f4592a);
        RestoreService.f(this.f4592a);
        int i6 = 0;
        com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
        nv[] nvVarArr = nxVar2.f4190a;
        int length = nvVarArr.length;
        int i7 = 0;
        while (i7 < length) {
            nv nvVar = nvVarArr[i7];
            String str = nvVar.f4187a.f3740a;
            int i8 = nvVar.d;
            String str2 = nvVar.f4188b;
            a2 = this.f4592a.a(str, i8, this.f4593b, fVar);
            if (a2) {
                if (FinskyApp.a().e().a(12605209L) && nvVar.i != null) {
                    for (fw fwVar : nvVar.i.e) {
                        FinskyLog.a("Package %s depends on %s min %d", str, fwVar.f3849a, Integer.valueOf(fwVar.c));
                    }
                }
                int i9 = 3;
                if (nvVar.h && nvVar.g < 100) {
                    i9 = 1;
                }
                String str3 = null;
                if (nvVar.f != null) {
                    str3 = nvVar.f.f;
                }
                this.f4592a.f4555a.a(str, i8, this.f4593b, str2, i9, null, true, str3, false, nvVar.i);
                fVar.a(str, com.google.android.finsky.c.d.eI.b().booleanValue(), false, false);
                fVar.a(str, i8, this.f4593b, str2, true, "restore", i9, nvVar.i);
                i5 = i6 + 1;
                if (!TextUtils.isEmpty(str3)) {
                    this.f4592a.b(str, str3);
                }
            } else {
                i5 = i6;
            }
            i7++;
            i6 = i5;
        }
        FinskyLog.a("Attempted to restore %d assets.", Integer.valueOf(nxVar2.f4190a.length));
        i = this.f4592a.i;
        FinskyLog.a("  Skipped (already tracked): %d", Integer.valueOf(i));
        i2 = this.f4592a.j;
        FinskyLog.a("  Skipped (other account): %d", Integer.valueOf(i2));
        i3 = this.f4592a.l;
        FinskyLog.a("  Skipped (attempts exceeded): %d", Integer.valueOf(i3));
        i4 = this.f4592a.k;
        FinskyLog.a("  Skipped (already installed): %d", Integer.valueOf(i4));
        if (i6 > 0) {
            FinskyLog.a("  Posted for deferred download/install: %d", Integer.valueOf(i6));
            if (com.google.android.finsky.utils.bg.aw.a().booleanValue()) {
                fVar.a();
            } else {
                if (Build.VERSION.SDK_INT >= 21) {
                    longValue = com.google.android.finsky.c.d.bF.b().longValue();
                } else {
                    longValue = com.google.android.finsky.c.d.bE.b().longValue();
                }
                RestoreService restoreService = this.f4592a;
                d = RestoreService.d(this.f4592a.getApplicationContext());
                restoreService.a(d, longValue);
            }
        }
        this.f4592a.f4555a.a(this.f4593b, true, (VolleyError) null);
        at.a(this.f4592a.f4555a);
    }

    public as(RestoreService restoreService, String str) {
        this.f4592a = restoreService;
        this.f4593b = str;
    }
}
