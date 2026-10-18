package com.google.android.finsky.billing.instrumentmanager;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.b.a;
import com.google.android.finsky.billing.lightpurchase.b.f;
import com.google.android.finsky.protos.pb;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.d;

/* loaded from: classes.dex */
public abstract class c<T extends com.google.android.finsky.billing.lightpurchase.b.a> extends f<T> implements d {
    public static Bundle a(String str, pb pbVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("InstrumentManagerStep.tokens", ParcelableProto.a(pbVar));
        bundle.putInt("InstrumentManagerStep.theme_res_id", i);
        return bundle;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.instrument_manager_step, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        Bundle bundle2 = this.r;
        String string = bundle2.getString("authAccount");
        com.google.android.wallet.common.pub.a.a.f7286a = new b(this, FinskyApp.a().f(string));
        com.google.android.wallet.common.c.a.a(FinskyApp.a().f1434a);
        com.google.android.wallet.common.c.a.b(FinskyApp.a().e);
        if (h().a(R.id.instrument_manager_host) == null) {
            pb pbVar = (pb) ParcelableProto.a(bundle2, "InstrumentManagerStep.tokens");
            h().a().a(R.id.instrument_manager_host, com.google.android.wallet.instrumentmanager.c.a.a(com.google.android.finsky.api.a.a(string, f()), pbVar.f4235a, pbVar.c, this.r.getInt("InstrumentManagerStep.theme_res_id"), Bundle.EMPTY)).b();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void q() {
        com.google.android.wallet.common.pub.a.a.f7286a = null;
        super.q();
    }

    public static boolean b(int i) {
        switch (i) {
            case 50:
                return true;
            case 51:
            case 52:
                return false;
            default:
                throw new IllegalStateException("Unexpected InstrumentManager resultCode: " + i);
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final boolean x() {
        return false;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return null;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
    }
}
