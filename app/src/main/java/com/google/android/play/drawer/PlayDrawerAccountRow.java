package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
class PlayDrawerAccountRow extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f6841a;

    /* renamed from: b, reason: collision with root package name */
    TextView f6842b;

    public PlayDrawerAccountRow(Context context) {
        super(context);
    }

    public PlayDrawerAccountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6841a = (FifeImageView) findViewById(com.google.android.play.k.avatar);
        this.f6842b = (TextView) findViewById(com.google.android.play.k.account_name);
    }
}
