package com.google.android.finsky.layout;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kc;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class SubscriptionRowView2 extends ch {
    private boolean e;
    private boolean f;
    private boolean g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private FifeImageView l;
    private PlayActionButton m;

    public SubscriptionRowView2(Context context) {
        this(context, null);
    }

    public SubscriptionRowView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2642);
    }

    @Override // com.google.android.finsky.layout.ch, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView) findViewById(R.id.price);
        this.i = (TextView) findViewById(R.id.status);
        this.j = (TextView) findViewById(R.id.subscription_details);
        this.l = (FifeImageView) findViewById(R.id.title_byline_icon);
        this.k = (TextView) findViewById(R.id.subscription_instrument_declined);
        this.m = (PlayActionButton) findViewById(R.id.action_button);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (animation == this.c) {
            this.k.setVisibility(8);
            this.m.setVisibility(8);
            this.l.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f3189b) {
            if (this.e) {
                a(this.m);
            }
            if (this.f) {
                a(this.k);
            }
            if (this.g) {
                a(this.l);
            }
        }
    }

    public final void a(Document document, com.google.android.play.image.e eVar, boolean z, com.google.android.finsky.gpkg.aq aqVar, DfeToc dfeToc, el elVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        kc aZ = document.aZ();
        super.a(document, aZ.c, eVar, z, bVar, cyVar);
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
            this.j.setVisibility(4);
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
        this.m.setVisibility(z ? 0 : 8);
        this.k.setVisibility(8);
        if (aZ.m && aZ.l && aqVar != null && aqVar.a() != 3) {
            this.m.a(10, R.string.cancel_subscription, new eg(this, elVar, document, aqVar));
        } else if (aZ.n != null) {
            this.m.a(10, R.string.payment_declined_get_help, new eh(this, bVar, aZ, dfeToc));
            this.f = true;
            this.k.setText(R.string.payment_declined);
            this.k.setVisibility(z ? 0 : 8);
        } else if (com.google.android.finsky.navigationmanager.b.b(document)) {
            this.m.a(10, R.string.view, bVar.a(document, new com.google.android.finsky.layout.play.ad(2644, this), (String) null, -1, getThumbnailCover()));
        } else {
            this.m.setVisibility(8);
            this.e = false;
        }
        a();
    }
}
