package com.google.android.wallet.instrumentmanager.ui.b;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.ui.card.q;
import com.google.android.wallet.ui.common.ExpDateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bj;
import com.google.b.a.a.a.b.a.a.b.a.p;
import com.google.b.a.a.a.b.a.b.x;
import com.google.b.a.a.a.b.a.b.z;
import com.google.b.a.a.a.b.a.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends ah<p> implements View.OnClickListener, com.google.android.wallet.analytics.e {

    /* renamed from: b, reason: collision with root package name */
    TextView f7338b;
    public ExpDateEditText c;
    public FormEditText d;
    View e;
    private final com.google.android.wallet.analytics.f f = new com.google.android.wallet.analytics.f(1651);

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<ai> f7337a = new ArrayList<>();

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        return this.f7337a;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        if (!jVar.f7704a.f7650a.equals(((p) this.aw).f7587a)) {
            return false;
        }
        switch (jVar.f7704a.f7651b) {
            case 1:
                this.d.setError(jVar.f7705b);
                return true;
            case 2:
                this.c.setError(jVar.f7705b);
                return true;
            case 3:
                this.c.setError(jVar.f7705b);
                return true;
            default:
                throw new IllegalArgumentException(new StringBuilder(45).append("Unknown FormFieldMessage fieldId: ").append(jVar.f7704a.f7651b).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.c == null) {
            return;
        }
        boolean z = this.av;
        this.c.setEnabled(z);
        this.d.setEnabled(z);
        this.e.setEnabled(z);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.wallet.instrumentmanager.f.fragment_credit_card_update, (ViewGroup) null, false);
        this.f7338b = (TextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.credit_card_label);
        this.f7338b.setText(((p) this.aw).c);
        ((ImageWithCaptionView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.card_logo)).a(((p) this.aw).f7588b, com.google.android.wallet.common.util.i.b(f().getApplicationContext()), com.google.android.wallet.a.d.f7228a.b().booleanValue());
        this.c = (ExpDateEditText) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.exp_date);
        this.d = (FormEditText) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.cvc);
        this.f7337a.add(new ai(0, this.c, null));
        this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((p) this.aw).d)});
        this.e = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.cvc_hint);
        this.e.setOnClickListener(this);
        q qVar = new q(this.d, ((p) this.aw).d);
        this.d.a(qVar);
        this.f7337a.add(new ai(0, this.d, null));
        x xVar = new x();
        xVar.d = false;
        xVar.f = f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_exp_date);
        xVar.n = new z();
        xVar.n.f7696a = 2;
        xVar.n.f7697b = new com.google.b.a.a.a.a.d();
        xVar.n.f7697b.f7554b = ((p) this.aw).h;
        xVar.n.f7697b.f7553a = ((p) this.aw).i;
        xVar.n.c = new com.google.b.a.a.a.a.d();
        xVar.n.c.f7554b = ((p) this.aw).j;
        xVar.n.c.f7553a = ((p) this.aw).k;
        bj.a(xVar, this.c);
        this.d.a(qVar, this.d, true);
        u();
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e && this.B.a("CvcInfoDialog") == null) {
            i.b(this.aI).a(this.B, "CvcInfoDialog");
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.f getUiElement() {
        return this.f;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        return null;
    }
}
