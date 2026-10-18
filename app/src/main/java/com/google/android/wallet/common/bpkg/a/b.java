package com.google.android.wallet.common.bpkg.a;

import android.os.Handler;
import com.google.android.wallet.analytics.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Handler f7264a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7265b;

    public b(boolean z) {
        this.f7265b = z;
    }

    public final void a(e eVar) {
        if (!this.f7265b) {
            this.f7264a.removeCallbacksAndMessages(null);
            this.f7264a.postDelayed(new c(this, eVar), com.google.android.wallet.a.a.i.b().intValue());
        }
    }
}
