package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.id;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class SubscriptionView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public Document f3093a;

    /* renamed from: b, reason: collision with root package name */
    public el f3094b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public PlayActionButton g;
    public PlayActionButton h;
    public PlayActionButton i;
    public TextView j;
    public View k;
    public View l;
    public final id m;
    public int n;

    public SubscriptionView(Context context) {
        this(context, null);
    }

    public SubscriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = -1;
        this.m = new id();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.subscription_title);
        this.d = (TextView) findViewById(R.id.subscription_price);
        this.e = (TextView) findViewById(R.id.subscription_renewal);
        this.f = (TextView) findViewById(R.id.subscription_status);
        this.g = (PlayActionButton) findViewById(R.id.subscription_cancel_button);
        this.h = (PlayActionButton) findViewById(R.id.cancel_button);
        this.i = (PlayActionButton) findViewById(R.id.my_account_button);
        this.j = (TextView) findViewById(R.id.subscription_description);
        this.k = findViewById(R.id.description_expander);
        this.l = findViewById(R.id.description_collapser);
    }

    public final void a(View view) {
        setNextFocusRightId(view.getId());
        view.setNextFocusLeftId(getId());
    }

    public final void a() {
        this.k.setVisibility(8);
        this.j.setVisibility(0);
        this.l.setVisibility(0);
    }

    public final void b() {
        this.k.setVisibility(0);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
    }
}
