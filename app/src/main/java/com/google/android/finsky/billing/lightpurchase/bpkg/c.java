package com.google.android.finsky.billing.lightpurchase.bpkg;

import android.view.View;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2318a;

    c(a aVar) {
        this.f2318a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        if (this.f2318a.ai != null) {
            z = this.f2318a.f2316b;
            if (z) {
                ik.a(this.f2318a.f(), this.f2318a.ai.R);
                if (view == this.f2318a.al) {
                    this.f2318a.ai.u();
                } else if (view == this.f2318a.am) {
                    this.f2318a.ai.R_();
                }
            }
        }
    }
}
