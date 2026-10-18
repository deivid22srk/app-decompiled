package com.google.android.finsky.activities;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.CheckBox;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.protos.jm;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ig;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
public class TosActivity extends android.support.v7.a.ae implements com.google.android.finsky.layout.r {
    private String k = null;
    private DfeToc l = null;
    private CheckBox m;
    private ButtonBar n;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        jm h;
        Boolean bool = null;
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle != null) {
            this.k = bundle.getString("finsky.TosActivity.account");
            this.l = (DfeToc) bundle.getParcelable("finsky.TosActivity.toc");
        }
        if (this.k == null || this.l == null) {
            FinskyLog.c("Bad request to Terms of Service activity.", new Object[0]);
            finish();
            return;
        }
        if (!TextUtils.isEmpty(this.l.f1961a.f) && (h = jb.h(this.k)) != null) {
            bool = Boolean.valueOf(h.f3999a);
        }
        setContentView(R.layout.terms_of_service);
        this.n = (ButtonBar) findViewById(R.id.button_bar);
        this.n.setPositiveButtonTitle(R.string.accept);
        this.n.setNegativeButtonTitle(R.string.decline);
        this.n.setClickListener(this);
        ((TextView) findViewById(R.id.account_name)).setText(com.google.android.finsky.utils.jm.a(this.k, getApplicationContext()));
        TextView textView = (TextView) findViewById(R.id.content);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(this.l.f1961a.d));
        this.m = (CheckBox) findViewById(R.id.email_opt_in);
        String str = this.l.f1961a.f;
        if (TextUtils.isEmpty(str) || bool == null) {
            this.m.setVisibility(8);
            return;
        }
        this.m.setText(str);
        this.m.setChecked(bool.booleanValue());
        this.m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("finsky.TosActivity.account", this.k);
        bundle.putParcelable("finsky.TosActivity.toc", this.l);
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        Boolean bool = null;
        if (this.m.getVisibility() == 0) {
            bool = Boolean.valueOf(this.m.isChecked());
        }
        ig.a(this.k, this.l, bool);
        setResult(-1);
        finish();
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
