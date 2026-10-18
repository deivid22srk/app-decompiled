package com.google.android.wallet.instrumentmanager.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.a.d;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.instrumentmanager.b;
import com.google.android.wallet.instrumentmanager.e;
import com.google.android.wallet.ui.common.FifeNetworkImageView;

/* loaded from: classes.dex */
public class TopBarView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    FifeNetworkImageView f7343a;

    /* renamed from: b, reason: collision with root package name */
    TextView f7344b;
    private boolean c;

    public TopBarView(Context context) {
        super(context);
        a(context);
    }

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    @TargetApi(11)
    public TopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    @TargetApi(21)
    public TopBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{b.imHideTitleIcon});
        this.c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7344b = (TextView) findViewById(e.title);
        this.f7343a = (FifeNetworkImageView) findViewById(e.title_icon);
    }

    public final void a(CharSequence charSequence, String str, String str2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7344b.setText(charSequence);
            this.f7344b.setVisibility(0);
        } else {
            this.f7344b.setVisibility(8);
        }
        if (!this.c && !TextUtils.isEmpty(str)) {
            this.f7343a.setVisibility(0);
            this.f7343a.setFadeIn(true);
            this.f7343a.a(str, i.b(getContext().getApplicationContext()), d.f7228a.b().booleanValue());
            this.f7343a.setContentDescription(str2);
            return;
        }
        this.f7343a.setVisibility(8);
    }

    public CharSequence getTitle() {
        return this.f7344b.getText();
    }
}
