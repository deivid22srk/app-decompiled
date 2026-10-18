package com.google.android.finsky.services;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.ContentFiltersActivity2;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.protos.ev;
import com.google.android.finsky.protos.ew;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ib;

/* loaded from: classes.dex */
final class e extends com.android.vending.b.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentFiltersService f4619a;

    e(ContentFiltersService contentFiltersService) {
        this.f4619a = contentFiltersService;
    }

    @Override // com.android.vending.b.a
    public final Bundle a(int[] iArr) {
        String a2;
        FinskyApp a3 = FinskyApp.a();
        if (!a3.e().a(12602392L) || (a2 = ib.a(this.f4619a, null, null, a3.h(), 519)) == null) {
            return null;
        }
        FinskyLog.a("Received content filters request from %s", a2);
        com.google.android.finsky.api.model.g gVar = new com.google.android.finsky.api.model.g(a3.b((String) null), this.f4619a);
        ContentFilters.ContentFilterSettingsResponse contentFilterSettingsResponse = null;
        if (gVar.f()) {
            contentFilterSettingsResponse = gVar.d();
        }
        ContentFilters.ContentFilterSettingsResponse e = contentFilterSettingsResponse == null ? gVar.e() : contentFilterSettingsResponse;
        if (e == null || !ContentFiltersService.a(e.f3574a, iArr)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("content_filters_intent", PendingIntent.getActivity(this.f4619a, 0, new Intent(a3, (Class<?>) ContentFiltersActivity2.class), 1073741824));
        bundle.putInt("content_filters_request_code", 44);
        if (TextUtils.isEmpty(com.google.android.finsky.utils.bg.c.a())) {
            return bundle;
        }
        com.google.android.finsky.c.b[] a4 = com.google.android.finsky.c.a.a(com.google.android.finsky.utils.bg.d);
        for (ew ewVar : e.f3574a) {
            ev b2 = com.google.android.finsky.c.a.b(ewVar, a4);
            if (b2 != null) {
                for (int i : iArr) {
                    int[] iArr2 = ewVar.f3804a;
                    int length = iArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (iArr2[i2] != i) {
                            i2++;
                        } else {
                            bundle.putBundle(String.valueOf(i), com.google.android.finsky.c.a.a(ewVar, b2));
                            break;
                        }
                    }
                }
            }
        }
        return bundle;
    }
}
