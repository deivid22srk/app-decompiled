package com.google.android.finsky.activities.b;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.MyAccountLandingPageRowView;
import com.google.android.finsky.layout.cg;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.av;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends dt {
    final Fragment c;
    final com.google.android.finsky.navigationmanager.b d;
    final Bundle e;
    private final Context f;
    private final cy g;
    private final LayoutInflater h;
    private final int i;
    private final ArrayList<Integer> j = new ArrayList<>();
    private final com.google.android.finsky.a.i k = FinskyApp.a().h();

    public e(Context context, Fragment fragment, com.google.android.finsky.navigationmanager.b bVar, cy cyVar, Bundle bundle) {
        this.f = context;
        this.c = fragment;
        this.d = bVar;
        this.g = cyVar;
        this.e = bundle;
        this.i = FinskyHeaderListLayout.a(context, 2);
        context.getResources();
        this.h = LayoutInflater.from(this.f);
        String j = FinskyApp.a().j();
        boolean a2 = bb.a(context, j);
        boolean z = a2 && bb.b(j);
        this.j.add(0);
        this.j.add(1);
        if (a2) {
            this.j.add(2);
            if (z) {
                this.j.add(3);
            }
        }
        this.j.add(4);
        this.j.add(5);
        this.j.add(6);
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.j.size();
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
                inflate = this.h.inflate(R.layout.play_list_vspacer, viewGroup, false);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                inflate = this.h.inflate(R.layout.my_account_landing_page_row, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
        return new cx(inflate);
    }

    private void a(cg cgVar) {
        String str = "SeenLandingRow_" + String.valueOf(cgVar.j);
        cgVar.g = Boolean.valueOf(this.e.getBoolean(str));
        this.e.putBoolean(str, true);
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        if (i >= this.j.size()) {
            throw new IllegalStateException("Invalid position for getItemViewType" + i);
        }
        return this.j.get(i).intValue();
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.i;
                view.setId(R.id.play_header_spacer);
                return;
            case 1:
                f fVar = new f(this);
                MyAccountLandingPageRowView myAccountLandingPageRowView = (MyAccountLandingPageRowView) view;
                cg cgVar = new cg();
                cgVar.f3186a = R.string.my_account_payment_methods_page_title;
                cgVar.c = R.drawable.ic_credit_card_white_24px;
                cgVar.e = R.color.payment_methods_icon;
                cgVar.d = R.color.play_apps_primary;
                cgVar.j = 2680;
                cgVar.h = fVar;
                cgVar.i = this.g;
                if (av.b()) {
                    this.e.putBoolean("PaymentMethodsNotification", true);
                    av.d();
                }
                cgVar.f = this.e.getBoolean("PaymentMethodsNotification");
                if (av.a()) {
                    cgVar.f3187b = R.string.my_account_payment_methods_row_subtitle;
                }
                a(cgVar);
                myAccountLandingPageRowView.a(cgVar, this.k);
                return;
            case 2:
                g gVar = new g(this, FinskyApp.a().j());
                cg cgVar2 = new cg();
                cgVar2.f3186a = R.string.my_account_family_page_title;
                cgVar2.c = R.drawable.ic_family_white_24px;
                cgVar2.e = R.color.family_icon;
                cgVar2.j = 2681;
                cgVar2.h = gVar;
                cgVar2.i = this.g;
                a(cgVar2);
                ((MyAccountLandingPageRowView) view).a(cgVar2, this.k);
                return;
            case 3:
                h hVar = new h(this);
                cg cgVar3 = new cg();
                cgVar3.f3186a = R.string.my_account_family_library_settings_title;
                cgVar3.c = R.drawable.ic_family_white_24px;
                cgVar3.e = R.color.family_icon;
                cgVar3.j = 0;
                cgVar3.h = hVar;
                cgVar3.i = this.g;
                a(cgVar3);
                ((MyAccountLandingPageRowView) view).a(cgVar3, this.k);
                return;
            case 4:
                i iVar = new i(this);
                cg cgVar4 = new cg();
                cgVar4.f3186a = R.string.my_account_subscriptions_page_title;
                cgVar4.c = R.drawable.ic_repeat_white_24px;
                cgVar4.e = R.color.subscriptions_icon;
                cgVar4.j = 2682;
                cgVar4.h = iVar;
                cgVar4.i = this.g;
                a(cgVar4);
                ((MyAccountLandingPageRowView) view).a(cgVar4, this.k);
                return;
            case 5:
                j jVar = new j(this);
                cg cgVar5 = new cg();
                cgVar5.f3186a = R.string.my_account_rewards_page_title;
                cgVar5.c = R.drawable.ic_reward_white_24px;
                cgVar5.e = R.color.rewards_icon;
                cgVar5.j = 2683;
                cgVar5.h = jVar;
                cgVar5.i = this.g;
                a(cgVar5);
                ((MyAccountLandingPageRowView) view).a(cgVar5, this.k);
                return;
            case 6:
                k kVar = new k(this);
                cg cgVar6 = new cg();
                cgVar6.f3186a = R.string.my_account_order_history_page_title;
                cgVar6.c = R.drawable.ic_history_white_24px;
                cgVar6.e = R.color.order_history_icon;
                cgVar6.j = 2684;
                cgVar6.h = kVar;
                cgVar6.i = this.g;
                a(cgVar6);
                ((MyAccountLandingPageRowView) view).a(cgVar6, this.k);
                return;
            default:
                throw new IllegalStateException("Unknown type for getView " + i2);
        }
    }
}
