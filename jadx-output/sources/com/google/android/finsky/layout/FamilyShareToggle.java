package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class FamilyShareToggle extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.detailspage.bc f2987a;

    /* renamed from: b, reason: collision with root package name */
    public SwitchCompat f2988b;
    public TextView c;
    public ImageView d;

    public FamilyShareToggle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2988b = (SwitchCompat) findViewById(R.id.switch_button);
        this.c = (TextView) findViewById(R.id.action_text);
        this.d = (ImageView) findViewById(R.id.family_icon);
    }
}
