package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.protos.di;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class o extends com.google.android.finsky.e.m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private di f2301a;

    /* renamed from: b, reason: collision with root package name */
    private EditText f2302b;
    private View c;
    private PlayActionButton d;
    private PlayActionButton e;

    public static o a(String str, int i, di diVar) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("SmsCodeFragment.backend", i);
        bundle.putParcelable("SmsCodeFragment.challenge", ParcelableProto.a(diVar));
        o oVar = new o();
        oVar.f(bundle);
        return oVar;
    }

    @Override // com.google.android.finsky.e.m, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2301a = (di) ParcelableProto.a(this.r, "SmsCodeFragment.challenge");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.age_verification_sms_code_fragment, viewGroup, false);
        TextView textView = (TextView) this.c.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2301a.f3728a)) {
            textView.setText(this.f2301a.f3728a);
            TextView textView2 = (TextView) this.c.findViewById(R.id.description);
            if (!TextUtils.isEmpty(this.f2301a.c)) {
                textView2.setText(Html.fromHtml(this.f2301a.c));
            } else {
                textView2.setVisibility(8);
            }
            this.f2302b = (EditText) this.c.findViewById(R.id.code_entry);
            if (this.f2301a.e != null) {
                if (!TextUtils.isEmpty(this.f2301a.e.e)) {
                    this.f2302b.setHint(this.f2301a.e.e);
                }
                if (!TextUtils.isEmpty(this.f2301a.e.c)) {
                    this.f2302b.setText(this.f2301a.e.c);
                }
                this.f2302b.addTextChangedListener(new p(this));
                TextView textView3 = (TextView) this.c.findViewById(R.id.error);
                if (!TextUtils.isEmpty(this.f2301a.e.g)) {
                    textView3.setText(this.f2301a.e.g);
                } else {
                    textView3.setVisibility(8);
                }
                int i = this.r.getInt("SmsCodeFragment.backend");
                this.e = (PlayActionButton) this.c.findViewById(R.id.positive_button);
                if (this.f2301a.g != null && !TextUtils.isEmpty(this.f2301a.g.f3699a)) {
                    this.e.a(i, this.f2301a.g.f3699a, this);
                    this.d = (PlayActionButton) this.c.findViewById(R.id.negative_button);
                    if (this.f2301a.f != null && !TextUtils.isEmpty(this.f2301a.f.f3699a)) {
                        this.d.a(i, this.f2301a.f.f3699a, this);
                    } else {
                        this.d.setVisibility(8);
                    }
                    v();
                    return this.c;
                }
                throw new IllegalStateException("No submit button returned.");
            }
            throw new IllegalStateException("No SMS code field returned.");
        }
        throw new IllegalStateException("No title returned");
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.c.getContext(), this.f2301a.f3728a, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.e.setEnabled(!jm.a(this.f2302b.getText()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return 1403;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.d) {
            b(1405);
            w().a(this.f2301a.f.c);
        } else if (view == this.e) {
            b(1408);
            w().a(this.f2301a.g.c, this.f2301a.e.i, this.f2302b.getText().toString());
        }
    }

    private q w() {
        if (this.s instanceof q) {
            return (q) this.s;
        }
        if (this.E instanceof q) {
            return (q) this.E;
        }
        if (f() instanceof q) {
            return (q) f();
        }
        throw new IllegalStateException("No listener registered.");
    }
}
