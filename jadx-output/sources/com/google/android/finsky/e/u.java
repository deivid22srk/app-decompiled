package com.google.android.finsky.e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public class u extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private v f2771a;
    public int at;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2772b;
    public int as = 0;
    public int au = 1;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        k();
        if (bundle != null) {
            c(bundle);
        }
        if (this.f2771a != null) {
            u();
        }
        this.f2772b = true;
    }

    @Override // android.support.v4.app.Fragment
    public final void q() {
        this.f2772b = false;
        super.q();
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("SidecarFragment.state", this.as);
        bundle.putInt("SidecarFragment.substate", this.at);
        bundle.putInt("SidecarFragment.stateInstance", this.au);
    }

    public void c(Bundle bundle) {
        this.as = bundle.getInt("SidecarFragment.state");
        this.at = bundle.getInt("SidecarFragment.substate");
        this.au = bundle.getInt("SidecarFragment.stateInstance");
        if (this.as == 1) {
            FinskyLog.a("Restoring after serialization in RUNNING, resetting to INIT.", new Object[0]);
            a(0, 0);
        }
    }

    public final void a(v vVar) {
        this.f2771a = vVar;
        if (this.f2771a != null && this.f2772b) {
            u();
        }
    }

    public final void a(int i, int i2) {
        jm.a();
        this.as = i;
        this.at = i2;
        this.au++;
        u();
    }

    private void u() {
        if (this.f2771a != null) {
            this.f2771a.a(this);
        }
    }
}
