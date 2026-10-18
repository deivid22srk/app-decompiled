package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.qb;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class EpisodeSnippet extends ForegroundRelativeLayout implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public Document f2977a;

    /* renamed from: b, reason: collision with root package name */
    public Document f2978b;
    public boolean c;
    public az d;
    public com.google.android.finsky.navigationmanager.b e;
    public com.google.android.play.image.e f;
    public com.google.android.finsky.apkg.ai g;
    public com.google.android.finsky.layout.play.cy h;
    private TextView i;
    private PlayActionButton j;
    private TextView k;
    private TextView l;
    private View q;
    private ViewStub r;
    private View s;
    private TextView t;
    private HeroGraphicView u;
    private final Runnable v;
    private final Handler w;

    public EpisodeSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = com.google.android.finsky.apkg.i.a(503);
        this.w = new Handler(Looper.getMainLooper());
        this.v = new aw(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2978b.J() == null) {
            setVisibility(8);
        } else {
            a();
            setOnClickListener(new ax(this));
        }
    }

    public final void a() {
        qb J = this.f2978b.J();
        this.i.setText(Integer.toString(J.c));
        this.i.setContentDescription(getResources().getString(R.string.content_description_episode_number, Integer.valueOf(J.c)));
        this.k.setText(this.f2978b.f1963a.i);
        this.k.setMaxLines(2);
        this.k.setEllipsize(TextUtils.TruncateAt.END);
        a(getResources(), this.j, this.l, this.q, this.f2977a, this.f2978b, this.c, this.e, this);
    }

    public Document getEpisode() {
        return this.f2978b;
    }

    public final void b() {
        if (this.s != null) {
            this.s.setVisibility(8);
        }
    }

    public final boolean c() {
        return this.s != null && this.s.getVisibility() == 0;
    }

    public void setExpandedContentVisibility(int i) {
        boolean c = c();
        if (this.s == null) {
            this.s = this.r.inflate();
            this.t = (TextView) findViewById(R.id.episode_description);
            this.u = (HeroGraphicView) findViewById(R.id.episode_screencap);
            this.u.setFocusable(false);
        }
        this.s.setVisibility(i);
        if (i == 8) {
            this.k.setMaxLines(2);
            this.k.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.k.setMaxLines(1000);
            this.k.setEllipsize(null);
        }
        if (i == 0) {
            this.u.a(this.f, this.f2978b);
            if (!TextUtils.isEmpty(this.f2978b.u())) {
                String charSequence = this.f2978b.u().toString();
                if (this.f2978b.J() != null) {
                    charSequence = (charSequence + "\n\n") + getResources().getString(R.string.original_air_date, this.f2978b.J().e);
                }
                this.t.setText(charSequence);
                Context context = getContext();
                if (!c && ik.c(context)) {
                    ik.a(context, (CharSequence) context.getString(R.string.accessibility_announcement_episode_expanded), (View) this.t, true);
                }
            }
        }
        if (this.d != null) {
            this.d.a(this);
        }
        this.w.post(this.v);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.w.removeCallbacks(this.v);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.r = (ViewStub) findViewById(R.id.expanded_content_stub);
        this.i = (TextView) findViewById(R.id.episode_number);
        this.j = (PlayActionButton) findViewById(R.id.buy_button);
        this.k = (TextView) findViewById(R.id.episode_title);
        this.l = (TextView) findViewById(R.id.added_state);
        this.q = findViewById(R.id.added_drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.res.Resources r15, com.google.android.play.layout.PlayActionButton r16, android.widget.TextView r17, android.view.View r18, com.google.android.finsky.api.model.Document r19, com.google.android.finsky.api.model.Document r20, boolean r21, com.google.android.finsky.navigationmanager.b r22, com.google.android.finsky.layout.play.cy r23) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.EpisodeSnippet.a(android.content.res.Resources, com.google.android.play.layout.PlayActionButton, android.widget.TextView, android.view.View, com.google.android.finsky.api.model.Document, com.google.android.finsky.api.model.Document, boolean, com.google.android.finsky.navigationmanager.b, com.google.android.finsky.layout.play.cy):void");
    }

    public static boolean a(Document document) {
        return com.google.android.finsky.utils.cy.a(document, FinskyApp.a().p, FinskyApp.a().i()) != null || com.google.android.finsky.utils.as.a(document.f1963a.u) > 0;
    }

    private static void setBuyButtonStyle(PlayActionButton playActionButton) {
        playActionButton.setDrawAsLabel(false);
        playActionButton.setActionStyle(2);
        playActionButton.setEnabled(true);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.g;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
