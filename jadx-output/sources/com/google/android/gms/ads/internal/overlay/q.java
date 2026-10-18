package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hk;

@gw
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5331a = false;

    /* renamed from: b, reason: collision with root package name */
    private m f5332b;

    q(m mVar) {
        this.f5332b = mVar;
    }

    public final void a() {
        hk.f6031a.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5331a) {
            return;
        }
        m mVar = this.f5332b;
        if (mVar.d != null) {
            long currentPosition = mVar.d.getCurrentPosition();
            if (mVar.h != currentPosition && currentPosition > 0) {
                if (mVar.c()) {
                    mVar.f5328b.removeView(mVar.g);
                }
                mVar.a("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
                mVar.h = currentPosition;
            }
        }
        a();
    }
}
