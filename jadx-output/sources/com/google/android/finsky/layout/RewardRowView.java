package com.google.android.finsky.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kb;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class RewardRowView extends cl {
    private boolean e;
    private boolean f;
    private TextView g;
    private TextView h;
    private PlayActionButton i;

    public RewardRowView(Context context) {
        this(context, null);
    }

    public RewardRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2662);
    }

    @Override // com.google.android.finsky.layout.cl, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.expiration_description);
        this.h = (TextView) findViewById(R.id.reward_description);
        this.i = (PlayActionButton) findViewById(R.id.redeem_button);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (animation == this.c) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f3196b) {
            if (this.e) {
                a(this.h);
            }
            if (this.f) {
                a(this.i);
            }
        }
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, boolean z, com.google.android.finsky.layout.play.cy cyVar, int i, DfeToc dfeToc) {
        super.a(document, document.f1963a.i, eVar, z, cyVar, i, bVar);
        kb au = document.au();
        if (au.d) {
            this.g.setText(au.c);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(4);
        }
        this.e = document.f1963a.t;
        if (this.e) {
            this.h.setText(document.f1963a.s);
            this.h.setMovementMethod(LinkMovementMethod.getInstance());
            this.h.setVisibility(z ? 0 : 8);
        } else {
            this.h.setVisibility(8);
        }
        this.f = au.f;
        if (this.f) {
            this.i.a(10, au.e, new dp(this, bVar, au, dfeToc, document));
            this.i.setVisibility(z ? 0 : 8);
        } else {
            this.i.setVisibility(8);
        }
        a();
    }
}
