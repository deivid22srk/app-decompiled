package com.google.android.finsky.billing.lightpurchase.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.api.s;
import com.google.android.finsky.billing.as;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.protos.cn;
import com.google.android.finsky.protos.co;
import com.google.android.finsky.protos.cu;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends Fragment implements f, k, q, v {

    /* renamed from: a, reason: collision with root package name */
    private i f2292a;

    /* renamed from: b, reason: collision with root package name */
    private as f2293b;
    private String c;
    private int d;
    private String e;
    private int f;

    public static Fragment a(String str, int i, String str2) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("AgeVerificationHostFragment.backend", i);
        bundle.putString("AgeVerificationHostFragment.docid_str", str2);
        gVar.f(bundle);
        return gVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.c = this.r.getString("authAccount");
        this.d = this.r.getInt("AgeVerificationHostFragment.backend");
        this.e = this.r.getString("AgeVerificationHostFragment.docid_str");
        if (bundle != null) {
            this.f = bundle.getInt("AgeVerificationHostFragment.last_state_instance");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("AgeVerificationHostFragment.last_state_instance", this.f);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.age_verification_host_fragment, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.f2292a = (i) this.B.a("AgeVerificationHostFragment.sidecar");
        if (this.f2292a == null) {
            String str = this.c;
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            iVar.f(bundle);
            this.f2292a = iVar;
            this.B.a().a(this.f2292a, "AgeVerificationHostFragment.sidecar").b();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        this.f2292a.a(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        this.f2292a.a((v) null);
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        co coVar;
        if (this.f2292a.au <= this.f) {
            FinskyLog.a("Already received state instance %d, ignore.", Integer.valueOf(this.f));
            return;
        }
        this.f = this.f2292a.au;
        switch (this.f2292a.as) {
            case 0:
                i iVar = this.f2292a;
                String str = this.e;
                if (str == null) {
                    iVar.a(4, 0);
                    return;
                }
                iVar.d = new com.google.android.finsky.api.model.h(iVar.f2294a, s.a(str));
                iVar.d.a((x) iVar);
                iVar.d.a((com.android.volley.s) iVar);
                iVar.a(1, 0);
                return;
            case 1:
                if (this.f2293b == null) {
                    this.f2293b = new as();
                }
                a(this.f2293b);
                return;
            case 2:
                a(true);
                return;
            case 3:
                if (this.f2292a.at == 1) {
                    i iVar2 = this.f2292a;
                    if (iVar2.as != 3 || iVar2.at != 1) {
                        throw new IllegalStateException("Invalid state: " + iVar2.as + " with substate: " + iVar2.at);
                    }
                    coVar = iVar2.f2295b.m;
                } else {
                    i iVar3 = this.f2292a;
                    if (iVar3.as != 3 || iVar3.at == 1) {
                        throw new IllegalStateException("Invalid state: " + iVar3.as + " with substate: " + iVar3.at);
                    }
                    String str2 = iVar3.c;
                    Resources resources = f().getResources();
                    cu cuVar = new cu();
                    cuVar.f3699a = resources.getString(R.string.ok);
                    cuVar.e = true;
                    coVar = new co();
                    coVar.f3687a = resources.getString(R.string.error);
                    coVar.c = str2;
                    coVar.e = cuVar;
                }
                a(j.a(this.c, this.d, coVar));
                return;
            case 4:
                i iVar4 = this.f2292a;
                iVar4.f2294a.e(iVar4, iVar4);
                iVar4.a(1, 0);
                return;
            case 5:
                i iVar5 = this.f2292a;
                if (iVar5.as != 5) {
                    throw new IllegalStateException("Invalid state: " + iVar5.as);
                }
                a(a.a(this.c, this.d, iVar5.f2295b.d));
                return;
            case 6:
                i iVar6 = this.f2292a;
                if (iVar6.as != 6) {
                    throw new IllegalStateException("Invalid state: " + iVar6.as);
                }
                a(o.a(this.c, this.d, iVar6.f2295b.e));
                return;
            case 7:
                a(false);
                return;
            default:
                FinskyLog.e("Unexpected state: " + this.f2292a.as, new Object[0]);
                return;
        }
    }

    private void a(Fragment fragment) {
        ap a2 = h().a();
        a2.b(R.id.content_frame, fragment);
        a2.a();
        a2.b();
    }

    private void a(boolean z) {
        if (z) {
            FinskyApp.a().a(this.c).d = false;
        }
        ((h) f()).b(true);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.f
    public final void a(String str, Map<String, String> map) {
        i iVar = this.f2292a;
        iVar.f2294a.b(str, map, iVar, iVar);
        iVar.a(1, 0);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.q
    public final void a(String str) {
        i iVar = this.f2292a;
        iVar.f2294a.j(str, iVar, iVar);
        iVar.a(1, 0);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.q
    public final void a(String str, String str2, String str3) {
        i iVar = this.f2292a;
        iVar.f2294a.a(str, str2, str3, iVar, iVar);
        iVar.a(1, 0);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.k
    public final void a(cn cnVar) {
        i iVar = this.f2292a;
        iVar.f2295b = cnVar;
        if (iVar.f2295b.d != null) {
            iVar.a(5, 0);
        } else {
            if (iVar.f2295b.e != null) {
                iVar.a(6, 0);
                return;
            }
            throw new IllegalStateException("Received unknown challenge.");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.k
    public final void u() {
        ((h) f()).b(false);
    }
}
