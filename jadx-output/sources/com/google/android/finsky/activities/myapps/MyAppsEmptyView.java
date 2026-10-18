package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.AccountSelectorView;

/* loaded from: classes.dex */
public class MyAppsEmptyView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    AccountSelectorView f1800a;

    /* renamed from: b, reason: collision with root package name */
    TextView f1801b;
    View c;
    View d;

    public MyAppsEmptyView(Context context) {
        super(context);
    }

    public MyAppsEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f1800a = (AccountSelectorView) findViewById(R.id.account_name);
        this.f1801b = (TextView) findViewById(R.id.empty_myapps_textview);
        this.c = findViewById(R.id.myapps_browse_apps);
        this.d = findViewById(R.id.myapps_browse_games);
    }
}
