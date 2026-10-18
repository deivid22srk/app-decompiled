package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.AccessibleLinearLayout;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public class SecondaryActionsModuleLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    static final NumberFormat f2510a = NumberFormat.getIntegerInstance();

    /* renamed from: b, reason: collision with root package name */
    AccessibleLinearLayout f2511b;
    ImageView c;
    AccessibleLinearLayout d;
    AccessibleLinearLayout e;
    TextView f;
    dy g;

    public SecondaryActionsModuleLayout(Context context) {
        this(context, null);
    }

    public SecondaryActionsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2511b = (AccessibleLinearLayout) findViewById(R.id.wishlist_button);
        this.c = (ImageView) findViewById(R.id.wishlist_button_icon);
        this.d = (AccessibleLinearLayout) findViewById(R.id.share_button);
        this.e = (AccessibleLinearLayout) findViewById(R.id.plus_one_button);
        this.f = (TextView) findViewById(R.id.plus_one_button_icon);
        this.f2511b.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.g != null) {
            if (view == this.f2511b) {
                this.g.c(view);
            }
            if (view == this.d) {
                this.g.a();
            }
            if (view == this.e) {
                this.g.d(view);
            }
        }
    }
}
