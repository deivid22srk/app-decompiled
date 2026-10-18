package com.google.android.finsky.billing.giftcard.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.lu;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class f extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.billing.giftcard.a> {

    /* renamed from: a, reason: collision with root package name */
    public lu f2215a;

    /* renamed from: b, reason: collision with root package name */
    private ai f2216b = com.google.android.finsky.a.i.a(883);
    private int c;
    private View d;

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2215a = (lu) ParcelableProto.a(this.r, "ConfirmationStep.challenge");
        this.c = this.r.getInt("ui_mode");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = layoutInflater.inflate(this.c == 0 ? R.layout.redeem_confirmation_step : R.layout.setup_wizard_redeem_confirmation_step, viewGroup, false);
        if (this.c == 1) {
            f().setTitle(f_(R.string.setup_wizard_redeem_confirmation_title));
        }
        TextView textView = (TextView) this.d.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2215a.f4099a)) {
            textView.setText(this.f2215a.f4099a);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) this.d.findViewById(R.id.title_byline);
        if (!TextUtils.isEmpty(this.f2215a.c)) {
            textView2.setText(Html.fromHtml(this.f2215a.c));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setLinkTextColor(textView2.getTextColors());
        } else {
            textView2.setVisibility(8);
        }
        FifeImageView fifeImageView = (FifeImageView) this.d.findViewById(R.id.image);
        ds dsVar = this.f2215a.k;
        if (dsVar != null) {
            fifeImageView.setOnLoadedListener(new g(this));
            fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
        } else {
            fifeImageView.setVisibility(8);
        }
        TextView textView3 = (TextView) this.d.findViewById(R.id.price);
        if (!TextUtils.isEmpty(this.f2215a.e)) {
            textView3.setText(this.f2215a.e);
        } else {
            textView3.setVisibility(8);
        }
        TextView textView4 = (TextView) this.d.findViewById(R.id.price_byline);
        if (!TextUtils.isEmpty(this.f2215a.g)) {
            String str = this.f2215a.g;
            textView4.setText(Html.fromHtml(str));
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
            textView4.setLinkTextColor(textView4.getTextColors());
            if (str.startsWith("<strike>") && str.endsWith("</strike>")) {
                textView4.setPaintFlags(textView4.getPaintFlags() | 16);
            }
            textView4.setContentDescription(g().getString(R.string.content_description_full_price, textView4.getText()));
            textView3.setContentDescription(g().getString(R.string.content_description_current_price, textView3.getText()));
        } else {
            textView4.setVisibility(8);
        }
        TextView textView5 = (TextView) this.d.findViewById(R.id.message);
        if (!TextUtils.isEmpty(this.f2215a.l)) {
            textView5.setText(Html.fromHtml(this.f2215a.l));
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
            textView5.setLinkTextColor(textView5.getTextColors());
        } else {
            textView5.setVisibility(8);
        }
        TextView textView6 = (TextView) this.d.findViewById(R.id.voucher_footer);
        if (!TextUtils.isEmpty(this.f2215a.n)) {
            textView6.setText(Html.fromHtml(this.f2215a.n));
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
            textView6.setLinkTextColor(textView6.getTextColors());
        } else {
            textView6.setVisibility(8);
        }
        TextView textView7 = (TextView) this.d.findViewById(R.id.tos_footer);
        if (this.r.getBoolean("ConfirmationStep.code_screen_skipped", false)) {
            textView7.setText(Html.fromHtml(a(R.string.redeem_screen_footer, u.a(com.google.android.finsky.c.d.s.b()))));
            textView7.setMovementMethod(LinkMovementMethod.getInstance());
            textView7.setLinkTextColor(textView7.getTextColors());
        } else {
            textView7.setVisibility(8);
        }
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.d.getContext(), this.c == 1 ? f_(R.string.setup_wizard_redeem_confirmation_title) : this.f2215a.f4099a, this.d);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return this.f2215a.i;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2216b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(884, (aj) null);
        com.google.android.finsky.billing.giftcard.e eVar = ((com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2208b;
        if (eVar.as != 5) {
            FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar.as));
        } else {
            eVar.f2225a.c = true;
            eVar.u();
        }
    }
}
