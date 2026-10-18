package com.google.android.finsky.billing.lightpurchase.bpkg;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.billing.lightpurchase.bpkg.a;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class f<T extends a> extends Fragment implements cy {
    public abstract String a(Resources resources);

    public abstract void u();

    @Override // android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        if (!(activity instanceof cy)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null) {
            ((a) this.E).a(this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("StepFragment.exists", true);
    }

    public String v() {
        return null;
    }

    public boolean x() {
        return true;
    }

    public void R_() {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return (cy) f();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void a(int i, aj ajVar) {
        ((a) this.E).a(i, ajVar, this);
    }
}
