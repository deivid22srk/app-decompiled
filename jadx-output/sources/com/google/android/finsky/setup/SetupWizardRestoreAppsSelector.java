package com.google.android.finsky.setup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.SeparatorLinearLayout;

/* loaded from: classes.dex */
public class SetupWizardRestoreAppsSelector extends SeparatorLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f4646a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f4647b;

    public SetupWizardRestoreAppsSelector(Context context) {
        super(context);
    }

    public SetupWizardRestoreAppsSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f4646a = (TextView) findViewById(R.id.sw_menu_selector_main_text);
        this.f4647b = (TextView) findViewById(R.id.sw_menu_selector_secondary_text);
        a();
    }

    public void setTexts(String str) {
        a(str, "");
    }

    public final void a(String str, String str2) {
        this.f4646a.setText(str);
        this.f4647b.setText(str2);
        a();
    }

    private void a() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f4646a.getText())) {
            sb.append(this.f4646a.getText()).append(", ");
        }
        if (!TextUtils.isEmpty(this.f4647b.getText())) {
            sb.append(this.f4647b.getText()).append(", ");
        }
        sb.append(getResources().getString(R.string.content_description_toggle_selector));
        setContentDescription(sb.toString());
    }
}
