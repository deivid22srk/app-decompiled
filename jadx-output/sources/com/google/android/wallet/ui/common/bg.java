package com.google.android.wallet.ui.common;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.common.util.ParcelableProto;

/* loaded from: classes.dex */
public final class bg extends c implements DialogInterface.OnClickListener, e {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b(i);
        a(false);
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        Context e = e();
        Intent b2 = bj.b(e, str);
        try {
            e.startActivity(b2);
        } catch (ActivityNotFoundException e2) {
            String valueOf = String.valueOf(b2.toString());
            Log.w("WalletDialogFragment", valueOf.length() != 0 ? "Actvity was not found for intent, ".concat(valueOf) : new String("Actvity was not found for intent, "));
        }
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b(-2);
    }

    private void b(int i) {
        bi biVar = null;
        if (this.s instanceof bi) {
            biVar = (bi) this.s;
        } else if (f() instanceof bi) {
            biVar = (bi) f();
        }
        if (biVar != null) {
            int i2 = this.r.getInt("requestCode");
            this.r.getParcelable("tag");
            biVar.a(i, i2);
        }
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        Bundle bundle2 = this.r;
        a aVar = new a(u());
        aVar.a(bundle2.getString("title"));
        View inflate = v().inflate(com.google.android.wallet.e.h.view_wallet_dialog, (ViewGroup) null);
        com.google.b.a.a.a.b.a.b.r rVar = (com.google.b.a.a.a.b.a.b.r) ParcelableProto.a(bundle2, "infoMessage");
        InfoMessageTextView infoMessageTextView = (InfoMessageTextView) inflate.findViewById(com.google.android.wallet.e.g.info_message);
        infoMessageTextView.setLinkify(bundle2.getBoolean("linkifyMessage", true));
        infoMessageTextView.setInfoMessage(rVar);
        infoMessageTextView.setVisibility(0);
        infoMessageTextView.setUrlClickListener(this);
        TextView textView = (TextView) inflate.findViewById(com.google.android.wallet.e.g.details);
        String string = bundle2.getString("details");
        if (TextUtils.isEmpty(string)) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
        }
        aVar.a(inflate);
        aVar.a(bundle2.getString("positiveButtonText"), this);
        String string2 = bundle2.getString("negativeButtonText");
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2, this);
        }
        return aVar.a();
    }

    static /* synthetic */ bg a(int i, String str, String str2, com.google.b.a.a.a.b.a.b.r rVar, String str3, String str4, String str5, boolean z, Parcelable parcelable, int i2) {
        if (TextUtils.isEmpty(str) || ((TextUtils.isEmpty(str2) && rVar == null) || TextUtils.isEmpty(str4))) {
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = rVar == null ? null : rVar.f7687b;
            objArr[3] = str4;
            throw new IllegalArgumentException(String.format("Title, message, and positive button text are required. Received values: title: %s  message: %s infoMessage: %s posButtonText: %s", objArr));
        }
        if (!TextUtils.isEmpty(str2) && rVar != null) {
            throw new IllegalArgumentException(String.format("Message and InfoMessage may not both be set. Received values: message: %s infoMessage: %s", str2, rVar.f7687b));
        }
        Bundle c = c(i2);
        c.putInt("requestCode", i);
        c.putString("title", str);
        if (rVar == null) {
            rVar = new com.google.b.a.a.a.b.a.b.r();
            rVar.f7687b = str2;
        }
        c.putParcelable("infoMessage", ParcelableProto.a(rVar));
        if (!TextUtils.isEmpty(str3)) {
            c.putString("details", str3);
        }
        c.putString("positiveButtonText", str4);
        if (!TextUtils.isEmpty(str5)) {
            c.putString("negativeButtonText", str5);
        }
        if (parcelable != null) {
            c.putParcelable("tag", parcelable);
        }
        c.putBoolean("linkifyMessage", z);
        bg bgVar = new bg();
        bgVar.f(c);
        return bgVar;
    }
}
