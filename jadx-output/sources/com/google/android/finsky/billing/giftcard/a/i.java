package com.google.android.finsky.billing.giftcard.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class i extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.billing.giftcard.a> {

    /* renamed from: a, reason: collision with root package name */
    public EditText f2219a;

    /* renamed from: b, reason: collision with root package name */
    public String f2220b;
    private int c;
    private ai d = com.google.android.finsky.a.i.a(881);
    private View e;
    private TextView f;

    public static i a(String str, String str2, String str3, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("RedeemCodeActivity.prefill_code", str2);
        bundle.putString("RedeemCodeFragment.error_message_html", str3);
        bundle.putInt("ui_mode", i);
        i iVar = new i();
        iVar.f(bundle);
        return iVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.c = this.r.getInt("ui_mode");
        if (bundle != null) {
            this.f2220b = bundle.getString("RedeemCodeFragment.error_message_html");
        } else {
            this.f2220b = this.r.getString("RedeemCodeFragment.error_message_html");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("RedeemCodeFragment.error_message_html", this.f2220b);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.c == 1) {
            f().setTitle(f_(R.string.redeem_screen_title));
        }
        this.e = layoutInflater.inflate(this.c == 0 ? R.layout.redeem_screen_step : R.layout.setup_wizard_redeem_screen_step, viewGroup, false);
        this.f2219a = (EditText) this.e.findViewById(R.id.pin_entry);
        String string = this.r.getString("RedeemCodeActivity.prefill_code");
        if (bundle == null && !TextUtils.isEmpty(string)) {
            this.f2219a.setText(string);
        }
        ((TextView) this.e.findViewById(R.id.account)).setText(jm.a(this.r.getString("authAccount"), e()));
        String a2 = u.a(com.google.android.finsky.c.d.s.b());
        TextView textView = (TextView) this.e.findViewById(R.id.footer);
        textView.setText(Html.fromHtml(a(R.string.redeem_screen_footer, a2)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(textView.getTextColors());
        this.f2219a.addTextChangedListener(new j(this, this.f2219a.getTextColors()));
        this.f2219a.setOnEditorActionListener(new k(this));
        this.f = (TextView) this.e.findViewById(R.id.error);
        y();
        Q_();
        return this.e;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle == null) {
            ik.a((Activity) f(), this.f2219a);
            if (this.f2220b != null) {
                w();
            }
        }
    }

    public final void w() {
        ik.a((Context) f(), (TextView) this.f2219a);
        ik.a(this.e.getContext(), this.f.getText().toString(), this.e);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.redeem_gift_card_button);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(false);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.d;
    }

    public final void Q_() {
        if (this.e == null) {
            FinskyLog.e("Null mMainView.", new Object[0]);
            return;
        }
        if (this.f2220b != null) {
            this.f.setText(Html.fromHtml(this.f2220b));
            this.f.setVisibility(0);
            this.f.setMovementMethod(LinkMovementMethod.getInstance());
            this.f.setLinkTextColor(this.f.getTextColors());
            this.f2219a.setTextColor(g().getColor(R.color.purchase_flow_error_text_color));
            return;
        }
        this.f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        aj ajVar = null;
        if (z) {
            ajVar = new aj();
            ajVar.f = true;
            ajVar.g = true;
        }
        a(882, ajVar);
        ((com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(this.f2219a.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        ((com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(!TextUtils.isEmpty(this.f2219a.getText()));
    }
}
