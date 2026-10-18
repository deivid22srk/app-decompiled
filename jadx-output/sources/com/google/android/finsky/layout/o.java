package com.google.android.finsky.layout;

import android.location.Location;
import android.view.View;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.jm;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class o implements com.android.volley.s, com.android.volley.t<com.google.android.finsky.placesapi.k>, g {

    /* renamed from: a, reason: collision with root package name */
    String f3289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BillingAddress f3290b;
    private com.google.android.finsky.placesapi.m c;
    private com.android.volley.o d;
    private Location e;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.placesapi.k kVar) {
        com.android.a.a.l lVar;
        com.android.a.a.l lVar2;
        lVar = this.f3290b.n;
        lVar.f1116a.b();
        lVar2 = this.f3290b.n;
        com.android.a.a.a a2 = com.google.android.finsky.billing.u.a(kVar.f3569a);
        View b2 = lVar2.b(com.android.a.a.e.ADDRESS_LINE_1);
        AddressAutoComplete addressAutoComplete = b2 instanceof AddressAutoComplete ? (AddressAutoComplete) b2 : null;
        if (addressAutoComplete != null) {
            addressAutoComplete.a();
        }
        lVar2.a(a2, false);
        if (addressAutoComplete == null) {
            return;
        }
        addressAutoComplete.setSelection(addressAutoComplete.getText().length());
    }

    o(BillingAddress billingAddress, com.google.android.finsky.placesapi.m mVar, com.android.volley.o oVar, Location location) {
        this.f3290b = billingAddress;
        this.c = mVar;
        this.d = oVar;
        this.e = location;
    }

    @Override // com.google.android.finsky.layout.g
    public final List<com.google.android.finsky.placesapi.e> a(CharSequence charSequence) {
        if (charSequence == null || this.f3289a == null) {
            return null;
        }
        com.android.volley.a.ae a2 = com.android.volley.a.ae.a();
        com.google.android.finsky.placesapi.m mVar = this.c;
        String charSequence2 = charSequence.toString();
        Location location = this.e;
        String str = this.f3289a;
        StringBuilder sb = new StringBuilder("/maps/api/place/autocomplete/json?input=");
        sb.append(jm.a(charSequence2.trim()));
        sb.append("&language=").append(mVar.f3572a);
        sb.append("&types=address");
        sb.append("&components=country:").append(str);
        if (location != null) {
            sb.append("&location=").append(location.getLatitude()).append(',').append(location.getLongitude());
            sb.append("&radius=").append(com.google.android.finsky.c.d.cL.b());
        }
        this.d.a(new com.google.android.finsky.placesapi.f(mVar.a(sb), a2, a2));
        try {
            return ((com.google.android.finsky.placesapi.h) a2.get()).f3567a;
        } catch (InterruptedException e) {
            return null;
        } catch (ExecutionException e2) {
            return null;
        }
    }

    @Override // com.google.android.finsky.layout.g
    public final void a(com.google.android.finsky.placesapi.e eVar) {
        com.android.a.a.l lVar;
        com.android.volley.o oVar = this.d;
        com.google.android.finsky.placesapi.m mVar = this.c;
        oVar.a(new com.google.android.finsky.placesapi.i(mVar.a(new StringBuilder("/maps/api/place/details/json?reference=").append(eVar.f3566b).append("&language=").append(mVar.f3572a)), mVar.f3573b, this, this));
        lVar = this.f3290b.n;
        lVar.f1116a.a();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.android.a.a.l lVar;
        lVar = this.f3290b.n;
        lVar.f1116a.b();
    }
}
