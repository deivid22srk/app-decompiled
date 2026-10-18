package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.mv;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class OrderHistoryRowView extends cl {
    private boolean e;
    private boolean f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private PlayActionButton k;
    private PlayActionButton l;
    private com.google.android.finsky.layout.play.cy q;

    public OrderHistoryRowView(Context context) {
        this(context, null);
    }

    public OrderHistoryRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2602);
    }

    @Override // com.google.android.finsky.layout.cl, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.date);
        this.h = (TextView) findViewById(R.id.price);
        this.i = (TextView) findViewById(R.id.status);
        this.j = (TextView) findViewById(R.id.purchase_details);
        this.k = (PlayActionButton) findViewById(R.id.open_button);
        this.l = (PlayActionButton) findViewById(R.id.refund_button);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (animation == this.c) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f3196b) {
            if (this.e) {
                a(this.j);
            }
            if (this.f) {
                a(this.k);
            }
            if (d()) {
                a(this.l);
                a(this.q);
            }
        }
    }

    private boolean d() {
        return this.q != null;
    }

    public final void a(Account account, Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, boolean z, com.google.android.finsky.layout.play.cy cyVar, int i, cr crVar) {
        super.a(document, document.f1963a.i, eVar, z, cyVar, i, bVar);
        mv at = document.at();
        if (at.f4151b) {
            this.g.setText(com.google.android.finsky.utils.aj.a(at.f4150a));
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(4);
        }
        com.google.android.finsky.protos.ea eaVar = at.h;
        if (eaVar == null || !eaVar.i) {
            this.h.setVisibility(4);
        } else {
            this.h.setText(at.h.h);
            this.h.setVisibility(0);
        }
        if (at.j) {
            this.i.setText(at.i);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
        this.e = at.f;
        if (this.e) {
            this.j.setText(Html.fromHtml(at.e));
            this.j.setMovementMethod(LinkMovementMethod.getInstance());
            this.j.setVisibility(z ? 0 : 8);
        } else {
            this.j.setVisibility(4);
        }
        this.f = com.google.android.finsky.navigationmanager.b.b(document);
        if (this.f) {
            this.k.a(10, R.string.view, bVar.a(document, new com.google.android.finsky.layout.play.ad(2605, this), (String) null, -1, getThumbnailCover()));
            this.k.setVisibility(z ? 0 : 8);
        } else {
            this.k.setVisibility(8);
        }
        this.q = null;
        if (document.f1963a.e == 1) {
            com.google.android.finsky.activities.a aVar = new com.google.android.finsky.activities.a(document.f1963a.c, FinskyApp.a().s, FinskyApp.a().p);
            if (aVar.h) {
                this.q = new com.google.android.finsky.layout.play.ad(2603, document.f1963a.R, this);
                this.l.a(10, R.string.refund, new cp(this, crVar, document, aVar));
            }
        }
        if (!d() && FinskyApp.a().e().a(12604148L)) {
            String str = document.f1963a.f3890a;
            int i2 = document.f1963a.g;
            boolean a2 = document.f1963a.e == 1 ? com.google.android.finsky.utils.cy.a(document, FinskyApp.a().p.a(account).j(com.google.android.finsky.g.a.f2782a)) : true;
            boolean a3 = com.google.android.finsky.billing.refund.j.a().a(account.name, str);
            if (a2 && !a3 && at.l) {
                this.q = new com.google.android.finsky.layout.play.ad(2606, document.f1963a.R, this);
                this.l.a(10, R.string.refund_start, new cq(this, crVar, at, str, i2));
            }
        }
        if (d() && z) {
            this.l.setVisibility(0);
            a(this.q);
        } else {
            this.l.setVisibility(8);
        }
        a();
    }
}
