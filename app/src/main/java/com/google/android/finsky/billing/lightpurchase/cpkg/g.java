package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.bq;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.billing.an;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.protos.lz;
import com.google.android.finsky.protos.mc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class g extends com.google.android.finsky.billing.lightpurchase.bpkg.f<PurchaseFragment> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, cy {

    /* renamed from: a, reason: collision with root package name */
    public int f2353a;
    public CheckBox ai;
    public View aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public GiftEmailParams an;
    public com.google.android.finsky.apkg.i ao;
    public final ai ap = com.google.android.finsky.apkg.i.a(710);

    /* renamed from: b, reason: collision with root package name */
    public mc f2354b;
    public View c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public View i;

    public static g a(int i, mc mcVar, boolean z, boolean z2, GiftEmailParams giftEmailParams) {
        Bundle bundle = new Bundle();
        g gVar = new g();
        bundle.putInt("CartDetailsStep.backend", i);
        bundle.putParcelable("CartDetailsStep.cart", ParcelableProto.a(mcVar));
        bundle.putBoolean("CartDetailsStep.continueToInstrumentManager", z);
        bundle.putBoolean("CartDetailsStep.expandedAtStart", z2);
        bundle.putParcelable("CartDetailsStep.giftEmailParams", giftEmailParams);
        gVar.f(bundle);
        gVar.f2354b = mcVar;
        return gVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        return this.f2354b.v;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.f2353a = bundle2.getInt("CartDetailsStep.backend");
        this.f2354b = (mc) ParcelableProto.a(bundle2, "CartDetailsStep.cart");
        this.am = bundle2.getBoolean("CartDetailsStep.continueToInstrumentManager");
        if (bundle == null) {
            this.ak = bundle2.getBoolean("CartDetailsStep.expandedAtStart");
        } else {
            this.ak = bundle.getBoolean("CartDetailsStep.expanded");
        }
        this.an = (GiftEmailParams) bundle2.getParcelable("CartDetailsStep.giftEmailParams");
        this.ao = FinskyApp.a().c(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).i);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("CartDetailsStep.expanded", this.ak);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lz lzVar;
        ColorStateList c = com.google.android.finsky.utils.ai.c(f(), this.f2353a);
        int defaultColor = c.getDefaultColor();
        com.google.android.finsky.dpkg.d d = FinskyApp.a().d(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).i.name);
        View inflate = layoutInflater.inflate(R.layout.light_purchase_cart, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.item_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.item_subtitle);
        this.g = (TextView) inflate.findViewById(R.id.item_price);
        this.h = (TextView) inflate.findViewById(R.id.instrument);
        TextView textView3 = (TextView) inflate.findViewById(R.id.instrument_setup_message);
        TextView textView4 = (TextView) inflate.findViewById(R.id.account);
        textView4.setVisibility(0);
        textView4.setText(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).i.name);
        this.d = inflate.findViewById(R.id.purchase_details);
        TextView textView5 = (TextView) inflate.findViewById(R.id.footer);
        this.e = (TextView) inflate.findViewById(R.id.payment_settings);
        this.e.setOnClickListener(this);
        this.e.setTextColor(defaultColor);
        View findViewById = inflate.findViewById(R.id.redeem_separator);
        this.f = (TextView) inflate.findViewById(R.id.redeem);
        this.f.setOnClickListener(this);
        this.f.setTextColor(defaultColor);
        this.c = inflate.findViewById(R.id.header);
        textView.setText(this.f2354b.f4115a);
        if (this.f2354b.d) {
            textView2.setText(this.f2354b.c);
            textView2.setVisibility(0);
        }
        this.g.setText(this.f2354b.e);
        this.g.setTextColor(c);
        TextView textView6 = (TextView) inflate.findViewById(R.id.price_byline);
        if (d.a(12603787L)) {
            if (this.f2354b.j) {
                textView6.setText(this.f2354b.i);
                textView6.setVisibility(0);
            } else {
                textView6.setVisibility(8);
            }
            if (this.f2354b.l) {
                TextView textView7 = (TextView) inflate.findViewById(R.id.price_byline_2);
                textView7.setText(this.f2354b.k);
                textView7.setVisibility(0);
            }
        } else if (this.f2354b.j) {
            textView6.setText(this.f2354b.i);
            textView6.setTextColor(c);
            textView6.setVisibility(0);
        } else {
            textView6.setVisibility(8);
        }
        io ioVar = this.f2354b.o;
        if (ioVar != null) {
            this.h.setText(ioVar.c);
            this.h.setVisibility(0);
            if (ioVar.s.length > 0) {
                TextView textView8 = (TextView) inflate.findViewById(R.id.instrument_error_message);
                textView8.setText(Html.fromHtml(ioVar.s[0].c));
                textView8.setMovementMethod(LinkMovementMethod.getInstance());
                textView8.setVisibility(0);
            } else {
                a(layoutInflater, (ViewGroup) inflate.findViewById(R.id.extended_detail_messages), R.layout.light_purchase_cart_extended_detail_message, this.f2354b.q, defaultColor);
                textView4.setText(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).i.name);
                this.al = !this.am;
            }
        } else {
            this.h.setVisibility(8);
            textView3.setText(com.google.android.finsky.billing.u.a(this.f2354b.t, defaultColor));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setVisibility(0);
        }
        a(layoutInflater, (ViewGroup) inflate.findViewById(R.id.detail_messages), R.layout.light_purchase_cart_detail_message, this.f2354b.p, defaultColor);
        if (this.f2354b.s) {
            textView5.setVisibility(0);
            textView5.setText(com.google.android.finsky.billing.u.a(this.f2354b.r, defaultColor));
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
            textView5.setLinkTextColor(textView5.getTextColors());
        } else {
            textView5.setVisibility(8);
        }
        if (this.f2354b.C != null) {
            this.ai = (CheckBox) inflate.findViewById(R.id.split_tender_checkbox);
            this.ai.setText(this.f2354b.C.f4144a);
            this.ai.setChecked(this.f2354b.C.c);
            this.ai.setOnCheckedChangeListener(this);
            this.ai.setVisibility(0);
        }
        if (this.f2354b.A != null && this.f2354b.A.length > 0) {
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.vouchers);
            viewGroup2.setVisibility(0);
            lz lzVar2 = null;
            lz[] lzVarArr = this.f2354b.A;
            int length = lzVarArr.length;
            int i = 0;
            while (i < length) {
                lz lzVar3 = lzVarArr[i];
                View inflate2 = layoutInflater.inflate(R.layout.light_purchase_cart_voucher_entry, viewGroup2, false);
                TextView textView9 = (TextView) inflate2.findViewById(R.id.title);
                textView9.setText(lzVar3.f4107a.i);
                if (lzVar3.d) {
                    if (lzVar2 != null) {
                        throw new IllegalArgumentException("Multiple applied vouchers is not supported");
                    }
                    textView9.setTypeface(textView9.getTypeface(), 1);
                    inflate2.findViewById(R.id.checkmark).setVisibility(0);
                    inflate2.setOnClickListener(new h(this));
                    lzVar = lzVar3;
                } else {
                    inflate2.setOnClickListener(new i(this, lzVar3.f4107a.f3890a));
                    lzVar = lzVar2;
                }
                viewGroup2.addView(inflate2);
                i++;
                lzVar2 = lzVar;
            }
            TextView textView10 = (TextView) inflate.findViewById(R.id.voucher_header);
            textView10.setVisibility(0);
            textView10.setTextColor(defaultColor);
            textView10.setText(lzVar2 == null ? R.string.voucher_section_none_selected : R.string.voucher_section_has_selected);
            inflate.findViewById(R.id.voucher_separator).setVisibility(0);
            if (lzVar2 != null) {
                this.i = inflate.findViewById(R.id.selected_voucher_container);
                this.i.setVisibility(0);
                this.i.setOnClickListener(this);
                ((TextView) this.i.findViewById(R.id.selected_voucher_title)).setText(lzVar2.f4107a.i);
                TextView textView11 = (TextView) this.i.findViewById(R.id.selected_voucher_discount_price);
                if (TextUtils.isEmpty(lzVar2.f4108b)) {
                    textView11.setVisibility(8);
                } else {
                    textView11.setText(a(R.string.cart_discounted_price, lzVar2.f4108b));
                }
                if (!TextUtils.isEmpty(lzVar2.f)) {
                    textView11.setContentDescription(lzVar2.f);
                }
                TextView textView12 = (TextView) this.i.findViewById(R.id.selected_voucher_original_price);
                if (TextUtils.isEmpty(this.f2354b.g)) {
                    textView12.setVisibility(8);
                } else {
                    textView12.setText(a(R.string.cart_original_price, this.f2354b.g));
                }
            }
        }
        if (this.an != null) {
            ((TextView) inflate.findViewById(R.id.gift_to_email)).setText(a(R.string.to_email_output, this.an.f2276b));
            ((TextView) inflate.findViewById(R.id.gift_from_name)).setText(a(R.string.from_name_output, this.an.f2275a));
            TextView textView13 = (TextView) inflate.findViewById(R.id.gift_message);
            if (!TextUtils.isEmpty(this.an.c)) {
                textView13.setText(a(R.string.message_output, this.an.c));
                textView13.setVisibility(0);
            }
            this.aj = inflate.findViewById(R.id.gift_contents);
        }
        boolean z = true;
        if (d.a(12603124L)) {
            if (ioVar != null && ioVar.s.length == 0) {
                findViewById.setVisibility(8);
                this.f.setVisibility(8);
            } else {
                z = false;
            }
        }
        if (z) {
            this.c.setOnClickListener(this);
            y();
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.c.getContext(), a(R.string.purchase_flow_start_description, this.f2354b.f4115a, a(R.string.content_description_current_price, this.f2354b.e)), this.c);
        if (this.i != null) {
            ik.a(this.i.getContext(), ((TextView) this.i.findViewById(R.id.selected_voucher_title)).getText(), this.i);
        }
    }

    public static void a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, String[] strArr, int i2) {
        for (String str : strArr) {
            TextView textView = (TextView) layoutInflater.inflate(i, viewGroup, false);
            textView.setText(com.google.android.finsky.billing.u.a(str, i2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setLinkTextColor(textView.getTextColors());
            viewGroup.addView(textView);
        }
        viewGroup.setVisibility(strArr.length > 0 ? 0 : 8);
    }

    public void y() {
        int i;
        this.d.setVisibility(this.ak ? 0 : 8);
        if (FinskyApp.a().d(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).i.name).a(12605524L) && this.h.getVisibility() == 0) {
            bq.a(this.h, this.ak ? R.drawable.ic_expand_less_18px : R.drawable.ic_expand_more_18px);
        } else {
            if (this.ak) {
                switch (this.f2353a) {
                    case 1:
                        i = R.drawable.ic_menu_expander_books_maximized_light;
                        break;
                    case 2:
                        i = R.drawable.ic_menu_expander_music_maximized_light;
                        break;
                    case 3:
                        if (!com.google.android.finsky.utils.ai.a()) {
                            i = R.drawable.ic_menu_expander_apps_maximized_light;
                            break;
                        } else {
                            i = R.drawable.ic_menu_expander_apps_ent_maximized_light;
                            break;
                        }
                    case 4:
                        i = R.drawable.ic_menu_expander_movies_maximized_light;
                        break;
                    case 5:
                    default:
                        if (!com.google.android.finsky.utils.ai.a()) {
                            i = R.drawable.ic_menu_expander_maximized_holo_light;
                            break;
                        } else {
                            i = R.drawable.ic_menu_expander_apps_ent_maximized_light;
                            break;
                        }
                    case 6:
                        i = R.drawable.ic_menu_expander_newsstand_maximized_light;
                        break;
                }
            } else {
                switch (this.f2353a) {
                    case 1:
                        i = R.drawable.ic_menu_expander_books_minimized_light;
                        break;
                    case 2:
                        i = R.drawable.ic_menu_expander_music_minimized_light;
                        break;
                    case 3:
                        if (!com.google.android.finsky.utils.ai.a()) {
                            i = R.drawable.ic_menu_expander_apps_minimized_light;
                            break;
                        } else {
                            i = R.drawable.ic_menu_expander_apps_ent_minimized_light;
                            break;
                        }
                    case 4:
                        i = R.drawable.ic_menu_expander_movies_minimized_light;
                        break;
                    case 5:
                    default:
                        if (!com.google.android.finsky.utils.ai.a()) {
                            i = R.drawable.ic_menu_expander_minimized_holo_light;
                            break;
                        } else {
                            i = R.drawable.ic_menu_expander_apps_ent_minimized_light;
                            break;
                        }
                    case 6:
                        i = R.drawable.ic_menu_expander_newsstand_minimized_light;
                        break;
                }
            }
            bq.a(this.g, i);
        }
        if (this.i != null) {
            this.i.setVisibility(this.ak ? 8 : 0);
        }
        if (this.aj != null) {
            this.aj.setVisibility(this.ak ? 8 : 0);
        }
        this.g.setContentDescription(a(this.ak ? R.string.content_description_current_price_toggle_collapse : R.string.content_description_current_price_toggle_expand, this.f2354b.e));
    }

    public void z() {
        this.ak = !this.ak;
        if (this.ak) {
            this.ao.b(715, null, this);
        }
        y();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.c) {
            if (view != this.e) {
                if (view != this.f) {
                    if (view != this.i) {
                        return;
                    }
                    a(717, (aj) null);
                    ik.a(view.getContext(), f_(R.string.voucher_section_has_selected), view);
                    z();
                    return;
                }
                a(716, (aj) null);
                PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
                purchaseFragment.a(RedeemCodeActivity.a(purchaseFragment.i.name, purchaseFragment.f2278b.f2281a.e, purchaseFragment.f2278b.f2281a, purchaseFragment.f2278b.d), 3);
                return;
            }
            a(714, (aj) null);
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((as) null);
            return;
        }
        a(713, (aj) null);
        if (!((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).f2277a.e) {
            ik.a(view.getContext(), f_(R.string.payment_methods), view);
            z();
        } else {
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).f2277a.i = true;
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((an) null, (Boolean) null);
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        if (!this.am) {
            if (this.al) {
                a(711, (aj) null);
                PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
                if (purchaseFragment.f2278b.f2281a.c == 1) {
                    FinskyApp.a().e(purchaseFragment.i.name).b(purchaseFragment.f2278b.f2282b);
                }
                purchaseFragment.u();
                return;
            }
            a(712, (aj) null);
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((as) null);
            return;
        }
        a(712, (aj) null);
        com.google.android.finsky.billing.lightpurchase.e eVar = ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).f2277a;
        if (eVar.as != 6) {
            FinskyLog.e("switchToInstrumentManager() called in state %d", Integer.valueOf(eVar.as));
        }
        eVar.a(9, 0);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.ai) {
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((an) null, Boolean.valueOf(z));
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.ap;
    }

    public static /* synthetic */ com.google.android.finsky.billing.lightpurchase.bpkg.a b(g gVar) {
        return (com.google.android.finsky.billing.lightpurchase.bpkg.a) gVar.E;
    }

    public static /* synthetic */ com.google.android.finsky.billing.lightpurchase.bpkg.a c(g gVar) {
        return (com.google.android.finsky.billing.lightpurchase.bpkg.a) gVar.E;
    }
}
