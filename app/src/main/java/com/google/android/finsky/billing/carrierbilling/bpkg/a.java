package com.google.android.finsky.billing.carrierbilling.bpkg;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.carrierbilling.model.SubscriberInfo;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.epkg.m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public c f2184a;

    /* renamed from: b, reason: collision with root package name */
    public SetupWizardNavBar f2185b;
    public RadioGroup c;
    public int d;
    public Button e;
    public Button f;
    public ImageButton g;
    public String h;

    public static a a(int i, SubscriberInfo subscriberInfo, String str, String str2, String str3, String str4, int i2) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putParcelable("prefill_address", subscriberInfo);
        bundle.putString("prefill_snippet", str2);
        bundle.putString("tos_url", str);
        bundle.putString("carrier_name", str3);
        bundle.putString("authAccount", str4);
        bundle.putInt("ui_mode", i2);
        aVar.f(bundle);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.m
    public final int u() {
        return this.d == 0 ? 843 : 895;
    }

    public void a(View view, String str, String str2) {
        ((TextView) view.findViewById(R.id.billing_information_description)).setText(a(R.string.billing_information_snippet_description, str2));
        ((TextView) view.findViewById(R.id.address_display)).setText(str);
        a((TextView) view.findViewById(R.id.phone_number_display), com.google.android.finsky.billing.k.c());
    }

    public void a(View view, SubscriberInfo subscriberInfo) {
        ((TextView) view.findViewById(R.id.billing_information_description)).setText(f_(R.string.billing_information_description));
        a((TextView) view.findViewById(R.id.phone_number_display), subscriberInfo.f2196b);
    }

    public void b(View view, SubscriberInfo subscriberInfo) {
        ((TextView) view.findViewById(R.id.billing_information_description)).setText(f_(R.string.billing_information_description));
        if (subscriberInfo == null) {
            subscriberInfo = new com.google.android.finsky.billing.carrierbilling.model.b().a();
        }
        com.android.a.a.a a2 = new com.android.a.a.c().g(subscriberInfo.f2195a).e(subscriberInfo.c).f(subscriberInfo.d).c(subscriberInfo.e).b(subscriberInfo.f).d(subscriberInfo.g).a(subscriberInfo.h).a();
        TextView textView = (TextView) view.findViewById(R.id.address_display);
        if (TextUtils.isEmpty(a2.j) && TextUtils.isEmpty(a2.f1056b) && TextUtils.isEmpty(a2.c) && TextUtils.isEmpty(a2.e) && TextUtils.isEmpty(a2.d) && TextUtils.isEmpty(a2.g) && TextUtils.isEmpty(a2.f1055a)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(TextUtils.join("\n", com.android.a.a.l.a(a2, f().getBaseContext())));
        }
        String str = subscriberInfo.f2196b;
        a((TextView) view.findViewById(R.id.phone_number_display), jm.a((CharSequence) str) ? PhoneNumberUtils.formatNumber(com.google.android.finsky.billing.k.c()) : str);
    }

    public static void a(TextView textView, String str) {
        if (!jm.a((CharSequence) str)) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    public static void a(View view, boolean z) {
        int i = z ? 0 : 8;
        view.findViewById(R.id.billing_information_description).setVisibility(i);
        view.findViewById(R.id.address_edit_button).setVisibility(i);
        view.findViewById(R.id.address_display).setVisibility(i);
        view.findViewById(R.id.phone_number_display).setVisibility(i);
    }

    public final void a(boolean z) {
        if (this.f2185b != null || this.e != null) {
            if (this.f2185b != null) {
                this.f2185b.f4642a.setEnabled(z);
                this.f2185b.f4643b.setEnabled(z);
            } else {
                this.e.setEnabled(z);
                this.f.setEnabled(z);
            }
            this.g.setEnabled(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            w();
            return;
        }
        if (view == this.f) {
            v();
        } else if (view == this.g) {
            b(844);
            this.f2184a.a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        b(849);
        this.f2184a.a(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        b(848);
        this.f2184a.a(0);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        Bundle bundle2 = this.r;
        String string = bundle2.getString("tos_url");
        if (!TextUtils.isEmpty(string)) {
            String f_ = f_(R.string.tos_locale_replacement);
            if (!TextUtils.isEmpty(f_)) {
                string = string.replace("%locale%", f_);
            }
            this.h = u.a(string);
        }
        this.d = bundle2.getInt("ui_mode");
        View inflate = layoutInflater.inflate(this.d == 0 ? R.layout.carrier_tos_and_address : R.layout.setup_wizard_carrier_tos_and_address, viewGroup, false);
        this.f2185b = ((com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b) f()).o;
        if (this.f2185b != null) {
            this.c = (RadioGroup) inflate.findViewById(R.id.tos_radio_group);
            this.f2185b.f4642a.setOnClickListener(new b(this));
        } else {
            this.e = (Button) inflate.findViewById(R.id.positive_button);
            this.f = (Button) inflate.findViewById(R.id.negative_button);
            if (this.e instanceof PlayActionButton) {
                ((PlayActionButton) this.e).a(3, R.string.accept, this);
            } else {
                this.e.setOnClickListener(this);
                this.e.setText(R.string.accept);
            }
            if (FinskyApp.a().d(bundle2.getString("authAccount")).a(12603132L)) {
                this.f.setVisibility(8);
            } else if (this.f instanceof PlayActionButton) {
                ((PlayActionButton) this.f).a(0, R.string.decline, this);
            } else {
                this.f.setOnClickListener(this);
                this.f.setText(R.string.decline);
            }
        }
        this.g = (ImageButton) inflate.findViewById(R.id.address_edit_button);
        this.g.setOnClickListener(this);
        int i = bundle2.getInt("type");
        SubscriberInfo subscriberInfo = (SubscriberInfo) bundle2.getParcelable("prefill_address");
        String string2 = bundle2.getString("prefill_snippet");
        String string3 = bundle2.getString("carrier_name");
        String string4 = bundle2.getString("authAccount");
        switch (i) {
            case 0:
                a(inflate, true);
                a(inflate, string2, string3);
                break;
            case 1:
                a(inflate, true);
                a(inflate, string2, string3);
                break;
            case 2:
                a(inflate, true);
                b(inflate, subscriberInfo);
                break;
            case 3:
                a(inflate, true);
                b(inflate, subscriberInfo);
                break;
            case 4:
                a(inflate, true);
                a(inflate, subscriberInfo);
                break;
            case 5:
                a(inflate, true);
                a(inflate, subscriberInfo);
                break;
            case 6:
                a(inflate, false);
                break;
            default:
                FinskyLog.a("Unexpected type " + i, new Object[0]);
                break;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.tos_footer);
        if (this.h != null) {
            textView.setText(Html.fromHtml(a(R.string.dcb_tos_acceptance_footer_html, f_(R.string.accept), this.h, string3)));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setLinkTextColor(textView.getTextColors());
            textView.setVisibility(0);
            if (this.c != null) {
                this.c.setVisibility(0);
            }
        } else {
            textView.setVisibility(8);
            if (this.c != null) {
                this.c.setVisibility(8);
            }
        }
        ((TextView) inflate.findViewById(R.id.addinstrument_introduction)).setText(a(R.string.add_carrier_billing_introduction, string3));
        TextView textView2 = (TextView) inflate.findViewById(R.id.addinstrument_password_info);
        if (TextUtils.isEmpty(string4)) {
            FinskyLog.e("Should have accountName available.", new Object[0]);
        } else if (com.google.android.finsky.cpkg.p.b(string4) == 2) {
            z = false;
        }
        if (z) {
            textView2.setText(R.string.password_protect_off);
        } else {
            textView2.setText(R.string.password_protect_on);
        }
        return inflate;
    }
}
