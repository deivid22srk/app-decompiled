package com.google.android.finsky.activities.b;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.MyAccountFamilyManagementCard;
import com.google.android.finsky.layout.MyAccountNewsstandCard;
import com.google.android.finsky.layout.MyAccountOrderHistoryCard;
import com.google.android.finsky.layout.MyAccountPaymentMethodsCard;
import com.google.android.finsky.layout.MyAccountSubscriptionCard;
import com.google.android.finsky.layout.bz;
import com.google.android.finsky.layout.ce;
import com.google.android.finsky.layout.ci;
import com.google.android.finsky.layout.ck;
import com.google.android.finsky.layout.cr;
import com.google.android.finsky.layout.el;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.hl;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cz;
import com.google.android.play.image.FifeImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends dt {
    int c = -1;
    List<Integer> d;
    int e;
    private final Context f;
    private final com.google.android.finsky.navigationmanager.b g;
    private final com.google.android.play.image.e h;
    private final cr i;
    private final el j;
    private final ce k;
    private final RecyclerView l;
    private final com.google.android.finsky.api.b m;
    private final cy n;
    private final LayoutInflater o;
    private final int p;
    private final int q;
    private final Bundle r;
    private x s;
    private s t;
    private com.google.android.finsky.billing.lightpurchase.billingprofile.a u;

    public a(Context context, com.google.android.finsky.api.b bVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar2, cr crVar, el elVar, ce ceVar, com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar, RecyclerView recyclerView, cy cyVar, Bundle bundle) {
        this.f = context;
        this.m = bVar;
        this.h = eVar;
        this.g = bVar2;
        this.i = crVar;
        this.j = elVar;
        this.k = ceVar;
        this.u = aVar;
        this.l = recyclerView;
        this.n = cyVar;
        this.p = FinskyHeaderListLayout.a(context, 2);
        Resources resources = context.getResources();
        this.q = resources.getDimensionPixelSize(R.dimen.play_card_default_inset) + resources.getDimensionPixelSize(R.dimen.card_list_vpadding);
        this.o = LayoutInflater.from(this.f);
        this.r = bundle;
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        if (this.d == null) {
            return 3;
        }
        return this.d.size() + 3;
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                int i2 = i - 3;
                if (this.d != null && this.d.size() > i2) {
                    return this.d.get(i2).intValue();
                }
                throw new IndexOutOfBoundsException("Invalid position for getItemViewType" + i);
        }
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
            case 1:
                inflate = this.o.inflate(R.layout.play_list_vspacer, viewGroup, false);
                break;
            case 2:
                inflate = this.o.inflate(R.layout.my_account_payment_methods_card, viewGroup, false);
                break;
            case 3:
                inflate = this.o.inflate(R.layout.my_account_order_history_card, viewGroup, false);
                break;
            case 4:
                inflate = this.o.inflate(R.layout.my_account_subscription_card, viewGroup, false);
                break;
            case 5:
                inflate = this.o.inflate(R.layout.my_account_rewards_card, viewGroup, false);
                break;
            case 6:
                inflate = this.o.inflate(R.layout.my_account_newsstand_card, viewGroup, false);
                break;
            case 7:
                inflate = this.o.inflate(R.layout.my_account_family_card, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
        return new cx(inflate);
    }

    public final void c() {
        int indexOf = this.d.indexOf(7);
        if (indexOf >= 0) {
            if (bb.a(this.f, this.m.c())) {
                c(indexOf + 3);
            } else {
                this.d.remove(indexOf);
                e(indexOf + 3);
            }
        }
    }

    public final void a(x xVar) {
        if (this.s != null) {
            d();
        }
        this.s = xVar;
        this.d = new ArrayList();
        if (bb.a(this.f, this.m.c())) {
            this.d.add(7);
        }
        if (this.s.a(1)) {
            this.d.add(4);
            this.t = new s(FinskyApp.a().p.a(this.m.b()));
            if (this.t.f1595a && !bg.aG.a().booleanValue() && com.google.android.finsky.c.d.eU.b().booleanValue()) {
                this.e = this.d.size();
                this.d.add(6);
            }
        }
        if (this.s.a(2)) {
            this.d.add(5);
        }
        if (this.s.a(0)) {
            this.d.add(3);
        }
        if (this.d.size() > 0) {
            this.f774a.a(3, this.d.size());
        }
    }

    public final void d() {
        if (this.s != null) {
            Iterator<y> it = this.s.f1601a.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.s = null;
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        String str;
        com.google.android.finsky.billing.lightpurchase.billingprofile.g a2;
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.p;
                view.setId(R.id.play_header_spacer);
                return;
            case 1:
                view.getLayoutParams().height = this.q;
                return;
            case 2:
                MyAccountPaymentMethodsCard myAccountPaymentMethodsCard = (MyAccountPaymentMethodsCard) view;
                Account b2 = this.m.b();
                com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar = this.u;
                RecyclerView recyclerView = this.l;
                cy cyVar = this.n;
                Bundle bundle = this.r;
                myAccountPaymentMethodsCard.j = aVar;
                myAccountPaymentMethodsCard.k = myAccountPaymentMethodsCard.j.f2322a;
                myAccountPaymentMethodsCard.f3031b = FinskyApp.a().c(b2);
                myAccountPaymentMethodsCard.o = recyclerView;
                myAccountPaymentMethodsCard.f3030a = cyVar;
                myAccountPaymentMethodsCard.p = bundle;
                myAccountPaymentMethodsCard.n = b2.name;
                switch (myAccountPaymentMethodsCard.j.as) {
                    case 0:
                    case 1:
                        myAccountPaymentMethodsCard.c.setVisibility(8);
                        myAccountPaymentMethodsCard.f.setVisibility(0);
                        myAccountPaymentMethodsCard.g.setVisibility(8);
                        myAccountPaymentMethodsCard.p.clear();
                        myAccountPaymentMethodsCard.f3031b.b(213, null, myAccountPaymentMethodsCard);
                        break;
                    case 2:
                    default:
                        myAccountPaymentMethodsCard.setVisibility(0);
                        myAccountPaymentMethodsCard.h.removeAllViews();
                        myAccountPaymentMethodsCard.i.removeAllViews();
                        io[] ioVarArr = myAccountPaymentMethodsCard.k.f3605a;
                        byte[] bArr = myAccountPaymentMethodsCard.k.e;
                        myAccountPaymentMethodsCard.l = ioVarArr;
                        if (myAccountPaymentMethodsCard.l.length == 0) {
                            myAccountPaymentMethodsCard.d.setVisibility(8);
                            myAccountPaymentMethodsCard.b(false);
                        } else {
                            myAccountPaymentMethodsCard.d.setVisibility(0);
                            if (myAccountPaymentMethodsCard.p.getBoolean("PaymentMethodsCard.AddingPaymentMethod")) {
                                myAccountPaymentMethodsCard.b(false);
                            } else {
                                myAccountPaymentMethodsCard.a(false);
                            }
                            io[] ioVarArr2 = myAccountPaymentMethodsCard.l;
                            int length = ioVarArr2.length;
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < length) {
                                io ioVar = ioVarArr2[i3];
                                int i5 = ioVar.E ? i4 + 1 : i4;
                                View inflate = LayoutInflater.from(myAccountPaymentMethodsCard.h.getContext()).inflate(R.layout.payment_methods_row_existing, myAccountPaymentMethodsCard.h, false);
                                FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(R.id.image_icon);
                                ds dsVar = ioVar.e;
                                if (dsVar != null) {
                                    fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
                                } else {
                                    fifeImageView.setVisibility(4);
                                }
                                ((TextView) inflate.findViewById(R.id.title)).setText(ioVar.c);
                                TextView textView = (TextView) inflate.findViewById(R.id.subtitle);
                                if (ioVar.D) {
                                    textView.setText(ioVar.C);
                                    textView.setVisibility(0);
                                }
                                String str2 = ioVar.s.length > 0 ? ioVar.s[0].c : null;
                                if (!TextUtils.isEmpty(str2)) {
                                    TextView textView2 = (TextView) inflate.findViewById(R.id.byline);
                                    textView2.setText(str2);
                                    textView2.setVisibility(0);
                                }
                                byte[] bArr2 = ioVar.v;
                                if (!TextUtils.isEmpty(ioVar.x) && bArr2 != null && bArr2.length > 0) {
                                    TextView textView3 = (TextView) inflate.findViewById(R.id.edit_button);
                                    textView3.setText(ioVar.x.toUpperCase());
                                    inflate.setOnClickListener(new ck(myAccountPaymentMethodsCard, ioVar, bArr2, bArr));
                                    textView3.setVisibility(0);
                                }
                                myAccountPaymentMethodsCard.h.addView(inflate);
                                i3++;
                                i4 = i5;
                            }
                            if (i4 > 1 && bb.c(myAccountPaymentMethodsCard.n)) {
                                myAccountPaymentMethodsCard.e.setVisibility(0);
                                myAccountPaymentMethodsCard.e.setOnClickListener(myAccountPaymentMethodsCard);
                                myAccountPaymentMethodsCard.f3031b.b(2629, null, myAccountPaymentMethodsCard);
                            }
                        }
                        ArrayList a3 = cz.a(myAccountPaymentMethodsCard.k.d.length);
                        android.support.v4.app.t f = myAccountPaymentMethodsCard.j.f();
                        boolean z = f.getPackageManager().checkPermission("android.permission.SEND_SMS", f.getPackageName()) == 0;
                        for (at atVar : myAccountPaymentMethodsCard.k.d) {
                            if ((atVar.f3607a != 2 || z) && (a2 = myAccountPaymentMethodsCard.j.a(atVar, myAccountPaymentMethodsCard.k.e, myAccountPaymentMethodsCard)) != null) {
                                a3.add(a2);
                            }
                        }
                        myAccountPaymentMethodsCard.m = a3;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i7 < myAccountPaymentMethodsCard.m.size()) {
                                com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar = myAccountPaymentMethodsCard.m.get(i7);
                                View inflate2 = LayoutInflater.from(myAccountPaymentMethodsCard.i.getContext()).inflate(R.layout.payment_methods_row_new, myAccountPaymentMethodsCard.i, false);
                                FifeImageView fifeImageView2 = (FifeImageView) inflate2.findViewById(R.id.image_icon);
                                ds dsVar2 = gVar.c;
                                if (dsVar2 != null) {
                                    fifeImageView2.a(dsVar2.f, dsVar2.l, FinskyApp.a().d);
                                } else {
                                    fifeImageView2.setVisibility(4);
                                }
                                ((TextView) inflate2.findViewById(R.id.title)).setText(gVar.f2334a);
                                inflate2.setOnClickListener(gVar.f);
                                myAccountPaymentMethodsCard.i.addView(inflate2);
                                i6 = i7 + 1;
                            } else {
                                if (myAccountPaymentMethodsCard.l.length == 0) {
                                    myAccountPaymentMethodsCard.a();
                                }
                                myAccountPaymentMethodsCard.f.setVisibility(8);
                                if (myAccountPaymentMethodsCard.g != null) {
                                    myAccountPaymentMethodsCard.g.setVisibility(8);
                                }
                                myAccountPaymentMethodsCard.c.setVisibility(0);
                                myAccountPaymentMethodsCard.c.requestFocus();
                                myAccountPaymentMethodsCard.f3031b.a(0L, (cy) myAccountPaymentMethodsCard);
                                break;
                            }
                        }
                        break;
                    case 3:
                        if (myAccountPaymentMethodsCard.j.at == 4) {
                            str = aw.a(myAccountPaymentMethodsCard.getContext(), aVar.c);
                        } else {
                            str = aVar.f2323b;
                        }
                        TextView textView4 = (TextView) myAccountPaymentMethodsCard.g.findViewById(R.id.error_msg);
                        textView4.setMovementMethod(LinkMovementMethod.getInstance());
                        textView4.setText(Html.fromHtml(str));
                        myAccountPaymentMethodsCard.g.findViewById(R.id.retry_button).setOnClickListener(new ci(myAccountPaymentMethodsCard));
                        myAccountPaymentMethodsCard.f.setVisibility(8);
                        myAccountPaymentMethodsCard.c.setVisibility(8);
                        myAccountPaymentMethodsCard.g.setVisibility(0);
                        myAccountPaymentMethodsCard.f3031b.b(2627, null, myAccountPaymentMethodsCard);
                        break;
                }
                bz.setMarginsForCardView(myAccountPaymentMethodsCard);
                return;
            case 3:
                ((MyAccountOrderHistoryCard) view).a(this.s, this.m.b(), FinskyApp.a().g, this.h, this.i, this.g, this.n);
                return;
            case 4:
                ((MyAccountSubscriptionCard) view).a(this.s, this.m.b(), FinskyApp.a().g, this.h, this.j, this.t, this.g, this.n);
                break;
            case 5:
                break;
            case 6:
                MyAccountNewsstandCard myAccountNewsstandCard = (MyAccountNewsstandCard) view;
                b bVar = new b(this, i);
                myAccountNewsstandCard.f3026a.setText(R.string.my_account_newsstand_subscriptions_title);
                myAccountNewsstandCard.f3027b.setText(Html.fromHtml(myAccountNewsstandCard.getResources().getString(R.string.my_account_newsstand_subscriptions_description)));
                myAccountNewsstandCard.f3027b.setMovementMethod(LinkMovementMethod.getInstance());
                myAccountNewsstandCard.c.a(10, R.string.warm_welcome_own_profile_got_it, bVar);
                bz.setMarginsForCardView(myAccountNewsstandCard);
                return;
            case 7:
                MyAccountFamilyManagementCard myAccountFamilyManagementCard = (MyAccountFamilyManagementCard) view;
                hl a4 = bb.a(this.m.c());
                if (a4 == null) {
                    myAccountFamilyManagementCard.setVisibility(8);
                    FinskyLog.e("Updating family view with no family info.", new Object[0]);
                    return;
                }
                ce ceVar = this.k;
                cy cyVar2 = this.n;
                bz.setMarginsForCardView(myAccountFamilyManagementCard);
                myAccountFamilyManagementCard.g = cyVar2;
                myAccountFamilyManagementCard.i = ceVar;
                myAccountFamilyManagementCard.g.a(myAccountFamilyManagementCard);
                if (!myAccountFamilyManagementCard.i.K()) {
                    myAccountFamilyManagementCard.d.setVisibility(0);
                    myAccountFamilyManagementCard.e.setVisibility(8);
                    switch (a4.f3914a) {
                        case 1:
                            myAccountFamilyManagementCard.a(a4.c);
                            return;
                        case 2:
                            myAccountFamilyManagementCard.a(a4.c);
                            return;
                        case 3:
                            myAccountFamilyManagementCard.h = 0;
                            myAccountFamilyManagementCard.f3020a.setText(R.string.create_a_family);
                            myAccountFamilyManagementCard.f3021b.setVisibility(8);
                            myAccountFamilyManagementCard.f.setVisibility(0);
                            myAccountFamilyManagementCard.c.setVisibility(0);
                            return;
                        default:
                            return;
                    }
                }
                myAccountFamilyManagementCard.d.setVisibility(8);
                myAccountFamilyManagementCard.e.setVisibility(0);
                return;
            default:
                throw new IllegalStateException("Unknown type for getView " + i2);
        }
        ((bz) view).a(this.s, this.m.b(), FinskyApp.a().g, this.h, this.g, this.n);
    }
}
