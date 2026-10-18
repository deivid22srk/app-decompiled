package com.google.android.finsky.utils;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.DfeServerError;

/* loaded from: classes.dex */
public final class al extends com.google.android.finsky.epkg.w implements com.google.android.finsky.activities.gp {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.apkg.ai f4736a = com.google.android.finsky.apkg.i.a(0);

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.api.model.h f4737b;

    public static al a(String str, String str2, String str3, String str4) {
        al alVar = new al();
        alVar.f(str3);
        alVar.a(FinskyApp.a().g, str);
        alVar.b("finsky.DetailsFragment.continueUrl", str2);
        alVar.b("finsky.DetailsFragment.overrideAccount", str3);
        alVar.b("finsky.DetailsShimFragment.originalUrl", str4);
        return alVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        y();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        super.d();
        if (this.f4737b != null) {
            this.f4737b.b((com.google.android.finsky.api.model.x) this);
            this.f4737b.b((com.android.volley.s) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        if (this.f4737b != null) {
            this.f4737b.b((com.google.android.finsky.api.model.x) this);
            this.f4737b.b((com.android.volley.s) this);
        }
        this.f4737b = new com.google.android.finsky.api.model.h(this.aq, this.aA, false, jr.b(FinskyApp.a().p.a(this.aq.b())));
        this.f4737b.a((com.google.android.finsky.api.model.x) this);
        this.f4737b.a((com.android.volley.s) this);
        M();
        N();
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.f4737b.b() == null) {
            this.ao.a(null, this.ap.getString(R.string.details_page_error), true);
        } else {
            this.as.a(this.f4737b.b(), this.aA, this.r.getString("finsky.DetailsFragment.continueUrl"), this.r.getString("finsky.DetailsFragment.overrideAccount"));
        }
    }

    @Override // com.google.android.finsky.epkg.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        super.a(volleyError);
        if ((volleyError instanceof DfeServerError) && ic.b(this.ap)) {
            String g = jm.g("finsky.sw_home_url");
            String authority = Uri.parse(Uri.decode(this.r.getString("finsky.DetailsShimFragment.originalUrl"))).getAuthority();
            if (!TextUtils.isEmpty(g) && TextUtils.equals(authority, "play.google.com")) {
                com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
                gnVar.a(R.string.app_unavailable_message).d(R.string.yes).e(R.string.no).a(true).a(this, 1, null);
                gnVar.b().a(this.B, "DetailsShimFragment.errorDialog");
            }
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            this.as.b(jm.g("finsky.sw_home_url"));
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.f4736a;
    }
}
