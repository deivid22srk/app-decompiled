package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class WarningMessageModuleLayout extends LinearLayout implements bp, bq, com.google.android.finsky.layout.am, com.google.android.finsky.layout.an {

    /* renamed from: a, reason: collision with root package name */
    TextView f2526a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f2527b;
    boolean c;

    public WarningMessageModuleLayout(Context context) {
        super(context);
    }

    public WarningMessageModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2526a = (TextView) findViewById(R.id.warning_message);
        this.f2527b = (ImageView) findViewById(R.id.warning_message_icon);
    }
}
