package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.ar;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class r extends com.google.android.finsky.billing.h implements com.google.android.finsky.billing.g, com.google.android.finsky.billing.j {

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.billing.f f2394b;

    protected abstract com.google.android.finsky.billing.f x();

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        Bundle bundle2 = new Bundle();
        if (this.f2394b != null) {
            this.f2394b.b(bundle2);
        }
        bundle.putBundle("CompleteDcb3Flow.flowState", bundle2);
    }

    protected final void i(Bundle bundle) {
        this.f2394b = x();
        if (bundle != null && bundle.containsKey("CompleteDcb3Flow.flowState")) {
            this.f2394b.a(bundle.getBundle("CompleteDcb3Flow.flowState"));
        } else {
            this.f2394b.a();
        }
    }

    @Override // com.google.android.finsky.billing.h
    public final boolean u() {
        return this.f2394b != null && this.f2394b.e();
    }

    @Override // com.google.android.finsky.billing.h
    public final void v() {
        if (this.f2394b != null) {
            this.f2394b.d();
        }
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment, String str) {
        FinskyLog.e("Not implemented.", new Object[0]);
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment) {
        FinskyLog.e("Not implemented.", new Object[0]);
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(boolean z, Bundle bundle) {
        if (z) {
            w();
        } else {
            c(bundle);
        }
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(String str) {
        b(str);
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(android.support.v4.app.r rVar, String str) {
        rVar.a(this.B, str);
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Bundle bundle, String str, Fragment fragment) {
        this.B.a(bundle, str, fragment);
    }

    @Override // com.google.android.finsky.billing.g
    public final Fragment a(Bundle bundle, String str) {
        return this.B.a(bundle, str);
    }

    @Override // com.google.android.finsky.billing.g
    public final void b(int i) {
        if (this.B.a("CompleteDcb3Flow.progressDialog") != null) {
            FinskyLog.e("Duplicate progress dialog.", new Object[0]);
        } else {
            ar.b(i).a(this.B, "CompleteDcb3Flow.progressDialog");
        }
    }

    @Override // com.google.android.finsky.billing.g
    public final void S_() {
        ar arVar = (ar) this.B.a("CompleteDcb3Flow.progressDialog");
        if (arVar == null) {
            FinskyLog.e("Progress dialog not shown.", new Object[0]);
        } else {
            arVar.a(false);
        }
    }
}
