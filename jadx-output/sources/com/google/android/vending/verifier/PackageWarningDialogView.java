package com.google.android.vending.verifier;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.go;

/* loaded from: classes.dex */
public class PackageWarningDialogView extends ScrollView implements View.OnClickListener, go {

    /* renamed from: a, reason: collision with root package name */
    Bundle f7109a;

    /* renamed from: b, reason: collision with root package name */
    private int f7110b;
    private View.OnClickListener c;

    public PackageWarningDialogView(Context context) {
        super(context);
        this.f7109a = new Bundle();
    }

    public PackageWarningDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7109a = new Bundle();
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        String string = bundle.getString("warning_message");
        String string2 = bundle.getString("app_name");
        this.f7110b = bundle.getInt("action");
        TextView textView = (TextView) findViewById(R.id.message);
        TextView textView2 = (TextView) findViewById(R.id.app_name);
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
        }
        if (!TextUtils.isEmpty(string2)) {
            textView2.setText(string2);
        }
        TextView textView3 = (TextView) findViewById(R.id.details_text);
        if (this.f7110b == 2 || this.f7110b == 3) {
            textView3.setText(R.string.package_malware_more_details_excerpt_autoscan);
        } else {
            textView3.setText(R.string.package_malware_more_details_excerpt);
        }
        findViewById(R.id.details_arrow_view).setOnClickListener(new o(this, findViewById(R.id.details_view), (ImageView) findViewById(R.id.details_arrow)));
        if (!(this.f7110b == 0 || this.f7110b == 2)) {
            return;
        }
        TextView textView4 = (TextView) findViewById(R.id.continue_anyway);
        if (this.f7110b == 0) {
            textView4.setText(R.string.package_malware_install_anyway_unsafe);
        } else if (this.f7110b == 2) {
            textView4.setText(R.string.package_malware_dont_warn_unsafe);
        }
        textView4.setVisibility(0);
        textView4.setOnClickListener(this);
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        return this.f7109a;
    }

    public int getAction() {
        return this.f7110b;
    }

    public void setOnContinueAnywayClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f7109a.putBoolean("dont_warn", true);
        if (this.c != null) {
            this.c.onClick(view);
        }
    }
}
