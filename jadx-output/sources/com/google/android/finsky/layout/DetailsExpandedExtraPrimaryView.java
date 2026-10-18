package com.google.android.finsky.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class DetailsExpandedExtraPrimaryView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public FifeImageView f2951a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2952b;
    public TextView c;

    public DetailsExpandedExtraPrimaryView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraPrimaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2951a = (FifeImageView) findViewById(R.id.extra_thumbnail);
        this.f2952b = (TextView) findViewById(R.id.extra_title);
        this.c = (TextView) findViewById(R.id.extra_description);
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
