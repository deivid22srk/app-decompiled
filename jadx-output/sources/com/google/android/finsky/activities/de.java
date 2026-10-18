package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class de extends android.support.v4.app.r {
    private String ai;

    public static de b(int i) {
        de deVar = new de();
        Bundle bundle = new Bundle();
        bundle.putInt("prompt_string_res_id", i);
        deVar.f(bundle);
        return deVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        android.support.v4.app.t f = f();
        Bundle bundle2 = this.r;
        int i = bundle2.getInt("prompt_string_res_id");
        if (bundle == null) {
            bundle = bundle2;
        }
        this.ai = bundle.getString("previous_message");
        View inflate = LayoutInflater.from(f()).inflate(R.layout.flag_item_message, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.flag_message);
        textView.setText(this.ai);
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f);
        aVar.a(i);
        aVar.a(inflate);
        aVar.a(true);
        aVar.a(android.R.string.ok, new df(this, textView));
        aVar.b(android.R.string.cancel, (DialogInterface.OnClickListener) null);
        return aVar.a();
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        android.support.v7.a.ac acVar = (android.support.v7.a.ac) this.f;
        Button button = acVar.f472a.n;
        button.setEnabled(!TextUtils.isEmpty(this.ai));
        ((TextView) acVar.findViewById(R.id.flag_message)).addTextChangedListener(new dg(this, button));
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        if (!TextUtils.isEmpty(this.ai)) {
            bundle.putString("previous_message", this.ai);
        }
    }

    static /* synthetic */ dh a(de deVar) {
        ComponentCallbacks componentCallbacks = deVar.s;
        if (componentCallbacks instanceof dh) {
            return (dh) componentCallbacks;
        }
        android.support.v4.app.c f = deVar.f();
        if (f instanceof dh) {
            return (dh) f;
        }
        return null;
    }
}
