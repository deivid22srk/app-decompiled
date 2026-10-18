package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.hl;

/* loaded from: classes.dex */
public final class fn extends android.support.v4.app.r {
    public static fn a(com.google.android.finsky.api.model.l lVar) {
        fn fnVar = new fn();
        Bundle bundle = new Bundle();
        bundle.putInt("sorting_type", hl.a(lVar));
        fnVar.f(bundle);
        return fnVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        android.support.v4.app.t f = f();
        Bundle bundle2 = this.r;
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f);
        aVar.a(R.string.sort_reviews);
        aVar.a(hl.a(f), bundle2.getInt("sorting_type"), new fo(this));
        return aVar.a();
    }

    static /* synthetic */ fp a(fn fnVar) {
        ComponentCallbacks componentCallbacks = fnVar.s;
        if (componentCallbacks instanceof fp) {
            return (fp) componentCallbacks;
        }
        android.support.v4.app.c f = fnVar.f();
        if (f instanceof fp) {
            return (fp) f;
        }
        return null;
    }
}
