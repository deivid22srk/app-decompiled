package com.google.android.wallet.instrumentmanager.ui.c;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.analytics.d;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.common.a.o;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.instrumentmanager.ui.b.g;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageTextView;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.as;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.y;
import com.google.b.a.a.a.b.a.a.a.b;
import com.google.b.a.a.a.b.a.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<b> implements e, g, com.google.android.wallet.nfc.b, as, com.google.android.wallet.ui.common.e {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.a.c.b f7339a;
    public RegionCodeView c;
    ImInfoMessageTextView e;
    private int[] g;
    private final f f = new f(1665);

    /* renamed from: b, reason: collision with root package name */
    int f7340b = 0;
    public ArrayList<ai<y>> d = new ArrayList<>();

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai<y>> w() {
        return this.d;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        if (jVar.f7704a.f7650a.equals(((b) this.aw).f7555a)) {
            throw new IllegalArgumentException(new StringBuilder(45).append("Unknown FormFieldMessage fieldId: ").append(jVar.f7704a.f7651b).toString());
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (this.d.get(i).f7482b.a(jVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.y
    public final boolean a(String str, int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.d.get(i2).f7482b.a(str, i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.e == null) {
            return;
        }
        boolean z = this.av;
        if (this.c != null) {
            this.c.setEnabled(z);
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).f7482b.b(z);
        }
        this.e.setEnabled(z);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (!this.d.get(i).f7482b.v()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f7340b = bundle.getInt("selectedRegionCode", 0);
            if (this.f7340b != 0) {
                this.f7339a = i.a(((b) this.aw).e, o.a(this.f7340b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ah ahVar;
        View inflate = layoutInflater.inflate(com.google.android.wallet.instrumentmanager.f.fragment_customer, (ViewGroup) null, false);
        this.e = (ImInfoMessageTextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.customer_legal_message_text);
        this.e.setParentUiNode(this);
        this.e.setUrlClickListener(this);
        if (((b) this.aw).f7556b == null && ((b) this.aw).c == null) {
            a(((b) this.aw).e == null ? null : ((b) this.aw).e.f7610a);
        }
        if (((b) this.aw).f7556b != null) {
            if (bundle == null) {
                if (((b) this.aw).f7556b.f7613b.length <= 0) {
                    throw new IllegalArgumentException("LegalCountrySelector's allowed country codes cannot be empty");
                }
                this.g = com.google.android.wallet.common.a.f.a(com.google.android.wallet.common.a.f.a(((b) this.aw).f7556b.f7613b));
            } else {
                this.g = bundle.getIntArray("regionCodes");
            }
            this.c = (RegionCodeView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.legal_country_selector);
            this.c.setVisibility(0);
            this.c.setRegionCodeSelectedListener(this);
            this.c.setRegionCodes(this.g);
            this.c.setSelectedRegionCode$2563266(o.a(((b) this.aw).f7556b.c));
        }
        if (((b) this.aw).f.length > 0) {
            inflate.findViewById(com.google.android.wallet.instrumentmanager.e.tax_info_fragment_holder).setVisibility(0);
            com.google.android.wallet.ui.c.a aVar = (com.google.android.wallet.ui.c.a) h().a(com.google.android.wallet.instrumentmanager.e.tax_info_fragment_holder);
            if (aVar == null) {
                aVar = com.google.android.wallet.ui.c.a.a(((b) this.aw).f, ((b) this.aw).g, this.aI);
                h().a().a(com.google.android.wallet.instrumentmanager.e.tax_info_fragment_holder, aVar).b();
            }
            this.d.add(new ai<>(0, aVar));
        }
        if (((b) this.aw).c != null) {
            inflate.findViewById(com.google.android.wallet.instrumentmanager.e.legal_address_entry_fragment_holder).setVisibility(0);
            com.google.android.wallet.ui.address.b bVar = (com.google.android.wallet.ui.address.b) h().a(com.google.android.wallet.instrumentmanager.e.legal_address_entry_fragment_holder);
            if (bVar == null) {
                bVar = bj.a(((b) this.aw).c, this.aI);
                h().a().a(com.google.android.wallet.instrumentmanager.e.legal_address_entry_fragment_holder, bVar).b();
            }
            bVar.an = this;
            this.d.add(new ai<>(0, bVar));
        }
        if (((b) this.aw).d != null) {
            inflate.findViewById(com.google.android.wallet.instrumentmanager.e.instrument_form_fragment_holder).setVisibility(0);
            ah ahVar2 = (ah) h().a(com.google.android.wallet.instrumentmanager.e.instrument_form_fragment_holder);
            if (ahVar2 == null) {
                ahVar = com.google.android.wallet.instrumentmanager.b.a.a.a(((b) this.aw).d, this.aI);
                h().a().a(com.google.android.wallet.instrumentmanager.e.instrument_form_fragment_holder, ahVar).b();
                if (ahVar instanceof com.google.android.wallet.instrumentmanager.ui.b.a) {
                    ((com.google.android.wallet.instrumentmanager.ui.b.a) ahVar).f7330b = this;
                }
            } else {
                ahVar = ahVar2;
            }
            this.d.add(new ai<>(0, ahVar));
        }
        u();
        return inflate;
    }

    @Override // com.google.android.wallet.nfc.b
    public final void b(Intent intent) {
        ComponentCallbacks a2 = h().a(com.google.android.wallet.instrumentmanager.e.instrument_form_fragment_holder);
        if (a2 instanceof com.google.android.wallet.nfc.b) {
            ((com.google.android.wallet.nfc.b) a2).b(intent);
        }
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putIntArray("regionCodes", this.g);
        bundle.putInt("selectedRegionCode", this.f7340b);
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        Fragment a2 = h().a(com.google.android.wallet.instrumentmanager.e.instrument_form_fragment_holder);
        if (a2 instanceof com.google.android.wallet.instrumentmanager.ui.b.a) {
            a2.a(i, i2, intent);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g(Bundle bundle) {
        super.g(bundle);
        a(6, Bundle.EMPTY);
    }

    @Override // com.google.android.wallet.ui.common.as
    public final void a(int i, int i2, boolean z) {
        if (this.f7340b != i) {
            this.f7340b = i;
            String a2 = o.a(i);
            if (((b) this.aw).f7556b != null && i2 == this.c.getId() && !((b) this.aw).f7556b.c.equals(a2)) {
                Bundle bundle = new Bundle();
                bundle.putString("FormEventListener.EXTRA_FORM_ID", ((b) this.aw).f7555a);
                bundle.putInt("FormEventListener.EXTRA_FIELD_ID", 1);
                a(3, bundle);
            }
            a(i.a(((b) this.aw).e, a2));
        }
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (view == this.e && this.B.a("tagTosWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagTosWebViewDialog");
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<e> getChildren() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(new d(1668, this));
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            y yVar = this.d.get(i).f7482b;
            if (yVar instanceof e) {
                arrayList.add((e) yVar);
            }
        }
        if (this.f7339a != null) {
            arrayList.add(this.e);
        }
        return arrayList;
    }

    @Override // com.google.android.wallet.instrumentmanager.ui.b.g
    @TargetApi(14)
    public final void a(boolean z, boolean z2, int i, long j) {
        if (z2) {
            if (Build.VERSION.SDK_INT >= 14) {
                this.e.animate().setStartDelay(j);
            }
            if (z) {
                bj.a(this.e, i);
            } else {
                bj.a(this.e, i, 0);
            }
            if (Build.VERSION.SDK_INT >= 14) {
                this.e.animate().setStartDelay(0L);
                return;
            }
            return;
        }
        this.e.setVisibility(z ? 0 : 8);
    }

    @Override // com.google.android.wallet.instrumentmanager.ui.b.g
    @TargetApi(14)
    public final void a(int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            this.e.setTranslationY(i);
            this.e.animate().translationY(0.0f).setStartDelay(150L).start();
            this.e.animate().setStartDelay(0L);
        }
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final boolean z() {
        return (((InfoMessageTextView) this.e).f7455a || ((InfoMessageTextView) this.e).f7456b) ? false : true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void A() {
        this.e.a(true);
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final String B() {
        return this.e.getExpandLabel();
    }

    private void a(com.google.b.a.a.a.b.a.a.c.b bVar) {
        this.f7339a = bVar;
        this.e.setInfoMessage(bVar == null ? null : bVar.f7606a);
        a(6, Bundle.EMPTY);
    }
}
