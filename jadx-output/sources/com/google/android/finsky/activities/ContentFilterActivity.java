package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.ButtonBar;

@Deprecated
/* loaded from: classes.dex */
public class ContentFilterActivity extends android.support.v7.a.ae implements com.google.android.finsky.layout.r {
    private RadioGroup k;
    private TextView l;
    private ButtonBar m;
    private com.google.android.finsky.a.i n;
    private com.google.android.finsky.layout.play.ad o = new com.google.android.finsky.layout.play.ad(315);
    private com.google.android.finsky.c.c p;

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.content_filter_activity);
        if (bundle == null) {
            this.p = com.google.android.finsky.c.c.a(this);
        } else {
            this.p = com.google.android.finsky.c.c.a(bundle.getInt("level"));
        }
        this.k = (RadioGroup) findViewById(R.id.level_radiobuttons);
        this.l = (TextView) findViewById(R.id.more_info);
        this.m = (ButtonBar) findViewById(R.id.button_bar);
        this.k.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this);
        a(from, com.google.android.finsky.c.c.EVERYONE, R.id.content_filter_everyone, R.string.content_filter_everyone);
        a(from, com.google.android.finsky.c.c.LOW_MATURITY, R.id.content_filter_low_maturity, R.string.content_filter_low_maturity);
        a(from, com.google.android.finsky.c.c.MEDIUM_MATURITY, R.id.content_filter_medium_maturity, R.string.content_filter_medium_maturity);
        a(from, com.google.android.finsky.c.c.HIGH_MATURITY, R.id.content_filter_high_maturity, R.string.content_filter_high_maturity);
        a(from, com.google.android.finsky.c.c.SHOW_ALL, R.id.content_filter_show_all_apps, R.string.content_filter_show_all_apps);
        this.k.setOnCheckedChangeListener(new az(this));
        this.l.setText(Html.fromHtml(String.format("%s <a href='%s'>%s</a>", getString(R.string.info_about_content_filter), com.google.android.finsky.c.d.A.b(), getString(R.string.more_about_content_filter))));
        this.l.setMovementMethod(LinkMovementMethod.getInstance());
        this.m.setPositiveButtonTitle(R.string.content_filter_ok);
        this.m.setNegativeButtonTitle(R.string.content_filter_cancel);
        this.m.setClickListener(this);
        setResult(0);
        this.n = FinskyApp.a().h();
        if (bundle == null) {
            this.n.a(0L, (com.google.android.finsky.layout.play.cy) this.o);
        }
    }

    private void a(LayoutInflater layoutInflater, com.google.android.finsky.c.c cVar, int i, int i2) {
        RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.radio_button_row, (ViewGroup) this.k, false);
        radioButton.setText(i2);
        radioButton.setTag(cVar);
        radioButton.setFocusable(true);
        radioButton.setChecked(this.p == cVar);
        radioButton.setId(i);
        this.k.addView(radioButton);
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("level", this.p.f);
    }

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case -1:
                return resources.getString(R.string.content_filter_no_rating);
            case 0:
                return resources.getString(R.string.content_filter_everyone);
            case 1:
                return resources.getString(R.string.content_filter_low_maturity);
            case 2:
                return resources.getString(R.string.content_filter_medium_maturity);
            case 3:
                return resources.getString(R.string.content_filter_high_maturity);
            case 4:
                return resources.getString(R.string.content_filter_show_all_apps);
            default:
                return null;
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        this.n.a(254, (byte[]) null, this.o);
        int i = com.google.android.finsky.c.c.a(this).f;
        int i2 = this.p.f;
        if (i != i2) {
            Intent intent = new Intent();
            intent.putExtra("ContentFilterActivity_selectedFilterLevel", i2);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        this.n.a(255, (byte[]) null, this.o);
        finish();
    }
}
