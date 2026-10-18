package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.sr;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.play.layout.PlayActionButton;
import java.util.Locale;

/* loaded from: classes.dex */
public class ExtrasItemSnippet extends ForegroundRelativeLayout implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public View f2983a;

    /* renamed from: b, reason: collision with root package name */
    public Document f2984b;
    public bd c;
    public com.google.android.finsky.navigationmanager.b d;
    public com.google.android.play.image.e e;
    public com.google.android.finsky.a.ai f;
    public com.google.android.finsky.layout.play.cy g;
    private PlayActionButton h;
    private TextView i;
    private TextView j;
    private ViewStub k;
    private TextView l;
    private HeroGraphicView q;
    private final Runnable r;
    private final Handler s;

    public ExtrasItemSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = com.google.android.finsky.a.i.a(2702);
        this.s = new Handler(Looper.getMainLooper());
        this.r = new ba(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2984b.I() == null) {
            setVisibility(8);
        } else {
            a();
            setOnClickListener(new bb(this));
        }
    }

    public final void a() {
        sr I = this.f2984b.I();
        this.j.setText(this.f2984b.f1963a.i);
        this.j.setMaxLines(2);
        this.j.setEllipsize(TextUtils.TruncateAt.END);
        Account i = FinskyApp.a().i();
        Account a2 = com.google.android.finsky.utils.cy.a(this.f2984b, FinskyApp.a().p, i);
        if (a2 != null) {
            this.i.setText((CharSequence) null);
            this.h.setVisibility(0);
            this.h.setDrawAsLabel(false);
            this.h.setActionStyle(2);
            this.h.setEnabled(true);
            this.h.a(4, R.string.play, new bc(this, a2));
            return;
        }
        this.h.setVisibility(8);
        this.i.setText(I.f4399b.toUpperCase(Locale.getDefault()));
    }

    public Document getDocument() {
        return this.f2984b;
    }

    public final boolean b() {
        return this.f2983a != null && this.f2983a.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.s.removeCallbacks(this.r);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.k = (ViewStub) findViewById(R.id.expanded_content_stub);
        this.h = (PlayActionButton) findViewById(R.id.play_button);
        this.i = (TextView) findViewById(R.id.duration);
        this.j = (TextView) findViewById(R.id.extras_item_title);
        this.i.setTextColor(com.google.android.play.utils.h.a(getContext(), 4));
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.g;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }

    public void setExpandedContentVisibility(int i) {
        if (this.f2983a == null) {
            this.f2983a = this.k.inflate();
            this.l = (TextView) findViewById(R.id.episode_description);
            this.q = (HeroGraphicView) findViewById(R.id.episode_screencap);
        }
        this.f2983a.setVisibility(i);
        if (i == 8) {
            this.j.setMaxLines(2);
            this.j.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.j.setMaxLines(1000);
            this.j.setEllipsize(null);
        }
        if (i == 0) {
            this.q.a(this.e, this.f2984b);
            CharSequence u = this.f2984b.u();
            if (TextUtils.isEmpty(u)) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(0);
                this.l.setText(u);
            }
        }
        if (this.c != null) {
            this.c.a(this);
        }
        this.s.post(this.r);
    }
}
