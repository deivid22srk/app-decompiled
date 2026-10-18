package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.et;
import com.google.android.play.layout.CardLinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MyAccountPaymentMethodsCard extends CardLinearLayout implements View.OnClickListener, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.layout.play.cy f3030a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.finsky.a.i f3031b;
    public View c;
    public View d;
    public View e;
    public View f;
    public View g;
    public ViewGroup h;
    public ViewGroup i;
    public com.google.android.finsky.billing.lightpurchase.billingprofile.a j;
    public com.google.android.finsky.protos.as k;
    public io[] l;
    public List<com.google.android.finsky.billing.lightpurchase.billingprofile.g> m;
    public String n;
    public RecyclerView o;
    public Bundle p;
    private final com.google.android.finsky.a.ai q;
    private TextView r;
    private View s;
    private View t;
    private View u;
    private View v;
    private View w;
    private View x;

    public MyAccountPaymentMethodsCard(Context context) {
        this(context, null);
    }

    public MyAccountPaymentMethodsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = com.google.android.finsky.a.i.a(2620);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.r = (TextView) findViewById(R.id.title);
        this.c = findViewById(R.id.profile);
        this.s = findViewById(R.id.instruments);
        this.t = findViewById(R.id.actions);
        this.d = findViewById(R.id.instruments_switcher);
        this.d.setOnClickListener(this);
        this.u = findViewById(R.id.actions_switcher);
        this.u.setOnClickListener(this);
        this.e = findViewById(R.id.family_instrument_switcher);
        this.f = findViewById(R.id.loading_indicator);
        this.g = findViewById(R.id.error_indicator);
        this.v = findViewById(R.id.edit_footer);
        this.v.setOnClickListener(this);
        this.w = findViewById(R.id.dot_notification);
        this.x = findViewById(R.id.dot_notification_description);
        this.h = (ViewGroup) findViewById(R.id.instruments_container);
        this.i = (ViewGroup) findViewById(R.id.actions_container);
    }

    private void a(View view, View view2, boolean z) {
        view2.setVisibility(0);
        if (z) {
            view2.startAnimation(et.a(getContext(), 250L, (Animation.AnimationListener) null));
            view.startAnimation(et.b(getContext(), 250L, new cj(this, view)));
        } else {
            view.setVisibility(8);
        }
    }

    public final void a(boolean z) {
        this.f3031b.b(2621, null, this);
        this.r.setText(R.string.payment_methods);
        this.w.setVisibility(8);
        this.x.setVisibility(8);
        a(this.t, this.s, z);
        for (io ioVar : this.l) {
            this.f3031b.b(802, ioVar.z, this);
        }
        this.p.putBoolean("PaymentMethodsCard.AddingPaymentMethod", false);
    }

    public final void b(boolean z) {
        if (this.p.getBoolean("PaymentMethodsCard.ShowingAccountCompletionNotification")) {
            b();
        } else if (com.google.android.finsky.utils.av.b()) {
            b();
            com.google.android.finsky.utils.av.d();
            this.p.putBoolean("PaymentMethodsCard.ShowingAccountCompletionNotification", true);
        } else {
            this.r.setText(R.string.add_payment_method);
            this.f3031b.b(2622, null, this);
        }
        a(this.s, this.t, z);
        if (z && this.o != null) {
            RecyclerView recyclerView = this.o;
            if (!recyclerView.g) {
                if (recyclerView.e == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    recyclerView.e.a(recyclerView);
                }
            }
        }
        if (this.m != null) {
            a();
        }
        this.p.putBoolean("PaymentMethodsCard.AddingPaymentMethod", true);
    }

    private void b() {
        this.w.setVisibility(0);
        this.x.setVisibility(0);
        this.r.setText(R.string.my_account_complete_account_title);
        this.f3031b.b(299, null, new com.google.android.finsky.layout.play.ad(2622, this));
    }

    public final void a() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.m.size()) {
                com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar = this.m.get(i2);
                this.f3031b.b(gVar.h, gVar.g, this);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.d) {
            this.f3031b.a(2625, (byte[]) null, this);
            a(true);
            return;
        }
        if (view == this.u) {
            this.f3031b.a(2624, (byte[]) null, this);
            b(true);
        } else if (view == this.v) {
            this.f3031b.a(2623, (byte[]) null, this);
            this.j.w();
        } else if (view == this.e) {
            this.f3031b.a(2629, (byte[]) null, this);
            this.j.a(getFamilyEligibleInstruments());
        }
    }

    private io[] getFamilyEligibleInstruments() {
        ArrayList arrayList = new ArrayList();
        for (io ioVar : this.l) {
            if (ioVar.E) {
                arrayList.add(ioVar);
            }
        }
        return (io[]) arrayList.toArray(new io[arrayList.size()]);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.q;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f3030a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
