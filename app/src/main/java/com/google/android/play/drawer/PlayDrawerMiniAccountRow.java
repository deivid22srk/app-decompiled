package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
class PlayDrawerMiniAccountRow extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    TextView f6845a;

    public PlayDrawerMiniAccountRow(Context context) {
        super(context);
    }

    public PlayDrawerMiniAccountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6845a = (TextView) findViewById(com.google.android.play.k.mini_account_name);
    }
}
