package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class fg extends android.support.v4.app.r {
    private final boolean[] ai = new boolean[2];

    public static fg a(boolean z, boolean z2) {
        fg fgVar = new fg();
        Bundle bundle = new Bundle();
        bundle.putBoolean("filterByVersion", z);
        bundle.putBoolean("filterByDevice", z2);
        fgVar.f(bundle);
        return fgVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        android.support.v4.app.t f = f();
        Bundle bundle2 = this.r;
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f);
        aVar.a(R.string.reviews_filter_options);
        String[] strArr = new String[this.ai.length];
        strArr[0] = f.getString(R.string.reviews_filter_by_version);
        strArr[1] = f.getString(R.string.reviews_filter_by_device_model);
        this.ai[0] = bundle2.getBoolean("filterByVersion");
        this.ai[1] = bundle2.getBoolean("filterByDevice");
        boolean[] zArr = this.ai;
        fh fhVar = new fh(this);
        if (aVar.f7468b != null) {
            aVar.f7468b.setMultiChoiceItems(strArr, zArr, fhVar);
        } else {
            android.support.v7.a.ad adVar = aVar.f7467a;
            adVar.f473a.s = strArr;
            adVar.f473a.G = fhVar;
            adVar.f473a.C = zArr;
            adVar.f473a.D = true;
        }
        aVar.a(android.R.string.ok, new fi(this));
        return aVar.a();
    }

    static /* synthetic */ fj b(fg fgVar) {
        ComponentCallbacks componentCallbacks = fgVar.s;
        if (componentCallbacks instanceof fj) {
            return (fj) componentCallbacks;
        }
        android.support.v4.app.c f = fgVar.f();
        if (f instanceof fj) {
            return (fj) f;
        }
        return null;
    }
}
