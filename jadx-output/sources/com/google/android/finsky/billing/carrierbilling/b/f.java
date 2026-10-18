package com.google.android.finsky.billing.carrierbilling.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.view.by;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.r;

/* loaded from: classes.dex */
public final class f extends com.google.android.finsky.e.l implements r {
    public g ai;
    private View ak;
    private EditText al;
    private View am;

    public static f a(String str, String str2, String str3) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("password_prompt", str2);
        bundle.putString("password_forgot_url", str3);
        fVar.f(bundle);
        return fVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        View inflate = View.inflate(f(), R.layout.carrier_password, null);
        Bundle bundle2 = this.r;
        String string = bundle2.getString("password_prompt");
        String string2 = bundle2.getString("password_forgot_url");
        this.ak = inflate.findViewById(R.id.carrier_password_main);
        this.am = inflate.findViewById(R.id.loading_indicator);
        this.ak.setVisibility(0);
        this.am.setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.password_prompt);
        TextView textView2 = (TextView) inflate.findViewById(R.id.password_forgot);
        this.al = (EditText) inflate.findViewById(R.id.password_edit);
        ButtonBar buttonBar = (ButtonBar) inflate.findViewById(R.id.button_bar);
        buttonBar.setClickListener(this);
        buttonBar.setPositiveButtonTitle(R.string.buy_no_price);
        by.a(buttonBar, 2, 4, 2, buttonBar.getPaddingBottom());
        if (FinskyApp.a().d(bundle2.getString("authAccount")).a(12603132L)) {
            buttonBar.setNegativeButtonVisible(false);
        }
        textView.setText(string);
        if (TextUtils.isEmpty(string2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(Html.fromHtml("<a href=\"" + string2 + "\">" + f_(R.string.forgot_your_password) + "</a>"));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return new com.google.android.wallet.ui.common.a(f()).a(R.string.enter_your_password_title).a(inflate).a();
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.ai.a(2, null, f().getBaseContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.l
    public final int u() {
        return 820;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        b(821);
        String obj = this.al.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            Toast.makeText(f(), R.string.enter_a_password, 0).show();
        } else {
            this.ai.a(0, obj, f().getBaseContext());
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        b(822);
        this.ai.a(2, null, f().getBaseContext());
    }
}
