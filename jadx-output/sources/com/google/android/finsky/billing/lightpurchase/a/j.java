package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.co;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class j extends com.google.android.finsky.e.m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private co f2296a;

    /* renamed from: b, reason: collision with root package name */
    private View f2297b;
    private PlayActionButton c;
    private PlayActionButton d;

    public static j a(String str, int i, co coVar) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("ChallengeErrorFragment.backend", i);
        bundle.putParcelable("ChallengeErrorFragment.challenge", ParcelableProto.a(coVar));
        j jVar = new j();
        jVar.f(bundle);
        return jVar;
    }

    @Override // com.google.android.finsky.e.m, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2296a = (co) ParcelableProto.a(this.r, "ChallengeErrorFragment.challenge");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2297b = layoutInflater.inflate(R.layout.age_verification_error_fragment, viewGroup, false);
        TextView textView = (TextView) this.f2297b.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2296a.f3687a)) {
            textView.setText(this.f2296a.f3687a);
            TextView textView2 = (TextView) this.f2297b.findViewById(R.id.message);
            if (!TextUtils.isEmpty(this.f2296a.c)) {
                textView2.setText(Html.fromHtml(this.f2296a.c));
            } else {
                textView2.setVisibility(8);
            }
            int i = this.r.getInt("ChallengeErrorFragment.backend");
            this.d = (PlayActionButton) this.f2297b.findViewById(R.id.positive_button);
            if (this.f2296a.e != null && !TextUtils.isEmpty(this.f2296a.e.f3699a)) {
                this.d.a(i, this.f2296a.e.f3699a, this);
                this.c = (PlayActionButton) this.f2297b.findViewById(R.id.negative_button);
                if (this.f2296a.f != null && !TextUtils.isEmpty(this.f2296a.f.f3699a)) {
                    this.c.a(i, this.f2296a.f.f3699a, this);
                } else {
                    this.c.setVisibility(8);
                }
                return this.f2297b;
            }
            throw new IllegalStateException("No submit button returned.");
        }
        throw new IllegalStateException("No title returned.");
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.f2297b.getContext(), this.f2296a.f3687a, this.f2297b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return 1406;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.d) {
            b(1407);
            if (this.f2296a.e.e) {
                v().u();
                return;
            } else {
                if (this.f2296a.e.g.length == 1) {
                    v().a(this.f2296a.e.g[0]);
                    return;
                }
                throw new IllegalStateException("Unexpected submit button action.");
            }
        }
        if (view == this.c) {
            b(1409);
            if (this.f2296a.f.e) {
                v().u();
                return;
            }
            throw new IllegalStateException("Unexpected cancel button action.");
        }
    }

    private k v() {
        if (this.s instanceof k) {
            return (k) this.s;
        }
        if (this.E instanceof k) {
            return (k) this.E;
        }
        if (f() instanceof k) {
            return (k) f();
        }
        throw new IllegalStateException("No listener registered.");
    }
}
