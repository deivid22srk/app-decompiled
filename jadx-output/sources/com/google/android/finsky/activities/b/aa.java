package com.google.android.finsky.activities.b;

import android.content.Context;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.MyAccountInlineNotification;
import com.google.android.finsky.layout.MyAccountPaymentMethodsActionRowView;
import com.google.android.finsky.layout.MyAccountPaymentMethodsCreatableInstrumentRowView;
import com.google.android.finsky.layout.MyAccountPaymentMethodsExistingInstrumentRowView;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aa extends dt {
    final com.google.android.finsky.billing.lightpurchase.billingprofile.a c;
    final cy d;
    boolean f;
    int g;
    io[] h;
    private final Context i;
    private final cy j;
    private final int k;
    private final int l;
    private final LayoutInflater m;
    private io[] o;
    private at[] p;
    private boolean q;
    private final ArrayList<Integer> n = new ArrayList<>();
    final com.google.android.finsky.a.i e = FinskyApp.a().h();

    public aa(Context context, com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar, cy cyVar, cy cyVar2) {
        this.i = context;
        this.c = aVar;
        this.d = cyVar;
        this.j = cyVar2;
        this.k = FinskyHeaderListLayout.a(context, 2);
        this.l = this.i.getResources().getDimensionPixelSize(R.dimen.my_account_payment_methods_spacer_height);
        this.m = LayoutInflater.from(this.i);
        this.q = !FinskyApp.a().e().a(12603133L);
    }

    public final void a(io[] ioVarArr) {
        this.o = ioVarArr;
        this.p = null;
        ArrayList arrayList = new ArrayList();
        for (io ioVar : ioVarArr) {
            if (ioVar.E) {
                arrayList.add(ioVar);
            }
        }
        this.h = (io[]) arrayList.toArray(new io[arrayList.size()]);
        c();
        a(1, this.o.length);
        if (this.q) {
            this.n.add(4);
            this.n.add(5);
        }
        if (this.h.length > 1 && bb.c(FinskyApp.a().j())) {
            if (!this.q) {
                this.n.add(4);
            }
            this.n.add(6);
        }
        this.f774a.a();
    }

    public final void a(at[] atVarArr) {
        this.p = atVarArr;
        this.o = null;
        this.h = null;
        c();
        if (this.f) {
            this.n.add(3);
        }
        a(2, this.p.length);
        this.f774a.a();
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.n.size();
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        return this.n.get(i).intValue();
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
                inflate = this.m.inflate(R.layout.play_list_vspacer, viewGroup, false);
                break;
            case 1:
                inflate = this.m.inflate(R.layout.my_account_payment_methods_existing_instrument_row, viewGroup, false);
                break;
            case 2:
                inflate = this.m.inflate(R.layout.my_account_payment_methods_creatable_instrument_row, viewGroup, false);
                break;
            case 3:
                inflate = this.m.inflate(R.layout.my_account_inline_notification, viewGroup, false);
                break;
            case 4:
                inflate = this.m.inflate(R.layout.my_account_payment_methods_spacer, viewGroup, false);
                break;
            case 5:
            case 6:
                inflate = this.m.inflate(R.layout.my_account_payment_methods_action_row, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unknown type for onCreateViewHolder " + i);
        }
        return new cx(inflate);
    }

    private void c() {
        this.n.clear();
        this.n.add(0);
    }

    private void a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.n.add(Integer.valueOf(i));
        }
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.k;
                view.setId(R.id.play_header_spacer);
                return;
            case 1:
                int i3 = (i - this.g) - 1;
                io ioVar = this.o[i3];
                boolean z = this.n.size() == 0 || i3 != this.o.length + (-1);
                com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar = this.c;
                cy cyVar = this.d;
                if (aVar.f2322a == null) {
                    throw new IllegalStateException("Cannot create edit instrument click listener without the billing profile.");
                }
                com.google.android.finsky.billing.lightpurchase.billingprofile.f fVar = (TextUtils.isEmpty(ioVar.x) || ioVar.v == null || ioVar.v.length <= 0) ? null : new com.google.android.finsky.billing.lightpurchase.billingprofile.f(aVar, ioVar, cyVar);
                MyAccountPaymentMethodsExistingInstrumentRowView myAccountPaymentMethodsExistingInstrumentRowView = (MyAccountPaymentMethodsExistingInstrumentRowView) view;
                cy cyVar2 = this.d;
                myAccountPaymentMethodsExistingInstrumentRowView.h = z;
                myAccountPaymentMethodsExistingInstrumentRowView.d.setText(ioVar.c);
                ds dsVar = ioVar.e;
                if (dsVar != null) {
                    myAccountPaymentMethodsExistingInstrumentRowView.c.a(dsVar.f, dsVar.l, FinskyApp.a().d);
                    myAccountPaymentMethodsExistingInstrumentRowView.c.setVisibility(0);
                } else {
                    myAccountPaymentMethodsExistingInstrumentRowView.c.setVisibility(8);
                }
                if (ioVar.D) {
                    myAccountPaymentMethodsExistingInstrumentRowView.e.setText(ioVar.C);
                    myAccountPaymentMethodsExistingInstrumentRowView.e.setVisibility(0);
                } else {
                    myAccountPaymentMethodsExistingInstrumentRowView.e.setVisibility(8);
                }
                String str = ioVar.s.length > 0 ? ioVar.s[0].c : null;
                if (!TextUtils.isEmpty(str)) {
                    myAccountPaymentMethodsExistingInstrumentRowView.f.setText(str);
                    myAccountPaymentMethodsExistingInstrumentRowView.f.setVisibility(0);
                } else {
                    myAccountPaymentMethodsExistingInstrumentRowView.f.setVisibility(8);
                }
                byte[] bArr = ioVar.v;
                if (!TextUtils.isEmpty(ioVar.x) && bArr != null && bArr.length > 0) {
                    myAccountPaymentMethodsExistingInstrumentRowView.g.setText(ioVar.x.toUpperCase());
                    myAccountPaymentMethodsExistingInstrumentRowView.g.setVisibility(0);
                    myAccountPaymentMethodsExistingInstrumentRowView.setOnClickListener(fVar);
                } else {
                    myAccountPaymentMethodsExistingInstrumentRowView.g.setVisibility(8);
                    myAccountPaymentMethodsExistingInstrumentRowView.setOnClickListener(null);
                    myAccountPaymentMethodsExistingInstrumentRowView.setClickable(false);
                }
                com.google.android.finsky.a.i.a(myAccountPaymentMethodsExistingInstrumentRowView.f3034a, ioVar.z);
                myAccountPaymentMethodsExistingInstrumentRowView.f3035b = cyVar2;
                myAccountPaymentMethodsExistingInstrumentRowView.f3035b.a(myAccountPaymentMethodsExistingInstrumentRowView);
                return;
            case 2:
                at atVar = this.p[(i - this.g) - 1];
                com.google.android.finsky.billing.lightpurchase.billingprofile.g a2 = this.c.a(atVar, this.c.f2322a.e, this.j);
                MyAccountPaymentMethodsCreatableInstrumentRowView myAccountPaymentMethodsCreatableInstrumentRowView = (MyAccountPaymentMethodsCreatableInstrumentRowView) view;
                cy cyVar3 = this.j;
                myAccountPaymentMethodsCreatableInstrumentRowView.d.setText(atVar.c);
                ds dsVar2 = atVar.e;
                if (dsVar2 != null) {
                    myAccountPaymentMethodsCreatableInstrumentRowView.c.a(dsVar2.f, dsVar2.l, FinskyApp.a().d);
                    myAccountPaymentMethodsCreatableInstrumentRowView.c.setVisibility(0);
                } else {
                    myAccountPaymentMethodsCreatableInstrumentRowView.c.setVisibility(8);
                }
                myAccountPaymentMethodsCreatableInstrumentRowView.setOnClickListener(a2.f);
                myAccountPaymentMethodsCreatableInstrumentRowView.f3032a.f1453a = a2.h;
                com.google.android.finsky.a.i.a(myAccountPaymentMethodsCreatableInstrumentRowView.f3032a, atVar.f);
                myAccountPaymentMethodsCreatableInstrumentRowView.f3033b = cyVar3;
                myAccountPaymentMethodsCreatableInstrumentRowView.f3033b.a(myAccountPaymentMethodsCreatableInstrumentRowView);
                return;
            case 3:
                ((MyAccountInlineNotification) view).f3022a.setText(R.string.my_account_complete_account_description);
                return;
            case 4:
                view.getLayoutParams().height = this.l;
                return;
            case 5:
                ((MyAccountPaymentMethodsActionRowView) view).a(R.string.more_payment_settings, R.raw.ic_settings_24px, new ab(this), 2623, this.d);
                return;
            case 6:
                ((MyAccountPaymentMethodsActionRowView) view).a(R.string.change_family_instrument, R.raw.ic_family_24px, new ac(this), 2629, this.d);
                return;
            default:
                throw new IllegalStateException("Unknown type for onBindViewHolder " + i2);
        }
    }
}
