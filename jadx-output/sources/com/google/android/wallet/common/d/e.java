package com.google.android.wallet.common.d;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;

/* loaded from: classes.dex */
public class e extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private f f7278a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7279b;
    public int f = -1;
    public int g = -1;
    boolean h = false;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        k();
        if (bundle == null) {
            a(0, 0);
        } else {
            c(bundle);
        }
        this.f7279b = true;
    }

    @Override // android.support.v4.app.Fragment
    public final void q() {
        this.f7279b = false;
        super.q();
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("SidecarFragment.state", this.f);
        bundle.putInt("SidecarFragment.substate", this.g);
        bundle.putBoolean("SidecarFragment.notifyListenerOfStateChange", this.h);
    }

    public void c(Bundle bundle) {
        this.f = bundle.getInt("SidecarFragment.state");
        this.g = bundle.getInt("SidecarFragment.substate");
        this.h = bundle.getBoolean("SidecarFragment.notifyListenerOfStateChange");
        if (this.f == 1) {
            Log.d("SidecarFragment", "Restoring after serialization in RUNNING, resetting to INIT.");
            a(0, 0);
        } else if (this.h) {
            u();
        }
    }

    public final void a(f fVar) {
        this.f7278a = fVar;
        if (this.f7278a != null && this.f7279b && this.h) {
            u();
        }
    }

    public final void a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(String.format("State / substate should be >= 0, state=%d, substate=%d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must be called from the UI thread.");
        }
        if (i != this.f || i2 != this.g) {
            this.f = i;
            this.g = i2;
            this.h = true;
            u();
        }
    }

    private void u() {
        if (this.f7278a != null) {
            this.f7278a.a(this);
            this.h = false;
        }
    }
}
