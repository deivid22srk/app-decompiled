package com.google.android.finsky.layout;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kc;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class SubscriptionRowView extends cl {
    private boolean e;
    private boolean f;
    private boolean g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private FifeImageView l;
    private PlayActionButton q;

    public SubscriptionRowView(Context context) {
        this(context, null);
    }

    public SubscriptionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2642);
    }

    @Override // com.google.android.finsky.layout.cl, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView) findViewById(R.id.price);
        this.i = (TextView) findViewById(R.id.status);
        this.j = (TextView) findViewById(R.id.subscription_details);
        this.l = (FifeImageView) findViewById(R.id.title_byline_icon);
        this.k = (TextView) findViewById(R.id.subscription_instrument_declined);
        this.q = (PlayActionButton) findViewById(R.id.action_button);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (animation == this.c) {
            this.k.setVisibility(8);
            this.q.setVisibility(8);
            this.l.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f3196b) {
            if (this.e) {
                a(this.q);
            }
            if (this.f) {
                a(this.k);
            }
            if (this.g) {
                a(this.l);
            }
        }
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, boolean z, com.google.android.finsky.layout.play.cy cyVar, int i, com.google.android.finsky.g.aq aqVar, DfeToc dfeToc, el elVar) {
        kc aZ = document.aZ();
        super.a(document, aZ.c, eVar, z, cyVar, i, bVar);
        if (aZ.h) {
            this.h.setText(aZ.g);
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(4);
        }
        if (aZ.f4026b) {
            this.j.setText(Html.fromHtml(aZ.f4025a));
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        if (aZ.j) {
            this.i.setText(Html.fromHtml(aZ.i));
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
        if (aZ.k != null) {
            this.g = true;
            this.l.setVisibility(z ? 0 : 8);
            this.l.a(aZ.k.f, aZ.k.l, eVar);
        } else {
            this.l.setVisibility(8);
        }
        this.e = true;
        this.q.setVisibility(z ? 0 : 8);
        if (aZ.m && aZ.l && aqVar != null && aqVar.a() != 3) {
            this.q.a(10, R.string.cancel_subscription, new ee(this, elVar, document, aqVar));
        } else if (aZ.n != null) {
            this.q.a(10, R.string.payment_declined_get_help, new ef(this, bVar, aZ, dfeToc));
            this.f = true;
            this.k.setText(R.string.payment_declined);
            this.k.setVisibility(z ? 0 : 8);
        } else if (com.google.android.finsky.navigationmanager.b.b(document)) {
            this.q.a(10, R.string.view, bVar.a(document, new com.google.android.finsky.layout.play.ad(2644, this), (String) null, -1, getThumbnailCover()));
        } else {
            this.e = false;
            this.q.setVisibility(8);
        }
        a();
    }
}
