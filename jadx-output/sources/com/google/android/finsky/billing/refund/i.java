package com.google.android.finsky.billing.refund;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.protos.qt;
import com.google.android.finsky.utils.ParcelableProtoArray;

/* loaded from: classes.dex */
public final class i extends h implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    RadioGroup f2433b;
    private final ai c = com.google.android.finsky.a.i.a(1154);

    public static i a(String str, String str2, qt[] qtVarArr, String str3, String str4) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("RefundStep.title", str);
        bundle.putString("RefundStep.messageHtml", str2);
        bundle.putParcelable("RefundStep.refundReasons", ParcelableProtoArray.a(qtVarArr));
        bundle.putString("RefundStep.continueButtonLabel", str3);
        bundle.putString("RefundStep.secondaryButtonLabel", str4);
        iVar.f(bundle);
        return iVar;
    }

    @Override // com.google.android.finsky.billing.refund.h, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        String y = y();
        boolean z = !TextUtils.isEmpty(y);
        if (z) {
            TextView textView = (TextView) a2.findViewById(R.id.title);
            textView.setVisibility(0);
            textView.setText(y);
        }
        String z2 = z();
        boolean z3 = !TextUtils.isEmpty(z2);
        if (z3) {
            TextView textView2 = (TextView) a2.findViewById(R.id.message);
            textView2.setVisibility(0);
            textView2.setText(Html.fromHtml(z2));
        }
        qt[] qtVarArr = (qt[]) ParcelableProtoArray.a(this.r, "RefundStep.refundReasons");
        boolean z4 = qtVarArr != null && qtVarArr.length > 0;
        if (z4) {
            a2.findViewById(R.id.reasons_scroll_view).setVisibility(0);
            this.f2433b = (RadioGroup) a2.findViewById(R.id.reasons);
            int length = qtVarArr.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                qt qtVar = qtVarArr[i2];
                RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.refund_survey_radio_button, (ViewGroup) this.f2433b, false);
                int i3 = i + 1;
                radioButton.setId(i);
                radioButton.setTag(qtVar);
                radioButton.setText(qtVar.e);
                radioButton.setOnClickListener(this);
                this.f2433b.addView(radioButton);
                if (bundle == null) {
                    ((e) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).an.b(1155, qtVar.f4310a, this);
                }
                i2++;
                i = i3;
            }
            this.f2433b.setOnCheckedChangeListener(this);
            if (bundle != null) {
                this.f2433b.check(bundle.getInt("RefundStep.selectedRefundReason", -1));
            }
        }
        if (!z && !z3 && !z4) {
            throw new IllegalStateException("No content for view.");
        }
        return a2;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.f2433b != null) {
            bundle.putInt("RefundStep.selectedRefundReason", this.f2433b.getCheckedRadioButtonId());
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        A();
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        String a2 = super.a(resources);
        return !TextUtils.isEmpty(a2) ? a2 : resources.getString(R.string.submit);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        super.u();
        a(1156, (aj) null);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final void R_() {
        super.R_();
        a(1157, (aj) null);
    }

    private void A() {
        if (this.f2433b != null) {
            ((e) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(this.f2433b.getCheckedRadioButtonId() >= 0);
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        A();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = (e) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E);
        eVar.an.a(1155, ((qt) view.getTag()).f4310a, this);
    }
}
