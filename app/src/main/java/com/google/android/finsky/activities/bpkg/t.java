package com.google.android.finsky.activities.bpkg;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.adapters.al;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.OrderHistoryRowView;
import com.google.android.finsky.layout.OrderHistoryRowView2;
import com.google.android.finsky.layout.RewardRowView;
import com.google.android.finsky.layout.RewardRowView2;
import com.google.android.finsky.layout.SubscriptionRowView;
import com.google.android.finsky.layout.SubscriptionRowView2;
import com.google.android.finsky.layout.ch;
import com.google.android.finsky.layout.cr;
import com.google.android.finsky.layout.el;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public final class t extends al {
    public final af c;
    public final ag d;
    public final boolean e;
    com.google.android.finsky.api.model.i f;
    public final Account g;
    public final int h;
    public final int i;
    public final DfeToc j;
    public final s k;
    public final com.google.android.play.image.e l;
    public final el m;
    public final cr n;
    public final cy o;

    public t(Account account, Context context, com.google.android.finsky.api.model.i iVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, cr crVar, el elVar, boolean z, cy cyVar, DfeToc dfeToc) {
        super(context, bVar, iVar.i(), iVar.m);
        this.g = account;
        this.j = dfeToc;
        this.f = iVar;
        this.f.a(this);
        this.h = FinskyHeaderListLayout.a(context, 2);
        Resources resources = context.getResources();
        if (z) {
            this.i = 0;
        } else {
            this.i = resources.getDimensionPixelSize(R.dimen.play_card_default_inset) + resources.getDimensionPixelSize(R.dimen.card_list_vpadding);
        }
        this.k = new s(FinskyApp.a().p.a(account));
        this.c = new af(FinskyApp.a().c(account));
        this.d = new ag(FinskyApp.a().c(account));
        this.l = eVar;
        this.m = elVar;
        this.n = crVar;
        this.e = z;
        this.o = cyVar;
    }

    @Override // com.google.android.finsky.adapters.al
    public final boolean O_() {
        return this.f.m;
    }

    @Override // com.google.android.finsky.adapters.al
    public final void d() {
        this.f.r();
    }

    @Override // com.google.android.finsky.adapters.al
    public final String e() {
        return aw.a(this.t, this.f.h());
    }

    public boolean f(int i) {
        return this.e ? i == this.d.f1572a : i == this.c.f1570a;
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        int p = this.f.p();
        if (p == 0 && this.e) {
            return 0;
        }
        int i = p + 2;
        if (p == 0 && !this.f.m) {
            i++;
        }
        if (v() != 0) {
            return i + 1;
        }
        return i;
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (this.f.p() == 0 && !this.f.m) {
            return 2;
        }
        if (i == a() - 1) {
            if (v() == 1) {
                return 3;
            }
            if (v() == 2) {
                return 4;
            }
        }
        int g = g(i);
        if (this.f.a(g)) {
            Document c = this.f.c(g);
            if (c.av()) {
                return 6;
            }
            if (c.ba()) {
                return 7;
            }
            return 5;
        }
        return -1;
    }

    public static int g(int i) {
        if (i <= 1) {
            return -1;
        }
        return i - 2;
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View h;
        switch (i) {
            case 0:
            case 1:
                h = a(R.layout.play_list_vspacer, viewGroup, false);
                break;
            case 2:
                h = a(R.layout.my_account_no_row, viewGroup, false);
                break;
            case 3:
                h = g(viewGroup);
                break;
            case 4:
                h = h(viewGroup);
                break;
            case 5:
                if (this.e) {
                    h = a(R.layout.order_history_row2, viewGroup, false);
                    break;
                } else {
                    h = a(R.layout.order_history_row, viewGroup, false);
                    break;
                }
            case 6:
                if (this.e) {
                    h = a(R.layout.reward_row2, viewGroup, false);
                    break;
                } else {
                    h = a(R.layout.reward_row, viewGroup, false);
                    break;
                }
            case 7:
                if (this.e) {
                    h = a(R.layout.subscription_row2, viewGroup, false);
                    break;
                } else {
                    h = a(R.layout.subscription_row, viewGroup, false);
                    break;
                }
            default:
                throw new IllegalStateException("Unknown type for onCreateView " + i);
        }
        return new cx(h);
    }

    public void a(ch chVar, int i) {
        ag agVar = this.d;
        if (agVar.f1573b == chVar) {
            agVar.f1573b = null;
        }
        if (i == agVar.f1572a) {
            agVar.f1573b = chVar;
        }
        chVar.setRowPosition(i);
        chVar.setOnClickListener(agVar);
        if (i == agVar.f1572a) {
            chVar.setClickable(false);
        }
        if (!(this.d.f1572a != -1)) {
            ag agVar2 = this.d;
            agVar2.f1573b = chVar;
            agVar2.f1572a = i;
            chVar.d = true;
            chVar.getLayoutParams().height = chVar.f3188a;
            chVar.invalidate();
            chVar.setClickable(false);
        }
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        View view = eqVar.f795a;
        int i2 = eqVar.e;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.h;
                view.setId(R.id.play_header_spacer);
                return;
            case 1:
                view.getLayoutParams().height = this.i;
                return;
            case 2:
                ((TextView) view).setText(R.string.no_order_history);
                return;
            case 3:
                e(view);
                return;
            case 4:
                f(view);
                return;
            case 5:
                if (this.e) {
                    OrderHistoryRowView2 orderHistoryRowView2 = (OrderHistoryRowView2) view;
                    a((ch) orderHistoryRowView2, i);
                    orderHistoryRowView2.a(this.g, this.f.c(g(i)), this.l, f(i), this.n, this.u, this.o);
                    return;
                }
                OrderHistoryRowView orderHistoryRowView = (OrderHistoryRowView) view;
                int g = g(i);
                this.c.a(orderHistoryRowView, i);
                if (!this.c.a()) {
                    this.c.b(orderHistoryRowView, i);
                }
                orderHistoryRowView.a(this.g, this.f.c(g), this.l, this.u, f(i), this.o, i(i), this.n);
                return;
            case 6:
                if (this.e) {
                    RewardRowView2 rewardRowView2 = (RewardRowView2) view;
                    a((ch) rewardRowView2, i);
                    rewardRowView2.a(this.f.c(g(i)), this.l, f(i), this.j, this.u, this.o);
                    return;
                }
                RewardRowView rewardRowView = (RewardRowView) view;
                int g2 = g(i);
                this.c.a(rewardRowView, i);
                if (!this.c.a()) {
                    this.c.b(rewardRowView, i);
                }
                rewardRowView.a(this.f.c(g2), this.l, this.u, f(i), this.o, i(i), this.j);
                return;
            case 7:
                if (this.e) {
                    SubscriptionRowView2 subscriptionRowView2 = (SubscriptionRowView2) view;
                    a((ch) subscriptionRowView2, i);
                    Document c = this.f.c(g(i));
                    subscriptionRowView2.a(c, this.l, f(i), this.k.a(c), this.j, this.m, this.u, this.o);
                    return;
                }
                SubscriptionRowView subscriptionRowView = (SubscriptionRowView) view;
                int g3 = g(i);
                this.c.a(subscriptionRowView, i);
                if (!this.c.a()) {
                    this.c.b(subscriptionRowView, i);
                }
                Document c2 = this.f.c(g3);
                subscriptionRowView.a(c2, this.l, this.u, f(i), this.o, i(i), this.k.a(c2), this.j, this.m);
                return;
            default:
                throw new IllegalStateException("Unknown type for onBindView " + i2);
        }
    }

    public int i(int i) {
        int g = g(i);
        boolean z = g == 0;
        boolean z2 = g == this.f.p() + (-1);
        if (z && z2) {
            return R.drawable.my_account_single_row_background;
        }
        if (z) {
            return R.drawable.my_account_first_row_background;
        }
        if (z2) {
            return R.drawable.my_account_last_row_background;
        }
        return R.color.play_card_light_background;
    }
}
